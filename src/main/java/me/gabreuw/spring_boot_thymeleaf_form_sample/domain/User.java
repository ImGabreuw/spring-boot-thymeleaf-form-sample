package me.gabreuw.spring_boot_thymeleaf_form_sample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@Data
public class User implements Serializable {

    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private String profession;

    private boolean married;

    private Date birthDate;

}
