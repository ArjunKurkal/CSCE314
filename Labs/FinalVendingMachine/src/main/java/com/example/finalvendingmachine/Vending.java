package com.example.finalvendingmachine;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Vending {
    private ArrayList<String> directory;
    private ArrayList<Queue<Item>> slots;

    public Vending(final ArrayList<String> arr) {
        this.slots = new ArrayList<>(8);
        this.directory = new ArrayList<>(8);
        this.loadItem(arr);
        for(int i = 0; i < slots.size(); ++i){
            if(slots.get(i).size() != 0) directory.add(i, slots.get(i).peek().getName());
        }

    }

    public String itemInSlot(int i){
        return directory.get(i);
    }

    public Integer[] quantity(){
        Integer[] temp = new Integer[8];
        for(int i = 0; i < this.slots.size(); ++i){
            temp[i] = this.slots.get(i).size();
        }
        return temp;
    }

    public void loadItem(final ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); ++i) {
            this.slots.add(new LinkedList<>());
            String[] data = arr.get(i).split(",\\s");
            Item item = "Drink".equals(data[0])
                    ? new Drink(data[1], Float.parseFloat(data[2]), data[0], Float.parseFloat(data[3]), data[4])
                    : new Snack(data[1], Float.parseFloat(data[2]), data[0], Float.parseFloat(data[3]),
                    Boolean.parseBoolean(data[4]));
            for (int j = 0; j < Integer.parseInt(data[5]); ++j)
                this.slots.get(i).add(item);
        }
        for(int i = arr.size(); i < 8; ++i){
            this.slots.add(new LinkedList<>());
            this.directory.add("empty");
        }
    }
    public void unloadedItem(final int index) {
        if (index >= this.slots.size())
            return;
        final Queue<Item> s = this.slots.get(index);
        if (s.isEmpty())
            return;
        int max = 0, j = 0;
        for (final Integer i : this.findProduct(s.peek().getName())) {
            final Queue<Item> slot = this.slots.get(i.intValue());
            if (slot.size() > max) {
                max = slot.size();
                j = i.intValue();
            }
        }

        this.slots.get(j).poll();
    }
    private ArrayList<Integer> findProduct(String name){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < this.directory.size(); ++i){
            if (name.equals(this.directory.get(i))) temp.add(i);
        }
        return temp;
    }
    public void unloadItems(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); ++i){
            this.unloadedItem(arr.get(i));
        }
    }
    @Override
    public String toString(){
        String temp = "";
        for(final Queue<Item> slot : this.slots){
            if(slot.isEmpty()) temp += "This spot is empty\n";
            else{
                final Item item = slot.peek();
                final String itemType = item.getItemType();
                String type;
                if (item instanceof Drink)
                    type = ((Drink) item).getType();
                else
                    type = itemType;
                temp+=(String.format("%s: (%s): %d%n", item.getName(), type, slot.size()));
            }
        }
        return temp;
    }
    public void displayItems(){
        System.out.println(this.toString());
    }
}
