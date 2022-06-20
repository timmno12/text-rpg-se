package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import setup.Item;
import setup.Player;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class PlayerTest {



    Player player;


    @BeforeEach
    void setup(){
        player= new Player("Base");
    }




    @Test
    void addToInventory() {
        player.addToInventory("piece of wire");
        assertTrue(player.isInInventory("piece of wire"));





    }

    @Test
    void isInInventory() {
        player.addToInventory("piece of wire");
        assertTrue(player.isInInventory("piece of wire"));
        assertFalse(player.isInInventory("button"));

    }

    @Test
    void isValidItem() {
    }



    @Test
    void showInventory() {
    }
}