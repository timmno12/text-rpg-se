package setup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class data {
    public static Item[] items = {
            new Item("piece of wire", "Whoever kidnapped you must’ve underestimated the power of a piece of wire because this piece of wire is your trusty lock-pick.", 0, 0),
            new Item("item2", "its an item 2 yo", 0, 0)

    };
    public static PlayerClasses[] playerClasses = {
            new PlayerClasses("Base","Base",100,7,7,6),
            new PlayerClasses("Mage","Squirrel",100,10,5,5),
            new PlayerClasses("Warrior","Mouse",100,9,10,1),
            new PlayerClasses("Assassin","Frog",100,7,3,10)
    };

    public static Enemy[] enemies = {
            new Enemy("cat",7,50,4,7)
    };

    public static Target[] DATA={
            new Target("Cage","piece of wire", "look", items[0].getItemDescription(), 10,false),
            new Target("Cage","piece of wire", "take", "You pick up the piece of wire.", 10,false),
            new Target("Cage","piece of wire", "use", "After fiddling around for a little you manage to unlock your cage.", 10,true),
            new Target("Cage","", "look", "It’s dark here, the only light coming from the cracks in the door. You look outside your cage and down the shelf you're on, the distance is not too bad. On your right is your sister's cage, she seems nervous and is fiddling around with the metal bars. Besides an old rusty piece of wire there’s only a big jar to your left which is filled with suspiciously glowing water. ", 10,false),
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
            new Target("Cage","item2", "use", "You used the item  2 lel" , 10,false),

            new Target("Storage Room","sister", "talk", "Let's get out of here!", 10,false),
            new Target("Storage Room","piece of wire", "use", "You successfully unlock your sister's cage as well.", 10,true),
            new Target("Storage Room","", "look", "This is definitely a storage room. Lots of shelves filled with gruesome things you don’t really want to look at closely. The door seems like the only way out.", 10,false),
            new Target("Storage Room","door", "use", "Your sister yells out in protest. Were you gonna leave without her?", 10,false),

            new Target("Storage Room","sister", "talk", "Let's get out of here!", 10,false),
            new Target("Storage Room","", "look", "This is definitely a storage room. Lots of shelves filled with gruesome things you don’t really want to look at closely. The door seems like the only way out.", 10,false),
            new Target("Storage Room","door", "use", "It’s not even locked. You open the door just enough to fit through and leave the room.", 10,true),

            new Target("Hallway (Basement)","door ahead", "look", "The vines are so dense that you can’t see past them. ", 10,false),
            new Target("Hallway (Basement)","", "look", "A sizable wooden hallway with a few decorative paintings. It’s dimly lit with a candle on each wall and connects to 4 rooms in total. You notice a cat curled up in front of one of the doors. At the end of the hallway there’s an arched entryway overgrown with vines that spread into the ceiling and the floor.", 10,false),
            new Target("Hallway (Basement)","cat", "attack", "You attack!", 8,true),
            new Target("Hallway (Basement)","sister", "talk", "If we wouldn’t have gotten knocked out and dumped into a cage I would almost say it’s cozy. But right now this place is scary, I just really want to get out of here. ", 1,false),
            new Target("Hallway (Basement)","sister", "talk", "There must be a way out of here. Sometimes you need to look at the bigger picture first to understand. ", 1,false),
            new Target("Hallway (Basement)","cat", "talk", "The cat opens its' eyes groggily and looks at you confused.", 0,false),
            new Target("Hallway (Basement)","cat", "talk", "I’m new here!", 1,false),
            new Target("Hallway (Basement)","cat", "talk", "Could you let us pass through that door?", 1,false),
            new Target("Hallway (Basement)","cat", "talk", "What are you doing here", 1,false),
            new Target("Hallway (Basement)","cat", "talk", "End conversation", 9,true),
            new Target("Hallway (Basement)","cat", "talk", "Ah, is that so? I don’t remember anyone new getting adopted. ", 2,false),
            new Target("Hallway (Basement)","cat", "talk", "There’s only one person with authority to enter this room and you are not them. ", 2,false),
            new Target("Hallway (Basement)","cat", "talk", "I’m taking a nap on my job, so why don’t you let me be?", 2,false),
            new Target("Hallway (Basement)","cat", "talk", "You seem suspicious. I will have to get rid off you", 8,true),

            //Chapter 2
            //TODO Fängt nach Fight mit der Katze automatisch neues Kap an und werden bereits angegebene Commands zurückgesetzt? zB: Hallway(Basement) "" "look"

            //TODO dirty button wird dem Inventar automatisch hinzugefügt
            //Text hinzufügen: You breathe heavily after giving the cat a hard blow. Growling, it jumps to the side and flees to some corner of the room. You don't see where she's gone, because a sparkling something draws all your attention. You pick it up, pluck off the last cat hairs and are the new owner of a dirty button (button).
            new Target("Hallway (Basement) II","", "look", "The cat seems to have disappeared. You hold your breath for a moment to listen, but there is nothing but your own excited heartbeat. The hallway has not changed. There are still 4 doors, but the one to the left is now clear of cats (left door). Opposite of it you see a simple wooden door, nothing special, but sturdy (right door). The big arch is still overgrown with plants (door ahead). It doesn't look like they're going to die anytime soon. In your back is the storage room (door behind).", 10,false),
            new Target("Hallway (Basement) II","door ahead", "look", "The arched entryway is overgrown. The vines are so dense that you can’t see past them.", 10,false),
            new Target("Hallway (Basement) II","door ahead", "use", "Even if you could get to the door the huge creepers would make it impossible for you to go through.", 10,false),
            new Target("Hallway (Basement) II","right door", "look", "It is a normal, wooden door. As your eyes wander higher from below, you can see a raven sitting on the doorknob far above, eyeing you with an unpleasantly interested look.", 10,false),
            new Target("Hallway (Basement) II","right door", "use", "You hear the fierce flapping of huge wings above you. When you ignore it and try to push the door open, it doesn't move an inch. Above you, you hear scornful laughter.", 10,false),
            new Target("Hallway (Basement) II","left door", "look", "The cat is gone. The door is free.", 10,false),
            new Target("Hallway (Basement) II","left door", "use", "You are about to push open the door when you are shrouded in a huge shadow. The raven holds itself in the air above you. ~Bring me treasure! Bring me gold!~ he crows. ~And I will help you to pass the right door~ You don't answer, but enter the darkness that extends behind the door.", 10,true),
            new Target("Hallway (Basement) II","door behind", "look", "This is where you came from. Nothing exciting there.", 10,false),
            new Target("Hallway (Basement) II","door behind", "use", "You hear your sister's thin voice: ~I don't think we'll find anything in there, besides, it's dark and I never want to see those cages again!~ You turn back toward the hallway.", 10,false),
            //To Sister. Player: Are you ok?
            new Target("Hallway (Basement) II","sister", "talk", "Are you ok?", 1,false),
            new Target("Hallway (Basement) II","sister", "talk", "I am fine. Did the beast hurt you? No? Phew… ok. I am relieved. I cannot imagine going through this without you.", 2,false),
            //To Sister. Player: Did you see where the cat went?
            new Target("Hallway (Basement) II","sister", "talk", "Did you see where the cat went?", 1,false),
            new Target("Hallway (Basement) II","sister", "talk", "No. I was covering my eyes all the time.", 2,false),
            //To Sister. Player: End conversation
            new Target("Hallway (Basement) II","sister", "talk", "End conversation", 1,false),
            new Target("Hallway (Basement) II","sister", "talk", "I’m sorry I couldn't help you.", 2,false),
            new Target("Hallway (Basement) II","raven", "look", "The huge raven sits calmly on the door handle and doesn't avert its penetrating gaze from you for a second. Every time you try to look at him, you have to turn away because you can't withstand his gaze on you. You shudder at the thought of the animal at your back and squeeze your sister's little hand a little tighter.", 10,false),
            //Text when conversation with raven is started:
            new Target("Hallway (Basement) II","raven", "talk", "You gather all your courage and address the giant bird.", 0,false),
            //To Raven. Player: Do you want to fight me as well?
            new Target("Hallway (Basement) II","raven", "talk", "Do you want to fight me as well?", 1,false),
            new Target("Hallway (Basement) II","raven", "talk", "I don't think that those are my plans for you and that little thing beside you.", 2,false),
            //To Raven. Player: Who are you?
            new Target("Hallway (Basement) II","raven", "talk", "Who are you?", 1,false),
            new Target("Hallway (Basement) II","raven", "talk", "Do you really want to know that? Let’s say… I have eyes and ears everywhere.", 2,false),
            //To Raven. Player: Can you open the door for me?
            new Target("Hallway (Basement) II","raven", "talk", "Can you open the door for me?", 1,false),
            new Target("Hallway (Basement) II","raven", "talk", "I could do that for you, if you gave me some pure gold and nothing less.", 2,false),
            //To Raven. Player: End conversation
            new Target("Hallway (Basement) II","raven", "talk", "End Conversation", 1,false),
            new Target("Hallway (Basement) II","raven", "talk", "Bring me treasure, little thing.", 2,false),
            new Target("Hallway (Basement) II","button", /*name2: "raven",*/ "look", "Raven: ~Hahahaha what is this? Do you want me to get angry? Back off, vermin.~", 10,false),
            new Target("Hallway (Basement) II","button", "look", "The button looks really dirty. You try to scrape off some of the dirt with your fingers, but no chance. The stuff is just too tight. If only there was some way to clean it.", 10,false),

            new Target("Eerie Crypt (left room)", "", "look", "You almost slip as you take your first steps. The ground is slippery and it makes a sound as if you were walking through honey. Your feet are wet and with every step you feel the water coming out of the mossy ground. It is very dark. Glowing torches light the room to the bare minimum. You shiver as the humidity reaches your skin. As far as you can see, the room is almost completely empty. You see a small sphere on a stone pedestal(pedestal) in the center.", 10, false),
            new Target("Eerie Crypt (left room)","pedestal", "look", "You move closer and now you can get a good look at the sphere (marble). It looks like a big marble and as if it were made of glass.", 10,false),
            new Target("Eerie Crypt (left room)","marble", "look", "You bend down a bit. You notice that the sphere is not completely clear. It looks as if it has many cracks and is only composed of splinters that magically hold themselves together.", 10,false),
            new Target("Eerie Crypt (left room)","marble", "use", "You hold your little sister's hand with one hand and stretch out the other. The surface of the sphere feels cold under your fingertips and you notice how the sphere begins to vibrate. Terrified, your hand jerks back. You can feel that your sister is also terrified. But you don't have time to react, because at the same moment the sphere explodes with a clinking sound and the glass fragments simply remain floating in space, while a short shower of sparks lights up the room. You are blinded and hold your hand in front of your aching eyes. When you open them again, blinking, a breathtaking sight expands before you. You are standing in a huge, collapsed chapel (chapel).", 10,true),
            new Target("Eerie Crypt (left room)","chapel", "look", "Light refracts in the dirty, splintered windows. Nature has reclaimed most of the building and it looks like no one has been here in decades. Your sister still holds your hand with a firm grip. In the center you see a huge statue made of stone. It looks like a lion (lion). At its foot lies a small piece of cloth.(cloth).", 10,false),
            new Target("Eerie Crypt (left room)","cloth", "look", "It looks pretty dirty and you wonder why it catches your eye so much.", 10,false),
            new Target("Eerie Crypt (left room)","cloth", "take", "You pick up the piece of fabric. It still looks a bit dirty at first glance, but it is much silkier than expected. You feel the strange urge to talk to the statue", 10,true),
            new Target("Eerie Crypt (left room)","lion", "look", "The lion statue is huge. Not even necessarily by its mass, but by its charisma. As soon as your eyes reach the lion, it's hard to take your eyes off it. The statue looks so alive, although it is obviously made of stone.", 10,false),
            new Target("Eerie Crypt (left room)","button", /*name2: "chapel",*/ "use", "The button falls down. It echoes unreal loud in the chapel. You bend down and pick up the dirty button. It goes back into your pocket.", 10,false),
            new Target("Eerie Crypt (left room)","button", /*name2: "lion",*/ "use", "~This is the prize you received when you selflessly faced the beast.~", 10,false),
            //To Lion. Player: What happened?
            new Target("Eerie Crypt (left room)","lion", "talk", "What happened?", 1,false),
            new Target("Eerie Crypt (left room)","lion", "talk", "You just traveled between the worlds. Something happened so that you proved your bravery. I saw you fighting off a creature not just bigger, but more dangerous and deceitful than you are. You were brave and protected your sister at all costs. This is why you are here.", 2,false),
            //To Lion. Player: Who are you?
            new Target("Eerie Crypt (left room)","lion", "talk", "Who are you?", 1,false),
            new Target("Eerie Crypt (left room)","lion", "talk", "Just a lost memory of a god that honored the brave back in the days to pass every obstacle they encountered. I am the force to give you this power. You proved your character and nothing shall hold you back.", 2,false),
            //To Lion. Player: End conversation
            new Target("Eerie Crypt (left room)","lion", "talk", "End Conversation", 1,true),
            new Target("Eerie Crypt (left room)","lion", "talk", "Take care and be mindful of the power I gave you.", 2,false),
            new Target("Eerie Crypt (left room)","cloth", /*name2: "button",*/ "use", "This is not the right place to combine this. You should wait until you get back.", 10,false),

            //Chapter 3 //TODO: Es wird in Chapter 3 gewechselt, wenn der Lion-Dialog einmal mit End Conversation beendet wurde und Cloth im Inventar liegt
    };



}
