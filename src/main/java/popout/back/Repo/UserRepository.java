package popout.back.Repo;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import popout.back.models.Users;

import java.util.List;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findUsersByUsername(String Username);
    Users findUsersById(Long id);

    @Transactional
    @Modifying
    @Query("update Users c set c.favorite_type = ?1, c.favorite_food = ?2, c.description = ?3 where c.id = ?4")
    void updateUserInfo(String favoriteType, String favoriteFood, String description, Long id);
}