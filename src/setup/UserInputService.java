package setup;

import javax.swing.*;

public class UserInputService {
    private static JTextField userInput;
    private static JTextArea mainTextShow;

    public UserInputService(JTextField userInput, JTextArea mainTextShow) {
        this.userInput = userInput;
        this.mainTextShow = mainTextShow;
    }


    public static void receiveUserInput(JTextField userInput, JTextArea mainTextShow) {
        mainTextShow.append(">" + userInput.getText() + "\n");


        mainTextShow.append("NPC: " + ReactionToUserInput.reactToUserInput(userInput) + "\n");


        userInput.setText("");

    }
}
