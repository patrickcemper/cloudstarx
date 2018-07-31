package patrickcemper.cloudstarx.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import patrickcemper.cloudstarx.entities.Place;
import patrickcemper.cloudstarx.entities.Route;
import patrickcemper.cloudstarx.repositories.PlaceRepository;
import patrickcemper.cloudstarx.repositories.RouteRepository;
import patrickcemper.cloudstarx.services.PlaceService;
import patrickcemper.cloudstarx.services.RouteService;

import java.util.*;

@RestController
@RequestMapping("/rest")
public class DefaultRestController {

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private RouteRepository routeRepository;

    @RequestMapping(value = "/deleteAllData")
    public String deleteAllData() {
        placeRepository.deleteAll();
        routeRepository.deleteAll();
        return "All data deleted.";
    }

    @RequestMapping(value = "/createTestData")
    public List<Object> createTestData() {
        List<Place> places = PlaceService.createTestData();
        List<Route> routes = RouteService.createTestData();

        // persist and return result
        List<Object> resultList = new ArrayList<>();
        Iterable<Place> placesItrRes = placeRepository.saveAll(places);
        placesItrRes.forEach(resultList::add);
        Iterable<Route> routesItrRes = routeRepository.saveAll(routes);
        routesItrRes.forEach(resultList::add);
        return resultList;
    }

    @GetMapping("/findAllPlaces")
    public List<Place> findAllPlaces() {
        return placeRepository.findAllByOrderById();
    }

    @GetMapping("/findAllRoutes")
    public List<Route> findAllRoutes() {
        return routeRepository.findAllByOrderById();
    }

    @GetMapping("/getPlace")
    public Place getPlace(@RequestParam(value="id") Long id) {
        return placeRepository.findById(id).orElse(null);
    }

    @GetMapping("/getRoute")
    public Route getRoute(@RequestParam(value="id") Long id) {
        return routeRepository.findById(id).orElse(null);
    }

}
