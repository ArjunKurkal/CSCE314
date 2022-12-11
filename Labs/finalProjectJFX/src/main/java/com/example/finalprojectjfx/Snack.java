public class Snack extends Item{
    private float weight;
    private boolean containsNuts;
    Snack(){
        super();
        weight = 0;
        containsNuts = false;
    }
    Snack(String n, float c, String i, float w, boolean CN){
        super(n,c,i);
        weight = w;
        containsNuts = CN;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }
    public String toString(){
        return "name=" + getName() + ", calories=" + getCalories() + ", itemType=" + getItemType() + ", weight=" + getWeight() + ", containsNuts=" + isContainsNuts();
    }
}
