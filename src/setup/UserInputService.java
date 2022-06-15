package setup;

import javax.swing.*;
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

}
