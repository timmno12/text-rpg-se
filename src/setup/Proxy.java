package setup;

import java.util.ArrayList;

public class Proxy {
    public Proxy() {
    }

    public ArrayList<Target> firstTimeTalking(ArrayList<Target> playerAnswers, Reaction reaction) {
        for (Target temp : data.DATA) {
            if (temp.getLocation().equals(reaction.getTarget().getLocation()) && temp.getName().equalsIgnoreCase(reaction.getTarget().getName()) && temp.getActionType().equalsIgnoreCase(reaction.getTarget().getActionType())) {
                if (temp.getState() == 1 || temp.getState() == 9) {
                    playerAnswers.add(temp);
                }
            }
        }
        return playerAnswers;
    }
    public void dialogue(ArrayList<Target> playerAnswers, ArrayList<Target> genAnswers, Reaction reaction){
        for(Target temp:data.DATA){
            if(temp.getLocation().equals(reaction.getTarget().getLocation()) && temp.getName().equalsIgnoreCase(reaction.getTarget().getName()) && temp.getActionType().equalsIgnoreCase(reaction.getTarget().getActionType())){
                if(temp.getState() == 1 || temp.getState() == 9){
                    playerAnswers.add(temp);
                }else if (temp.getState()!=0){
                    genAnswers.add(temp);
                }
            }
        }
    }
}
