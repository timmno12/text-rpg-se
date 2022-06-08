package setup;

public class StoryTracker {
    private int tracker = 0;

    private String[] locations = {"Cage","Storage Room", "Hallway (Basement)", "Hallway (Basement) II", "Eerie Crypt (left room)", "Eerie Crypt (left room)", "Eerie Crypt (left room)"};

    private String[] targets_0= {"sister","piece of wire"};
    private String[] targets_1= {"sister","piece of wire","door"};
    private String[] targets_2= {"sister","piece of wire", "door ahead", "cat"};
    private String[] targets_3= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button"};
    private String[] targets_4= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble"};
    private String[] targets_5= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "chapel", "cloth", "lion"};
    private String[] targets_6= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "chapel", "cloth", "lion"};
    private String[] targets_7= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "chapel", "cloth", "lion"};
    private String[][] targets = {targets_0, targets_1, targets_2, targets_3, targets_4, targets_5, targets_6, targets_7};

    public void progress(){
       tracker +=1;
    }

    public String getLocation() {
        return locations[tracker];
    }

    public String[] getTargets() {
        return targets[tracker];
    }
}
