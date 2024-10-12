package com.lld.project.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Theater extends BaseModel {
    private String name;
    private String address;
    //@OneToMany
    //private List<Screen> screens;
    @ManyToOne
    private Region region;

}
