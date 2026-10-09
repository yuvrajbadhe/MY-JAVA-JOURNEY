  import java.util.Scanner;
public class q11perirectangle {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println(" enter length 'l' : ");
        int l =  in.nextInt();

         System.out.println(" enter width 'w' : ");
        int w =  in.nextInt();

        int A =(l+w)*2;
        System.out.println("Perimeter of rectangle is : " +A);
    }
    
}
    