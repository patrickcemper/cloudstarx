package patrickcemper.cloudstarx.controller;

import org.springframework.data.repository.CrudRepository;
import patrickcemper.cloudstarx.entities.Route;

public interface RouteRepository extends CrudRepository<Route, Long> {
}
