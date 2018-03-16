package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class RegisterController
{
//    @RequestMapping(method = RequestMethod.POST)
//    public String viewLogin(Map<String,Object> model)
//    {
//        Users user = new Users();
//        model.put("userForm", userForm);
//        List<String> professionList = new ArrayList<>();
//        professionList.add("Dev");
//        professionList.add("Designer");
//        professionList.add("IT");
//        model.put("professionList", professionList);
//
//        return "Registartion";
//    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public boolean processRegistration (@RequestBody Users user){
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());

        return true;
    }


}
