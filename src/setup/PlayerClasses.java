package setup;

import java.util.ArrayList;

public class PlayerClasses{
    private String className;


    private String animalName;
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    private int classLP;
    private int classATK;
    private int classDEF;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassLP() {
        return classLP;
    }

    public void setClassLP(int classLP) {
        this.classLP = classLP;
    }

    public int getClassATK() {
        return classATK;
    }

    public void setClassATK(int classATK) {
        this.classATK = classATK;
    }

    public int getClassDEF() {
        return classDEF;
    }

    public void setClassDEF(int classDEF) {
        this.classDEF = classDEF;
    }

    public int getClassDodge() {
        return classDodge;
    }

    public void setClassDodge(int classDodge) {
        this.classDodge = classDodge;
    }

    private int classDodge;


    public PlayerClasses(String className, String animalName, int classLP, int classATK, int classDEF, int classDodge) {
        this.className = className;
        this.animalName = animalName;
        this.classLP = classLP;
        this.classATK = classATK;
        this.classDEF = classDEF;
        this.classDodge = classDodge;
    }

}
