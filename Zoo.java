import java.util.*;


/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    public static void main(String[] args)
    {
        System.out.println("*** Let's visit the Zoo");
        List<Animal> animals = new ArrayList<Animal>();
        
        // Populate our zoo
        animals.add( new FlyingHippo("Flying Hippo"));
        
        
        
        for (Animal a : animals)
        {
            System.out.println(" *** Let's visit the "+a.getName());
            System.out.println("     *** Let us watch the "+a.getName()+" eat : "+a.eat());
           
            
            // Task 2.  Create the Swimmable Interface
            // Task 3. Complete the following lines with Swimmable and Flyable
            // Task 4. In groups of two, create four more animals of your choice.
            if (a instanceof Runnable) {
                System.out.println("    This animal can run: "+((Runnable) a).run());
            }
            if (a instanceof Swimmable) {
                System.out.println("    This animal can swim: "+((Swimmable) a).swim());
            }
            if (a instanceof Flyable) {
                System.out.println("    This animal can fly: "+((Flyable) a).fly());
            }
        }
        
    }
}
