public class sixwordle implements wordle
{
     private String wordInserted;
  private String answer = "tomato";
  private int amountOfTries;
  private int amountOfLetters;
   public int getTriesLeft(){
        return 6 - amountOfTries;
   }
   public void insertWord(String word)
       {
           wordInserted = word;
       }
   public String getWord(){
         return answer;
   }
   
   public boolean compareWords(){
       amountOfTries++;
       return wordInserted.equals(answer);
   }
   public int getAmountLetters(){
       return 5;
   }
}
