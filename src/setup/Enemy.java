package setup;

public class Enemy {

    private String enemName;
    private int enemDMG;
    private int enemLP;
    private int enemDEF;
    private int enemDODGE;


    public Enemy(String enemName, int enemDMG, int enemLP, int enemDEF, int enemDODGE){
        this.enemName = enemName;
        this.enemDMG = enemDMG;
        this.enemLP = enemLP;
        this.enemDEF = enemDEF;
        this.enemDODGE = enemDODGE;
    }

    public int getEnemDMG() {
        return enemDMG;
    }

    public int getEnemLP() {
        return enemLP;
    }

    public int getEnemDEF() {
        return enemDEF;
    }

    public int getEnemDODGE() {
        return enemDODGE;
    }

}
