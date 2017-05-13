package com.erikcarlsten.controllers;

import com.erikcarlsten.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginForm(Model model) {

        model.addAttribute("loginCommand", new LoginCommand());

        return "login";
    }

    @RequestMapping("logout-success")
    public String loggedOut() {
        return "logout-success";
    }

}
