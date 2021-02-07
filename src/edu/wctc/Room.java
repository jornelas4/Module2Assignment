package edu.wctc;

import java.util.List;

//Abstract class called Room
public abstract class Room {

    //String feild called name for the Room class
    private String name;

    //String fields for the Room class
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room down;
    private Room up;

    //constructor that accepts String for the class Room
    public Room(String name)
    {
        this.name = name;
    }

    //Abstract Method for getDescription which returns a string
    public abstract String getDescription();



    /*Method which accepts char arguments for the direction. if else statements are used to
       tell which direction they went*/
    public Room getAdjoiningRoom(char direction) {
        if (direction == 'w') {
            return west;
        } else if (direction == 'n') {
            return north;
        } else if (direction == 'e') {
            return east;
        } else if (direction == 's') {
            return south;
        } else if (direction == 'd') {
            return down;
        } else if (direction == 'u') {
            return up;
        } else {
            return null;
        }
    }
    /*Method which accepts char arguments for the direction.  if else statements used to
    return a boolean if the statement is not true*/
    public boolean isValidDirection(char direction) {
        if (direction == 'w') {
            return west != null;
        } else if (direction == 'n') {
            return north != null;
        } else if (direction == 'e') {
            return east != null;
        } else if (direction == 's') {
            return south != null;
        } else if (direction == 'd') {
            return down != null;
        } else if (direction == 'u') {
            return up != null;
        } else {
            return false;
        }
    }
    /*Method String name get exit that return description */
    public String getExits()
    {
        String name = "You can move: ";
        if (north != null){
            name += "North";
        }
        if (south != null) {
             name += "South";
        }
        if (east != null) {
             name += "East";
        }
        if (west != null) {
             name += "West";
        }
        if (down != null) {
             name += "Down";
         }
        if (up != null) {
             name += "Up";
        }
        return name;
    }

    //These are all getters and setters for the directions you can go.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public edu.wctc.Room getNorth() {
        return north;
    }

    public void setNorth(edu.wctc.Room north) {
        this.north = north;
    }

    public edu.wctc.Room getSouth() {
        return south;
    }

    public void setSouth(edu.wctc.Room south) {
        this.south = south;
    }

    public edu.wctc.Room getEast() {
        return east;
    }

    public void setEast(edu.wctc.Room east) {
        this.east = east;
    }

    public edu.wctc.Room getWest() {
        return west;
    }

    public void setWest(edu.wctc.Room west) {
        this.west = west;
    }

    public edu.wctc.Room getDown() {
        return down;
    }

    public void setDown(edu.wctc.Room down) {
        this.down = down;
    }

    public edu.wctc.Room getUp() {
        return up;
    }

    public void setUp(edu.wctc.Room up) {
        this.up = up;
    }


}
