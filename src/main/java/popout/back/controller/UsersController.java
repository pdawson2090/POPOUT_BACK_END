package popout.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import popout.back.Repo.UserRepository;
import popout.back.Service.UserService;
import popout.back.models.Event;
import popout.back.models.Users;
//import popout.back.models.Event;
//import popout.back.models.User;

import java.util.List;


@RestController
public class UsersController
{

    private UserService repository;

    @Autowired
   public UsersController(UserService repository) {
        this.repository = repository;
    }


    @PostMapping("/login")
    public boolean processLogin (@RequestBody Users user){
        return repository.login(user);

    }

    @PostMapping("/register")
    boolean processRegistration (@RequestBody Users user){
        repository.save(user);
        return true;
    }






}
