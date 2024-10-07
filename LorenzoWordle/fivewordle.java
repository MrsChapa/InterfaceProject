public class fivewordle
{
  private String wordInserted;
  private String answer = bread;
  private int amountOfTries;
  private int amountOfLetters;
   int getTriesLeft(){
       return 6 - amountOfTries;
   }
   void insertWord(String word)
       {
           wordInserted = word;
       }
   String getWord(){
       return answer;
   }
   
   Boolean compareWords(){
       return wordInserted = answer;
   }
   int getAmountLetters(){
       return 5;
   }
}
