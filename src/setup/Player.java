package setup;

import java.util.ArrayList;

public class Player {
    private String charName;
    private String animalName;
    private String chosenClass;
    private int userDMG;

    private int userLP;

    private int userDEF;
    private int userDODGE;

    private static ArrayList<Item> itemList = new ArrayList<Item>();

    public String[][] getAchievements() {
        return achievements;
    }


    public void setAchievements(String[][] achievements) {
        this.achievements = achievements;
    }

    private String[][] achievements = {{"cat","1"},{"temple", "0"}};

    private String location;

    //TODO Möglichkeit überlegen Werte von Classes heraus zubekommen um in Konstruktur des Users zu bekommen
    //TODO Eventuell durch Index einer Liste -> Main Ablauf Klasse??!?!?
    public Player(/*, ArrayList<Item> itemList, String location */) {
        this.charName = charName;
        this.userDMG = userDMG;
        this.userLP = userLP;
        this.userDEF = userDEF;
        this.userDODGE = userDODGE;
        this.itemList = itemList;
        this.location = location;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(PlayerClasses chosenClass) {this.animalName = chosenClass.getAnimalName();
    }

    public String getChosenClass() {
        return chosenClass;
    }

    public void setChosenClass(PlayerClasses chosenClass) {
        this.chosenClass = chosenClass.getClassName();
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static String showInventory(){
        String ans="";
        if (itemList.isEmpty() || itemList==null) {
            return  "You have no Items";
        }
        else {

            for (Item i : itemList){
                ans+=i.getItemName() + " \n";


            }
        }
        return ans;
    };




    };

