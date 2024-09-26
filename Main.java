import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int didntVote = 0;
        User joe = new User();
        while(didntVote==0){
        Scanner input = new Scanner(System.in);
        System.out.println("Who do you vote for Bob or Bill(Capatilze the B, key sensitive)");
        String vote = input.nextLine();
        System.out.println("What is your age?");
        int a = input.nextInt();
        if(vote==""){
            didntVote++;
        }
        else{
            joe.addVote(vote,a);
        }
        }
        CountVotes counter = new CountVotes(joe.getBobVotes(),joe.getBillVotes());
        counter.toString();
    }
}
