import java.util.Objects;

public class Quadrilateral implements Comparable<Quadrilateral>{
    int length;
    int width;
    public int getLength(){return length;}
    public int getWidth(){return  width;}
    Quadrilateral(){
        length = 0;
        width = 0;
    }
    Quadrilateral(int l, int w){length = l; width = w;}
    public int area(){
        return length * width;
    }

    @Override
    public int compareTo(Quadrilateral o) {
        return this.area() - o.area();
    } //a fine time to forget how this works :(

    @Override
    public String toString(){
        return "Quadrilateral{length="+length+".0, width="+width+".0}";
    }


}
