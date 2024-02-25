package RESTfulAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/hello")
    //@ResponseBody
    private String hello() {
        return "hello";
    }

    @RequestMapping("/todos" + "/{id}")
    private ModelAndView getUser(@PathVariable Integer id) {
        String uri = "https://jsonplaceholder.typicode.com/todos/" + id;
        RestTemplate restTemplate = new RestTemplate();

        User user = restTemplate.getForObject(uri, User.class);
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("user", user);


        return modelAndView;
    }
}
