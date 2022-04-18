package setup;

import javax.swing.*;
import java.util.Map;
import java.util.TreeMap;

public class ReactionToUserInput {
    private static JTextField userInput;

    private static Map<String, String> dialogues;

    static {
        dialogues = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        dialogues.put("hello", "Greetings Traveler");
        dialogues.put("attack","warum ?");
        dialogues.put("Mathe ist cool", "Weitz mag dich");
    }


    public ReactionToUserInput() {
        this.userInput = userInput;


    }


    public static String reactToUserInput(JTextField userInput) {

        if (userInput.getText().equalsIgnoreCase("exit")) {
            System.exit(0);

        }

        if (dialogues.get(userInput.getText()) != null) {

            return dialogues.get(userInput.getText());
        } else {
            return "This is unbelievable !";
        }


    }
}


