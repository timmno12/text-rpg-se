package setup;

public class data {
    public static Target[] DATA={
            new Target("Cage","piece of wire", "look", "Whoever kidnapped you must’ve underestimated the power of a piece of wire because this piece of wire is your trusty lock-pick.", 10,false),
            new Target("Cage","piece of wire", "use", "After fiddling around for a little you manage to unlock your cage.", 10,true),
            new Target("Cage","", "look", "It’s dark here, the only light coming from the cracks in the door. You look outside your cage and down the shelf you're on, the distance is not too bad. On your right is your sister's cage, she seems nervous and is fiddling around with the metal bars. There’s a big jar to your left which is filled with suspiciously glowing water. ", 10,false),
            new Target("Cage","sister", "talk", "I’m so scared, I want to go home.", 0,false),
            new Target("Cage","sister", "talk", "Thank you. I don’t know what I would do without you.", 1,false),
            new Target("Cage","sister", "talk", "It’s really dark and there’s some weird objects here. ", 1,false),
    };
}
