package com.example.vendingmachine;

public class Item {
    private String Name;
    private float Calories;
    private String itemType;
    Item(){
        Name = "";
        Calories = 0;
        itemType = "";
    }
    Item(String n, float c, String i){
        Name = n;
        Calories = c;
        itemType = i;
    }
    public void setName(String name){
        Name = name;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public float getCalories() {
        return Calories;
    }

    public String getItemType() {
        return itemType;
    }

    public String getName() {
        return Name;
    }

    public void setCalories(float calories) {
        Calories = calories;
    }
}
