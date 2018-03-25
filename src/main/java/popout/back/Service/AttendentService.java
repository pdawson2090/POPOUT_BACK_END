package popout.back.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import popout.back.Repo.AttendentRepository;
import popout.back.models.Attendent;
import popout.back.models.AttendentIdentity;
import popout.back.models.Users;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttendentService
{

    private List<Long> temp = new ArrayList<>();
    private UserService userService;
    private AttendentRepository repository;


    @Autowired
    public AttendentService(AttendentRepository repository, UserService userService)
    {
        this.repository = repository;
        this.userService = userService;
    }

    public List<Users> getEventAttendents(long id)
    {
        temp = new ArrayList<>();

        List<Attendent> eventAttendents  = repository.findAttendentByAttendentIdentity_EventId(id);
        for (Attendent a : eventAttendents)
        {
            temp.add(a.getFriendIdentity().getUserId());
        }
        return userService.findAllByEvent(temp);
    }
    public boolean newAttendent(long eventId, long userId){
        AttendentIdentity temp = new AttendentIdentity();
        temp.setEventId(eventId);
        temp.setUserId(userId);
        Attendent a = new Attendent(temp);
        repository.save(a);
        return true;
    }
}
