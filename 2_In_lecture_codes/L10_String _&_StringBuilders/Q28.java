public class Q28 {
    public static void main(String[] args) {

        int a = 20;
         int b = 3;

// Convert to string and extract first character as an integer
            int firstA = String.valueOf(Math.abs(a)).charAt(0) - '0'; // 2
          int firstB = String.valueOf(Math.abs(b)).charAt(0) - '0'; // 3

if (firstA < firstB) {
    System.out.println(firstA + " is smaller than " + firstB);
}

        int ans = strStr("sadbutsad" , "sad");
        System.out.println(ans);
    }
    static int strStr(String haystack, String needle) {
  
        StringBuilder series = new StringBuilder();
        int n = needle.length();
        for (int i = 0 ; i< haystack.length() ; i++){
            char x = haystack.charAt(i) ;
            // char ch = ' ';
            //  ch = (char)(ch + x);
            series.append(x);
            // if(series.equals(needle)){
            if(series.length() > n ){
                series.deleteCharAt(0);
            }
            if (series.toString().equals(needle)) {
                return i - n + 1;
            }
        }
        return -1 ;
    }
}