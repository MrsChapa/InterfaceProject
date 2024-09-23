
interface VideoGameRecomender{
    
    int strategyValue; 
    int physSkillValue;
    //These two will be used to gauge the player's preferences
    String recomendation;
    //The reccomended 
    
    public void strategy(int tenPointScale);
    public void physSkill(int tenPointScale);
    //This will set strategyValue and physSkillValue 
    
    public String calculate();
    //This will get the two greatest values and return recomendations based on that
    //A third variable will be implimented based on the class
    //
    
    
    
    
    
    
    
}