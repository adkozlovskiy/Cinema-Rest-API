package kozlovskiy.prod.controllers;

import kozlovskiy.prod.entities.User;
import kozlovskiy.prod.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("reg")
    public User registerUser(@RequestBody User user) {
        return service.registerUser(user);
    }

    @PostMapping("auth")
    public User authorizeUser(@RequestBody User user) {
        return service.authorizeUser(user);
    }
}