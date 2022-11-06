public class customer {

    private String name;
    private int ph_num;
    private String address;
    private account acc;
    private double[] Transactions;
    private int index;

    public customer(String name, int ph_num, String address)
    {
        this(name, ph_num, address, 0);
    }

    public customer(String name, int ph_num, String address, double deposit)
    {
        this.name = name;
        this.ph_num = ph_num;
        this.address = address;
        if (deposit == 0){
            acc = new c_acc();
        }
        else
        {
            acc = new s_acc(deposit);
        }
        Transactions = new double[200];
        index = 0;

    }

    // getters
    public String getName() {return name;}
    public int getPhoneNum() {return ph_num;}
    public String getAddress() {return address;}
    public account getAcc() {return acc;}
    public double[] getTransactions() {return Transactions;}

    // setters
    public void setName(String name) {this.name = name;}
    public void setPhoneNum(int ph_num) {this.ph_num = ph_num;}
    public void setAddress(String address) {this.address = address;}
    public void setAcc(account acc) {this.acc = acc;}
    public void setTransactions(double[] trans) {this.Transactions = trans;}

    public void makeDebit(double money){
        acc.debit(money);
        if (index == Transactions.length - 1) {
            double[] temp = new double[index * index];
            for (int i = 0; i < index; ++i)
                temp[i] = Transactions[i];
            Transactions = temp;
        }
        Transactions[index] = -1 * money;
        index++;
    }

    public void makeCredit(double money){
        acc.credit(money);
        if (index == Transactions.length - 1)
            if (index == Transactions.length - 1) {
                double[] temp = new double[index * index];
                for (int i = 0; i < index; ++i)
                    temp[i] = Transactions[i];
                Transactions = temp;
            }
        Transactions[index] = money;
        index++;
    }

    public String toString(){
        String out = "Name: " + getName() + "\nPhone Number: " + getPhoneNum() + "\nAddress: " + getAddress() +
                "\nAccount Number: " + acc.getAccNum() + "\nAccount Balance: " + acc.getBal() + "\nTransactions: [";
        if (index > 0)
            out += getTransactions()[0];
        for(int i = 1; i < index; i++){
            out += ", " + getTransactions()[i];
        }
        out += "]";
        return out;
    }
}
