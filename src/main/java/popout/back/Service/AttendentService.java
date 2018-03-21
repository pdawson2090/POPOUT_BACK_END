package popout.back.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import popout.back.Repo.AttendentRepository;
import popout.back.Repo.UserRepository;
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
    public AttendentService(AttendentRepository repository)
    {
        this.repository = repository;
    }

    public List<Users> getEventAttendents(long id)
    {

        List<Attendent> eventAttendents = repository.findAttendentByAttendentIdentity_EventId(id);
        for(Attendent a : eventAttendents){
            temp.add(a.getFriendIdentity().getUserId());
        }
        return userService.findAllByEvent(temp);
    }
}
