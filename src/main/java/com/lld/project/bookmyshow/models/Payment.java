package com.lld.project.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private int amount;
    private PaymentStatus paymentStatus;
    private String paymentReference;
    private String paymentGateway;
    private Date paymentDate;
    @ManyToOne
    private Booking booking;
}
