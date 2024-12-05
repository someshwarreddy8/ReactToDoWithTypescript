package com.kairos.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Table(name = "user_table")
public class User extends MetaDataEntity {
    private String userName;
    private String password;
    private String email;
    private Long mobile;
}
