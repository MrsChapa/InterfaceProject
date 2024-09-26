class User implements Voter{
    private int age;
    private String voted;
    private int vote1;
    private int vote2;
    public String votedFor(){
        return voted;
    }
    public int voterAge(){
        return age;
    }
    public void addVote(String v,int a){
        if(a >= 18 && v=="Bob"){
            vote1++;
        }
        else if(a >= 18 && v=="Bill"){
            vote2++;
        }
        age =a;
        voted = v;
    }
    public int getBobVotes(){
        return vote1;
    }
    public int getBillVotes(){
        return vote2;
    }
}
