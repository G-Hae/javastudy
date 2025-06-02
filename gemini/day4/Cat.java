package gemini.day4;

class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Meow! Meow!");
    }

    public void scratch(){
        System.out.println("Is scratching scratcher!");
    }
    
}
