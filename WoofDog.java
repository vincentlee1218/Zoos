
public class WoofDog extends Animal implements Runnable, Swimmable {
	public WoofDog(String name) { super(name); }
	public String eat() {
		return "These treats are tasty.";
	}
	public String run() {
		return "You can't outrun me.";
	}
	public String swim() {
		return "I'm drowning. Help me!";
	}

}
