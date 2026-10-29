package oops_2_code.staticExample;

public class HumanEx {
    int age ;
    String name ;
    int salary ;
    boolean married ;
    //mys steps nnumbers for explain population 
    // step 1 long ppopulation
    // long population ;

    //step 4
    static long population ;


    // public static void  Human( int age ,String name ,int salary , boolean married ){
              // can be this or bellow also 
    // }

     public HumanEx( int age ,String name ,int salary , boolean married ){
        this.age = age ;
        this.name = name ;
        this.salary = salary ;
        this.married = married ;

        // step 2 = this.population.
        // this.population = +1;

        // step 5 ; human.population
        HumanEx.population += 1 ;
    }
}
