import java.util.Scanner;
import java.util.*;
public class TurtleExibit implements VirtualMuseumTour{
    public Scanner input = new Scanner(System.in);
    public ArrayList<String> fact = new ArrayList<String>(Arrays.asList("Turtles belong to one of the oldest reptile groups in the world",
                                                                "Turtles date back to the time of the dinosaurs, over 200 million years ago",
                                                                "A turtle’s shell is actually part of its skeleton",
                                                                "Turtles don’t have teeth",
                                                                "129 of approximately 300 species of turtle and tortoise on Earth today are either vulnerable, endangered, or critically endangered, according to the IUCN"));
    public ArrayList<String> descriptions = new ArrayList<String>(Arrays.asList("This turtle is ablut 3 feet long with a brown smooth heart-shaped shell and a yellowish underbelly",
                                                                "This turtle has a grayish shell with ehite spots that is fexable and leathery with ridges down its back",
                                                                "This turtle has a thick ridged shell that resembles the rough tectured skin of an alligator and a large head"));
    public void tourStart(){
        System.out.println("Welcome to the Turtle Exhibit");
        System.out.println("My name is Susanna and I will be your tour guide today");
        introduceRoom();
        tellFacts(fact);
        viewAnimal(descriptions);
    }
    public void introduceRoom(){
        System.out.println("In this room we have a giant open water tank filled with some coral reefs and some beach for the turtles to lay their eggs in when the time comes");
    }
    public void tellFacts(ArrayList<String> facts){
        System.out.println("Lets learn some fun facts about turtles");
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
        System.out.println("⢸⣷⡦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠙⢿⡪⡑⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠤⠤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠈⠻⣔⣌⠑⠢⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠻⠇⠀⠀⣈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠙⢻⡦⡀⠉⢢⡀⠀⠀⠀⠀⠀⠀⣼⠒⠦⢄⡀⢻⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⢳⡀⠀⠀⠀⠀⡴⠛⠻⠥⣲⣭⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⢇⣠⣴⣖⣾⣦⢤⣀⠀⢨⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣆⣤⣪⠽⠋⠈⣆⠀⠀⠉⠙⣿⡯⡀⢀⡠⠖⠒⠦⢄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡯⠧⠄⢰⡒⠈⠉⠉⠒⢖⠈⠁⢹⠻⡋⠀⠀⠀⢀⠀⠀⡉⠑⠂⢠⠤⠤⠤⢤⣀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣜⡹⠀⠀⠀⠀⢣⠀⠀⠀⠀⢀⡵⠤⣈⢳⢧⡴⣲⣼⠭⠵⠮⠙⠛⠛⠛⠛⠚⠙⠛⠛");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⣸⡽⠀⠀⠀⠀⢀⠤⠳⠤⣤⠔⠉⠀⠀⠀⠙⣺⡉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⣰⢹⠓⠒⠂⢠⡞⠁⠀⠀⠀⠈⢦⡀⠀⠀⠀⠀⣁⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⣿⡯⠀⠀⠀⠀⠱⡀⠀⠀⠀⠀⡠⠷⢄⣀⠀⢰⢫⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⢿⡇⠀⠀⠀⣠⠔⠚⠒⠢⡖⠋⠀⠀⠀⠈⢉⠶⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⢸⡗⠒⠒⡍⠀⠀⠀⠀⠀⢳⣀⡀⠀⠀⢀⣺⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠘⡟⡄⠀⢱⡀⠀⠀⠀⣠⠋⠀⠈⠙⢢⣏⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⢠⢿⢧⣠⠞⠋⠓⠒⣞⠁⠀⠀⡠⣴⡵⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⣠⠏⢘⣿⢢⠀⠀⠀⠀⣘⣦⣔⡾⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⢠⠟⠁⣐⣿⠉⢿⣲⣤⡿⠿⢷⣾⠁⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⢿⠀⢰⣿⠃⠀⠀⠉⠀⠀⠀⡞⡿⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠘⣴⡿⠋⠀⠀⠀⠀⠀⠀⣼⣿⠁⠀⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢽⣀⡤⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }
}
