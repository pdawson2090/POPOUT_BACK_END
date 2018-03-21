package popout.back.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import popout.back.models.Attendent;
import popout.back.models.AttendentIdentity;
import popout.back.models.Friend;

import java.util.List;

@Repository
public interface AttendentRepository extends JpaRepository<Attendent,AttendentIdentity>
{
    List<Attendent> findAttendentByAttendentIdentity_EventId(Long event);

}
