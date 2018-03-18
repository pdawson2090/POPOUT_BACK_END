package popout.back.models;

import javax.persistence.*;

@Entity
public class Event
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "event_title")
    private String event_title;
    @Column(name = "event_description")
    private String event_description;
    @Column(name = "event_date")
    private String event_date;
    @Column(name = "event_time")
    private String event_time;
    @Column(name = "lat")
    private double latitude;
    @Column(name = "long")
    private double longitude;
    @Column(name = "event_address")
    private String event_address;

    public String getEvent_address()
    {
        return event_address;
    }

    public void setEvent_address(String event_address)
    {
        this.event_address = event_address;
    }

    public long getId()
    {
        return this.id;
    }


    public void setEvent_title(String newTitle)
    {
        this.event_title = newTitle;
    }

    public String getEvent_title()
    {
        return this.event_title;
    }

    public void setEvent_description(String newDesc)
    {
        this.event_description = newDesc;
    }

    public String getEvent_description()
    {
        return this.event_description;
    }

    public void setEvent_date(String newDate)
    {
        this.event_date = newDate;
    }

    public String getEvent_date()
    {
        return this.event_date;
    }


    public void setEvent_time(String newTime)
    {
        this.event_time = newTime;
    }

    public String getEvent_time()
    {
        return this.event_time;
    }


    public void setLatitude(double newLat)
    {
        this.latitude = newLat;
    }

    public double getLatitude()
    {
        return this.latitude;
    }

    public void setLongitude(double newLong)
    {
        this.longitude = newLong;
    }

    public double getLongitude()
    {
        return this.longitude;
    }
}