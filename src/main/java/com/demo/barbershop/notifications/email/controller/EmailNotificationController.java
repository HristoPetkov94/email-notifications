package com.demo.barbershop.notifications.email.controller;

import com.demo.barbershop.notifications.email.interfaces.EmailInterface;
import com.demo.barbershop.notifications.email.models.EmailDetailsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.ValidationException;

@RestController
@RequestMapping("/sendMailMessage")
public class EmailNotificationController {

    @Autowired
    private EmailInterface emailInterface;

    @PostMapping
    public void sendMailMessage(@RequestBody EmailDetailsModel emailDetails, BindingResult bindingResult) throws ValidationException {

        if (bindingResult.hasErrors())
            throw new ValidationException("emailDetailsDTO is not valid");

        // Send mail
        emailInterface.sendMailMessage(emailDetails);
    }
}
