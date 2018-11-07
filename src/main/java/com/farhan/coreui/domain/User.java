package com.farhan.coreui.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {

    @Id
    private String username;

    private String password;

    private String email;

    private Long roleId;

    private boolean active;

}
