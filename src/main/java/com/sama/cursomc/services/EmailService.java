package com.sama.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.sama.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
