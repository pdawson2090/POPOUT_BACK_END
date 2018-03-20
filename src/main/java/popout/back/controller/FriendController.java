package popout.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import popout.back.Repo.FriendRepository;
import popout.back.Service.FriendService;
import popout.back.models.Friend;
import popout.back.models.FriendIdentity;

import java.util.List;

@RestController
public class FriendController {

    private FriendService friendRepository;

    @Autowired
    public FriendController(FriendService friendRepository){
        this.friendRepository = friendRepository;
    }

    @GetMapping("/getFriends")
    public List<Long> findByFriends(@Param("id") Long id){
        return friendRepository.friendList((Long) id);
    }
    @GetMapping("/newFriend")
    public void addFriend(@RequestParam Long friendA, @RequestParam Long friendB){
        FriendIdentity friend = new FriendIdentity(friendA,friendB);
        friendRepository.save(friend);
    }
}
