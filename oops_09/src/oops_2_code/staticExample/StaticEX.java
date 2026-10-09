package oops_2_code.staticExample;


public class StaticEX {
    public static void main(String[] args) {

        RanvirS();
        System.out.println();
            StaticEX obj = new StaticEX();  // STaticEX is a class name and it is creating new object name obj \
        obj.AliaNS();


        
    }
    static void RanvirS(){  //static not dependent on object 
        System.out.println("hey stat ranvir");
        //  AliaNS(); // I can not call an non static in a static function without giving it an object 

        //same for 
        // RanbirNS(); 

        // To call non static we have to assign an object to them 

        StaticEX obj = new StaticEX();  // STaticEX is a class name and it is creating new object name obj \
        // obj.AliaNS();

        obj.RanbirNS();   // now we can call both without an error 
    }

    void RanbirNS(){  // non static
        System.out.println();
        System.out.println("non stat Ranbir");
        AliaNS();  // I can call non static in non sttic without giving it an object 
    }

    void AliaNS(){ 
        System.out.println();        // this is non static , therefore it is dependent on object
        System.out.println("non satt alia");
    }
}
