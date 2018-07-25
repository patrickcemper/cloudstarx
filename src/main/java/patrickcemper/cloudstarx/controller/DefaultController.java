package patrickcemper.cloudstarx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {

    @GetMapping("/testService")
    public String testService(@RequestParam(name="someparam", required=false, defaultValue="") String someparam, Model model) {
        model.addAttribute("someparam", someparam);
        return "testtemplate";
    }

}
