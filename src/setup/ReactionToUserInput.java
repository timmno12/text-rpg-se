package setup;

import javax.swing.*;
import java.util.ArrayList;
//import java.util.Map;
//import java.util.TreeMap;

public class ReactionToUserInput {
    private static JTextField userInput;
    private static boolean locked = false;
    private static Target oldTarget;

    private static String firstWord="";
    private static String secondWord="";


    public static String reactToUserInput(JTextField userInput, StoryTracker storyTracker, JTextArea location, ArrayList<Target> targets, Player player, JTextArea mainTextShow) {
        StoryHandler storyHandler = new StoryHandler();
        String input = userInput.getText();
        int spaceIndex = input.indexOf(" ");

        // TODO: Check ob locked or not -> if false proceed , else check if input is viable (number from 1-maxOptions)

        if (input.equalsIgnoreCase("exit")) {
            System.exit(0);

        }

        if (spaceIndex != -1) {
            firstWord = input.substring(0, spaceIndex);
            secondWord = input.substring(spaceIndex +1);
        }
        if (spaceIndex == -1){
            firstWord = input.substring(0);
            secondWord = "";
        }

        if (locked == true) {
            try {
                Integer option = Integer.parseInt(firstWord);
                Reaction out = storyHandler.handle(new Reaction(option, locked, oldTarget, player,mainTextShow));
                locked = out.isLocked();
                return out.getTarget().getName() + ": " + out.getTarget().getDialogue() +"\n";
            }catch (NumberFormatException e){
                return "Input has to be a number\n";
            }
        }

        for (Target t : data.DATA) {
            if (storyTracker.getLocation().equalsIgnoreCase(t.getLocation())) {
                // check if valid command in location ->
                if (firstWord.equalsIgnoreCase(t.getActionType()) && secondWord.equalsIgnoreCase(t.getName())) {

                    Reaction reaction = new Reaction(t, storyTracker, location, mainTextShow, player); //in
                    if (firstWord.equalsIgnoreCase("use")&& !player.isInInventory(secondWord)){
                        return BasicHandler.handle(firstWord, secondWord, player) + "\n";

                    }
                    else{
                        Reaction out = storyHandler.handle(reaction);
                        locked = out.isLocked();
                        oldTarget = out.getTarget();
                        if (locked == true) {
                            return "";
                        }
                        return out.getTarget().getDialogue() + "\n";
//                    else if (firstWord.equalsIgnoreCase("attack")){
//                            BattleSystem.keepFighting();
//                    }

                    }


                }
            }
        }
            return BasicHandler.handle(firstWord, secondWord, player) + "\n";



    }
}



