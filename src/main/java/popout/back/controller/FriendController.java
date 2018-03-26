package popout.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import popout.back.Repo.FriendRepository;
import popout.back.Service.FriendService;
import popout.back.models.Friend;
import popout.back.models.FriendIdentity;
import popout.back.models.Users;

import java.util.List;

@RestController
public class FriendController {

    private FriendService friendRepository;

    @Autowired
    public FriendController(FriendService friendRepository){
        this.friendRepository = friendRepository;
    }

    @GetMapping("/getFriends")
    public List<Users> findByFriends(@Param("id") Long id){
        return friendRepository.friendList((Long) id);
    }

    @GetMapping("/newFriend")
    public void addFriend(@RequestParam Long friendA, @RequestParam Long friendB){
        //making sure that friendA's ID is less than friendB's ID.
        if(friendA < friendB) {
            FriendIdentity friend = new FriendIdentity(friendA, friendB);
            friendRepository.save(friend);
        }else{
            FriendIdentity friend = new FriendIdentity(friendB, friendA);
            friendRepository.save(friend);
        }
        //friendRepository.save(friend);
    }

    @DeleteMapping("/deleteFriend")
    public void deleteFriend(@RequestParam Long friendA, @RequestParam Long friendB){
        if(friendA < friendB){
            FriendIdentity friend = new FriendIdentity(friendA, friendB);
            friendRepository.deleteFriend(friend);
        }else{
            FriendIdentity friend = new FriendIdentity(friendB, friendA);
            friendRepository.deleteFriend(friend);
        }
    }

}
