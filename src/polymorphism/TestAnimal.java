
package polymorphism;


public class TestAnimal {
    public static void main(String args[]){
       
        Dog dog = new Dog();
        dog.name = "charge";
        dog.breed = "Husky";
        dog.age = 2;
        
        System.out.println("Nmae of dog " + dog.name );
        System.out.println("Bread of dog " + dog.breed );
        System.out.println("Age of dog  "  + dog.age );
                
        dog.sound(5);
        dog.poop();
               
        Cat cat = new Cat();
        cat.sound();
        
        Cow cow = new Cow();
        cow.sound();
                
    }
    
}
