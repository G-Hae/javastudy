package gemini.day4;

class Dog extends Animal{
   
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Bark Bark!");
    }

    public void fetch(){
        System.out.println("Getting a ball");
    }
}
