package popout.back.Services;


import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import popout.back.models.User;

public class Validation
{
    private static Argon2 argon2 = Argon2Factory.create();
    public void argon2Secure(User user){

        user.setPassword(argon2.hash(14,65336,1,user.getPassword()));

    }
    public boolean loginValidation(String username, String pass)
    {
        User user = new User();
        try
        {
            if (user.getUsername().equals(username))
            {

                // Verify password
                if (argon2.verify(user.getPassword(), pass))
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

            //argon2.wipeArray(user.getPassword().toCharArray());
        }

        return false;
    }

}
