
public class PolarAirBear extends Animal implements Swimmable, Flyable {
	public PolarAirBear(String name) { super(name); }
	public String eat() {
		return "I ate a shark as my meal for today.";
	}
	public String fly() {
		return "I am even scarier in the air than on water.";
	}
	public String swim() {
		return "Ordinary swimming technique bears have.";
	}
}
