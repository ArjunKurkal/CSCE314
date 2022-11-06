import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class bank {
    enum account_type {SAVINGS, CHECKING}
    static customer[] customers;

    public static void main(String[] args){
        create_accounts();
        System.out.println();

        create_accounts(3);
        System.out.println();

        create_accounts(2, account_type.SAVINGS);
        create_accounts(2, account_type.CHECKING);
    }

    static public void create_accounts() {
        // create two customers to demonstrate your work here
        customer joe = new customer("Joe Biden", 1234567890, "TheWhiteHouse");
        joe.makeCredit(2000);
        joe.makeDebit(1000);
        System.out.println(joe);
        System.out.println();
        customer kamala = new customer("Kamala Harris", 987654321, "TheWhiteHouse", 55555);
        kamala.makeCredit(12);
        kamala.makeDebit(44444);
        System.out.println(kamala);
    }

    static public void create_accounts(int n) {
        Random rand = new Random();
        customers = new customer[n];
        for (int i = 0; i < n; ++i) {
            customers[i] = new customer("Joe Biden", 1234567890,
                    "TheWhiteHouse", rand.nextDouble() * 10000);
            System.out.println(customers[i]);
            System.out.println();
        }
    }

    //creates n customers with acc_type accounts
    static public void create_accounts(int n, account_type acc_type) {
        Random rand = new Random();
        // creates n savings accounts
        customers = new customer[n];
        if (acc_type == account_type.SAVINGS)
        {
            for (int i = 0; i < n; ++i) {
                customers[i] = new customer("Joe Biden", 1234567890,
                        "TheWhiteHouse",  rand.nextDouble() * 10000);
                System.out.println(customers[i]);
                System.out.println();
            }
        }
        //creates n checkings accounts
        else
        {
            for (int i = 0; i < n; ++i){
                customers[i] = new customer("joe", 1234567890,
                        "WhiteHouse",  rand.nextDouble() * 10000);
                System.out.println(customers[i]);
                System.out.println();
            }
        }
    }
    /*  create overloaded create_accounts method  with correct function signatures */
	// Note: you can use the enum provided above or String or integer to identify the account type. Please add what you have used in the comments
//
//        create customers with random attribute and store them in array
//	Note: Since this is a learning exercise the customers can have the same attributes

}
