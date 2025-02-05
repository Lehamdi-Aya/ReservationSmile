package com.reservationsmile.reservationplace_smile.user.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/")
    public String welcome() {
        return "welcome";  // Redirige vers welcome.html
    }

    @GetMapping("/login")
    public String login() {
        return "redirect:/oauth2/authorization/keycloak";
    }
}
