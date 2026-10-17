package oops_2_code.singletontryning;

public class SingleTonTrying {
    private SingleTonTrying(){

    }

    private static  SingleTonTrying insta2;

    public static SingleTonTrying getinsta(){

        if(insta2 == null){
            insta2 = new SingleTonTrying() ;
        }
        return insta2 ;
    }
}
