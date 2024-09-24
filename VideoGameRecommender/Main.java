
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Main
{
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
        System.out.println("type 1 for solo and 2 for competitive");
       int input = in.nextInt();
        if(input == 1){
            Solo yes = new Solo();
            yes.strategy();
            yes.physSkill();
            yes.story();
           System.out.println(yes.calculate());
        }
        else if(input == 2){
            Competitive no = new Competitive();
            no.strategy();
            no.physSkill();
            no.teamwork();
            System.out.println("\n\nRecommended genre,");
            System.out.println(no.calculate());
        }
    }
}
