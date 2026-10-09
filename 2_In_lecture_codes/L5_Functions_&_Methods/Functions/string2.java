
import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
     /*    Scanner in= new Scanner(System.in);
        System.out.print("enter your name : ");
        String naam = in.next();
        String personal = mygreet(naam);
        System.out.println(personal); */

        Scanner in= new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = in.next();
        String personal = mygreet(name);
        System.out.println(personal);

    }
    static String mygreet(String name){

        String message = "HEllo " + name;
        return message;
    }
    
}
