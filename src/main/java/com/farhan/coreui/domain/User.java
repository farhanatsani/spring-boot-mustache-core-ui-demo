package com.farhan.coreui.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {

    @Id
    @NotBlank(message = "username cannot be null")
    private String username;

    @NotBlank(message = "password cannot be null")
    private String password;

    @NotBlank(message = "email cannot be null")
    private String email;

    private Long roleId;

    private boolean active;

}
