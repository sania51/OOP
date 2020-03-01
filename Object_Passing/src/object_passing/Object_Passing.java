package object_passing;

public class Object_Passing {

    public static void main(String[] args) {
        
        Box b1 = new Box(10,20);
        Box b2 = new Box(30,40);      
        Box b3 = new Box(b1);

        b1.display();
        b2.display();
        b3.display();
        
        if(b1.isEqual(b2)) System.out.println("b1 and b2 are eaual");
        else System.out.println("b1 and b2 are not eaual");
        
        if(Box.isTwoObectsEqual(b1, b3)) System.out.println("b1 and b3 are eaual");
        else System.out.println("b1 and b3 are not eaual");

    }
}


