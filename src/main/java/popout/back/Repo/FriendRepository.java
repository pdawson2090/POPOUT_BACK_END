package popout.back.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import popout.back.models.Friend;
import popout.back.models.FriendIdentity;

import java.util.List;

@Repository
public interface FriendRepository extends JpaRepository<Friend, FriendIdentity>{
    List<Friend> findByFriendIdentity_FriendAOrFriendIdentity_FriendB(long userId);
}
