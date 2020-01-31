
public class FlyingHedgehog extends Animal implements Flyable, Runnable, Amiable, Swimmable, Amicable, Sellable {
	public FlyingHedgehog(String name) { super("Sonic"); }
	public String toString() {
		return "\nComing to theaters February 14th. Fastest movie and animal of all time!";
	}
	public String eat() {
		return "I'm already done eating!";
	}
	public String fly() {
		return "I can fly at the speed of sound in midair!";
	}
	public String run() {
		return "See me zoom away in an instant! #CatchSonic " + toString();
	}
	public String swim() {
		return "You'll be soaked in an instant!";
	}
	public String friend() {
		return "I'm now friends with you! Let's talk together. " + run();
	}
	public String like() {
		return "I'll like your posts, and you like mines so we can get popular!";
	}
	public String sell() {
		return "I'm finally with someone to accompany me.";
	}
	public String buy() {
		return "Thanks for buying the fastest animal in the world.";
	}
}
