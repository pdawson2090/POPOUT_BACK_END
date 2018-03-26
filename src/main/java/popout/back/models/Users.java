package popout.back.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "favorite_type")
    private String favorite_type;
    @Column(name = "email")
    private String email;

    @Column(name= "birthday")
    private String birthday;
    @Column(name= "favorite_food")
    private String favorite_food;
    @Column(name= "description")
    private String description;


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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFavorite_food() {
        return favorite_food;
    }

    public void setFavorite_food(String favorite_food) {
        this.favorite_food = favorite_food;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Users(String username, String password, String first_name, String last_name, String favorite_type, String email, String birthday, String favorite_food, String description)
    {
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.favorite_type = favorite_type;
        this.email = email;
        this.birthday = birthday;
        this.favorite_food = favorite_food;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", favorite_type='" + favorite_type + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", favorite_food='" + favorite_food + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    protected Users(){}


}