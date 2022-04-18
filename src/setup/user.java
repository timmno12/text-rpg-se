package setup;

public class user {
    private String charName;
    private String chosenClass;
    private int userDMG;
    private int userDEF;
    private int userDODGE;

    public user(String charName, String chosenClass, int userDMG, int userDEF, int userDODGE){
        this.charName = charName;
        this.chosenClass = chosenClass;
        this.userDMG = userDMG;
        this.userDEF = userDEF;
        this.userDODGE = userDODGE;
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
