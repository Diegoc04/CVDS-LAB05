package RESTfulAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {
    @RequestMapping("/hello")
    //@ResponseBody
    private String hello() {
        return "hello";
    }

    @RequestMapping("/user/{id}")
    @ResponseBody
    private String getUser(@PathVariable Integer id) {
        String uri = "https://jsonplaceholder.typicode.com/users/" + id;
        RestTemplate restTemplate = new RestTemplate();

        User user = restTemplate.getForObject(uri, User.class);
        System.out.println("User: " + user);

        System.out.println("Userid: " + user.getUserId());
        System.out.println("Name: " + user.getId());
        System.out.println("Username: " + user.getTitle());
        System.out.println("Email: " + user.getCompleted());

        return "User detail page.";
    }
}
