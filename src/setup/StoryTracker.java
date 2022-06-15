package setup;

public class StoryTracker {

    private int tracker = 0;

    private String[] locations = {"Cage","Storage Room", "Hallway (Basement)", "Hallway (Basement) ", "Hallway (Basement) II", "Eerie Crypt (left room)", "Ruins of a crumbled church", "Ruins of a crumbled church ", "Hallway (Basement) III", "Hallway (Basement) IV", "Foggy void", "Foggy void II", "Foggy void III", "Light flooded cave", "Hallway (Basement) V"};

    public void progress(){
       tracker +=1;
    }

    public String getLocation() {
        return locations[tracker];
    }

    public int getTracker() {
        return tracker;
    }

}
