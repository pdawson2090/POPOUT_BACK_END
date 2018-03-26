package popout.back.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import popout.back.models.Friend;
import popout.back.models.FriendIdentity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long>{
    List<Friend> findByFriendIdentity_FriendAOrFriendIdentity_FriendB(Long x, Long y);

    @Transactional
    void deleteByFriendIdentity(FriendIdentity identity);
}
