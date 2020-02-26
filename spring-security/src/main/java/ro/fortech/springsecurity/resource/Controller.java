package ro.fortech.springsecurity.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome</h1>"+
                "<a href=\"http://localhost:8080/login\">Log in</a>");
    }
    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User</h1>"+
                "<a href=\"http://localhost:8080/logout\">Log out</a>");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin!</h1>" +
                "<a href=\"http://localhost:8080/logout\">Log out</a>");
    }

}
