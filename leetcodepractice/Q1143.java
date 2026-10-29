public class Q1143 {
   public static void main(String[] args) {
      int ans = longestCommonSubsequence("hsdfbac" , "abc");
      System.out.println(ans);
   }
    static int longestCommonSubsequence(String text1, String text2) {
        int a1 = text1.length();
        int a2 = text2.length();
        int min = Math.min(a1,a2);
        int max = Math.max(a1,a2);
        int count = 0 ;
        for(int i = 0 ; i< min ; i++){
            for(int j = 0; j< max ; j++){
            if (min == a1 && text1.charAt(i) == text2.charAt(j)) {
                count++;
            } 
            if (min == a2 && text2.charAt(i) == text1.charAt(j) && min != a1) {
                count++;
            } 
            
            }
        }
        return count ;
    }
}
