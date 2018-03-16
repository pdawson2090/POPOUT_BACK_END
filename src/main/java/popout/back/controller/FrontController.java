package popout.back.controller;

import org.springframework.web.bind.annotation.*;
import popout.back.models.User;
//import popout.back.models.Event;
//import popout.back.models.User;

import java.util.List;

@RestController
public class FrontController
{

    @PostMapping("/login")
    public boolean processRegistration (@RequestBody User user){
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        return true;
    }

//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    boolean processRegistration (@RequestBody User user){
//        return true;
//    }
//    @RequestMapping(value = "/eventregistration", method = RequestMethod.POST)
//    boolean processEventRegistration (@RequestBody Event event){
//        return true;
//    }
//    @RequestMapping(value = "/eventRoster", method = RequestMethod.POST)
//    List<Event> processEventRoster (){
//        //Get List Of All Events
//        return null;
//    }




}
