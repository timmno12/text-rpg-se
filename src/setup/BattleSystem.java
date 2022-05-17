package setup;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class BattleSystem {

    // TODO: Falls LP-Potions eingebaut werden muss nochmal über die keepfighting geschaut werden in Hinblick auf tempLP

    static Random random = new Random();

    static long delayInMS = 2000;

    static int min = 1;
    static int max = 10;
    static float rand;
    static float rand2;
    static float crit_rand;
    static boolean crit = false;
    static float critValue = 1.5f; //-> 1.5 entspricht einem Crit von 50% extra auf den normalen Schaden
    static float tempUserLP;
    static float tempEnemLP;

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

    //Hinter jeder Ausgabe in die GUI wird ein Thread.sleep() für 2 Sekunden ausgelöst -> insgesamt 6stk




    static public void startFight(Player player, Enemy enemy){
        tempUserLP = player.getUserLP();
        tempEnemLP = enemy.getEnemLP();
        enemyDodge(player, enemy);
    }

    static public void userDodge(Player player, Enemy enemy){
        int dodgeValue = max + player.getUserDODGE();
        rand = (random.nextInt((dodgeValue - min)+1) + min)/ 1.0f;
        if(dodgeValue < max){
            userWasHit(player, enemy);
        } else {
            userDodged(player, enemy);
        }
    }

    static public void enemyDodge(Player player, Enemy enemy){
        int dodgeValue = max + enemy.getEnemDODGE();
        rand = (random.nextInt((dodgeValue - min)+1) + min)/ 1.0f;
        if(dodgeValue < max){
            enemyWasHit(player, enemy);
        } else {
            enemyDodged(player, enemy);
        }
    }

    static public void enemyWasHit(Player player, Enemy enemy){
        int DEFValue = max + enemy.getEnemDEF();
        int balanceValue = 1/2;

        //Zufallsfaktor in DEF des Enemy, zuerst random zahl zwischen min und max gepickt und dann + enemy.DEF gerechnet
        rand = ((random.nextInt((max - min)+1) + min) + enemy.getEnemDEF()) / 1.0f;

        //Zufallsfaktor in DMG des Users und Crit
        if(crit == true){
            rand2 = (random.nextInt((max + player.getUserDMG()) - (min + player.getUserDMG())+ 1) + min + player.getUserDMG()) * critValue;
        } else{
            rand2 = (random.nextInt((max + player.getUserDMG()) - (min + player.getUserDMG()) + 1) + min + player.getUserDMG());
        }

        float resultDEF = (rand / DEFValue) * balanceValue;
        tempEnemLP = tempEnemLP - ((1.0f - resultDEF) * rand2);
        crit = false;



        try {
            Thread.sleep(delayInMS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        lifepointChecker();
        userDodge(player, enemy);
    }

    static public void enemyDodged(Player player, Enemy enemy){

        //TODO Ausgabe: Ene konnte ausweichen und wurde nicht getroffen.
        try {
            Thread.sleep(delayInMS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        userDodge(player, enemy);


        crit_rand = (random.nextInt(3 - 1 + 1) + 1);
        if (crit_rand == 1){
            crit = true;
        } else {
            crit = false;
        }
    }


    static public void userWasHit(Player player, Enemy enemy){
        int DEFValue = max + player.getUserDEF();
        int balanceValue = 1/2;

        //Zufallsfaktor in DEF des Users zuerst random zahl zwischen min und max gepickt und dann + user.DEF gerechnet
        rand = (random.nextInt((max - min) +1) + min) + player.getUserDEF();

        //Zufallsfaktor in DMG des Enemies und Crit
        if(crit == true){
            rand2 =  (random.nextInt((max + enemy.getEnemDMG()) - (min + enemy.getEnemDMG())+ 1) + min + enemy.getEnemDMG())* critValue;
        } else {
            rand2 = (random.nextInt((max + enemy.getEnemDMG()) - (min + enemy.getEnemDMG())+ 1) + min + enemy.getEnemDMG());
        }

        float resultDEF = (rand / DEFValue) * balanceValue;
        tempUserLP = tempUserLP - ((1.0f - resultDEF) * rand2);
        crit = false;

        //TODO Ausgabe: Du wurdest getroffen
        try {
            Thread.sleep(delayInMS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        lifepointChecker();
        keepFighting(player, enemy);
    }

    static public void userDodged(Player player, Enemy enemy){

        //TODO Ausgabe: Du konntest ausweichen.
        try {
            Thread.sleep(delayInMS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        crit_rand = (random.nextInt(3 - 1 + 1) + 1);
        if (crit_rand == 1){
            crit = true;
        } else {
            crit = false;
        }
        keepFighting(player, enemy);
    }

    static public void lifepointChecker(){
        if(tempUserLP<= 0){
            //TODO Ausgabe: Du wurdest besiegt
            try {
                Thread.sleep(delayInMS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            //TODO Aus battleSystem rausspringen
        }
        if(tempEnemLP <= 0){
            //TODO Ausgabe: Der Gegener wurde besiegt
            try {
                Thread.sleep(delayInMS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            //TODO Aus battleSystem rausspringen
        }
    }

    static public void keepFighting(Player player, Enemy enemy){

        //TODO Ausgabe: Möchtest du weiterkämpfen -> Abfrage bei 25% und 50% vielleicht??
        if(player.getUserLP()*0.3f > tempUserLP){
            //TODO Window abfrage: still wanna fight?
            //TODO UserInputService.sendWindowMessage();

        }else{
            enemyDodge(player, enemy);
        }
    }

}
