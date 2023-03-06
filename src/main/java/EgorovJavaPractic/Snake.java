package EgorovJavaPractic;
public class Snake extends Animal {
    public Snake(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " hisses");
    }
}
