package Collections.Abstraction;

public class Dog implements Animal, Animal2{

    @Override
    public void sound() {
        System.out.println("Bho... Bho...");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating Bread");
    }
}
