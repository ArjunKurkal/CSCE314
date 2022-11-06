public class s_acc extends account {
    private double min_balance;

    public s_acc(double money){
        super(money);
        min_balance = 500;
    }

    public s_acc(double money, double min){
        super(money);
        min_balance = min;
    }

    public double get_min_balance() { return min_balance; }

    public void set_min_balance(double min) { min_balance = min; }
}
