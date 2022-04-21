package setup;

import java.util.ArrayList;

public class Player {
    private String charName;
    private String chosenClass;
    private int userDMG;

    private int userLP;

    private int userDEF;
    private int userDODGE;

    private ArrayList<Item> itemList = new ArrayList<Item>();


    //TODO Möglichkeit überlegen Werte von Classes heraus zubekommen um in Konstruktur des Users zu bekommen
    //TODO Eventuell durch Index einer Liste -> Main Ablauf Klasse??!?!?
    public Player(String charName, String chosenClass, int userDMG, int userLP, int userDEF, int userDODGE, ArrayList<Item> itemList) {
        this.charName = charName;
        this.chosenClass = chosenClass;
        this.userDMG = userDMG;
        this.userLP = userLP;
        this.userDEF = userDEF;
        this.userDODGE = userDODGE;
        this.itemList = itemList;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getChosenClass() {
        return chosenClass;
    }

    public void setChosenClass(String chosenClass) {
        this.chosenClass = chosenClass;
    }

    public int getUserDMG() {
        return userDMG;
    }

    public void setUserDMG(int userDMG) {
        this.userDMG = userDMG;
    }

    public int getUserLP() {
        return userLP;
    }

    public void setUserLP(int userLP) {
        this.userLP = userLP;
    }

    public int getUserDEF() {
        return userDEF;
    }

    public void setUserDEF(int userDEF) {
        this.userDEF = userDEF;
    }

    public int getUserDODGE() {
        return userDODGE;
    }

    public void setUserDODGE(int userDODGE) {
        this.userDODGE = userDODGE;
    }
}
