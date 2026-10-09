package oops_2_code.staticExample;

public class CallHuman {
public static void main(String[] args) {
    // Human Yuvraj = new Human(20, "Yuvraj", 9999, false);
    // Human Shivam = new Human(19, "Shivam", 999, false);
    // Human Fardin = new Human(21, "Fardin", 99999, true);
    

    // System.out.println(Yuvraj.name);
    // System.out.println(Yuvraj.married);
    // System.out.println();
    
    //step 3; Yuvraj.population when long population and this.population 
    // System.out.println(Yuvraj.population);
    // System.out.println(Shivam.population);  // output should be 2 but it is 1 because of long population and not static long population
    // System.out.println();

    // step6 
    System.out.println(HumanEx.population); // correct way for static
 
}
}
