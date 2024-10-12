package com.lld.project.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users") //mysql already has user table
public class User extends BaseModel {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    @OneToMany
    private List<Booking> bookingList;
}
