package com.lld.project.bookmyshow.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String title;
    private String director;
    private String genre;
    private Date releaseDate;
    @ElementCollection
    private List<String> actors;
}
