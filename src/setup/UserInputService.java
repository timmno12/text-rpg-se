package setup;

import javax.swing.*;
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

}
