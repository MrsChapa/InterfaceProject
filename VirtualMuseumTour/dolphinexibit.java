import java.util.Scanner;
import java.util.*;
public class DolphinExibit implements VirtualMuseumTour{
    public Scanner input = new Scanner(System.in);
public ArrayList<String> fact = new ArrayList<String>(Arrays.asList("Dolphins Are Carnivores",
                                                                "Dolphins Only Sleep with Half of Their Brain",
                                                                "A Dolphin Can Swim More than 20MPH",
                                                                "Dolphins Do Not Have Hair",
                                                                "A Group of Dolphins is Called a Pod"));
    public ArrayList<String> descriptions = new ArrayList<String>(Arrays.asList("This Dolphin is gray with a light underbelly and is about 10 feet long",
                                                                "This Dolphin is gray with a light gray band running from its eye to the flipper and measures about 6 feet long",
                                                                "This dolphin is black with a lighter belly, a blunt snout, curved dorsal fins amd 5 feet long"));
    public void tourStart(){
        System.out.println("Welcome to the Dolphin Exibit");
        System.out.println("My name is David and I will be your tour guide today");
        introduceRoom();
        tellFacts(fact);
        viewAnimal(descriptions);
    }
    public void introduceRoom(){
        System.out.println("In this room we have some shallow warm water as well as some coral reefs for the dolphins to swim around in");
    }
    public void tellFacts(ArrayList<String> facts){
        System.out.println("Lets learn some fun facts about dolphins");
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
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠔⠒⣢⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⢀⡠⠤⠤⠤⠮⣅⡀⠀⡎⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⢀⠔⠊⠁⠀⠀⠀⠀⠀⠀⠈⠑⢧⡀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠰⠁⠀⡄⠀⠀⢀⠀⠈⠑⠒⠖⣲⠄⠙⢦⠀⠀⠀⠀⠀");
            System.out.println("⠀⡇⣠⠔⠁⠀⡀⣈⣐⠒⣒⣊⠉⠀⠀⠀⠈⢳⠀⠀⠀⠀");
            System.out.println("⢠⠫⢊⡠⠔⠊⠣⡀⠈⠢⣀⠀⠉⠒⢄⠀⠀⠈⣇⠀⠀⠀");
            System.out.println("⠘⠕⠁⠀⠀⠀⠀⠈⠁⠒⠊⠁⠀⠀⠀⠱⡄⠀⢹⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⢱⠀⢸⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠾⠂⠛⠦⣄⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠃⣀⡤⢤⣀⡘⡆");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠏⠀⠀⠀⠀⠙⡟");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉");

    }
}
