package org.twinnation.observer;

import java.util.ArrayList;
import java.util.List;


public class Subject {
	
	private List<Observer> observers = new ArrayList<>();
	private int state;
	
	
	public int getState() {
		return state;
	}
	
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers(); // every time the state is updated, the observers must be notified
	}
	
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	
	private void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
}
