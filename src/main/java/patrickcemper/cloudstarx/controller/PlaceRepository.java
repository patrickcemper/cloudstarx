package patrickcemper.cloudstarx.controller;

import org.springframework.data.repository.CrudRepository;
import patrickcemper.cloudstarx.model.Place;

public interface PlaceRepository extends CrudRepository<Place, Long> {

}
