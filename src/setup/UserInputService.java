package setup;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserInputService {
    private static JTextField userInput;
    private static JTextArea mainTextShow;
    private static String location;
    private static ArrayList<Target> targets;

    public UserInputService(JTextField userInput, JTextArea mainTextShow, String location, ArrayList<Target> targets) {
        this.userInput = userInput;
        this.mainTextShow = mainTextShow;
        this.location = location;
        this.targets = targets;
    }


    public static void receiveUserInput(JTextField userInput, JTextArea mainTextShow, String location, ArrayList<Target> targets) {
        mainTextShow.append(">" + userInput.getText() + "\n");


        mainTextShow.append(ReactionToUserInput.reactToUserInput(userInput,location, targets) + "\n");


        userInput.setText("");

    }
    public static void userSetup(JTextField userInput,JTextArea mainTextShow, String playerName){
        PlayerClasses base = new PlayerClasses("Base","Base",100,7,7,6);
        PlayerClasses mage = new PlayerClasses("Mage","Squirrel",100,10,5,5);
        PlayerClasses warrior = new PlayerClasses("Warrior","Mouse",100,9,10,1);
        PlayerClasses assassin = new PlayerClasses("Assassin","Frog",100,7,3,10);

        ArrayList<PlayerClasses> playerClasses = new ArrayList<>();
        playerClasses.add(base);
        playerClasses.add(mage);
        playerClasses.add(warrior);
        playerClasses.add(assassin);
        ArrayList<String> className = new ArrayList<>();
        className.add(base.getAnimalName());
        className.add(mage.getAnimalName());
        className.add(warrior.getAnimalName());
        className.add(assassin.getAnimalName());

        for(String pc: className){
            if(userInput.getText().equalsIgnoreCase(pc)){
                int indexClass = className.indexOf(pc);
                Player user = new Player(playerName,playerClasses.get(indexClass));
                mainTextShow.append("You've choosen the " + user.getChosenClass() + "/" + user.getAnimalName() + "! Now the Story can begin!1\n");
            }
        }

        userInput.setText("");
    }

}
