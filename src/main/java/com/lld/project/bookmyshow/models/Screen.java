package com.lld.project.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection //creates separate table for screen features
    private List<Feature> features;
    @ManyToOne
    private Theater theater;
    @OneToMany
    private List<Seat> seats;
}
