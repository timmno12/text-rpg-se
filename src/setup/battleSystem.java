package setup;

import java.util.Random;

public class battleSystem {

    static Random random = new Random();
    static int min = 1;
    static int max = 10;
    static int rand;

    /* Dodgelogik
    Es wird max + Dodge gerechnet. User kommt dabei zb auf Gesamtwert = (max =) 10 + (dodge =) 10 = 20. dann wird eine
    zufällige Zahl zwischen min und Gesamtwert = 20(max + Dodge) ausgegeben. Falls Wert hoch ist, dann chance höher
    dass zufallszahl > max ist.
    Bsp1: User -> DOD=2, Gesamtwert = 12 -> max/gesamtwert = 10/12 = 5/6 -> Wahrscheinlichkeit von 83,3% getroffen zu werden
    Bsp2: User -> DOD=10, Gesamtwert = 20 -> max/gesamtwert = 10/20 = 1/2 -> Wahrscheinlichkeit von 50% getroffen zu werden
     */

    /* Critlogik
    Falls Dodge erfolgreich Wahrscheinlichkeit 50%, dass Crit
     */

    static public void userDodge(user user, enemy enemy){
        int dodgeValue = max + user.getUserDODGE();
        rand = random.nextInt(dodgeValue+ min) + min;
        if(dodgeValue < max){
            userWasHit(user, enemy);
        } else {
            userDodged(user, enemy);
        }
    }

    static public void enemyDodge(user user, enemy enemy){
        int dodgeValue = max + enemy.getEnemDODGE();
        rand = random.nextInt(dodgeValue+ min) + min;
        if(dodgeValue < max){
            enemyWasHit(user, enemy);
        } else {
            enemyDodged(user, enemy);
        }
    }

    static public void enemyWasHit(user user, enemy enemy){

        //Ene.LP - charDMG -> Berechnung DMG (zufällig gerollt) DEF einbeziehen
        //Ausgabe: Ene wurde getroffen
        //enemy greift an

    }

    static public void enemyDodged(user user, enemy enemy){

        //Ausgabe: Ene wurde nicht getroffen
        userDodge(user, enemy);
    }


    static public void userWasHit(user user, enemy enemy){

        //Ene.LP - charDMG -> Berechnung DMG (zufällig gerollt) DEF einbeziehen
        //Ausgabe: Ene wurde getroffen
        //enemy greift an

    }

    static public void userDodged(user user, enemy enemy){

        //Ausgabe: Du wurdest nicht getroffen
        enemyDodge(user, enemy);
    }

    static public void LifepointChecker(user user, enemy enemy){

    }
}
