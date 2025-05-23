public class HierarchialInheritance {
    public static void main(String[] args) {
        
    }    
}

// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// Derived class 01
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }

}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flys");
    }
}

