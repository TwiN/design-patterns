package org.twinnation.observer;

public class Main {
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		SomeObserver observerA = new SomeObserver(subject);
		SomeObserver observerB = new SomeObserver(subject);
		SomeObserver observerC = new SomeObserver(subject);
		
		// all observers will be notified whenever the state changes.
		subject.setState(1);
		subject.setState(2);
		
		/*
		 * That example was rather abstract, but a clearer example could be the following scenario:
		 *
		 * You have a fire detector, and you want all your sprinklers to start if a fire is detected
		 *
		 * Subject = FireDetector
		 * Observers = Sprinklers
		 *
		 * Instead of all sprinklers (observers) constantly checking if FireDetector (subject)
		 * detected a fire (state change), FireDetector (subject) notifies all sprinklers (observers)
		 * when there's a fire (state change).
		 *
		 *
		 *
		 * Without observer design pattern:
		 *
		 * Sprinkler 1 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 1 : NO
		 * [Sprinkler 1 stays off]
		 * Sprinkler 2 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 2 : NO
		 * [Sprinkler 2 stays off]
		 * ...
		 * Sprinkler 1 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 1 : YES
		 * [Sprinkler 1 turns on]
		 * Sprinkler 2 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 2 : YES
		 * [Sprinkler 2 turns on]
		 * Sprinkler 1 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 1 : YES
		 * [Sprinkler 1 is already on]
		 * Sprinkler 2 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 2 : YES
		 * [Sprinkler 2 is already on]
		 * Sprinkler 1 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 1 : YES
		 * [Sprinkler 1 is already on]
		 * Sprinkler 2 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 2 : YES
		 * [Sprinkler 2 is already on]
		 * ...
		 * [Fire is out]
		 * Sprinkler 1 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 1 : NO
		 * [Sprinkler 1 turns off]
		 * Sprinkler 2 -> FireDetector : is there a fire?
		 * FireDetector -> Sprinkler 2 : NO
		 * [Sprinkler 2 turns off]
		 * ...
		 *
		 *
		 *
		 * With observer design pattern:
		 *
		 * ...
		 * [There's a fire]
		 * FireDetector -> Sprinkler 1: THERE'S A FIRE!
		 * [Sprinkler 1 turns on]
		 * FireDetector -> Sprinkler 2: THERE'S A FIRE!
		 * [Sprinkler 2 turns on]
		 * [ste Fire is out]
		 * FireDetector -> Sprinkler 1: The fire's out, you can stop sprinkling
		 * [Sprinkler 1 turns off]
		 * FireDetector -> Sprinkler 2: The fire's out, you can stop sprinkling
		 * [Sprinkler 2 turns off]
		 *
		 *
		 * As you can see, there are no useless calls made when using the observer design pattern,
		 * whereas there are plenty of useless calls made in the other case.
		 */
	}
	
}
