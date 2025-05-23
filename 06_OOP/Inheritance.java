public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.swim();
        shark.eat();

    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// Derived class / sub class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
