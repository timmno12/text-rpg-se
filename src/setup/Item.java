package setup;

public class Item {
    private String itemName;
    private String itemDescription;
    private  int damageIncrease;
    private int defenseIncrease;
    public Item(String itemName, String itemDescription){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public Item(String itemName, String itemDescription, int damageIncrease, int defenseIncrease){
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
