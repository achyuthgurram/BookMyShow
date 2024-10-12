package com.lld.project.bookmyshow;

import com.lld.project.bookmyshow.controllers.UserController;
import com.lld.project.bookmyshow.dtos.ResponseStatus;
import com.lld.project.bookmyshow.dtos.SignupRequestDTO;
import com.lld.project.bookmyshow.dtos.SignupResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

    @Autowired
    UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowApplication.class, args);
    }

    @Override
    public void run(String... args) {
        SignupRequestDTO signupRequestDTO = new SignupRequestDTO();
        signupRequestDTO.setEmail("abc101@gmail.com");
        signupRequestDTO.setPassword("123456");

        SignupResponseDTO signupResponseDTO = userController.signup(signupRequestDTO);

        System.out.println("received response");
        System.out.println(signupResponseDTO.getStatus());
        if (signupResponseDTO.getStatus().equals(ResponseStatus.SUCCESS))
        {
            System.out.println("received response");
            System.out.println(signupResponseDTO.getMessage());
        }
    }
}
