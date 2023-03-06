package EgorovJavaPractic;



public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kiss", 3, "meow");
        cat.makeSound();
        cat.eat();
        cat.sleep();

        Dog dog = new Dog("Gav", 5, "woof");
        dog.makeSound();
        dog.eat();
        dog.sleep();

        Snake snake = new Snake("Snake2", 2, "hiss");
        snake.makeSound();
        snake.eat();
        snake.sleep();
    }
}