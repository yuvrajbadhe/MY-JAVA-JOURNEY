package src ;

public class Pract1 {
    public static void main(String[] args) {
        
        Star[] shah = new Star[5];

        Star Akki = new Star();
      
        System.out.println(Akki.movies);
        System.out.println(  Akki.film);
        System.out.println(Akki.boxoff);
        System.out.println();
        
        Akki.movies =150 ;
        Akki.film = "Khiladi" ;
        Akki.boxoff =15010.0124f ;

        System.out.println(Akki.movies);
        System.out.println(  Akki.film);
        System.out.println(Akki.boxoff);
        System.out.println();

        // Star Sallu = new Star(178 , "Ash" , 4574.154f);
        // System.out.println(Sallu.movies);
        // System.out.println(Sallu.film);
         
        // Change the name 
        Akki.changefilm("Anadi");

        System.out.println(Akki.movies);
        System.out.println(  Akki.film);
        System.out.println(Akki.boxoff);
        System.out.println();
        
        //Greeting message 
        Akki.greeting();

        System.out.println();

        //Giving new person others info ;
        Star Ro = new Star(Akki);
        System.out.println(Ro.film);
        System.out.println();

        Star one = new Star(25 , "Rocky" , 2410.21f);
        Star two = one ;
        System.out.println("Flim one 1st : " + one.film);
        System.out.println(two.film);
        System.out.println();

        two.film = "KGF PARTY VERSE" ;
        System.out.println("Flim one 2nd : " +one.film);
        System.out.println(two.film);
        System.out.println();

        one.film = "Something Something";
         System.out.println("Flim one 3rd : " + one.film);
        System.out.println(two.film);
    }
}

class Star {
  int movies ;
  String film ;
  float boxoff ;

//  Star(){
//     this.movies= 0;
//     this.film = "Nothing";
//     this.boxoff = 0.0f ;
//  }

     Star() {
      this(0 , null , 0.0f) ;
    }

    Star(int movies, String film, float boxoff) {
        this.movies = movies;
        this.film = film;
        this.boxoff = boxoff;
    }


    // Change the name 
    void changefilm(String film){
        this.film = film ;
        this.movies = 21;
    }
    
    //Greeting message 
    void greeting(){
       System.out.println("ram ram Bhai Saryane ");
    }

    //
    Star(Star other){
        this.movies = other.movies ;
        this.film = other.film ;
        this.boxoff = other.boxoff ;
    }
 
}
