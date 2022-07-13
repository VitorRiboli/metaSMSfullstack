package com.vitor.metasms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.vitor.metasms.entities.Sale;
import com.vitor.metasms.repositories.SaleRepository;

@Service /*Registrando como componente Service */
public class SmsService {

	@Value("${twilio.sid}")
	private String twilioSid;

	@Value("${twilio.key}")
	private String twilioKey;

	@Value("${twilio.phone.from}")
	private String twilioPhoneFrom;

	@Value("${twilio.phone.to}")
	private String twilioPhoneTo;
	
	@Autowired
	private SaleRepository saleRepository;

	public void sendSms(Long saleId) {
		
		Sale sale = saleRepository.findById(saleId).get();
		
		String date = sale.getDate().getMonth() + "/" + sale.getDate().getYear();
		
		String msg = "O vendedor " + sale.getSellerName() + " foi destaque em " + date 
				+ " com o valor de R$ " + String.format("%.2f", sale.getAmount());

		Twilio.init(twilioSid, twilioKey);

		PhoneNumber to = new PhoneNumber(twilioPhoneTo);
		PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

		Message message = Message.creator(to, from, msg ).create();

		System.out.println(message.getSid());
	}
}
