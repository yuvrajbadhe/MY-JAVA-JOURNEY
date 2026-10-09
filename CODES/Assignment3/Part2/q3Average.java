import java.util.Scanner;

public class q3Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("total numbers you want to enter : ");
        int n = in.nextInt();

        if(n<=0){
            System.out.println("please enter positive or greater then zero number.");
            return;
        }
         float sum = 0f;
        for(int i = 1; i<=n; i++){
            System.out.print("enter the number"+i+" : ");
            float a = in.nextFloat();
             sum = sum + a;
            
        }
        float Average = (float) sum/n;
        System.out.println("Average of numbers is : "+Average);
    }
}
