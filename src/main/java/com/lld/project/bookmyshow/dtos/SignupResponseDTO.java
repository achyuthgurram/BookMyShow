package com.lld.project.bookmyshow.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupResponseDTO {
    private int userId;
    private ResponseStatus status;
    private String message;
}
