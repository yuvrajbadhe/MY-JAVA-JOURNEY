public class Q8 {
    public static void main(String[] args) {
        String s = "42";
        String s1 = "42";
        String s2 = "-42";
        String s3 = "  42" ;
        String ch = "" + s ;
        System.out.println(ch);
        char ch1 = s1.trim().charAt(0);
        char ch2 = s2.trim().charAt(0);
        char ch3 = s3.trim().charAt(0);
        String a = s3.trim() + " "; 
        System.out.println(ch1 + " " + ch2 +" " + ch3);
        System.out.println(s1.length() + "  " + s2.length() + "  " + s3.length());
        System.out.println(s3);
    }
}
