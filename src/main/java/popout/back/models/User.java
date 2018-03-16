package popout.back.models;


import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int user_id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name= "first_name")
    private String first_name;

    @Column(name= "last_name")
    private String last_name;

    @Column(name="favorite_type")
    private String favorite_type;

    @Column(name="email")
    private String email;


    //    @Id
//    @Column(name="user_id")
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public void setUser_id(int newId){
        this.user_id = newId;
    }
    public int getUser_id(){
        return this.user_id;
    }

    //add nullable and length if needed
//    @Column(name="username")
    public void setUsername(String newName){
        this.username = newName;
    }
    public String getUsername(){
        return this.username;
    }

    //    @Column(name="password")
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    public String getPassword(){
        return this.password;
    }

    //    @Column(name= "first_name")
    public void setFirst_name(String newFirst){
        this.first_name = newFirst;
    }
    public String getFirst_name(){
        return this.first_name;
    }

    //@Column(name="last_name")
    public void setLast_name(String newLast){
        this.last_name = newLast;
    }
    public String getLast_name(){
        return this.last_name;
    }

    //    @Column(name="favorite_type")
    public void setFavorite_type(String newFav){
        this.favorite_type = newFav;
    }
    public String getFavorite_type(){
        return this.favorite_type;
    }

    //    @Column(name="email")
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public String getEmail(){
        return this.email;
    }
}