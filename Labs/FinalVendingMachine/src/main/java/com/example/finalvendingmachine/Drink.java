package com.example.finalvendingmachine;


public class Drink extends Item{
    private float ounces;
    private String type;
    Drink(){
        super();
        ounces=0;
        type="";
    }

    public float getOunces() {
        return ounces;
    }

    public String getType() {
        return type;
    }

    public void setOunces(float ounces) {
        this.ounces = ounces;
    }

    public void setType(String type) {
        this.type = type;
    }

    Drink(String n, float c, String i, float o, String t){
        super(n, c, i);
        ounces = o;
        type = t;
    }

    public String toString(){
        return "name=" + getName() + ", calories=" + getCalories() + ", itemType=" + getItemType() + ", ounces=" + getOunces() + ", type=" + getType();
    }
}
