package setup;

import javax.swing.*;
import java.util.ArrayList;
//import java.util.Map;
//import java.util.TreeMap;

public class ReactionToUserInput {
    private static JTextField userInput;
    private boolean locked = false;

    private static String firstWord="";
    private static String secondWord="";


    public static String reactToUserInput(JTextField userInput, StoryTracker storyTracker, JTextArea location,ArrayList<Target> targets) {
        StoryHandler storyHandler = new StoryHandler();
        String input = userInput.getText();
        int spaceIndex = input.indexOf(" ");

        // TODO: Check ob locked or not -> if false proceed , else check if input is viable (number from 1-maxOptions)

        if (input.equalsIgnoreCase("exit")) {
            System.exit(0);

        }

        if (spaceIndex != -1) {
            // firstWord = actionType, secondWord = name (of target)
            firstWord = input.substring(0,spaceIndex);
            secondWord = input.substring(spaceIndex+1);
        }

        for (Target t:data.DATA){
            if (storyTracker.getLocation().equalsIgnoreCase(t.getLocation())){
                // check if valid command in location ->
                if (firstWord.equalsIgnoreCase(t.getActionType()) && secondWord.equalsIgnoreCase(t.getName())){

                    return storyHandler.handle(t, storyTracker, location);
                    }
//                    else if (firstWord.equalsIgnoreCase("attack")){
//                            //battle handler
//                            return "Into battle!!";
//                    }

            }
        }
        //if loop has been completed and no return so far -> basic Handler
        //firstWord ="";
        //secondWord ="";

        return BasicHandler.handle(firstWord, secondWord);



    }



        //Überprüft mit welchem Command der eingegebene Text beginnt und verarbeitet anschließend den darauf folgenden restlichen Text.
//        if (userInput.getText().startsWith("say ")) {
//            String text = userInput.getText().replace("say ", "");
//
//            if (dialogues.get(text) != null) {
//
//                return dialogues.get(text);
//            } else {
//                return "This is unbelievable !";
//            }
//        } else{
//            return "command not found";
//        }



    }




