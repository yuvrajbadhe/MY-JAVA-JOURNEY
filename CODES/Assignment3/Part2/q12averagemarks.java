import java.util.Scanner;

public class q12averagemarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("total numbers of subject you want to enter : ");
        int n = in.nextInt();

        if(n<=0){
            System.out.println("please enter positive or greater then zero number.");
            return;
        }
         double sum = 0.0;
        for(int i = 1; i<=n; i++){
            System.out.print("enter the marks of subject number"+i+" : ");
            double a = in.nextDouble();
             sum = sum + a;
            
        }
        double Average = sum/n;
        System.out.println("Average of marks is : "+Average);
    }
}
