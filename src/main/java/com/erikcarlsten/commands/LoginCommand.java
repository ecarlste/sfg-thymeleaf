package com.erikcarlsten.commands;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

@Data
public class LoginCommand {

    @NotEmpty
    @Size(min = 8, max = 50)
    private String username;

    @NotEmpty
    @Size(min = 8, max = 20)
    private String password;

}
