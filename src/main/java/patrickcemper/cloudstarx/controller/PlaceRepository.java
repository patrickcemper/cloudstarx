package patrickcemper.cloudstarx.controller;

import org.springframework.data.repository.CrudRepository;
import patrickcemper.cloudstarx.entities.Place;

public interface PlaceRepository extends CrudRepository<Place, Long> {
}
