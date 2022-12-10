import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Vending {
    private ArrayList<String> directory;
    private ArrayList<Queue<Item>> slots;

    public Vending(final ArrayList<String> arr) {
        this.slots = new ArrayList<>(arr.size());
        this.loadItem(arr);
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
    }
    public void unloadedItem(final int index){
        if(index >= this.slots.size()) return;
        final Queue<Item> s = this.slots.get(index);
        if(s.isEmpty()) return;
        int max = 0, j = 0;
        for(final Integer i : this.findProduct(s.peek().getName())){
            final Queue<Item> slot = this.slots.get(i.intValue());
            if(slot.size() > max){
                max = slot.size();
                j = i.intValue();
            }
        }
        this.slots.get(j).poll();
    }
    private ArrayList<Integer> findProduct(String name){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < this.directory.size(); ++i){
            if (name == this.directory.get(i)) temp.add(i);
        }
        return temp;
    }
    public void unloadItems(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); ++i){
            this.unloadedItem(arr.get(i));
        }
    }

    public String toString(){
        String temp = "";
        for(int i = 0; i < directory.size(); ++i){
            if (directory.get(i) != null)
                temp += directory.get(i) + ": (" + slots.get(i).peek().getItemType() == "Snack" ? "Snack" : ((Drink)slots.get(i).peek()).getType() + "): " + slots.get(i).size() + "\n";
            else{
                temp += "This slot is empty\n";
            }
        }
        return temp;
    }
    public void displayItems(){
        System.out.println(this.toString());
    }
}
