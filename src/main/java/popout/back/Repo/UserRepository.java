package popout.back.Repo;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import popout.back.models.Users;

import java.util.List;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findUsersByUsername(String Username);
    Users findUsersById(Long id);

//    @Modifying(clearAutomatically = true)
//    @Query("UPDATE Users c SET c.birthday = :birthday, c.favorite_food = :favorite_food, c.description = :description WHERE c.id = :userId")
//    boolean update
}