public class Abstraction {
    public static void main(String args[]){
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal -> Horse -> Mustang
        Mustang myHorse = new Mustang();

    }
}

abstract class Animal{
    String colour;
    Animal(){
        System.out.println("Animal constructor is called");
        colour = "brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }

    void changeColour(){
        colour = "dark brown";
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal{
    void changeColour(){
        colour = "yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
