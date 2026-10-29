public class Q2380 {
    public static void main(String[] args) {
        int ans = secondsToRemoveOccurrences("0110101");
        System.out.println(ans);
    }
    static int secondsToRemoveOccurrences(String s) {
        int a = 0 ;
        int b = 0 ;
        int count1 = 0 ;
        int count2 = 0;
        int count3 = 0;
        for(int i = s.length() - 1 ; i>= 0 ; i--){
            a = i ;
            if(s.charAt(i) == '0'){
                count1 ++;
            }else{
                break;
            }
        }
        for(int i = 0 ; i <s.length() ; i++){
            if(s.charAt(i) == '0'){
                count2++ ;
                b = i ;
                break;
            }
        }
        for(int j = a;j>b ; j--){
            if(s.charAt(j) == '0'){
                count2 ++;
            }else{
                count3++;
            }

        }
        if(count2 == 0){
            return 0 ;
        }
        return count3;
    }
}
