class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println("The dog barks.");
    }

    // Method overriding
    @Override
    void eat() {
        System.out.println("The dog eats bones.");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.age = 5;
        myDog.breed = "Golden Retriever";

        System.out.println("Name: " + myDog.name);
        System.out.println("Age: " + myDog.age);
        System.out.println("Breed: " + myDog.breed);
        
        myDog.eat();    // Calls overridden method from Dog class
        myDog.sleep();  // Calls inherited method from Animal class
        myDog.bark();   // Calls method from Dog class
    }
}
