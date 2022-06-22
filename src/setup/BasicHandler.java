package setup;



public class BasicHandler {
    private static String helpCommand(){
        return "combine - To combine two items from your inventory\n" +
                "look - Gives you a more detailed description of the object or the environment (i.e 'look location') \n" +
                "interact - Interact with somebody or something" +
                "inventory - Shows you what items you own \n" +
                "take - Adds an item to your inventory \n" +
                "talk - Starts a conversation \n" +
                "attack - Starts a fight " +
                "help - Shows you all applicable commands and their use \n" ;

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
               if(secondWord.equals("")){
                   ans="You can't interact with nothing";
               }else {
                   ans = "You can't interact with " + secondWord;
               }
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



