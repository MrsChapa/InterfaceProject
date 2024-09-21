interface VirtualMuseumTour {
/**
 * @author De'Marcus Thomas
 * @since 1.4.8
 * VirtualMuseumTour is an interface that holds methods to add to classes that make a VirtualMuseumTour program. Every method in this class 
 * is void because they'll all use print statements to give the tour experience. 
 */
 
 /**
  * tourStart starts the tour program. All methods in the interface will run inside of tourStart. Tourstart starts with the tour guide
  * the tour guide introducing himself/herself.
  */
    void tourStart();
/**
 * introduceRoom gives a general description to the room and what animal is in it. 
 */
    void introduceRoom();
/** 
 * tellFact tells facts about the animal out of the small ArrayList facts in a given Exhibit. It does by using a for loop to 
 * print each fact from the list. Before any of this, the tour guide transitions into this part of the tour/ print statement to let 
 * museum goers know that it's time for facts about the animal.
 * @param facts - a list of facts about the animal in the exhibit.
 */
    void tellFacts(ArrayList<String> facts);
/**
 * viewAnimal provides descriptive visual imagery about the animal in a given exhibit by taking strings randomly from descs. This method
 * uses a scanner to ask the museum goer if they would like to view the animal. If the user enters yes, a random description will be 
 * pulled from descs. If the user says no, this method will end. Before any of this, the tour guide transitions into this part of the tour/
 * print statement saying that the user can take a look at the animal in the exhibit if they would like.
 */
    void viewAnimal(ArrayList<String> descs);
}