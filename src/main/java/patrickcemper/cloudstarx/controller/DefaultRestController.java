package patrickcemper.cloudstarx.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import patrickcemper.cloudstarx.model.SomeBean;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DefaultRestController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/testRestService")
    public SomeBean testRestService(@RequestParam(value="inParam1", required = false) String inParam1) {
        return new SomeBean(counter.incrementAndGet(), String.format("Your value for inParam1 is %s", inParam1));
    }

}
