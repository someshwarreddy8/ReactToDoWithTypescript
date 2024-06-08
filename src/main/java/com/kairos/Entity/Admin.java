package com.kairos.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Admin extends MetaEntity {

    private String adminName;
    private String password;

}
