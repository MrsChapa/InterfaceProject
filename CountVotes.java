class CountVotes{
    private int votes1;
    private int votes2;
    private boolean bob;
    private boolean bill;
    public CountVotes(int v1,int v2){
        votes1 = v1;
        votes2 = v2;
    }
    public void currentlyWinning(int v1,int v2){
        if(v1>v2){
            bob = true;
            bill = false;
        }
        if(v2>v1){
            bob = false;
            bill = true;
        }
        else{
            bob = false;
            bill = false;
        }
    }
    public String toString(){
        if(bob){
            return "Bob has the most votes.";
        }
        if(bill){
            return "Bill has the most votes.";
        }
        else{
            return "It is a tie, no one has the most votes.";
        }
    }
}
