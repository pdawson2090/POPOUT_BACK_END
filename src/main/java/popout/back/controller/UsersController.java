package popout.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import popout.back.Service.UserService;
import popout.back.models.Users;

import java.util.List;

//import popout.back.models.Event;
//import popout.back.models.User;


@RestController
public class UsersController
{
    private UserService repository;

    @Autowired
    public UsersController(UserService repository)
    {
        this.repository = repository;
    }

    @PostMapping("/login")
    public Users processLogin(@RequestBody Users user)
    {
        if (repository.login(user))
        {
            return repository.getUser(user.getUsername());
        } else
        {
            return null;
        }
    }

    @PostMapping("/register")
    boolean processRegistration(@RequestBody Users user)
    {
        repository.save(user);
        return true;
    }


    @PostMapping("/allUsers")
    List<Users> processUserList()
    {
        return repository.getAllUsers();
    }

    @GetMapping("/name")
    Users getUserByUsername(@Param("username") String username){
        return repository.getUser(username);
    }

    @PutMapping("/updateUser")
    boolean updateUser(@RequestBody Users user){
        repository.updateUser(user);
        return true;
    }
}
