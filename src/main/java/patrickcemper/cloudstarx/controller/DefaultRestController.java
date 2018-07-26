package patrickcemper.cloudstarx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import patrickcemper.cloudstarx.model.Place;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/rest")
public class DefaultRestController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/testRestService")
    public Place getPlace(@RequestParam(value="id") Long id) {
        // TODO add actual implementation
        return new Place(id, "Some Place", "This is actually a very nice place!", 8.5);
    }

}
