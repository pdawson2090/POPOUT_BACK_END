package popout.back.models;


import javax.persistence.*;

@Entity
public class Users
{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "favorite_type")
    private String favorite_type;
    @Column(name = "email")
    private String email;

    public long getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFirst_name()
    {
        return first_name;
    }

    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

    public String getLast_name()
    {
        return last_name;
    }

    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }

    public String getFavorite_type()
    {
        return favorite_type;
    }

    public void setFavorite_type(String favorite_type)
    {
        this.favorite_type = favorite_type;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Users(String username, String password, String first_name, String last_name, String favorite_type, String email)
    {
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.favorite_type = favorite_type;
        this.email = email;

    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", favorite_type='" + favorite_type + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    protected Users(){}


}