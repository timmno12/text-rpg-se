package setup;

public class enemy {

    private String enemName;
    private int enemDMG;
    private int enemLP;
    private int enemDEF;
    private int enemDODGE;


    public enemy(String enemName, int enemDMG, int enemLP, int enemDEF, int enemDODGE){
        this.enemName = enemName;
        this.enemDMG = enemDMG;
        this.enemLP = enemLP;
        this.enemDEF = enemDEF;
        this.enemDODGE = enemDODGE;
    }

    public String getEnemName() {
        return enemName;
    }

    public void setEnemName(String enemName) {
        this.enemName = enemName;
    }

    public int getEnemDMG() {
        return enemDMG;
    }

    public void setEnemDMG(int enemDMG) {
        this.enemDMG = enemDMG;
    }

    public int getEnemLP() {
        return enemLP;
    }

    public void setEnemLP(int enemLP) {
        this.enemLP = enemLP;
    }

    public int getEnemDEF() {
        return enemDEF;
    }

    public void setEnemDEF(int enemDEF) {
        this.enemDEF = enemDEF;
    }

    public int getEnemDODGE() {
        return enemDODGE;
    }

    public void setEnemDODGE(int enemDODGE) {
        this.enemDODGE = enemDODGE;
    }
}
