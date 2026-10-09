package oops_2_code.staticExample;

public class InnerClasses {
    
    //Step 1
/*     class Odi{
        String name ;
        public Odi(String name ){
           this.name = name ;
        }
    }
    public static void main(String[] args) {

     //Step 1 
     Odi a = new Odi("Yuvraj");
     Odi b = new Odi("rahul");   // both are giving an error because class odi is not static and we are calling it 
                                       // from a static block 
    } */

    //Step 2
/*        static class Odi{
        String name ;
        public Odi(String name ){
           this.name = name ;
        }
    }
    public static void main(String[] args) {

        //Step 1 
        Odi a = new Odi("Yuvraj");
        Odi b = new Odi("rahul");   // no error as class Odi is static  
     
        System.out.println(a.name); // printing 

    } */
    
   
    public static void main(String[] args) {

     //Step 1 
     Odi a = new Odi("Yuvraj");
     Odi b = new Odi("rahul");   
        System.out.println(a.name);
    }
    
}
   // we can not make a static class outside the main class like 
    // step 3
    // static class Odi{            // giving error because static outside 
    //     String name ;
    //     public Odi(String name ){ 
    //        this.name = name ;
    //     }
    // }
    

        class Odi{         // chalega 
        String name ;
        public Odi(String name ){
           this.name = name ;
        }
    }