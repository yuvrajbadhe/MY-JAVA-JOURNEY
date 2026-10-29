import java.util.Scanner;
public class nsum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" how many numbers : ");
        int n = in.nextInt();
        int i =0;
        while(n>0){
            System.out.println("enter the numbers : ");
            int x = in.nextInt();
            i=i+x;
            n--;
        }
        System.out.println(i);
    }

}