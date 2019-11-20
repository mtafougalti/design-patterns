package com.mt.dp.observer;

public class SMSCanal implements Canal{

	@Override
	public void sendMessage(String message) {
		System.out.println("The Following message is sent by SMS : ");
		System.out.println("Message : " + message);
	}

}
