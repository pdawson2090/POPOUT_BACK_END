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
    @Column(name = "event_address")
    private String event_address;

    public String getEvent_type()
    {
        return event_type;
    }

    public void setEvent_type(String event_type)
    {
        this.event_type = event_type;
    }

    @Column(name = "event_type")
    private String event_type;
    @Column(name = "lat")
    private double lat;
    @Column(name = "long")
    private double lng;

    @Override
    public String toString()
    {
        return "Event{" +
                "id=" + id +
                ", event_title='" + event_title + '\'' +
                ", event_description='" + event_description + '\'' +
                ", event_date='" + event_date + '\'' +
                ", event_time='" + event_time + '\'' +
                ", latitude=" + lat +
                ", longitude=" + lng +
                ", event_address='" + event_address + '\''+
                 ", event_type='" + event_type + '\'' +
                '}';
    }

    public Event(String event_title,String event_type, String event_description, String event_date, String event_time, double latitude, double longitude, String event_address)
    {
        this.event_title = event_title;
        this.event_description = event_description;
        this.event_date = event_date;
        this.event_time = event_time;
        this.event_address = event_address;
        this.event_type = event_type;
        this.lat = latitude;
        this.lng = longitude;

    }



    protected Event(){};
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
        this.lat = newLat;
    }

    public double getLatitude()
    {
        return this.lat;
    }

    public void setLongitude(double newLong)
    {
        this.lng = newLong;
    }

    public double getLongitude()
    {
        return this.lng;
    }
}