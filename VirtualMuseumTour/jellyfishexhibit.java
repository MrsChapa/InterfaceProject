import java.util.Scanner;
import java.util.*;
public class JellyfishExhibit implements VirtualMuseumTour{
    public Scanner input = new Scanner(System.in);
    public ArrayList<String> fact =  new ArrayList<String>(Arrays.asList("Jellyfish don’t have a brain, heart, or bones",
                                                                "Jellyfish are mostly made of water, about 95%",
                                                                "Many jellyfish, especially those in deep ocean waters, are bioluminescent",
                                                                "Jellyfish use their tentacles to sting and capture prey",
                                                                "Jellyfish inhabit every ocean on Earth, from the surface to the deep sea, and can even thrive in extreme conditions like polar waters or low-oxygen environments"));
    
    public ArrayList<String> descriptions =  new ArrayList<String>(Arrays.asList("This jellyfish has a nearly transparent bell with four distinct, horseshoe-shaped gonads visible through the top",
                                                                "This jellyfish is reddish-brown with its thick, cascading tentacles resembling a lion’s mane",
                                                                "This jellyfish has a cube-shaped bell that is almost transparent with eyes arranged in clusters around its bell"));
    public void tourStart(){
        System.out.println("Welcome to the jellyfish exhibit");
        System.out.println("My name is Zachary and I will be your tour guide today");
        introduceRoom();
        tellFacts(fact);
        viewAnimal(descriptions);
    }
    public void introduceRoom(){
        System.out.println("In this room we have a really deep tank to allow for both sunlit surface and deep sea to emulate a jellyfishs' normal enviornment");
    }
    public void tellFacts(ArrayList<String> facts){
        System.out.println("Lets learn some fun facts about jellyfish");
        for(int i = 0; i < facts.size(); i++){
            System.out.println("Fun fact number " + i + 1 + ":");
            System.out.println(facts.get(i));
    }
    }
    public void viewAnimal(ArrayList<String> descs){
        System.out.println("Would you like to have a closer look?");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
            pictureAnimal();

            System.out.println(descs.get((int)(Math.random() * descs.size())));
        }
    }
    public void pictureAnimal(){
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣤⣤⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⠾⠏⠉⠀⠀⠀⠀⠀⠀⠈⠉⠳⢶⣄⡀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠁⠀⠀⠀⠸⠷⠀⠀⠀⠀⠀⠘⠛⠃⠙⢿⣄⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⢠⡿⢱⡟⠓⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣶⡄⢻⡆⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⢸⣧⡈⠙⠛⠁⠀⢀⣀⡀⠀⠀⠀⣀⣀⠀⠀⠁⠀⠈⣿⡀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠸⢍⣻⣦⣄⡀⠀⠹⠭⠟⠀⠀⠸⣿⣿⠇⠀⣠⠶⣦⣿⠃");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⣧⣈⣻⡷⢶⣦⣀⣀⠀⠀⠀⠀⠀⠀⠈⢛⢡⡟⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣳⠃⡹⠳⡤⡴⡏⠙⠛⣻⠶⠶⢤⡤⠤⠶⣿⠁⠀");
System.out.println("⠀⠀⠀⢀⣠⣤⣶⠶⠋⣵⠋⢰⠇⣼⣱⠁⢹⠗⢲⡟⠦⣤⠼⠛⠦⠞⠃⠀⠀");
System.out.println("⠀⢀⣴⡿⠋⠁⢠⣰⠞⠁⣰⣯⣼⠁⡏⠀⢸⠀⠸⡇⠀⢸⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⣼⠋⢀⣠⡴⣟⢁⣠⡞⢻⡿⠁⢰⡇⠀⢸⣄⠀⢷⠀⠸⣆⠀⠀⠀⠀⠀⠀");
System.out.println("⢸⢇⣴⡿⠋⠄⣼⡿⠁⠀⣾⠁⠀⠸⡇⠀⠀⢿⡄⠘⣆⠀⠹⣦⠀⠀⠀⠀⠀");
System.out.println("⢠⣾⠏⠀⠀⢠⣿⠀⠀⠀⣿⡄⠀⠀⢿⠀⠀⠈⣷⡄⠹⣧⠀⠙⢷⣄⠀⠀⠀");
System.out.println("⢸⡟⠀⠀⠀⢸⣿⠀⠀⠀⢹⣧⠀⠀⠸⣷⠀⠀⠸⣷⡀⠹⣦⠀⠀⠻⣧⠀⠀");
System.out.println("⢸⡇⠀⠀⠀⠀⣿⡆⠀⠀⠀⢻⣧⠀⠀⢻⡆⠀⠀⠹⣧⠀⠹⣇⠀⠀⢻⣧⠀");
System.out.println("⢸⣇⠀⠀⠀⠀⠘⣿⣄⠀⠀⠀⠹⣧⠀⠘⣿⠀⠀⠀⣿⡇⠀⢿⣄⠀⠀⣿⡇");
System.out.println("⢈⣿⡄⠀⠀⠀⠀⠘⣿⣄⠀⠀⠀⠈⠣⡀⢿⡆⠀⠀⣿⠃⠀⠘⣿⡀⠀⢸⡇");
System.out.println("⠀⠘⠃⠀⠀⠀⠀⠀⠈⢿⣧⠀⠀⠀⠀⠀⢸⣷⢀⡼⠃⠀⠀⠀⣿⡇⠀⢸⡇");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣧⡀⠀⠀⠀⢸⣿⠈⠀⠀⠀⠀⠀⣿⡇⠀⡾⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⡄⠀⠀⣸⡏⠀⠀⠀⠀⠀⣸⡟⠀⠀⠁⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⠀⠀⠀⠀⢀⣴⠟⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠃⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }
}
