package oops_2_code.singleton;

public class Singleton {
     Singleton () {
        
    }

    private static Singleton insta ;
    public static Singleton getInstance(){
             if(insta == null){
                insta = new Singleton() ;
             }
             return insta ;
    }
}
