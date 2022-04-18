package setup;

public class Classes {
    private String className;
    private int classLP;
    private int classATK;
    private int classDEF;
    private int classDodge;


    public Classes(String className, int classLP, int classATK, int classDEF, int classDodge) {
        this.className = className;
        this.classLP = classLP;
        this.classATK = classATK;
        this.classDEF = classDEF;
        this.classDodge = classDodge;
    }

    public Classes baseClass = new Classes("Basis Klasse", 100,7,7,6);

}
