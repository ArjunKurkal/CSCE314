public class Square  extends Quadrilateral{
    int length;
    int width;
    Square(){length = 0; width = 0;}
    Square(int l){length = l; width = l;}

    @Override
    public int area() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Square {Side=" + length + ".0}";
    }
}
