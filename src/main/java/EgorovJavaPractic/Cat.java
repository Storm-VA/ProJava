package EgorovJavaPractic;
public class Cat extends Animal {
    public Cat(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}
