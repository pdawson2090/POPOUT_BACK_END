package popout.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import popout.back.Repo.FriendRepository;
import popout.back.models.Friend;

import java.util.List;

@RestController
public class FriendController {

    private FriendRepository friendRepository;

    @Autowired
    public FriendController(FriendRepository friendRepository){
        this.friendRepository = friendRepository;
    }

    @GetMapping("/getFriends")
    public List<Friend> findByFriends(@Param("id") long id){
        return friendRepository.findByFriendIdentity_FriendAOrFriendIdentity_FriendB(id);
    }
}
