package com.lld.project.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "shows") // show is reserved keyword in mysql
public class Show extends BaseModel {
    @ManyToOne
    private Screen screen;
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private int duration;
    @OneToMany
    private List<ShowSeat> showSeats;
    @OneToMany
    private List<ShowSeatType> showSeatTypes;
}
