package com.erikcarlsten.commands;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

@Data
public class CheckoutCommand {

    @NotEmpty
    @Size(min = 2, max = 50)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String lastName;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String addressLine1;
    private String addressLine2;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String city;

    @NotEmpty
    @Size(min = 2, max = 2)
    private String stateCode;

    @NotEmpty
    @Size(min = 5, max = 10)
    private String zipCode;

}
