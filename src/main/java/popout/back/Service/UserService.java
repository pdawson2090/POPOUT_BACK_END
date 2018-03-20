package popout.back.Service;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import popout.back.Repo.UserRepository;
import popout.back.models.Users;

import java.util.List;

@Service
public class UserService
{
    private static Argon2 argon2 = Argon2Factory.create();

    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Users save (@RequestBody Users user){
        user.setPassword(argon2.hash(14,65336,1,user.getPassword()));
        return repository.save(user);
    }

    public boolean login(Users user){
        Users temp = repository.findUsersByUsername(user.getUsername());
        System.out.println(temp.getFirst_name());
        try
        {
            if (temp.getUsername() != null)
            {

                // Verify password
                if (argon2.verify(temp.getPassword(), user.getPassword()))
                {
                    System.out.println("Login Success!");
                    return true;
                } else
                {
                    System.out.println("Invalid Login");
                }

            } else
            {
                System.out.println("Invalid Credentials");
                return false;
            }
        } catch (NullPointerException e)
        {
            System.out.println("Enter Credentials In Both Fields");
        } finally
        {
            argon2.wipeArray(user.getPassword().toCharArray());
        }

        return false;
    }

    public Users getUser(String username){
        return repository.findUsersByUsername(username);
    }

    public List<Users> getAllUsers(){
        return repository.findAll();
    }
}
