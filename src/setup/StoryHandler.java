package setup;

import javax.swing.*;
import java.util.ArrayList;

public class StoryHandler {
    // gets a valid Target from react
    // check if progress, check state of objects in location (dialog/norm text)
    private ArrayList<String> dialogue = new ArrayList<>();
    //gets target t, check state
    public String handle(Target t, StoryTracker storyTracker, JTextArea location, Player player){

        if (t.isProgression()){
            storyTracker.progress();
            location.setText("Location: "+storyTracker.getLocation());
            t.setProgression(false);
        }
        if(t.getState() == 10){
            if (t.getActionType()=="take")
            {
                player.addToInventory(t.getName());
            }
            return t.getDialogue();
        }
        else if (t.getState()<10){
            for(Target temp: data.DATA){
                if(temp.getLocation().equals(t.getLocation()) && temp.getName().equalsIgnoreCase(t.getName()) && temp.getActionType().equalsIgnoreCase(t.getActionType())){
                    dialogue.add(temp.getDialogue());
                }
            }
            // TODO: Check state of objects in location(here: targets).
            //  The targets list given to handle() is going to get changed to a list with different classes (Enemy,Item,etc.) -> some superclass maybe
            //  Change the targets ArrayList<> (in window, spawner and everywhere
            //  Maybe: check state , set a state to get into battleHandler from here, set a State to get into Basic Handler
        }
        return "";
    }

}
