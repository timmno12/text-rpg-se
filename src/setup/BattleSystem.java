package setup;

import java.util.Random;

public class BattleSystem {

    static Random random = new Random();
    //static User user = new User();
    //static Enemy enemy = new Enemy();
    static int min = 1;
    static int max = 10;
    static int rand;
  // static int tempUserLP = user.getUserLP();
  //  static int tempEneLP = enemy.getEnemLP();

    /* Dodgelogik
    Es wird max + Dodge gerechnet. User kommt dabei zb auf Gesamtwert = (max =) 10 + (dodge =) 10 = 20. dann wird eine
    zufällige Zahl zwischen min und Gesamtwert = 20(max + Dodge) ausgegeben. Falls Wert hoch ist, dann chance höher
    dass zufallszahl > max ist.
    Bsp1: User -> DOD=2, Gesamtwert = 12 -> max/gesamtwert = 10/12 = 5/6 -> Wahrscheinlichkeit von 83,3% getroffen zu werden
    Bsp2: User -> DOD=10, Gesamtwert = 20 -> max/gesamtwert = 10/20 = 1/2 -> Wahrscheinlichkeit von 50% getroffen zu werden
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

        //Ene.LP - charDMG -> Berechnung DMG (zufällig gerollt) DEF einbeziehen
        //Ausgabe: Ene wurde getroffen
        lifepointChecker(user, enemy);

    }

    static public void enemyDodged(User user, Enemy enemy){

        //Ausgabe: Ene wurde nicht getroffen
        userDodge(user, enemy);
    }


    static public void userWasHit(User user, Enemy enemy){

        //Ene.LP - charDMG -> Berechnung DMG (zufällig gerollt) DEF einbeziehen
        //Ausgabe: Ene wurde getroffen
        //LifepointChecker
        enemyDodge(user, enemy);

    }

    static public void userDodged(User user, Enemy enemy){

        //Ausgabe: Du konntest ausweichen.
        enemyDodge(user, enemy);
    }

    static public void lifepointChecker(User user, Enemy enemy){
        if(user.getUserLP() <= 0){
            //Ausgabe: Du wurdest besiegt
            //Aus battleSystem rausspringen
        }
        if(enemy.getEnemLP() <= 0){
            //Ausgabe: Der Gegener wurde besiegt
            //Aus battleSystem rausspringen
        }
    }
    static public void keepFighting(User user, Enemy enemy){
        //Ausgabe: Möchtest du weiterkämpfen -> Abfrage bei 25% und 50% vielleicht??
        //Input: Ja -> enemyDodge(user, enemy); wird aufgerufen
        //Input: Nein -> battleSystem wird beendet
    }

}
