package com.lld.project.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    @OneToMany
    @JoinColumn(name = "booking_id")
    private List<ShowSeat> showSeats;
    private int amount;
    @OneToMany
    @JoinColumn(name = "booking_id")
    private List<Payment> paymentList;
    private BookingStatus bookingStatus;
    @ManyToOne
    private User bookedBy;
    private Date bookingDate;
}
