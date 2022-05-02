package setup;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserInputService {
    private static JTextField userInput;
    private static JTextArea mainTextShow;
    private static StoryTracker storyTracker;
    private static ArrayList<Target> targets;

    public UserInputService(JTextField userInput, JTextArea mainTextShow, StoryTracker storyTracker, JTextArea location,ArrayList<Target> targets) {
        this.userInput = userInput;
        this.mainTextShow = mainTextShow;
        this.storyTracker = storyTracker;
        this.targets = targets;
    }


    public static void receiveUserInput(JTextField userInput, JTextArea mainTextShow, StoryTracker storyTracker, JTextArea location,ArrayList<Target> targets) {
        mainTextShow.append(">" + userInput.getText() + "\n");


        mainTextShow.append(ReactionToUserInput.reactToUserInput(userInput,storyTracker, location, targets) + "\n");


        userInput.setText("");

    }
    public static void userSetup(JTextField userInput,JTextArea mainTextShow, Player player, StoryTracker storyTracker,JTextArea location){
        PlayerClasses base = new PlayerClasses("Base","Base",100,7,7,6);
        PlayerClasses mage = new PlayerClasses("Mage","Squirrel",100,10,5,5);
        PlayerClasses warrior = new PlayerClasses("Warrior","Mouse",100,9,10,1);
        PlayerClasses assassin = new PlayerClasses("Assassin","Frog",100,7,3,10);

        ArrayList<PlayerClasses> playerClasses = new ArrayList<>();
        playerClasses.add(base);
        playerClasses.add(mage);
        playerClasses.add(warrior);
        playerClasses.add(assassin);
        ArrayList<String> animalName = new ArrayList<>();
        animalName.add(base.getAnimalName());
        animalName.add(mage.getAnimalName());
        animalName.add(warrior.getAnimalName());
        animalName.add(assassin.getAnimalName());

        for(String pc: animalName){
            if(userInput.getText().equalsIgnoreCase(pc)){
                int indexClass = animalName.indexOf(pc);
                player.setChosenClass(playerClasses.get(indexClass));
                player.setAnimalName(playerClasses.get(indexClass));
                mainTextShow.append("You've choosen the " + player.getChosenClass() + "/" + player.getAnimalName() + "! Now the Story can begin!\n You wake up to the rattling cage right next to you. Your head aches. It’s dark but you can tell the "+ player.getAnimalName().toLowerCase()+" in the other cage is your little sister.\n");
                location.setText("Location: "+ storyTracker.getLocation());
            }
        }

        userInput.setText("");
    }

}
