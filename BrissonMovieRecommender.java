
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class BrissonMovieRecommender
{
    public static void main(String[] args) {
        MovieRecommender a = new ComedyMovie();
        
        System.out.println(a.searchRating(8));
        System.out.println(a.searchAge(2012));
        System.out.println(a.searchPrice(20));
        System.out.println(a.recommendRandom());
        System.out.println(a.searchMovie("Despicable Me 4"));
    }
}
