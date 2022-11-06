import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class account
{
    // Create a variable to store the account number
    private int accNum;

	//( try automatically generating the number for 5 bonus points.)
	// Hint: you can use a static variable of type AtomicInteger to store the latest account number
    // create a variable balance and use correct access specifier for it and create getter and setter for it.
    private double bal;

    // create class constructors for the same
    public account(){
        this(0);
    }

    public account(double money){
        Random rand = new Random();
        // randomly generate acc number
        accNum = rand.nextInt(899999) + 100000;
        bal = money;
    }

    // getters
    public int getAccNum() {return accNum;}
    public double getBal() {return bal;}

    // setters
    protected void set_AccNum(int num) { accNum = num;}
    protected void set_Bal(double num) { bal = num;}
    
    protected void credit(double money) {
    //Adds money to your account balance
        bal += money;
    }

    protected void debit(double money) {
        //Removes money from balance
        if (bal - money >= 500)
            bal -= money;
    }

    // abstract values
    public abstract double get_min_balance();

    public abstract void set_min_balance(double min);
}




