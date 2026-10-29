import java.util.Scanner;
public class Z_nestedswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the serial number (1,2,3) : ");
        int day = sc.nextInt();
        System.out.print("cource name : ");
        String cource = sc.next();

        switch(day){

            case 1:
                 System.out.print("subhashri shahu : ");
                 System.out.println("like her before she become the over night sensation <3 .");

            break;

             case 2:
                 System.out.println("kriti sanon");
                  switch(cource){

                    case "it":
                        System.out.println("she looks stunning while holding 'IT' ");
                        break;
                    
                    case "java":
                        System.out.println("she is prety while doing code in java");
                        break;
                    default:
                        System.out.println("for 2 enter  only java or it");        
                }
            break;

             case 3:
                    System.out.println("Shraddha kapoor");
                switch(cource){

                    case "dsa":
                        System.out.println("she looks stunning while learning dsa");
                        break;
                    
                    case "java":
                        System.out.println("she is prety in java");
                        break;
                    default:
                        System.out.println(" for 3 enter  only java or dsa ");        
                }
            break;

             /*switch (day) {
    case 1:
        System.out.print("subhashri shahu : ");
        System.out.println("like her before she become the over night sensation <3 .");
        break;

    case 2:
        System.out.println("kriti sanon");
        switch (cource) {
            case "it":
                System.out.println("she looks stunning while holding 'IT' ");
                break;
            case "java":
                System.out.println("she is prety while doing code in java");
                break;
            default:
                System.out.println("for 2 enter  only java or it");
                break;
        }
        break;

    case 3:
        System.out.println("Shraddha kapoor");
        switch (cource) {
            case "dsa":
                System.out.println("she looks stunning while learning dsa");
                break;
            case "java":
                System.out.println("she is prety in java");
                break;
            default:
                System.out.println(" for 3 enter  only java or dsa ");
                break;
        }
        break;
} */

            default:
                System.out.println("tuzya baapne thevalay kay 1 te 7 chya bahercha number ekhadya day la ");
        }
    }
}