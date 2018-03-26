import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import popout.back.Repo.FriendRepository;
import popout.back.Service.FriendService;
import popout.back.models.Friend;
import popout.back.models.Users;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class FriendServiceTest {
    @Mock
    private FriendRepository friendRepository;

    @InjectMocks
    private FriendService friendService;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFriendList(){
    }
}
