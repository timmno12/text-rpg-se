package setup;

public class StoryTracker {
    private int tracker = 0;

    private String[] locations = {"Cage","Storage Room", "Hallway (Basement)", ""};

    private String[] targets_0= {"sister","piece of wire"};
    private String[] targets_1= {"sister","piece of wire","door"};
    private String[] targets_2= {"sister","piece of wire", "door ahead", "cat"};
    private String[] targets_3= {"sister","piece of wire", "door ahead", "cat"};

    private String[][] targets = {targets_0, targets_1, targets_2,targets_3};

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
