package setup;

public class item {
    private String itemName;
    private String itemDescription;
    private  int damageIncrease;
    private int defenseIncrease;
    public item(String itemName, String itemDescription){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public item(String itemName, String itemDescription, int damageIncrease, int defenseIncrease){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.damageIncrease = damageIncrease;
        this.defenseIncrease = defenseIncrease;
    }
    public String getItemName() {
        return itemName;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public int getDamageIncrease() {
        return damageIncrease;
    }

    public int getDefenseIncrease() {
        return defenseIncrease;
    }

}
