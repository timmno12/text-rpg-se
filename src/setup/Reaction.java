package setup;


import javax.swing.*;


public class Reaction {

    private Target target;

    private StoryTracker storyTracker;

    private JTextArea location;

    private boolean locked;

    private JTextArea mainTextShow;

    private Integer option;

    private Player player;

    public Reaction(Target target, StoryTracker storyTracker, JTextArea location, JTextArea mainTextShow, Player player) {

        this.target = target;

        this.storyTracker = storyTracker;

        this.location = location;

        this.mainTextShow = mainTextShow;

        this.player = player;
    }


    public Reaction(StoryTracker storyTracker,JTextArea location, Integer option, boolean locked, Target target, Player player, JTextArea mainTextShow) {

        this.storyTracker = storyTracker;
        this.location = location;
        this.option = option;

        this.locked = locked;

        this.target = target;

        this.player = player;

        this.mainTextShow = mainTextShow;
    }

    public Target getTarget() {

        return target;

    }

    public void setTarget(Target target) {

        this.target = target;

    }

    public StoryTracker getStoryTracker() {

        return storyTracker;

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public JTextArea getLocation() {

        return location;

    }

    public boolean isLocked() {

        return locked;

    }

    public void setLocked(boolean locked) {

        this.locked = locked;

    }

    public JTextArea getMainTextShow() {

        return mainTextShow;

    }

    public Integer getOption() {

        return option;

    }


}