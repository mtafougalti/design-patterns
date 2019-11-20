package com.mt.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable
 * 
 * @author mtafo
 *
 */
public class MessageManager {
	
	private List<Canal> canals = new ArrayList<>();
	private String message;

	public void whriteMessage(String message) {
		this.message = message;
		notifyCanals();
	}

	public void addCanal(Canal canal) {
		canals.add(canal);
	}

	public void removeCanal(Canal canal) {
		canals.remove(canal);
	}
	
	public void notifyCanals() {
		for (Canal canal : canals) {
			canal.sendMessage(message);
		}
	}

}
