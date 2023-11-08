import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

    Programmer programmer = new Programmer("programming","peaksoft", LocalDate.of(2, 2, 4),"java" ) ;
        System.out.println(programmer.coder() );
        System.out.println(programmer);


    Dancer dancer = new Dancer( "dancer",  "Studiodance" , LocalDate.of(3,5,6), "ballet"
    );
        System.out.println(dancer.dancing() );
        System.out.println(dancer );

    Singer singer = new Singer( "singer", "hall", LocalDate .of(2, 5, 6), "rock");
        System.out.println(singer.Singer() );
        System.out.println(singer);
}

}