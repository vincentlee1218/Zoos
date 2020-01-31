
public class ExtraTerrestial extends Animal implements Swimmable, Flyable, Runnable {
    public ExtraTerrestial() { super("Blue"); }   
    public ExtraTerrestial(String name) { super(name); }
    public String eat() {
        return "There's nowhere to eat!";
    }
    public String run() {
        return "I can run up to 50 mph on land.";
    }
    public String swim() {
        return "I can dive up to 5,000 meters below sea level!";
    }
    public String fly() {
        return "I can fly up to 1,000 meters above sea level!";
    }
}
