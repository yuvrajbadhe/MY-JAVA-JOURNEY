//Input currency in rupees and output in USD.

import java.util.Scanner;
public class q6currencychange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the money in rupee : ");
        int rupee = input.nextInt();
        float USD = rupee/95.38f;
        System.out.println("In dollar it would be : "+USD);
    }
}
