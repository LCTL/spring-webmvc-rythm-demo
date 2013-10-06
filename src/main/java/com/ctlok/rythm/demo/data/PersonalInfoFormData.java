package com.ctlok.rythm.demo.data;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author Lawrence Cheung
 * 
 */
public class PersonalInfoFormData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String email;
    private String firstName;
    private String lastName;

    @NotNull
    @NotEmpty
    @Email
    @Length(min = 4, max = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotNull
    @NotEmpty
    @Length(min = 4, max = 100)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    @NotEmpty
    @Length(min = 4, max = 100)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
