package setup;

import java.util.Random;

public class BattleSystem {

    static Random random = new Random();
    static int min = 1;
    static int max = 10;
    static int rand;
    static int rand2;

    /* Dodgelogik
    Es wird max + Dodge gerechnet. User kommt dabei zb auf Gesamtwert = (max =) 10 + (dodge =) 10 = 20. dann wird eine
    zufällige Zahl zwischen min und Gesamtwert = 20(max + Dodge) ausgegeben. Falls Wert hoch ist, dann chance höher
    dass zufallszahl > max ist.
    Bsp1: User -> DOD=2, Gesamtwert = 12 -> max/gesamtwert = 10/12 = 5/6 -> Wahrscheinlichkeit von 83,3% getroffen zu werden
    Bsp2: User -> DOD=10, Gesamtwert = 20 -> max/gesamtwert = 10/20 = 1/2 -> Wahrscheinlichkeit von 50% getroffen zu werden
     */

    /* DEF + DMGlogik (der Dogdelogik ähnlich)
    DEF:
    Es wird max + DEF gerechnet. User kommt dabei zb auf Gesamtwert = (max =) 10 + (DEF =) 10 = 20. dann wird eine
    zufällige Zahl zwischen min = 1 und max = 10 ausgegeben. Diese Zahl wird anschließend + user.DEF gerechnet.
    Die Berechnung ist dann zufall/Gesamtwert * 1/2 (-> 1/2 ist sicherlich gut veränderbar um anständig zu balancen und
    soll erstmal verhindern, dass der user 100% des Schadens blocken kann, wenn sein Wert sehr hoch ist. Man könnte sicherlich
    auf 4/5 oder 2/3 hochgehen, damit der DEF grundsätzlich stärker wird)
    Das Ergebnis ist die Prozentzahl wie viel enemy.DMG geblockt wird. Also user.LP - ((1.0 - ergebnis) * enemy.DMG)
    Beispiel:
    Spieler mit hohem DEF: Def = 10 -> gesamtwert: max + deff = 20
    -> zufall nextInt(1,10) + user.DEF zb: zufall = 8 + 10 = 18
    berechnung: zufall/ gesamtwert * 1/2
    Bsp: Spieler mit hohem DEF: gut gewürfelt: 18/20 * 1/2 = (9/20) -> 0.45, schlecht gewürfelt: 11/20 * 1/2 = (11/40), 0.275
        Spieler mit niedrigem DEF: gut gewürfelt 8/11 * 1/2 = (4/11), 0.363, schlecht gewürfelt: 1/11 * 1/2 = (1/22), 0.045

    DMG:
    zufall nextInt(min +user.DMG, max + user.DMG)

     */

    /*
    TODO Am Ende des Kampfes müssen die LP zurück auf 100 gesetzt werden
     */

    /*
    TODO Wenn wir wollen, dass der User den Kampf unterbrechen kann, dann muss jeder Methodenaufruf enemyDodge umgewandelt
    TODO werden in zb: static public void keepfighting(){}
    TODO enemyDodge beschreibt die Methode, wenn sich der Nutzer entscheidet anzugreifen (aka. userAttack sozusagen)
     */

    /* Critlogik
    Falls Dodge erfolgreich Wahrscheinlichkeit 50%, dass Crit
     */

    static public void userDodge(User user, Enemy enemy){
        int dodgeValue = max + user.getUserDODGE();
        rand = random.nextInt(dodgeValue+ min) + min;
        if(dodgeValue < max){
            userWasHit(user, enemy);
        } else {
            userDodged(user, enemy);
        }
    }

    static public void enemyDodge(User user, Enemy enemy){
        int dodgeValue = max + enemy.getEnemDODGE();
        rand = random.nextInt(dodgeValue+ min) + min;
        if(dodgeValue < max){
            enemyWasHit(user, enemy);
        } else {
            enemyDodged(user, enemy);
        }
    }

    static public void enemyWasHit(User user, Enemy enemy){
        int DEFValue = max + enemy.getEnemDEF();
        int balanceValue = 1/2;
        //Zufallsfaktor in DEF des Enemy, zuerst random zahl zwischen min und max gepickt und dann + enemy.DEF gerechnet
        rand = (random.nextInt(max + min) + min) + enemy.getEnemDEF();
        //Zufallsfaktor in DMG des Users
        rand2 = (random.nextInt((max + user.getUserDMG()) + (min + user.getUserDMG())) + min);
        int resultDEF = (rand / DEFValue) * balanceValue;
        //enemy.getEnemLP() = enemy.getEnemLP() - ((1.0 - resultDEF) * rand2);
        //TODO Ausgabe: Ene wurde getroffen
        lifepointChecker(user, enemy);
        userDodge(user, enemy);
    }

    static public void enemyDodged(User user, Enemy enemy){

        //TODO Ausgabe: Ene konnte ausweichen und wurde nicht getroffen.
        userDodge(user, enemy);
    }


    static public void userWasHit(User user, Enemy enemy){
        int DEFValue = max + user.getUserDEF();
        int balanceValue = 1/2;
        //Zufallsfaktor in DEF des Users zuerst random zahl zwischen min und max gepickt und dann + user.DEF gerechnet
        rand = (random.nextInt(max + min) + min) + user.getUserDEF();
        //Zufallsfaktor in DMG des Enemies
        rand2 = (random.nextInt((max + enemy.getEnemDMG()) + (min + enemy.getEnemDMG())) + min);
        int resultDEF = (rand / DEFValue) * balanceValue;
        //user.getUserLP() = user.getUserLP() - ((1.0 - resultDEF) * rand2);
        //TODO Ausgabe: Du wurdest getroffen
        lifepointChecker(user, enemy);
        keepFighting(user, enemy); //oder enemyDodge(user, enemy);

    }

    static public void userDodged(User user, Enemy enemy){

        //TODO Ausgabe: Du konntest ausweichen.
        keepFighting(user, enemy); //oder enemyDodge(user, enemy);
    }

    static public void lifepointChecker(User user, Enemy enemy){
        if(user.getUserLP() <= 0){
            //TODO Ausgabe: Du wurdest besiegt
            //user.getLP werden wieder hergestellt
            //Aus battleSystem rausspringen
        }
        if(enemy.getEnemLP() <= 0){
            //TODO Ausgabe: Der Gegener wurde besiegt
            //Aus battleSystem rausspringen
        }
    }


    static public void keepFighting(User user, Enemy enemy){
        /*
        //TODO Ausgabe: Möchtest du weiterkämpfen -> Abfrage bei 25% und 50% vielleicht??
        if(User Input: "yes"){
            enemyDodge(user, enemy);
        }
        if(User Input: "no"){
            //battleSystem wird beendet, LP werden wieder hergestellt
        } else{
            //Output "Tell me. Do you want to keep fighting? Yes or no?"
        } */
    }

}
