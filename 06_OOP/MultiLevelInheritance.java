public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        dobby.breathe();
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
    int legs;

}

// Derived class 02
class Dog extends Mammal{
    String breed;
}

