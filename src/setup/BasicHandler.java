package setup;



public class BasicHandler {
    private static String helpCommand(){
        return "use \n combine \n look \n help \n go \n inventory \n take \n locations \n talk \n attack";

    }


    public static String handle(String firstWord, String secondWord) {

       String ans=null;
       switch (firstWord){
           case "use":

               ans= "You try to use " + secondWord +" but there is nothing you can use it on.";
               break;

           case "look":
               ans= "It looks exactly how you think it does.";
               break;

           case "go":
               ans= "You can’t just go there.";
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
           //case "combine":
               //return "You try to combine " + secondWord +   " and " +  secondWord + ". You don’t succeed.";
           case "inventory":

               ans= Player.showInventory();
               break;
           case "locations":


               ans= "You can go to : Storage Room & Hallway";
               break;


           default:
               ans=firstWord +" " + secondWord + "Command is unclear. Be more specific or see “help” if you need any.";






       }
       firstWord="";
       secondWord="";
       return ans;





        

    }

}



