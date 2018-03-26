package popout.back.Service;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import popout.back.Repo.FriendRepository;
import popout.back.Repo.UserRepository;
import popout.back.models.Friend;
import popout.back.models.FriendIdentity;
import popout.back.models.Users;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendService
{

    private FriendRepository repository;
    private UserService userService;

    @Autowired
    public FriendService(FriendRepository repository, UserService userService)
    {
        this.repository = repository;
        this.userService = userService;
    }

    public List<Users> friendList(Long id){
        List<Long> tempFriend = new ArrayList<>();
       for(Friend f: repository.findByFriendIdentity_FriendAOrFriendIdentity_FriendB(id,id)){
            if(f.getFriendIdentity().getFriendA() == id){
                tempFriend.add(f.getFriendIdentity().getFriendB());
            }else{
                tempFriend.add(f.getFriendIdentity().getFriendA());
            }
       }
       return userService.findAllByEvent(tempFriend);
    }
    public void save(FriendIdentity f){
//        FriendIdentity f = new FriendIdentity(id,id2);
        Friend friend = new Friend(f);
        repository.save(friend);
    }

    public void deleteFriend(FriendIdentity f){
        repository.deleteByFriendIdentity(f);
    }
}