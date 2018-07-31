package patrickcemper.cloudstarx.repositories;

import org.springframework.data.repository.CrudRepository;
import patrickcemper.cloudstarx.entities.Place;
import patrickcemper.cloudstarx.entities.Route;

import java.util.List;

public interface RouteRepository extends CrudRepository<Route, Long> {
    List<Route> findAllByOrderById();
}
