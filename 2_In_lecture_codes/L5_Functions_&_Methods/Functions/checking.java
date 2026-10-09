public class checking{
    public static void main(String[] args) {
        int a= 10;
        int b=20;
         
        a = 100;
        
         System.out.println("a outside (initialised ) the block " +a);
        {
            a =40 ; // value is given in the block still it used outside it because it is initialised outside
            System.out.println("a inside the block " +a);
            int c = 17 ;
            System.out.println("c inside "+c);
        }
         
        int c = 101 ;
           System.out.println("c outside "+ c);
        System.out.println("a outside the block " +a);
    }
}