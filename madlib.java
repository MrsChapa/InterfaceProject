/**
Provides the interface for the MadLib Variants

@author Ryan George
*/
interface MadLib 
{
     /** 
    Gets the next type of data that needs to be inputted
    @return String containing the data type
    */
    String nextValue();
    
    /**
    Shows how many words are left to input
    @return int containing how many words are left
    */
    int wordsLeft();
    
    /**
    Allows the user to input a word into the MadLib
    @param word - String word to input
    */
    void addWord(String word);
    
    /**
    Allows the user to input a number into the MadLib
    @param num - Integer num to input
    */
    void addNumber(int num);
    
    /**
    Prints the final MadLib to read
    */
    void printMadLib();
    
    /**
    Prints the name of the MadLib to read
    */
    void printName();
}