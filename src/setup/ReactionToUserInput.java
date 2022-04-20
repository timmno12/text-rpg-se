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

        //Überprüft mit welchem Command der eingegebene Text beginnt und verarbeitet anschließend den darauf folgenden restlichen Text.
        if (userInput.getText().startsWith("say ")) {
            String text = userInput.getText().replace("say ", "");

            if (dialogues.get(text) != null) {

                return dialogues.get(text);
            } else {
                return "This is unbelievable !";
            }
        } else{
            return "command not found";
        }



    }
}


