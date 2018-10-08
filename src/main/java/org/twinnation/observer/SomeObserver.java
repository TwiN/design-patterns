package org.twinnation.observer;

public class SomeObserver extends Observer {
	
	public SomeObserver(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}
	
	
	@Override
	public void update() {
		System.out.println("Subject state has been updated to " + subject.getState());
	}
	
}