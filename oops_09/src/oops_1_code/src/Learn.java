package src;

public class Learn {
    public static void main(String[] args) {
        int[] rnos = new int[5];
        String[] names = new String[5];
         
        Student1[] dataOfStudents = new Student1[5] ;
        // System.out.println(dataOfStudents);

        Student1 Yuvraj = new Student1(15,"Yuvi" , 99.9f);
        // Yuvraj.roll = 13 ;
        // System.out.println(Yuvraj.roll);
        System.out.println(Yuvraj.roll);
        System.out.println(Yuvraj.name);
        System.out.println(Yuvraj.mark);
        
       

    }
}

 class Student1 {
        int roll ;
        String name ; 
        float mark ;

         Student1(){
            this.roll = 0 ;
            this.name = null ;
            this.mark = 0.0f ;
        }

        Student1(int roll , String name , float mark){
            this.roll = roll ;
            this.name =name ;
            this.mark = mark;
        }
    }
