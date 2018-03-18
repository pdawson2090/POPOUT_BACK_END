package popout.back.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import popout.back.models.Event;

@org.springframework.stereotype.Repository
public interface EventRepository extends JpaRepository<Event, Long>
{
}
