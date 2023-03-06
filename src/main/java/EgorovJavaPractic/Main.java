package EgorovJavaPractic;



public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers", 3, "meow");
        cat.makeSound();
        cat.eat();
        cat.sleep();

        Dog dog = new Dog("Fido", 5, "woof");
        dog.makeSound();
        dog.eat();
        dog.sleep();

        Snake snake = new Snake("Slytherin", 2, "hiss");
        snake.makeSound();
        snake.eat();
        snake.sleep(); 
    }
}