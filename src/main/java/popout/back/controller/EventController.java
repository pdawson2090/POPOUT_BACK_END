package popout.back.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import popout.back.Repo.AttendentRepository;
import popout.back.Repo.EventRepository;
import popout.back.models.Event;

import java.util.List;

@RestController
public class EventController
{
    private EventRepository repository;
    private AttendentRepository repo;

    @Autowired
    public EventController(EventRepository repository, AttendentRepository repo) {
        this.repository = repository;
        this.repo = repo;
    }
    @PostMapping("/newEvent")
    public boolean addEvent(@RequestBody Event event){
         repository.save(event);
         return true;
//         repo.save();
    }
    @GetMapping("/allEvents")
    public List<Event> getAllEvents(){
        return repository.findAll();
    }
    @GetMapping("/event")
    public Event getEventById(@Param("id") long id){
        return repository.getOne(id);
    }
}
