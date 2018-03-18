package popout.back.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import popout.back.models.Users;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}