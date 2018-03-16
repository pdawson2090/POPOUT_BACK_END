package popout.back.front_controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import popout.back.models.Event;
import popout.back.models.User;

import java.util.List;

@RestController
public class FrontController
{
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    User processLogin (@RequestBody User user){
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        //Retrieve User Values
        return user;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    boolean processRegistration (@RequestBody User user){
        return true;
    }

    @RequestMapping(value = "/eventregistration", method = RequestMethod.POST)
    boolean processEventRegistration (@RequestBody Event event){
        return true;
    }

    @RequestMapping(value = "/eventRoster", method = RequestMethod.POST)
    List<Event> processEventRoster (){
        //Get List Of All Events
        return null;
    }




}
