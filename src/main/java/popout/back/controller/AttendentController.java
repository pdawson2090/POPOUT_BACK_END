package popout.back.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import popout.back.Repo.AttendentRepository;
import popout.back.Repo.EventRepository;
import popout.back.Service.AttendentService;
import popout.back.models.Attendent;
import popout.back.models.Users;

import java.util.List;

@RestController
public class AttendentController
{

    private AttendentService attendentService;

    @Autowired
    public AttendentController(AttendentService attendentService){
        this.attendentService = attendentService;
    }

    @PostMapping("/allVisitors")
    public List<Users> getEventAttendents(Long id){
        return attendentService.getEventAttendents(id);
    }
}
