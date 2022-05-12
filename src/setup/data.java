package setup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class data {
    public static Item[] items = {
            new Item("piece of wire", "Whoever kidnapped you must’ve underestimated the power of a piece of wire because this piece of wire is your trusty lock-pick.", 0, 0),
            new Item("item2", "its an item 2 yo", 0, 0)

    };
    public static Target[] DATA={
            new Target("Cage","piece of wire", "look", items[0].getItemDescription(), 10,false),
            new Target("Cage","piece of wire", "use", "After fiddling around for a little you manage to unlock your cage.", 10,true),
            new Target("Cage","", "look", "It’s dark here, the only light coming from the cracks in the door. You look outside your cage and down the shelf you're on, the distance is not too bad. On your right is your sister's cage, she seems nervous and is fiddling around with the metal bars. There’s a big jar to your left which is filled with suspiciously glowing water. ", 10,false),
            new Target("Cage","sister", "talk", "I’m so scared, I want to go home.", 0,false),
            new Target("Cage","sister", "talk", "Don't worry, I'll find a way.", 1,false),
            new Target("Cage","sister", "talk", "Did you notice anything? ", 1,false),
            new Target("Cage","sister", "talk", "End conversation.", 9,false),
            new Target("Cage","sister", "talk", "Thank you. I don’t know what I would do without you.", 2,false),
            new Target("Cage","sister", "talk", "It’s really dark and there’s some weird objects here. ", 2,false),
            new Target("Cage","sister", "talk", "I'm scared..", 2,false),

            //test entry
            new Target("Cage","item", "take", "You picked up the item" , 10,false),
            new Target("Cage","item2", "take", "You picked up the item 2" , 10,false),

            new Target("Storage Room","sister", "talk", "Let's get out of here!", 10,false),
            new Target("Storage Room","piece of wire", "use", "You successfully unlock your sister's cage as well.", 10,true),
            new Target("Storage Room","", "look", "This is definitely a storage room. Lots of shelves filled with gruesome things you don’t really want to look at closely. The door seems like the only way out.", 10,false),
            new Target("Storage Room","door", "use", "Your sister yells out in protest. Were you gonna leave without her?", 10,false),

            new Target("Storage Room","sister", "talk", "Let's get out of here!", 10,false),
            new Target("Storage Room","", "look", "This is definitely a storage room. Lots of shelves filled with gruesome things you don’t really want to look at closely. The door seems like the only way out.", 10,false),
            new Target("Storage Room","door", "use", "It’s not even locked. You open the door just enough to fit through and leave the room.", 10,true),

            new Target("Hallway (Basement)","arched entryway overgrown with vines", "look", "The vines are so dense that you can’t see past them. ", 10,false),
            new Target("Hallway (Basement)","", "look", "A sizable wooden hallway with a few decorative paintings. It’s dimly lit with a candle on each wall and connects to 4 rooms in total. You notice a cat curled up in front of one of the doors. At the end of the hallway there’s an arched entryway overgrown with vines that spread into the ceiling and the floor.", 10,false),
            new Target("Hallway (Basement)","cat", "attack", "You attack!", 10,true),
            new Target("Hallway (Basement)","sister", "talk", "If we wouldn’t have gotten knocked out and dumped into a cage I would almost say it’s cozy. But right now this place is scary, I just really want to get out of here. ", 1,false),
            new Target("Hallway (Basement)","sister", "talk", "There must be a way out of here. Sometimes you need to look at the bigger picture first to understand. ", 1,false),
            new Target("Hallway (Basement)","cat", "talk", "The cat opens its' eyes groggily and looks at you confused.", 1,false),
            new Target("Hallway (Basement)","cat", "talk", "Ah, is that so? I don’t remember anyone new getting adopted. ", 1,false),
            new Target("Hallway (Basement)","cat", "talk", "There’s only one person with authority to enter this room and you are not them. ", 1,false),
            new Target("Hallway (Basement)","cat", "talk", "I’m taking a nap on my job, so why don’t you let me be?", 1,false),
            new Target("Hallway (Basement)","cat", "talk", "You seem suspicious. I will have to get rid off you", 1,true),


    };



}
