package popout.back.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Event
{
    private int event_id;
    private String event_title;
    private String event_description;
    private String event_date;
    private String event_time;
    private double latitude;
    private double longitude;


    @Id
    @Column(name = "event_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getEvent_id()
    {
        return this.event_id;
    }

    @Column(name = "event_title")
    public void setEvent_title(String newTitle)
    {
        this.event_title = newTitle;
    }

    public String getEvent_title()
    {
        return this.event_title;
    }

    @Column(name = "event_description")
    public void setEvent_description(String newDesc)
    {
        this.event_description = newDesc;
    }

    public String getEvent_description()
    {
        return this.event_description;
    }

    @Column(name = "event_date")
    public void setEvent_date(String newDate)
    {
        this.event_date = newDate;
    }

    public String getEvent_date()
    {
        return this.event_date;
    }

    @Column(name = "event_time")
    public void setEvent_time(String newTime)
    {
        this.event_time = newTime;
    }

    public String getEvent_time()
    {
        return this.event_time;
    }

    @Column(name = "lat")
    public void setLatitude(double newLat)
    {
        this.latitude = newLat;
    }

    public double getLatitude()
    {
        return this.latitude;
    }

    @Column(name = "long")
    public void setLongitude(double newLong)
    {
        this.longitude = newLong;
    }

    public double getLongitude()
    {
        return this.longitude;
    }
}