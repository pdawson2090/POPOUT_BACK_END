package popout.back.controller;

import org.springframework.web.bind.annotation.*;
import popout.back.models.Event;
import popout.back.models.User;
//import popout.back.models.Event;
//import popout.back.models.User;

import java.util.List;

@RestController
public class FrontController
{

    @PostMapping("/login")
    public boolean processLogin (@RequestBody User user){
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        return true;
    }
    @PostMapping("/register")
    boolean processRegistration (@RequestBody User user){
        return true;
    }
    @PostMapping("/event")
    boolean processEventRegistration (@RequestBody Event event){
        return true;
    }
    @PostMapping("/allevents")
    List<Event> processEventRoster (){
        //Get List Of All Events
        return null;
    }





}
