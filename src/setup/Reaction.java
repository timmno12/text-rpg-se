package setup;


import javax.swing.*;


public class Reaction {

    private Target target;

    private StoryTracker storyTracker;

    private JTextArea location;

    private boolean locked;

    private JTextArea mainTextShow;

    private Integer option;


    public Reaction(Target target, StoryTracker storyTracker, JTextArea location, JTextArea mainTextShow) {

        this.target = target;

        this.storyTracker = storyTracker;

        this.location = location;

        this.mainTextShow = mainTextShow;

    }


    public Reaction(StoryTracker storyTracker, JTextArea location, boolean locked, JTextArea mainTextShow) {

        this.storyTracker = storyTracker;

        this.location = location;

        this.locked = locked;

        this.mainTextShow = mainTextShow;

    }


    public Reaction(Integer option, boolean locked, Target target) {

        this.option = option;

        this.locked = locked;

        this.target = target;

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

    public void setStoryTracker(StoryTracker storyTracker) {

        this.storyTracker = storyTracker;

    }

    public JTextArea getLocation() {

        return location;

    }

    public void setLocation(JTextArea location) {

        this.location = location;

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