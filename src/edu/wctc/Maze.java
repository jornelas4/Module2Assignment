package edu.wctc;

//Concrete class created by creating new class file
public class Maze {

    //These are fields created for class Maze
    private Room currentRoom;
    private Player player;
    private boolean isFinished;

    //Boolean for isFinished which initialization of false
    public boolean isFinished() {
        return isFinished;
    }

    //Maze constructor that accepts player objects and room objects
    public Maze(Player player) {
        this.player = player;
        Safe safe = new Safe("Safe room");
        Cellar cellar = new Cellar("You have entered the Cellar");
        safe.setDown(cellar);
        cellar.setUp(safe);
        currentRoom = safe;
        Spooky spooky = new Spooky("Spooky Room");
        cellar.setEast(spooky);
        spooky.setWest(cellar);
    }
    //This is a Method that returns a string to exit current room which will return message. It is also using the
    //Exit interface
    public String exitCurrentRoom() {
        if (currentRoom instanceof Exit exitRoom) {
            isFinished = true;
            return exitRoom.exit(player);
        } else {
            return "You can't exit from this room";
        }
    }
    //This is a Method that returns a string to interact with the room which will return message.  It is also using the
    //Interactable interface
    public String interactWithCurrentRoom() {
        if (currentRoom instanceof Interactable interact) {
            return interact.interact(player);
        } else {
            return "You can't interact from this room";
        }

    }
    //This is a room that returns a string to loot a room which will also return a message. It is also using the
    //Lootable interface
    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable loot) {
            return loot.lootable(player);
        } else {
            return "You can't loot from this room";
        }
    }
    //This is a method which accpets Char arguments for the direction the user/Player will go and will return a
    //boolean.
    public boolean move(char directions){
        if (currentRoom.isValidDirection(directions)){  //This validates if the current room direction is valid.
            currentRoom = currentRoom.getAdjoiningRoom(directions);// This will get the adjoining room directions.
        }
        return false;
    }

    //This is a method that will return the players score by calling the getScore Method
    public int getPlayerScore() {
        return player.getScore();
    }

    //This is a Method  that will return a players inventory list by calling the getInventory Method
    public String getPlayerInventory() {
        return player.getInventory();

    }
    //Method that returns the results of calling the getDescription Method
    public String getCurrentRoomDescripton() {
        return currentRoom.getName();
    }
    //Method that returns the results of calling the getExits Method
    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }


}
