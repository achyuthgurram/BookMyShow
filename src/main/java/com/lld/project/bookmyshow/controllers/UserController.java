package com.lld.project.bookmyshow.controllers;

import com.lld.project.bookmyshow.dtos.ResponseStatus;
import com.lld.project.bookmyshow.dtos.SignupRequestDTO;
import com.lld.project.bookmyshow.dtos.SignupResponseDTO;
import com.lld.project.bookmyshow.models.User;
import com.lld.project.bookmyshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public SignupResponseDTO signup(SignupRequestDTO request) {
        SignupResponseDTO response = new SignupResponseDTO();

        try
        {
            User user = userService.signup(request.getEmail(), request.getPassword());
            response.setStatus(ResponseStatus.SUCCESS);
            response.setMessage("User id : " + user.getId());
        }
        catch (Exception e)
        {
            response.setStatus(ResponseStatus.FAILURE);
            response.setMessage(e.getMessage());
        }

        return response;
    }
}
