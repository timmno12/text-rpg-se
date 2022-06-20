package setup;



public class BasicHandler {
    private static String helpCommand(){
        return "use \n combine \n look \n help \n go \n inventory \n take \n locations \n talk \n attack";

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
           //case "combine":
               //return "You try to combine " + secondWord +   " and " +  secondWord + ". You don’t succeed.";
           case "inventory":

               ans= player.showInventory();
               break;
           case "locations":


               ans= "You can go to : Storage Room & Hallway";
               break;


           default:
               ans=firstWord +" " + secondWord + "Command is unclear. Be more specific or see 'help' if you need any.";






       }
       firstWord="";
       secondWord="";
       return ans;





        

    }

}



