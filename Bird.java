/**
 * Write a description of class Bird here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bird extends Animal implements Runnable, Flyable {
	/**
	 * Constructor for objects of class Bird
	 */
	public Bird(String name) { super(name); }
	
	// ** Implement eat() from Animal
	public String eat() {
		return "Yummy chicks.";
	}
	
	// ** Implement Runnable run()
	public String run() {
		return "Sonic the Hedgehog failed to catch the bird.";
	}
	
	// ** Implement Flyable fly()
	public String fly() {
		return "See ya later, Sonic the Hedgehog. Too bad you can't fly.";
	}
}
