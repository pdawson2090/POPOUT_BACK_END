package popout.back.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/allVisitors")
    public List<Users> getEventAttendents(@Param("id") Long id){
        return attendentService.getEventAttendents(id);
    }

    @GetMapping("/attendEvent")
    public void addAttendent(@Param("id")Long user_id, @Param("id2")Long event_id){
        attendentService.newAttendent(event_id,user_id);
    }
}
