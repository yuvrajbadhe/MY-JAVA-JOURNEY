package src;


public class Pract2 {
    public static void main(String[] args) {
        // when int a then it is declare as primative 
        int a= 10 ;
        int b = 20 ;
        System.out.println(a + "   " + b);
        System.out.println();
        
        // it will  not swap because in java there is no such thing like pass by reference , evereything is passed by values
        swap(a,b);
        System.out.println(a +"   " + b);
        System.out.println();
        
        // when Integer (Wrapper classes) , so x and y is now declare as object 
        Integer x = 30 ;
        Integer y = 40 ;
        System.out.println(x + "   " +y);
        System.out.println();
        
        // it is still not swapping even though we declare it as object 
        // because Integer type is the final class 
        swap1(x,y);
        System.out.println(x + "   " +y);
        System.out.println();

        // final is a keyword by using final we can prevent the content to be modify

        // final int bonus = 2  ;       // if we try to modify 
        // bonus = 3 ;                 // It is giving an error

       // now we are making a object (non primitve) as final 
       final A Akki = new A("Twinkle");
       System.out.println("The first Akki name : " + Akki.name);
       System.out.println();

       Akki.name = "Ikka" ;
       System.out.println("The second Akki name : " + Akki.name);
       System.out.println();

       //When a non primitive is final we cannot reassign it 
    //    Akki = new A("new obj");

       A kunal = new A("new obj") ;
       System.out.println(kunal.name);
       System.out.println();

       kunal = new A("Ravas");
       System.out.println(kunal.name);
       System.out.println();

       //finalize == Garbage Collector 
       A obj ;

       for (int i = 0; i < 500000; i++) {
           obj = new A("RAndom name ");
       }
    }
    //here actual a and b are passed only there values are passed 10 and 20
    static void swap(int a , int b ) {
        int temp = a;
        a =b ;
        b = temp ;
    }
    static void swap1(Integer a , Integer b ) {
        Integer temp = a;
        a =b ;
        b = temp ;
    }
}
class A{
   String name ;
   A(String name){
    this.name =name ;
   }
    
    int count = 0 ;
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed ");
        ++count;
        System.out.println(count);
    }
    // here count will not print because count is a non-static instance variable,
    //  so each object gets its own separate count initialized to 0 rather than
    //  sharing a single global counter across all instances.
}
