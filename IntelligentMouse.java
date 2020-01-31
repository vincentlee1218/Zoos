
public class IntelligentMouse extends Animal implements Runnable, Amiable, Electable, Amicable, Learnable {
    public IntelligentMouse() { super("Nezu"); }
    public IntelligentMouse(String name) { super(name); }
    public String toString() {
        return "\nFind me in My Hero Academia on Funimation, Toonami, and Crunchyroll! Go beyond! PLUS ULTRA!";
    }
    public String eat() {
        return "I only take Asian foods, thank you.";
    }
    public String elect() {
        return "Sigh. I'm one of the staff at U.A. High." + toString();
    }
    public String friend() {
        return "I'm now your friend on Facebook. Cheer up!";
    }
    public String like() {
        return "I liked your posts and made you popular!";
    }
    public String learn() {
        return "My intelligence will let me learn ANYTHING!";
    }
    public String run() {
        return "Catch me if you can! I'm really fast!";
    }
}
