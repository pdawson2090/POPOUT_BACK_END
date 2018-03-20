package popout.back.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Attendent
{
    @EmbeddedId
    private popout.back.models.AttendentIdentity attendentIdentity;

    protected Attendent(){}

    public Attendent(AttendentIdentity newAttendentIdentity){
        this.attendentIdentity = newAttendentIdentity;
    }

    public AttendentIdentity getFriendIdentity() {
        return attendentIdentity;
    }


 
}
