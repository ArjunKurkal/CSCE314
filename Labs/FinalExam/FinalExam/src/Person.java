import java.util.Collections;

public class Person {
    private double Height;
    private double Weight;
    private int Age;
    private String Name;
    private String Country;
    Person(){
        Height = 0;
        Weight = 0;
        Age = 0;
        Name = "";
        Country = "";
    }
    Person(double height, double weight, int age, String name, String country){
        Height = height;
        Weight = weight;
        Age=age;
        Name = name;
        Country = country;
    }


    public double getHeight(){ return Height;}
    public double getWeight(){ return Weight;}
    public int getAge(){return Age;}
    public String getName(){return Name;}
    public String getCountry(){return Country;}
    public void setHeight(int height){Height = height;}
    public void setWeight(int weight){Weight = weight;}
    public void setAge(int age){Age = age;}
    public void setName(String name){Name = name;}
    public void setCountry(String country){Country = country;}

    public String toString(){
        return "name='" + Name + "', country=" + Country + "', age=" + Age + "', height=" + Height + "', weight=" + Weight;
    }
}
