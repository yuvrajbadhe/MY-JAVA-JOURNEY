import java.util.ArrayList;
import java.util.*;
public class dice{
    public static void main(String[] args) {
    
        diceroll("" , 4 );
      System.out.println(diceRet("", 4));
    }
    static void diceroll(String p ,int target ) {
        if(target == 0){
            int n = Integer.parseInt(p);
            System.out.println(n);
            return ;
        }
        for (int i = 1; i <= 6 && i<=target; i++){
            diceroll(p+i , target-i );
        }
    }
        static List<List<String>> diceRet(String p, int target) {
        if (target == 0) {
            List<List<String>> list = new ArrayList<>();
            list.addAll(p);
            return list;
        }
        List<List<String>> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }
}
