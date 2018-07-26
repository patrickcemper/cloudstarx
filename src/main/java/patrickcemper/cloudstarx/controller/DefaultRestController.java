package patrickcemper.cloudstarx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import patrickcemper.cloudstarx.model.Place;

@RestController
@RequestMapping("/rest")
public class DefaultRestController {

    @Autowired
    private PlaceRepository placeRepository;

    @RequestMapping("/addRandomPlace")
    public Place addRandomPlace() {
        Place newPlace = new Place("Some name", "some description", 8.4);
        newPlace = placeRepository.save(newPlace);
        return newPlace;
    }

    @RequestMapping("/getPlace")
    public Place getPlace(@RequestParam(value="id") Long id) {
        return placeRepository.findById(id).orElse(null);
    }

}
