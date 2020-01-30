
/**
 * Write a description of class FlyingHippo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlyingHippo extends Animal implements Runnable, Flyable
{


    /**
     * Constructor for objects of class FlyingHippo
     */
    public FlyingHippo(String name)
    {
        super(name);
    }

    // ** Implement eat() from Animal
    public String eat()
    {
        return "Flying Hippos do not eat.  They dine.";
    }
    
    // ** Implement Runnable run()
    public String run()
    {
        return "Batman and Robin tried to capture a running Hippo.  They are now known as Flatman and Ribbon";
    }
    
    public String fly()
   {
       return "Hippos fly?  Yes.  On United, first class.  They won't fit on economy seats"; 
   }
}
