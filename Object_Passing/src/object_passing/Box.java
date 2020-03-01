package object_passing;

public class Box {

    int width;
    int height;
    
    Box(int w, int h){
        width = w;
        height = h;
    }
    
    Box(Box b){
        this.width = b.width;
        this.height = b.height;
    }
    
    boolean isEqual(Box b){
        if(this.width == b.width && this.height == b.height)
            return true;
        else
            return false;
    }
    
    static boolean isTwoObectsEqual(Box b1, Box b2){
        int area1 = b1.width*b1.height;
        int area2 = b2.width*b2.height;
        if(area1 == area2)
            return true;
        else
            return false;   
    }
    
    void display(){
        System.out.println("Width is "+this.width+" and height is "+this.height);
    }
}
