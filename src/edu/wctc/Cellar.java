package edu.wctc;
//This is a concrete Basement class that extends the Room class for the interface
public class Cellar extends Room implements Exit{

    //This is a abstract Method for Cellar that gives the name of the Room
    public Cellar(String name) {
        super(name);
    }


    // This is a Method for Exit that returns a message
    @Override
    public String exit(Player player) {
        return "You have exited the Maze";
    }


    //This is a Method for abstract get method get description and returns the description of the Room entered
    @Override
    public String getDescription() {
        return "You have made it to the cellar.  Your almost out of the woods";
    }
}
