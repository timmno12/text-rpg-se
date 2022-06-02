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


    public static void receiveUserInput(JTextField userInput, JTextArea mainTextShow, StoryTracker storyTracker, JTextArea location, ArrayList<Target> targets, Player player) {
        mainTextShow.append(">" + userInput.getText() + "\n");


        mainTextShow.append(ReactionToUserInput.reactToUserInput(userInput,storyTracker, location, targets,player, mainTextShow)); //TODO if something BUGGY add "\n" after first )


        userInput.setText("");

    }
    public static void userSetup(JTextField userInput,JTextArea mainTextShow, Player player, StoryTracker storyTracker,JTextArea location){
        Proxy proxy = new Proxy();
        player.setChosenClass((PlayerClasses) Array.get(data.playerClasses,proxy.userChosenClass(userInput.getText())));
        player.setAnimalName((PlayerClasses) Array.get(data.playerClasses,proxy.userChosenClass(userInput.getText())));
        player.setUserLP(((PlayerClasses) Array.get(data.playerClasses,proxy.userChosenClass(userInput.getText()))).getClassLP());
        player.setUserDEF(((PlayerClasses) Array.get(data.playerClasses,proxy.userChosenClass(userInput.getText()))).getClassDEF());
        player.setUserDODGE(((PlayerClasses) Array.get(data.playerClasses,proxy.userChosenClass(userInput.getText()))).getClassDodge());
        player.setUserDMG(((PlayerClasses) Array.get(data.playerClasses,proxy.userChosenClass(userInput.getText()))).getClassATK());
        mainTextShow.append("You've choosen the " + player.getChosenClass() + "/" + player.getAnimalName() + "! Now the Story can begin!\n You wake up to the rattling cage right next to you. Your head aches. It’s dark but you can tell the " + player.getAnimalName().toLowerCase() + " in the other cage is your little sister.\n");
        location.setText("Location: " + storyTracker.getLocation());

        userInput.setText("");
    }

}
