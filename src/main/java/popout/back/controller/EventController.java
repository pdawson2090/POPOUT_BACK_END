package popout.back.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import popout.back.Repo.EventRepository;
import popout.back.models.Event;

@RestController
public class EventController
{
    private EventRepository repository;

    @Autowired
    public EventController(EventRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/newEvent")
    public void addEvent(@RequestBody Event event){
         repository.save(event);
    }
}
