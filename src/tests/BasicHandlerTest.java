package tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.Mock;
import setup.BasicHandler;
import setup.Item;
import setup.Player;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BasicHandlerTest {

    Player player = mock(Player.class);


    @Test
    void testHandleLook() {assertEquals("It looks exactly how you think it does.", BasicHandler.handle("look", "", player));}

    @Test
    void testHandleInventory() {assertEquals(player.showInventory(), BasicHandler.handle("inventory", "", player));
    }

    @Test
    void testHandleCombine() {
        when(player.isValidItem("piece of wire cage"))
                .thenReturn(true);
        assertEquals("You try to combine " + "piece of wire cage" + " but you can't find it in your pockets!", BasicHandler.handle("combine", "piece of wire cage", player));
        assertEquals("You try to combine " + "banana cage" + " but there is nothing you can use it on.", BasicHandler.handle("combine", "banana cage", player));
    }

    @Test
    void testHandleInteract() {assertEquals("You can't interact with " + "", BasicHandler.handle("interact", "", player));}

    @Test
    void testHandleTake() {assertEquals("You can’t just take it.", BasicHandler.handle("take", "", player));}


    @Test
    void testHandleAttack() {assertEquals("You think for a moment you could attack " + "cat" + " but why would you do that?", BasicHandler.handle("attack", "cat", player));}

    @Test
    void testHandleHelp() {assertEquals(
            " combine - zur Kombination eines Gegenstandes aus deinem Inventar und einem anderen \n" +
            " look - gibt dir eine genauere Beschreibung des Gegenstandes oder der Umgebung \n" +
            " help - zeigt dir alle anwendbare Befehle und deren nutzen \n" +
            " inventory - zeigt dir welche Gegenstände du besitzt \n" +
            " take - fügt einen Gegenstand deinem Inventar hinzu \n" +
            " talk - startet eine Konversation \n" +
            " attack - startet einen Kampf ",
            BasicHandler.handle("help", "", player)
    );}

    @Test
    void testHandleDefault() {assertEquals("use" + " " + "piece of wire" + "Command is unclear. Be more specific or see 'help' if you need any.", BasicHandler.handle("use", "piece of wire", player));}}