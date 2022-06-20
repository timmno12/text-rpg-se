package setup;

public class Target {
    private String location;
    private String name;

    public String getName2() {
        return name2;
    }

    private String name2;

    private String actionType;
    private String dialogue;
    private int state;

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getActionType() {
        return actionType;
    }

    public String getDialogue() {
        return dialogue;
    }

    public int getState() {
        return state;
    }

    public boolean isProgression() {
        return progression;
    }

    public void setProgression(boolean progression) {
        this.progression = progression;
    }

    private boolean progression;

    public Target(String location, String name ,String name2, String actionType, String dialogue, int state, boolean progression) {
        this.location = location;
        this.name = name;
        this.name2=name2;
        this.actionType = actionType;
        this.dialogue = dialogue;
        this.state = state;
        this.progression = progression;
    }
}
