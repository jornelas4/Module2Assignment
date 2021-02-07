package edu.wctc;

import java.util.ArrayList;
import java.util.List;

//This is a concreted class
public class Player {

    //This is a field with an int called score
    private int score;

    //This is a list of Strings called inventory
    private List<String> inventory = new ArrayList<>();

    //This is a Method that accepts String Arguments that adds to Players inventory list
    public void addToInventory(String inventoryList) {
        inventory.add(inventoryList);
    }

    //This is a Method that accepts and int argument and add to the Players score
    public void addToScore(int points) {
        score += points;
    }

    //This is a Method that gets the inventory and return a string.  Will contain contents of Player inventory list
    //Also if empty will return message
    public String getInventory() {
        if (inventory.isEmpty()) {
            return "Empty";
        } else {
            return inventory.toString();
        }
    }

    //This is a Method gets score and will return the players score with an int
    public int getScore() {
        return score;
    }

}
