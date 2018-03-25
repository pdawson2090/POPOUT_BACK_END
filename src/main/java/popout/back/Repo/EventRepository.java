package popout.back.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import popout.back.models.Event;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface EventRepository extends JpaRepository<Event, Long>
{
    @Override
    List<Event> findAll();

    @Override
    List<Event> findAllById(Iterable<Long> iterable);


    Event findEventById(Long id);
}
