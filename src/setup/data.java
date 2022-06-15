package setup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class data {
    public static Item[] items = {
            new Item("piece of wire", "Whoever kidnapped you must’ve underestimated the power of a piece of wire because this piece of wire is your trusty lock-pick.", 0, 0),
            new Item("item2", "its an item 2 yo", 0, 0)

    };

    public static Enemy[] enemies = {
            new Enemy("cat",7,50,4,7)
    };

    public static Target[] DATA={
            new Target("Cage","piece of wire","", "look", items[0].getItemDescription(), 10,false),
            new Target("Cage","piece of wire","", "take", "You pick up the piece of wire.", 10,false),
            new Target("Cage","piece of wire","cage", "combine", "After fiddling around for a little you manage to unlock your cage.", 10,true),
            new Target("Cage","", "look","", "It’s dark here, the only light coming from the cracks in the door. You look outside your cage and down the shelf you're on, the distance is not too bad. On your right is your sister's cage, she seems nervous and is fiddling around with the metal bars. Besides an old rusty piece of wire there’s only a big jar to your left which is filled with suspiciously glowing water. ", 10,false),
            new Target("Cage","sister","", "talk", "I’m so scared, I want to go home.", 0,false),
            new Target("Cage","sister","", "talk", "Don't worry, I'll find a way.", 1,false),
            new Target("Cage","sister","", "talk", "Did you notice anything? ", 1,false),
            new Target("Cage","sister","", "talk", "End conversation.", 9,false),
            new Target("Cage","sister","", "talk", "Thank you. I don’t know what I would do without you.", 2,false),
            new Target("Cage","sister","", "talk", "It’s really dark and there’s some weird objects here. ", 2,false),
            new Target("Cage","sister","", "talk", "I'm scared..", 2,false),

            //test entry


            new Target("Storage Room","sister","", "talk", "Let's get out of here!", 10,false),
            new Target("Storage Room","piece of wire", "cage","combine", "You successfully unlock your sister's cage as well.", 10,true),
            new Target("Storage Room","", "", "look","This is definitely a storage room. Lots of shelves filled with gruesome things you don’t really want to look at closely. The door seems like the only way out.", 10,false),
            new Target("Storage Room","door", "","interact", "Your sister yells out in protest. Were you gonna leave without her?", 10,false),

            new Target("Storage Room","sister", "","talk", "Let's get out of here!", 10,false),
            new Target("Storage Room","", "","look", "This is definitely a storage room. Lots of shelves filled with gruesome things you don’t really want to look at closely. The door seems like the only way out.", 10,false),
            new Target("Storage Room","door","", "interact", "It’s not even locked. You open the door just enough to fit through and leave the room.", 10,true),

            new Target("Hallway (Basement)","door ahead","", "look", "The vines are so dense that you can’t see past them. ", 10,false),
            new Target("Hallway (Basement)","","", "look", "A sizable wooden hallway with a few decorative paintings. It’s dimly lit with a candle on each wall and connects to 4 rooms in total. You notice a cat curled up in front of one of the doors. At the end of the hallway there’s an arched entryway overgrown with vines that spread into the ceiling and the floor.", 10,false),
            new Target("Hallway (Basement)","cat","", "attack", "You breathe heavily after giving the cat a hard blow. Growling, it jumps to the side and flees to some corner of the room. You don't see where she's gone, because a sparkling something draws all your attention. You should take a closer look. (button)", 8,true),
            new Target("Hallway (Basement)","sister","", "talk", "If we wouldn’t have gotten knocked out and dumped into a cage I would almost say it’s cozy. But right now this place is scary, I just really want to get out of here. ", 1,false),
            new Target("Hallway (Basement)","sister","", "talk", "There must be a way out of here. Sometimes you need to look at the bigger picture first to understand. ", 1,false),
            new Target("Hallway (Basement)","cat","", "talk", "The cat opens its' eyes groggily and looks at you confused.", 0,false),
            new Target("Hallway (Basement)","cat","", "talk", "I’m new here!", 1,false),
            new Target("Hallway (Basement)","cat","", "talk", "Could you let us pass through that door?", 1,false),
            new Target("Hallway (Basement)","cat","", "talk", "What are you doing here", 1,false),
            new Target("Hallway (Basement)","cat","", "talk", "End conversation", 9,true),
            new Target("Hallway (Basement)","cat","", "talk", "Ah, is that so? I don’t remember anyone new getting adopted. ", 2,false),
            new Target("Hallway (Basement)","cat","", "talk", "There’s only one person with authority to enter this room and you are not them. ", 2,false),
            new Target("Hallway (Basement)","cat","", "talk", "I’m taking a nap on my job, so why don’t you let me be?", 2,false),
            new Target("Hallway (Basement)","cat","", "talk", "~You seem suspicious. I will have to get rid off you~ said the cat and already you see yourself involved in a fight with the cat. You breathe heavily after giving the cat a hard blow. Growling, it jumps to the side and flees to some corner of the room. You don't see where she's gone, because a sparkling something draws all your attention. You should take a closer look. (button)", 8,true),

            //Chapter 2
            //TODO dirty button wird dem Inventar automatisch hinzugefügt
            //TODO Text hinzufügen: You breathe heavily after giving the cat a hard blow. Growling, it jumps to the side and flees to some corner of the room. You don't see where she's gone, because a sparkling something draws all your attention. You pick it up, pluck off the last cat hairs and are the new owner of a dirty button (button).
            new Target("Hallway (Basement) ", "button", "", "take", "You pick the button up, pluck off the last cat hairs and are the new owner of a dirty button.", 10, true),
            new Target("Hallway (Basement) II","","", "look", "The cat seems to have disappeared. You hold your breath for a moment to listen, but there is nothing but your own excited heartbeat. The hallway has not changed. There are still 4 doors, but the one to the left is now clear of cats (left door). Opposite of it you see a simple wooden door, nothing special, but sturdy (right door). The big arch is still overgrown with plants (door ahead). It doesn't look like they're going to die anytime soon. In your back is the storage room (door behind).", 10,false),
            new Target("Hallway (Basement) II","door ahead","", "look", "The arched entryway is overgrown. The vines are so dense that you can’t see past them.", 10,false),
            new Target("Hallway (Basement) II","door ahead","", "interact", "Even if you could get to the door the huge creepers would make it impossible for you to go through.", 10,false),
            new Target("Hallway (Basement) II","right door","", "look", "It is a normal, wooden door. As your eyes wander higher from below, you can see a raven sitting on the doorknob far above, eyeing you with an unpleasantly interested look.", 10,false),
            new Target("Hallway (Basement) II","right door","", "interact", "You hear the fierce flapping of huge wings above you. When you ignore it and try to push the door open, it doesn't move an inch. Above you, you hear scornful laughter.", 10,false),
            new Target("Hallway (Basement) II","left door","", "look", "The cat is gone. The door is free.", 10,false),
            new Target("Hallway (Basement) II","left door","", "interact", "You are about to push open the door when you are shrouded in a huge shadow. The raven holds itself in the air above you. ~Bring me treasure! Bring me gold!~ he crows. ~And I will help you to pass the right door~ You don't answer, but enter the darkness that extends behind the door.", 10,true),
            new Target("Hallway (Basement) II","door behind","", "look", "This is where you came from. Nothing exciting there.", 10,false),
            new Target("Hallway (Basement) II","door behind","", "interact", "You hear your sister's thin voice: ~I don't think we'll find anything in there, besides, it's dark and I never want to see those cages again!~ You turn back toward the hallway.", 10,false),
            //To Sister. Player: Are you ok?
            new Target("Hallway (Basement) II","sister","", "talk", "Are you ok?", 1,false),
            new Target("Hallway (Basement) II","sister","", "talk", "I am fine. Did the beast hurt you? No? Phew… ok. I am relieved. I cannot imagine going through this without you.", 2,false),
            //To Sister. Player: Did you see where the cat went?
            new Target("Hallway (Basement) II","sister","", "talk", "Did you see where the cat went?", 1,false),
            new Target("Hallway (Basement) II","sister","", "talk", "No. I was covering my eyes all the time.", 2,false),
            //To Sister. Player: End conversation
            new Target("Hallway (Basement) II","sister","", "talk", "End conversation", 9,false),
            new Target("Hallway (Basement) II","sister","", "talk", "I’m sorry I couldn't help you.", 2,false),
            new Target("Hallway (Basement) II","raven","", "look", "The huge raven sits calmly on the door handle and doesn't avert its penetrating gaze from you for a second. Every time you try to look at him, you have to turn away because you can't withstand his gaze on you. You shudder at the thought of the animal at your back and squeeze your sister's little hand a little tighter.", 10,false),
            //Text when conversation with raven is started:
            new Target("Hallway (Basement) II","raven","", "talk", "You gather all your courage and address the giant bird.", 0,false),
            //To Raven. Player: Do you want to fight me as well?
            new Target("Hallway (Basement) II","raven","", "talk", "Do you want to fight me as well?", 1,false),
            new Target("Hallway (Basement) II","raven","", "talk", "I don't think that those are my plans for you and that little thing beside you.", 2,false),
            //To Raven. Player: Who are you?
            new Target("Hallway (Basement) II","raven","", "talk", "Who are you?", 1,false),
            new Target("Hallway (Basement) II","raven","", "talk", "Do you really want to know that? Let’s say… I have eyes and ears everywhere.", 2,false),
            //To Raven. Player: Can you open the door for me?
            new Target("Hallway (Basement) II","raven","", "talk", "Can you open the door for me?", 1,false),
            new Target("Hallway (Basement) II","raven","", "talk", "I could do that for you, if you gave me some pure gold and nothing less.", 2,false),
            //To Raven. Player: End conversation
            new Target("Hallway (Basement) II","raven","", "talk", "End conversation", 9,false),
            new Target("Hallway (Basement) II","raven","", "talk", "Bring me treasure, little thing.", 2,false),
            new Target("Hallway (Basement) II","button","raven",  "use", "Raven: ~Hahahaha what is this? Do you want me to get angry? Back off, vermin.~", 10,false),
            new Target("Hallway (Basement) II","button","", "look", "The button looks really dirty. You try to scrape off some of the dirt with your fingers, but no chance. The stuff is just too tight. If only there was some way to clean it.", 10,false),

            new Target("Eerie Crypt (left room)", "","", "look", "You almost slip as you take your first steps. The ground is slippery and it makes a sound as if you were walking through honey. Your feet are wet and with every step you feel the water coming out of the mossy ground. It is very dark. Glowing torches light the room to the bare minimum. You shiver as the humidity reaches your skin. As far as you can see, the room is almost completely empty. You see a small sphere on a stone pedestal(pedestal) in the center.", 10, false),
            new Target("Eerie Crypt (left room)","pedestal","", "look", "You move closer and now you can get a good look at the sphere (marble). It looks like a big marble and as if it were made of glass.", 10,false),
            new Target("Eerie Crypt (left room)","marble","", "look", "You bend down a bit. You notice that the sphere is not completely clear. It looks as if it has many cracks and is only composed of splinters that magically hold themselves together.", 10,false),
            new Target("Eerie Crypt (left room)","marble","", "interact", "You hold your little sister's hand with one hand and stretch out the other. The surface of the sphere feels cold under your fingertips and you notice how the sphere begins to vibrate. Terrified, your hand jerks back. You can feel that your sister is also terrified. But you don't have time to react, because at the same moment the sphere explodes with a clinking sound and the glass fragments simply remain floating in space, while a short shower of sparks lights up the room. You are blinded and hold your hand in front of your aching eyes. When you open them again, blinking, a breathtaking sight expands before you. You are standing in a huge, collapsed chapel.", 10,true),
            new Target("Ruins of a crumbled church","","", "look", "Light refracts in the dirty, splintered windows. Nature has reclaimed most of the building and it looks like no one has been here in decades. Your sister still holds your hand with a firm grip. In the center you see a huge statue made of stone. It looks like a lion (lion). At its foot lies a small piece of cloth.(cloth).", 10,false),
            new Target("Ruins of a crumbled church","cloth","", "look", "It looks pretty dirty and you wonder why it catches your eye so much.", 10,false),
            new Target("Ruins of a crumbled church","cloth","", "take", "You pick up the piece of fabric. It still looks a bit dirty at first glance, but it is much silkier than expected. You feel the strange urge to talk to the statue", 10,true),
            new Target("Ruins of a crumbled church ","lion","", "look", "The lion statue is huge. Not even necessarily by its mass, but by its charisma. As soon as your eyes reach the lion, it's hard to take your eyes off it. The statue looks so alive, although it is obviously made of stone.", 10,false),
            new Target("Ruins of a crumbled church ","button","","interact", "The button falls down. It echoes unreal loud in the chapel. You bend down and pick up the dirty button. It goes back into your pocket.", 10,false),
            new Target("Ruins of a crumbled church ","button","lion","combine", "~This is the prize you received when you selflessly faced the beast.~", 10,false),
            new Target("Ruins of a crumbled church ","cloth","button", "combine", "This is not the right place to combine this. You should wait until you get back.", 10,false),
            //To Lion. Player: What happened?
            new Target("Ruins of a crumbled church ","lion","", "talk", "What happened?", 1,false),
            new Target("Ruins of a crumbled church ","lion","", "talk", "You just traveled between the worlds. Something happened so that you proved your bravery. I saw you fighting off a creature not just bigger, but more dangerous and deceitful than you are. You were brave and protected your sister at all costs. This is why you are here.", 2,false),
            //To Lion. Player: Who are you?
            new Target("Ruins of a crumbled church ","lion","", "talk", "Who are you?", 1,false),
            new Target("Ruins of a crumbled church ","lion","", "talk", "Just a lost memory of a god that honored the brave back in the days to pass every obstacle they encountered. I am the force to give you this power. You proved your character and nothing shall hold you back.", 2,false),
            //To Lion. Player: End conversation
            new Target("Ruins of a crumbled church ","lion","", "talk", "End conversation", 9,false),
            new Target("Ruins of a crumbled church ","lion","", "talk", "Take care and be mindful of the power I gave you.", 2,true),

            //Chapter 3
            //TODO Text hinzufügen: A small light emerges from inside the statue. You see how it floats calmly towards you. You do not retreat and the light touches you. A warm tingling sensation flows through you and the fear you have been carrying around with you suddenly dissolves into thin air. You look at your sister. She looks at you uncertainly, but the smile you give her also makes her smile hopefully. Suddenly you find yourself back in the hallway with your sister holding your hand.
            new Target("Hallway (Basement) III","","", "look", "Still no sign of the cat. But you realize that suddenly you are no longer afraid that she might come back. The hallway has changed. There are suddenly only 3 doors. The door to your left has disappeared. In its place, a picture has appeared showing a small dandelion (dandelion) breaking out of paved ground. Opposite you see a simple wooden door, nothing special, but sturdy (right door). The large arch is still overgrown with plants (door ahead). Doesn't look like they're going to die anytime soon. In your back is the storage room (door behind).", 10,false),
            new Target("Hallway (Basement) III","dandelion","", "look", "The paved floor resembles that of the chapel you were in just moments ago. The stones actually look exactly the same. The dandelion looks strong and is in full bloom. You think about him for a while and finally turn away from the image.", 10,false),
            new Target("Hallway (Basement) III","dandelion","", "interact", "You remember the magic orb that transported you to the chapel. Something about that picture seems magical. You are drawn into its spell and hold your breath in anticipation as you reach out your fingers to touch the frame. You are sure that something special will happen when your fingers touch the picture. You are only an inch away. Your fingertips touch the cold surface of the glass..... Nothing happens.", 10,false),
            //Text when conversation with raven is started:
            new Target("Hallway (Basement) III","raven","", "talk", "The raven still sits calm and sublime on the door handle. He seems to be waiting for you to comply with your wishes. His gaze is still as unpleasant as before.", 0,false),
            //To Raven. Player: Can you finally let me through?
            new Target("Hallway (Basement) III","raven","", "talk", "Can you finally let me through?", 1,false),
            new Target("Hallway (Basement) III","raven","", "talk", "TREASURE! OR NO PASS!", 2,false),
            //To Raven. Player: Are we going to fight now?
            new Target("Hallway (Basement) III","raven","", "talk", "Are we going to fight now?", 1,false),
            new Target("Hallway (Basement) III","raven","", "talk", "You don't seriously think that I would bend even a feather just to exterminate such an unworthy creature like you? Ridiculous, now get lost.", 2,false),
            //To Raven. Player: You won't believe what happened to me!
            new Target("Hallway (Basement) III","raven","", "talk", "You won't believe what happened to me!", 1,false),
            new Target("Hallway (Basement) III","raven","", "talk", "I am mentally superior to you. Don't try to lie to me. I've eaten some animals twice the size of you and your little companion.", 2,false),
            //To Raven. Player: End Conversation
            new Target("Hallway (Basement) III","raven","", "talk", "End conversation", 9,false),
            new Target("Hallway (Basement) III","raven","", "talk", "Bring me treasure, little thing.", 2,false),
            new Target("Hallway (Basement) III","cloth ","button",  "combine", "You start polishing the dirty button with the silky cloth. Slowly it begins to shimmer beautifully. Looks almost like a golden coin.", 10,true),
            new Target("Hallway (Basement) IV","button","raven",  "combine", "Raven: ~Oh that looks shiny. Give it to me and I'll open the door for you~ You hand the polished, glittery button to the raven. ~Gold. Jewelry. Valuables.~ he cheers. For a moment, you watch the raven rejoice in his newfound treasures. He doesn't seem to notice that it's a simple plastic gold-plated button. You feel a slight pang of guilt, but you would do anything to save your sister. Besides, the raven seems to be thievishly happy about your offering. A brief moment passes as you watch the raven rejoice in its new possession. Then, without giving you another glance, he opens the door, fluttering. Without hesitation, you walk through, your sister close behind you, before the raven can change its mind.", 10,true),
            new Target("Foggy Void","","", "look", "You take a step through the door. You have the feeling you can still hear the raven laughing behind you, but when you focus on it, you hear nothing but deafening silence. It is so quiet, as if you were deaf. And in front of you stretches a sea of white fog. You can't tell if you're looking into eternity or if it's only a few centimeters you can see. When you turn around, there is nothing but fog behind you. The door seems to have been swallowed up or to have simply dissolved. You can't make out how big the room is that you're in. Are you even in a room or are you outside? No matter where you look, it's just white. You could try to go straight ahead, but how smart is it to get even more lost in the dense fog (use ahead)? Or you try to find the wall of the room on the right (use right) or on the left (use left)?", 10,false),
            //right combination is: left, ahead, left
            //first movement in fog
            new Target("Foggy void","ahead","", "interact", "Thick fog envelops you and your sister as you continue forward, but the environment around you doesn't change a bit. Which way now? Ahead, left or right?", 10,false),
            new Target("Foggy void","right","", "interact", "Although you realize you've taken some steps, it looks like you haven't moved a bit. Which way now? Ahead, left or right?", 10,false),
            new Target("Foggy void","left","", "interact", "Carefully, you move to the left with your sister. For a moment, you think the fog is lifting, when it thickens again. Was it your imagination or are you possibly on the right path? Which way now? Ahead, left or right?", 10,true),
            //second movement in fog
            new Target("Foggy void II","left","", "interact", "Left seems to have worked once before. But your hope slowly dissipates when you notice that the fog doesn't change a bit. Which way now? Ahead, left or right?", 10,false),
            new Target("Foggy void II","right","", "interact", "You decide to turn a little to the right. Everything looks the same. Which way now? Ahead, left or right?", 10,false),
            new Target("Foggy void II","ahead","", "interact", "You walk slowly and hold your breath after a few steps. A soft ringing reaches your ears. It sounds like a small bell. Pure and bright, even if very quiet. Which way now? Ahead, left or right?", 10,true),
            //third movement in fog
            new Target("Foggy void III","ahead","", "interact", "Disoriented, you stumble around in the void. No matter how much you walk, it always looks the same. Which way now? Ahead, left or right?", 10,false),
            new Target("Foggy void III","right","", "interact", "Still nothing but dense fog. Slowly you are getting desperate. Which way now? Ahead, left or right?", 10,false),
            new Target("Foggy void III","left","", "interact", "You're getting impatient. There must be an exit somewhere. Your steps become faster. Looking down, you can't see your feet. In the distance, you imagine a small light on the ground. Is it your imagination? It becomes clearer and clearer the closer you get. You notice how you almost start running and you have to be careful not to lose your sister behind you. One more step. Solid ground under your feet. One more step. Solid ground under your feet. One more step. Emptiness. You can't react as fast as you fall. Small pebbles accompany your fall and you also hear your sister scream as you fall together. The impact is strangely gentle, although you can feel stony ground beneath you. As you blink and try to stand up, you notice that the fog has completely disappeared. All you see now is the vastness of a huge cave. In the center of the cave, illuminated by a bluish light, rises a statue of a large cat. In some places it is broken, but its individual pieces still float as if held by magic where they were once assembled.", 10,true),
            new Target("Light flooded cave","","", "look", "The cave you are in is huge. You are on a small ledge. A few meters in front of you it goes down, but from your point of view you have an incredible view of the cat statue (cat) in the middle. It towers loftily in the center of the cave. You feel overwhelmed by the sight and for another moment you just stand there admiring what you see.", 10,false),
            new Target("Light flooded cave","cat","", "look", "The cat statue looks frighteningly real. You're surprised you don't have the urge to flee. Normally, cats aren't your favorite animals. But this statue exudes a certain calm and peacefulness. Strangely, you feel that there is a certain deceitfulness in its gaze, but you are sure that it means you no harm. Small pebbles and fragments of the statue magically fly around her.", 10,false),
            new Target("Light flooded cave","sister","", "look", "Your sister seems to be as overwhelmed as you are. You didn't see her get up after the fall. But she looks unharmed, and if you didn't know she had just fallen, you wouldn't suspect it. Her gaze rests on the cat, but she doesn't look frightened, just as fascinated by the sight as you are.", 10,false),
            new Target("Light flooded cave","sister","", "talk", "Your sister looks unharmed and speechlessly admires the statue in the middle of the cave.", 0,false),
            //To sister. Player: Did you hurt yourself in the fall?
            new Target("Light flooded cave","sister","", "talk", "Did you hurt yourself in the fall?", 1,false),
            new Target("Light flooded cave","sister","", "talk", "I am fine. Strangely enough, I didn't feel the impact at all.", 2,false),
            //To sister. Player: You do not have to be afraid. The cat will not hurt you.
            new Target("Light flooded cave","sister","", "talk", "You do not have to be afraid. The cat will not hurt you.", 1,false),
            new Target("Light flooded cave","sister","", "talk", "I am not afraid. I know that she will not hurt us.", 2,false),
            //To sister. Player: End conversation
            new Target("Light flooded cave","sister","", "talk", "End conversation", 9,false),
            new Target("Light flooded cave","sister","", "talk", "We should talk to it, right?", 2,false),
            new Target("Light flooded cave","cat","", "talk", "The cat looks so real and alive even though it hasn't moved an inch.", 0,false),
            //To cat. Player: Are you alive?
            new Target("Light flooded cave","cat","", "talk", "Are you alive?", 1,false),
            new Target("Light flooded cave","cat","", "talk", "Alive would not be the word I would use to describe myself. I exist as long as someone remembers me and there are little heroes like you who overcome obstacles with great cunning and a clever head.", 2,false),
            //To cat. Player: What are you?
            new Target("Light flooded cave","cat","", "talk", "What are you?", 1,false),
            new Target("Light flooded cave","cat","", "talk", "You can imagine me as something you call a spirit. I am a part of your character since you proved that you have the necessary wisdom to face any challenge.", 2,false),
            //To cat. Player: What happened?
            new Target("Light flooded cave","cat","", "talk", "What happened?", 1,false),
            new Target("Light flooded cave","cat","", "talk", "Your character is formed from the choices you make and very few make it to that place. You did something heroic to save your sister. You put yourself in danger to free her. Not through strength, not through courage, but through ingenuity, you overcame a great obstacle and brought yourself and your sister one step closer to freedom.", 2,false),
            //To cat. Player: End conversation
            new Target("Light flooded cave","cat","", "talk", "End conversation", 9,false),
            new Target("Light flooded cave","cat","", "talk", "Return and find the last statue in the overgrown woods. A gate conquered by nature will guide you.", 2,true),

            //Chapter 4
            //TODO Text hinzufügen: The statue falls silent and at the same moment something seems to happen for the first time. Once again, you can see a soft glow appearing around the statue and a small ball of light coming out of its interior. The same small light you saw at the lion statue! A warm feeling flows through you as it slowly floats toward you and finally connects with you. Again you feel light and dazzled and when you open your eyes again you find yourself in the old familiar hallway.
            new Target("Hallway (Basement) V","","", "look", "Another time the hallway seems to have changed. To the left you can still see the pretty picture of the dandelion (dandelion). There is still no sign of the door. But as your gaze turns to the right, you see that the door on the right has also disappeared. You smile when you see the picture that has appeared on the wall in its place. It shows the interior of a cave and its floor overgrown with cat grass (grass). The large arch is still overgrown with plants (door ahead). Doesn't look like they're going to die anytime soon. In your back is the storage room (door behind).", 10,false),
    };



}
