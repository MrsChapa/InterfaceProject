import java.util.Scanner;
class Competitive implements VideoGames{
    int strategyValue;
    int physSkillValue;
    int teamworkValue;
    String recommendation;
    Scanner in = new Scanner(System.in);
     public void strategy(){
        System.out.println("How much strategy do you want in your game from 1-10?");
        strategyValue = in.nextInt();
    }
    public void physSkill(){
        System.out.println("How much physical skill do you want in your game from 1-10?");
        physSkillValue = in.nextInt();
    }
    public void teamwork(){
        System.out.println("How much teamwork do you want in your game from 1-10?");
        teamworkValue = in.nextInt();
    }
     public int lowest(){
        int result = 0;
        int[] scores = {strategyValue, physSkillValue, teamworkValue};
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
           return "FPS, EX: CS, Valorant, COD";
       }
       else if(lower == 1){
           return "MOBA's, EX: LOL, DOTA2, ML";
       }
       else{
           return "Fighting games, EX: Street Fighter, Guilty Gear, Tekken";
       }
    }
}