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
        boolean isDefault = true;
        /*
        Interfaces: Amicable, Electable, Flyable, Learnable, Runnable, Sellable, Swimmable, Amiable
        Animals: Bird, ExtraTerrestial, FlyingHedgehog, FlyingHippo, IntelligentMouse,
        		 PolarAirBear, WoofDog
		Other classes: Animal, Zoo
        */
        // Populate our zoo
        animals.add(new FlyingHippo("the Flying Hippo"));
        if (isDefault) {
        animals.add(new Bird("the Bird"));
        animals.add(new ExtraTerrestial("the Extra Terrestial Animal"));
       	animals.add(new PolarAirBear("the Polar Air Bear"));
       	animals.add(new WoofDog("the Woof Dog"));
       	animals.add(new IntelligentMouse("the Intelligent Mouse"));
       	animals.add(new FlyingHedgehog("the Flying Hedgehog"));
        }
        else { default_promotion(animals); }
       	
        for (Animal a : animals)
        {
            // please insert "the" if you are using the animal name,
            // not the real name
            System.out.println(" *** Let's visit "+a.getName());
            System.out.println("     *** Let us watch "+a.getName()+" eat : "+a.eat());
           
            
            // Task 2.  Create the Swimmable Interface
            // Task 3. Complete the following lines with Swimmable and Flyable
            // Task 4. In groups of two, create four more animals of your choice.
            // Interfaces: Amicable, Electable, Flyable, Learnable, Runnable, Sellable, Swimmable, Amiable
            if (a instanceof Runnable) {
                System.out.println("    This animal can run: "+((Runnable) a).run());
            }
            if (a instanceof Swimmable) {
                System.out.println("    This animal can swim: "+((Swimmable) a).swim());
            }
            if (a instanceof Flyable) {
                System.out.println("    This animal can fly: "+((Flyable) a).fly());
            }
            if (a instanceof Amicable) {
            	System.out.println("    This animal can friend you: "+((Amicable) a).friend());
            }
            if (a instanceof Amiable) {
            	System.out.println("    This animal can like you: "+((Amiable) a).like());
            }
            if (a instanceof Electable) {
            	System.out.println("    This animal can be elected: "+((Electable) a).elect());
            }
            if (a instanceof Learnable) {
            	System.out.println("    This animal can learn: "+((Learnable) a).learn());
            }
            if (a instanceof Sellable) {
            	System.out.println("    This animal can be traded: "+((Sellable) a).sell()+" "
            			+ ((Sellable) a).buy());
            }
            
        }
        
    }
    
    public static void default_promotion(List<Animal> animals) {
        animals.add(new Bird());
        animals.add(new ExtraTerrestial());
       	animals.add(new PolarAirBear());
       	animals.add(new WoofDog());
       	animals.add(new IntelligentMouse());
       	animals.add(new FlyingHedgehog());
    }
}
