package exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

// BEGIN
import org.springframework.web.bind.annotation.RestController;
import exercise.daytime.Daytime;

@RestController
public class WelcomeController {

    @Autowired
    private Daytime daytime;

    @GetMapping("/welcome")
    public String index() {
        return daytime.getName();
    }
}
// END
