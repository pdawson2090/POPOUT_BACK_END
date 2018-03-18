package popout.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import popout.back.Repo.UserRepository;
import popout.back.models.Event;
import popout.back.models.Users;
//import popout.back.models.Event;
//import popout.back.models.User;

import java.util.List;


@RestController
public class UsersController
{

    private UserRepository repository;

    @Autowired
   public UsersController(UserRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/login")
    public Users processLogin (@RequestBody Users user){
        return repository.save(user);

    }

    @PostMapping("/register")
    boolean processRegistration (@RequestBody Users user){
        return true;
    }
    @PostMapping("/event")
    boolean processEventRegistration (@RequestBody Event event){
        return true;
    }
    @PostMapping("/allevents")
    List<Event> processEventRoster (){
        return null;
    }





}
