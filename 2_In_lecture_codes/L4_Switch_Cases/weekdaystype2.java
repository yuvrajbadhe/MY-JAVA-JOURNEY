import java.util.Scanner;
public class weekdaystype2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter the serial number of day : ");
        int day = in.nextInt();

        /* switch(day){

            case 1:
                 System.out.println("monday");
            break;

             case 2:
                 System.out.println("tuesday");
            break;

             case 3:
                 System.out.println("wednesday");
            break;

             case 4:
                 System.out.println("thursday");
            break;

             case 5:
                 System.out.println("friday");
            break;

             case 6:
                 System.out.println("saturday");
            break;

             case 7:
                 System.out.println("sunday");
            break;

            default:
                System.out.println("tuzya baapne thevalay kay 1 te 7 chya bahercha number ekhadya day la ");
        } */

        /*  switch(day){
            
            case 1 -> System.out.println("monday");
            case 2 ->  System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("tuzya baapne thevalay kay 1 te 7 chya bahercha number ekhadya day la ");

         }  */

       /*   switch(day){
            
            case 11,2,3,4,5 -> System.out.println("weekday");
            case 6,7 ->  System.out.println("weekend");
         }    */ 

         switch(day){
            case 1:
             case 2:
             case 3:
             case 4:
             case 5:
                 System.out.println("weekday");
            break;

             case 6:
             case 7:
                 System.out.println("weekend");
            break;

            default:
                System.out.println("tuzya baapne thevalay kay 1 te 7 chya bahercha number ekhadya day la ");
        } 
        }
    }