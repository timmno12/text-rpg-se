package setup;

import java.util.ArrayList;

public class Player {
    private String charName;
    private String animal;
    private String chosenClass;
    private int userDMG;

    private int userLP;

    private int userDEF;
    private int userDODGE;

    public static ArrayList<Item> itemList = new ArrayList<Item>();


    public String[][] achievements = {{"Lion","0"},{"Cat", "0"}};
    public String[][] getAchievements() {
        return achievements;
    }


    public void setAchievements(String[][] achievements) {
        this.achievements = achievements;
    }

    private String location;

    //TODO Möglichkeit überlegen Werte von Classes heraus zubekommen um in Konstruktur des Users zu bekommen
    //TODO Eventuell durch Index einer Liste -> Main Ablauf Klasse??!?!?
    public Player(String chosenClass) {
        if(chosenClass.equalsIgnoreCase("Frog")){
        this.setChosenClass("Assassin");
        this.setAnimal("Frog");
        this.setUserLP(100);
        this.setUserDEF(3);
        this.setUserDODGE(10);
        this.setUserDMG(7);

        } else if(chosenClass.equalsIgnoreCase("Mouse")){
            this.setChosenClass("Warrior");
            this.setAnimal("Mouse");
            this.setUserLP(100);
            this.setUserDEF(10);
            this.setUserDODGE(1);
            this.setUserDMG(9);

        }else if(chosenClass.equalsIgnoreCase("Squirrel")){
            this.setChosenClass("Mage");
            this.setAnimal("Squirrel");
            this.setUserLP(100);
            this.setUserDEF(5);
            this.setUserDODGE(5);
            this.setUserDMG(10);
        }
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {this.animal = animal;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    public void addToInventory(String itemName){

        for (Item item: data.items){
            if (item.getItemName().equals(itemName) && !itemList.contains(item)){
                itemList.add(item);

            }

        }


        };
    public boolean isInInventory(String itemName){
        for (Item item: data.items){
            if(item.getItemName().equals(itemName)&&itemList.contains(item)){
                return true;

            }

        }
        return false;

    };

    public boolean isValidItem(String itemName){
        for (Item item: data.items){
            if(itemName.contains(item.getItemName())){
                return true;

            }

        }
        return false;
    };
    public void removeFromInventory(String itemName){
        for (Item item: data.items){
            if (item.getItemName().equals(itemName) && itemList.contains(item)){
                itemList.remove(item);

            }

        }

    };


    public  String showInventory(){
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

