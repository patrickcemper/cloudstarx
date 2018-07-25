package patrickcemper.cloudstarx.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = DefaultController.class)
public class ApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIndexPage() throws Exception {
        mockMvc.perform(get("/index.html"))
                .andExpect(content().string(containsString("List of services")));
    }

    @Test
    public void testTestService() throws Exception {
        mockMvc.perform(get("/testService"))
                .andExpect(content().string(containsString("the most primitive MVC test service")));
    }

    @Test
    public void testTestServiceWithParam() throws Exception {
        mockMvc.perform(get("/testService").param("someparam", "ABCDE"))
                .andExpect(content().string(containsString("optional parameter &lt;someparam&gt;: ABCDE.")));
    }

}
