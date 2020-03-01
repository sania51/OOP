package object_passing;

class Methods {
    
    public static void static_method(type obj){
        obj.name = "Static Mathod";
    }

    public void instance_method(type obj){
        obj.name = "Instance Method";
    }
    
    Methods(type obj){
        obj.name = "Constructor";
    }
}


public class Object_Passing {

    public static void main(String[] args) {
        
        type t = new type();
        t.name = "Main";
        System.out.println(t.name);
        
        Methods mtd = new Methods(t);
        System.out.println(t.name);
        
        Methods.static_method(t);
        System.out.println(t.name);
        
        mtd.instance_method(t);
        System.out.println(t.name);
        
    }
}

