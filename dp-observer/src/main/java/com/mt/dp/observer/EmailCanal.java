package com.mt.dp.observer;

public class EmailCanal implements Canal{

	@Override
	public void sendMessage(String message) {
		System.out.println("The Following message is sent by Email : ");
		System.out.println("Message : " + message);
	}

}
