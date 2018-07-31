package patrickcemper.cloudstarx.repositories;

import org.springframework.data.repository.CrudRepository;
import patrickcemper.cloudstarx.entities.Place;

import java.util.List;

public interface PlaceRepository extends CrudRepository<Place, Long> {
    List<Place> findAllByOrderById();
}
