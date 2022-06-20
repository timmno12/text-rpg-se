package setup;



public class BasicHandler {
    private static String helpCommand(){
        return " combine - zur Kombination eines Gegenstandes aus deinem Inventar und einem anderen \n" +
                " look - gibt dir eine genauere Beschreibung des Gegenstandes oder der Umgebung \n" +
                " help - zeigt dir alle anwendbare Befehle und deren nutzen \n" +
                " inventory - zeigt dir welche Gegenstände du besitzt \n" +
                " take - fügt einen Gegenstand deinem Inventar hinzu \n" +
                " talk - startet eine Konversation \n" +
                " attack - startet einen Kampf ";

    }


    public static String handle(String firstWord, String secondWord, Player player) {

       String ans=null;
       switch (firstWord){
           case "combine":
               if (player.isValidItem(secondWord)){
                   ans="You try to combine " +  secondWord + " but you can't find it in your pockets!";
                   break;
               }



               ans= "You try to combine " + secondWord +" but there is nothing you can use it on.";
               break;

           case "look":
               ans= "It looks exactly how you think it does.";
               break;

           case "interact":
               ans= "You can't interact with " + secondWord;
                break;

           case "take":
               ans= "You can’t just take it.";
               break;
           case "attack":

               ans= "You think for a moment you could attack " + secondWord +  " but why would you do that?";
               break;


           case "help":
               ans=helpCommand();
               break;

           case "inventory":

               ans= player.showInventory();
               break;


           default:
               ans=firstWord +" " + secondWord + "Command is unclear. Be more specific or see 'help' if you need any.";






       }
       firstWord="";
       secondWord="";
       return ans;





        

    }

}



