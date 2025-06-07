package gemini.day04;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Badook", 3);
        Cat cat = new Cat("Navi", 2);

        dog.makeSound();
        dog.fetch();

        cat.makeSound();
        cat.scratch();

        Animal[] animals = {dog, cat};

        for(Animal animal: animals){
            animal.makeSound();
        }
    }
    
}
