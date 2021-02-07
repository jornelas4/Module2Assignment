package edu.wctc;
//This is a concrete Safe class that extends the Room class for the interface
public class Safe extends Room implements Lootable{

    //This is an abstract Method for Safe that gives the name of the class
    public Safe(String name) {
        super(name);
    }

    // This is a Method for loot that returns a message and item added to Player Inventory List
    @Override
    public String lootable(Player player) {
        player.addToInventory("Health Potion");
        return "You have received a potion veil for your health";
    }
    //This is a Method for abstract get method get description and returns the description of the Room entered
    @Override
    public String getDescription() {
        return "You will be safe in this room temporarily";
    }
}
