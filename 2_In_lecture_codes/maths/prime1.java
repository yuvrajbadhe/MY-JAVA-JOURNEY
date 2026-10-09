public class prime1{
    public static void main(String[] args) {
        int n = 12 ;
        for(int i =2 ; i < n / 2 ; i++ ){
            if(n % i == 0 ){
                System.out.println("It is not a prime number");
                return ;
            }
        }
        System.out.println("It is a prime number");
    }
}