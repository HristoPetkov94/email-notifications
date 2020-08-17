package com.demo.barbershop.notifications.email.interfaces;


import com.demo.barbershop.notifications.email.models.EmailDetailsModel;

public interface EmailInterface {
    void sendMailMessage(EmailDetailsModel emailDetails);
}
