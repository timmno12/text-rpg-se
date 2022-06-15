package setup;

import javax.swing.*;
import java.util.ArrayList;

public class Spawner {
    //spawn objects in location

    private String oldName = "";

    public Player spawnPlayer(String chosenClass) {
        return new Player(chosenClass);
    }

    public void spawnObjects(String location, ArrayList<Target> targets) {
        for (Target t : data.DATA) {
            if (location.equalsIgnoreCase(t.getLocation())) {
                String newName = t.getName();
                if (!oldName.equalsIgnoreCase(newName)) {
                    oldName = newName;
                    targets.add(t);
                }
            }
        }
    }

    public void refreshState(String location, ArrayList<Target> targets) {
        spawnObjects(location, targets);
    }
}
