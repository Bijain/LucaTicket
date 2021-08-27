package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
    private JavaMailSender mailSender;

    
    public void sendEmail(String info) {

        SimpleMailMessage email = new SimpleMailMessage();
        String[] datos = info.split("/"); 
        
        email.setTo(datos[0]);
        email.setSubject("Recibo del ticket para el evento "+datos[2]);
        email.setText("Hola "+datos[1]+", se le confirma que se ha efectuado la compra del ticket para el evento "+datos[2]+" para el dia "+datos[3]+ " a las "+datos[4]+" con exito.");
        mailSender.send(email);
    }
}
