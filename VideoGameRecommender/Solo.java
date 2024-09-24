import java.util.Scanner;
class Solo implements VideoGames{
    Scanner in = new Scanner(System.in);
    int strategyValue;
    int physSkillValue;
    int storyValue;
    String recommendation;
    public void strategy(){
        System.out.println("How much strategy do you want in your game from 1-10?");
        strategyValue = in.nextInt();
    }
    public void physSkill(){
        System.out.println("How much physical skill do you want in your game from 1-10?");
        physSkillValue = in.nextInt();
    }
    public void story(){
        System.out.println("How much story do you want in your game from 1-10?");
        storyValue = in.nextInt();
    }
    public int lowest(){
        int result = 0;
        int[] scores = {strategyValue, physSkillValue, storyValue};
        for(int i = 0; i < scores.length - 1; i++){
            if(scores[i] > scores[i + 1]){
                result = i + 1;
            }
        }
        return result;
    }
    public String calculate(){
       int lower = lowest();
       if(lower == 0){
           return "Open World RPG's, EX: Elden Ring, Cyberpunk, RDR";
       }
       else if(lower == 1){
           return "Turn Based RPG's, EX: Persona, Final Fantasy";
       }
       else{
           return "Arcade Games, EX: Tetris, PacMan, DDR";
       }
    }
}