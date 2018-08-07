package it.fp.securityexample.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
	
	@Autowired UserDetailsService userService;

    @GetMapping(value = { "/", "/home" })
    public String home1() {
        return "/home";
    }



 /*   @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user(Authentication authentication) {
    	UserDetails userDetails = (UserDetails) authentication.getPrincipal();
    	System.out.println("User has authorities: " + userDetails.getAuthorities());
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
*/
}
