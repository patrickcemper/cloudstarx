package engineering.patrickcemper.cloudstarx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {

    @GetMapping("/testservice")
    public String greeting(@RequestParam(name="someparam", required=false, defaultValue="") String someparam, Model model) {
        model.addAttribute("someparam", someparam);
        return "testtemplate";
    }

}
