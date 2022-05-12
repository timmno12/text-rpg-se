package setup;

public class Proxy {

    public int userChosenClass(String userInput){
        for(PlayerClasses pc : data.playerClasses){
            if(userInput.equalsIgnoreCase(pc.getAnimalName())){
                return java.util.Arrays.asList(data.playerClasses).indexOf(pc);
            }
        }
        return 0;
    }
}
