public class OOPExample{
    public static void main(String args[]){
        Pen p1 = new Pen(); // Created a pen object.
        p1.setColour("Blue");
        System.out.println(p1.getColour());
    }
}

class Pen {
    // properties
    private String colour;
    private int tip;

    void setColour(String newColour){
        colour = newColour;
    }

    void setTip(int newTip){
        tip = newTip;
    }
    
    String getColour(){
        return this.colour;
    }

    int getTip(){
        return this.tip;
    }
}
