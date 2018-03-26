package popout;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import popout.back.Repo.UserRepository;
import popout.back.Service.UserService;
import popout.back.models.Users;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllUsers(){
        List<Users> temp = new ArrayList<>();

        Users temp1 = new Users("test", "test", "test", "test", "test", "test","","","");
        Users temp2 = new Users("test2", "test", "test", "test", "test", "test","","","");
        Users temp3 = new Users("test3", "test", "test", "test", "test", "test","","","");
        temp.add(temp1);
        temp.add(temp2);
        temp.add(temp3);

        when(userRepository.findAll()).thenReturn(temp);

        List<Users> result = userService.getAllUsers();

        assertEquals(3, result.size());
    }
}
