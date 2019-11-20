package com.mt.dp.observer;

public class Application {
	
	public static void main(String[] args) {
		MessageManager messageManager = new MessageManager();
		messageManager.addCanal(new SMSCanal());
		messageManager.addCanal(new EmailCanal());
		messageManager.whriteMessage("Hello World !");
	}

}
