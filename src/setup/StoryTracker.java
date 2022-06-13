package setup;

public class StoryTracker {

    private int tracker = 0;

    private String[] locations = {"Cage","Storage Room", "Hallway (Basement)", "Hallway (Basement) II", "Eerie Crypt (left room)", "Ruins of a crumbled church", "Ruins of a crumbled church ", "Hallway (Basement) III", "Hallway (Basement) IV", "Foggy void", "Foggy void II", "Foggy void III", "Light flooded cave", "Hallway (Basement) V"};

    //Cage
    private String[] targets_0= {"sister","piece of wire"};

    //Storage Room
    private String[] targets_1= {"sister","piece of wire","door"};

    //Hallway (Basememt)
    private String[] targets_2= {"sister","piece of wire", "door ahead", "cat"};

    //"Hallway (Basement) II"
    private String[] targets_3= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button"};

    //Eerie Crypt (left room)
    private String[] targets_4= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble"};

    //Ruins of a crumbled church
    private String[] targets_5= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "cloth", "lion"};

    //Ruins of a crumbled church <- Mit Leerzeichen hinten dran
    private String[] targets_6= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "cloth", "lion"};

    //Hallway (Basement) III
    private String[] targets_7= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "cloth", "lion", "dandelion"};

    //Hallway (Basement) IV
    private String[] targets_8= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "cloth", "lion", "dandelion"};

    //Foggy void
    private String[] targets_9= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "cloth", "lion", "dandelion", "ahead", "right", "left"};

    //Foggy void II
    private String[] targets_10= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "cloth", "lion", "dandelion", "ahead", "right", "left"};

    //Foggy void III
    private String[] targets_11= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "cloth", "lion", "dandelion", "ahead", "right", "left"};

    //Light flooded cave
    private String[] targets_12= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "cloth", "lion", "dandelion", "ahead", "right", "left", "cat"};

    //Hallway (Basement) V
    private String[] targets_13= {"sister","piece of wire", "door ahead", "cat", "right door", "left door", "door behind", "raven", "button", "pedestal", "marble", "cloth", "lion", "dandelion", "ahead", "right", "left", "cat"};

    private String[][] targets = {targets_0, targets_1, targets_2, targets_3, targets_4, targets_5, targets_6, targets_7, targets_8, targets_9, targets_10, targets_11, targets_12, targets_13};

    public void progress(){
       tracker +=1;
    }

    public String getLocation() {
        return locations[tracker];
    }

    public String[] getTargets() {
        return targets[tracker];
    }
    public int getTracker() {
        return tracker;
    }

}
