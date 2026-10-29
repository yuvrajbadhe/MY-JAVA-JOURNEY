import java.util.Arrays;

public class Q242{
    public static void main(String[] args) {
        System.out.println(isAnagram("ayan","yana"));
    }
    static boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(s.length() != t.length()){
            return false ;
        }
        for(int i = 0 ; i< t.length() ; i++){
            char a = ch1[i];
            char b = ch2[i];
            if(ch1[i] != ch2[i]){
                return false ;
            }
        }
        return true ;
    }
}