public class Rectangle  extends Quadrilateral{
    int length;
    int width;
    Rectangle(){length = 0; width = 0;}
    Rectangle(int l, int w){length = l; width = w;}

    @Override
    public int area() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{length="+length+".0, width="+width+".0}";
    }
}
