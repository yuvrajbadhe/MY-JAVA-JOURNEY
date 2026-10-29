public class Q_of_XOR {
public static void main(String[] args) {
    int[] arr = {4,2,1,8,5,4,2,5,1};
    int uni = 0 ;
    for(int n : arr){
        uni ^= n ;
    }
    System.out.println(uni);
}
}