package covarianttype;

class Animal {
    Animal getAnimal() {
        System.out.println("Returning an Animal");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog getAnimal() { // Covariant return type: Dog is a subclass of Animal
        System.out.println("Returning a Dog");
        return new Dog();
    }
}

public class CovariantDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal result = a.getAnimal(); // Calls Dog's version, returns Dog as Animal
        
        Animal av = new Animal();
        Animal result1 = a.getAnimal();
    }
    
}