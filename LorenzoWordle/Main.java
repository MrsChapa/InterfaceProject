
import java.util.Scanner; 
public class Main
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("five or six wordle? enter five or six");
        String mode = myObj.nextLine();
        if(mode.equals("five") ){
            fivewordle ob = new fivewordle();
            System.out.println("the answer has 5 letters");
            
             while(ob.getTriesLeft() != 0){
             System.out.println("tries left: " + ob.getTriesLeft());
             System.out.println("enter a guess:");
             ob.insertWord(myObj.nextLine());
             if(ob.compareWords()){
                 System.out.println("You did it!");
                 break;
             }else{
                 System.out.println("wrong :(");
             }
        }
        }else if (mode.equals("six")) {
             sixwordle ob = new sixwordle();
             System.out.println("the answer has 6 letters");
             
             
              while(ob.getTriesLeft() != 0){
             System.out.println("tries left: " + ob.getTriesLeft());
             System.out.println("enter a guess:");
              ob.insertWord(myObj.nextLine());
             if(ob.compareWords()){
                 System.out.println("You did it!");
                 break;
             }else{
                 System.out.println("wrong :(");
             }
        }
        }
        
       System.out.println("wordle complete");
        
    }
}
