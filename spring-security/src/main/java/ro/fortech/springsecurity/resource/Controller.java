package ro.fortech.springsecurity.resource;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>" +
                "<a href=\"http://localhost:8084/user\">Log in</a>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<a href=\"http://localhost:8084/app1\">App1</a>" +
                "<br></br>" +
                "<a href=\"http://localhost:8084/app2\">App2</a> " +
                "<br></br>" +
                "<a href=\"http://localhost:8084/app3\">App3</a>" +
                "<br></br>" +
                "<a href=\"http://localhost:8084/logout\">Logout</a>");
    }

    @GetMapping("/app1")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public RedirectView app1() {
        return new RedirectView("http://localhost:8081/app1");
    }

    @GetMapping("/app2")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public RedirectView app2() {
        return new RedirectView("http://localhost:8082/app2");
    }

    @GetMapping("/app3")
    @Secured({"ROLE_ADMIN"})
    public RedirectView app3() {
        return new RedirectView("http://localhost:8083/app3");
    }

    @GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }
}