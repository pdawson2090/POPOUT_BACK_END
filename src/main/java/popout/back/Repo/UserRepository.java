package popout.back.Repo;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import popout.back.models.Users;

import java.util.List;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    List<Users> findUsersByUsername(String Username);
}