package com.erikcarlsten.controllers;

import com.erikcarlsten.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginForm(Model model) {

        model.addAttribute("loginCommand", new LoginCommand());

        return "login-form";
    }

    @PostMapping("/dologin")
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "login-form";
        }

        return "login-complete";
    }

}
