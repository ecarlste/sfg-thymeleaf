package com.erikcarlsten.controllers;

import com.erikcarlsten.commands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CheckoutController {

    @RequestMapping("checkout")
    public String checkoutForm() {
        return "checkout-form";
    }

    @PostMapping("/docheckout")
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "checkout-form";
        }

        return "checkout-complete";
    }


}
