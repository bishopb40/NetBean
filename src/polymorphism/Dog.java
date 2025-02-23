
package polymorphism;

public class Dog extends Animal implements AnimalBehavour{
    String breed;
    
    @Override public void sound(){
        System.out.println("woof woof woof");
        
    
        
    }
    
    @Override public void poop(){
        System.out.println("All dogs will poop ");
    }
    
    
}
