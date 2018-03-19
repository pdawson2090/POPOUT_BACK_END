package popout.back.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import popout.back.models.Event;

import java.util.List;

@org.springframework.stereotype.Repository
public interface EventRepository extends JpaRepository<Event, Long>
{
    @Override
    List<Event> findAll();

    @Override
    List<Event> findAllById(Iterable<Long> iterable);

    @Override
    Event getOne(Long aLong);
}
