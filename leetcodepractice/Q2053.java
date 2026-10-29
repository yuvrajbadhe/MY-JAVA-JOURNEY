import java.util.* ;
public class Q2053 {
    public static void main(String[] args) {
        String[] arr = {"d" ,"b" ,"c","b","c","a"};
        int k = 2 ;
        int a = 0;
        // StringBuilder series = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        // System.out.println(arr[1].equals(arr[3])); 
        list.add(-1);
        for(int i = 0 ; i<arr.length;i++ ){
            int count = 0;
            
            for(int j = i; j< arr.length && i != j; j++){
                for(int index = 0; index< list.size() ; index++){
                    if(list.get(index) == j){
                        return;
                    }
                if(arr[i].equals(arr[j])){
                    count++ ; 
                    list.add(j);
                }
                }
            }
            if(count == 0){
               a++ ;
            }                                                    
            if(a == k){
                System.out.println(arr[i]);
            }
        }
    } 
}
