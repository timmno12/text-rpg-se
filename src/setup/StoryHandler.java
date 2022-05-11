package setup;

import java.util.ArrayList;

public class StoryHandler {
    public Reaction handle(Reaction reaction){

        ArrayList<Target> playerAnswers = new ArrayList<>();
        ArrayList<Target> genAnswers = new ArrayList<>();

        if(reaction.getTarget()!=null) {
            //progress
            if (reaction.getTarget().isProgression()) {
                reaction.getStoryTracker().progress();
                reaction.getLocation().setText("Location: " + reaction.getStoryTracker().getLocation());
                reaction.getTarget().setProgression(false);
            }

            //simple targets
            if(reaction.getTarget().getState() == 10) {
                if (reaction.getTarget().getActionType() == "take") {
                    reaction.getPlayer().addToInventory(reaction.getTarget().getName());
                }
                reaction.setLocked(false);
                return reaction;
            }

            //output for first time talking
            if(reaction.getMainTextShow()!=null && reaction.getTarget().getActionType().equalsIgnoreCase("talk")) {
                for (Target temp : data.DATA) {
                    if (temp.getLocation().equals(reaction.getTarget().getLocation()) && temp.getName().equalsIgnoreCase(reaction.getTarget().getName()) && temp.getActionType().equalsIgnoreCase(reaction.getTarget().getActionType())) {
                        if (temp.getState() == 1 || temp.getState() == 9) {
                            playerAnswers.add(temp);
                           }
                    }
                }
                reaction.getMainTextShow().append(reaction.getTarget().getName() + ": " + reaction.getTarget().getDialogue() + "\nYou say...\n");

                int i = 0;
                while (i < playerAnswers.size()) {
                    reaction.getMainTextShow().append(i + 1 + ". " + playerAnswers.get(i).getDialogue() + "\n");
                    i++;
                }
                reaction.setLocked(true);
                return reaction;
            }
        }

        //dialog
        for(Target temp:data.DATA){
            if(temp.getLocation().equals(reaction.getTarget().getLocation()) && temp.getName().equalsIgnoreCase(reaction.getTarget().getName()) && temp.getActionType().equalsIgnoreCase(reaction.getTarget().getActionType())){
                if(temp.getState() == 1 || temp.getState() == 9){
                    playerAnswers.add(temp);
                }else if (temp.getState()!=0){
                    genAnswers.add(temp);
                }
            }
        }

        //takes char input and gives correct dialogue
        if(reaction.getOption() != null){
            //end conversation with last dialogue option
            if(reaction.getOption() == playerAnswers.size()){
                Target t = genAnswers.get(reaction.getOption()-1);
                reaction.setTarget(t);
                reaction.setLocked(false);
            }
            else {
            //other dialogue
            Target t = genAnswers.get(reaction.getOption()-1);
            reaction.setTarget(t);
            reaction.setLocked(true);
            }
        }return reaction;


    }

}
