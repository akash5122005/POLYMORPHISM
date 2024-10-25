
class Animal {
    
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}


class Cat extends Animal {
    
    
    public void makeSound() {
        System.out.println("Meow");
    }
}


public class Main{
    public static void main(String[] args) {
        
        System.out.println("Animal sounds:");

       
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        for (Animal animal : animals) {
            animal.makeSound(); 
        }
    }
}
