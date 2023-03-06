package EgorovJavaPractic;

public class Dog extends Animal {
    public Dog(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}
