package com.farhan.coreui.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Role {

    @Id
    private Long roleId;

    private String role;

}
