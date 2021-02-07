package edu.wctc;

public class Spooky extends Room implements Interactable {

    //This is an abstract Method for spooky that gives the name of the room
    public Spooky(String name) {
        super(name);
    }

    //This is a Method for abstract get method get description and returns the description of the Room entered
    @Override
    public String getDescription() {
        return "You have entered spooky room";
    }

    // This is a Method for interact that returns a message and adds point to player score
    @Override
    public String interact(Player player) {
        player.addToScore(10);
        return "You opened the door";
    }

}




