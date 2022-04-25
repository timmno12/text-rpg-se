package setup;

public class Target {
    private String location;
    private String name;
    private String actionType;
    private String dialogue;
    private int state;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isProgression() {
        return progression;
    }

    public void setProgression(boolean progression) {
        this.progression = progression;
    }

    private boolean progression;

    public Target(String location, String name, String actionType, String dialogue, int state, boolean progression) {
        this.location = location;
        this.name = name;
        this.actionType = actionType;
        this.dialogue = dialogue;
        this.state = state;
        this.progression = progression;
    }
}
