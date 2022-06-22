package setup;

import javax.swing.*;
import java.util.ArrayList;

public class StoryHandler {
    public Reaction handle(Reaction reaction){

        ArrayList<Target> playerAnswers = new ArrayList<>();
        ArrayList<Target> genAnswers = new ArrayList<>();
        Proxy proxy = new Proxy();
        BattleSystem battleSystem = new BattleSystem();

        Target target = reaction.getTarget();
        StoryTracker storyTracker = reaction.getStoryTracker();
        JTextArea location = reaction.getLocation();
        Player player = reaction.getPlayer();
        JTextArea mainTextShow = reaction.getMainTextShow();
        Integer option = reaction.getOption();

        //progress
        if (target.isProgression()) {
            storyTracker.progress();
            location.setText("Location: " + storyTracker.getLocation());
            target.setProgression(false);
        }

        //archievements
        if(storyTracker.getTracker() == 8) {
            player.achievements[0][1] = "1";
        }
        if(storyTracker.getTracker() == 14){
            player.achievements[1][1] = "1";
        }

        //no dialogue
        if(option ==null) {
            //simple targets + take objects
            if(target.getState() == 10) {
                if (target.getActionType() == "take") {
                    player.addToInventory(target.getName());
                }
                reaction.setLocked(false);
                return reaction;
            }
            //attack command leads to battle
            if(target.getState() == 8){
                battleSystem.startFight(reaction,proxy.getEnemy());
                mainTextShow.append("You started a fight with " + target.getName() + "\n");
                if(target.isProgression()){
                    storyTracker.progress();
                    location.setText("Location: " + storyTracker.getLocation());
                    target.setProgression(false);
                }
                return reaction;
            }

            //output for first time talking
            if(mainTextShow !=null && target.getActionType().equalsIgnoreCase("talk")) {
                playerAnswers = proxy.firstTimeTalking(playerAnswers,reaction);
                int i = 0;
                mainTextShow.append(target.getName() + ": " + target.getDialogue() + "\nYou say...\n");
                while (i < playerAnswers.size()) {
                    System.out.println("Aufruf:" + i);
                    mainTextShow.append(i + 1 + ". " + playerAnswers.get(i).getDialogue() + "\n");

                    i++;
                }
                reaction.setLocked(true);
                return reaction;
            }
        }
        //dialog
        proxy.dialogue(playerAnswers,genAnswers,reaction);


        //end conversation with last dialogue option
        if(option == playerAnswers.size()){
            Target t = genAnswers.get(option -1);

            //end of conversation leads to battle
            if(t.getState() == 8){
                battleSystem.startFight(reaction,data.enemies[0]);
                mainTextShow.append("You started a fight with " + target.getName() + "\n");
                if(playerAnswers.get(option -1).isProgression()){
                    storyTracker.progress();
                    location.setText("Location: " + storyTracker.getLocation());
                    target.setProgression(false);
                }
            }

            reaction.setTarget(t);
            reaction.setLocked(false);

        }
        else {
            //other dialogue
            Target t = genAnswers.get(option -1);
            reaction.setTarget(t);
            reaction.setLocked(true);

        }return reaction;


    }

}
