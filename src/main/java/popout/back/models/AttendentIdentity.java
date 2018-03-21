package popout.back.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AttendentIdentity implements Serializable
{
    @Column(name= "event_id")
    private long eventId;

    @Column(name = "user_id")
    private long userId;

    @Override
    public String toString()
    {
        return "AttendentIdentity{" +
                "eventId=" + eventId +
                ", userId=" + userId +
                '}';
    }

    public long getEventId()
    {
        return eventId;
    }

    public void setEventId(long eventId)
    {
        this.eventId = eventId;
    }

    public long getUserId()
    {
        return userId;
    }

    public void setUserId(long userId)
    {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof AttendentIdentity)) return false;
        AttendentIdentity that = (AttendentIdentity) o;
        return eventId == that.eventId &&
                userId == that.userId;
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(eventId, userId);
    }


    public AttendentIdentity(){}

}
