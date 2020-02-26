package ro.fortech.userregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.fortech.userregistration.entities.Users;
import ro.fortech.userregistration.services.UserService;

@RestController
@RequestMapping("/user")
public class UsersController {


    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public void getUsers(){
        userService.getAllUsers();
    }

    @PostMapping("/")
    public void addUser(@RequestBody Users users){
        userService.addUser(users);
    }
}
