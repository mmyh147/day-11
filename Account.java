public class Account {
    private String id, name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){
        System.out.println(" A debit of " + amount + " units has been successfully processed. ");
        balance += amount;
        return balance;
    }

    public int debit(int amount){
        if (balance >= amount){
            System.out.println("A credit of " + amount + " units has been successfully processed.");
            balance -= amount;
        }else{
            System.out.println("You don't have this amount of money");
        }
        return balance;
    }

    public int transerTo(Account another, int amount){
        if (balance >= amount){

            System.out.println( name + " transfer " + amount + " To " + another.getName());
            balance = balance - amount;
            another.balance += amount ;
        }else{
            System.out.println("You don't have this amount of money");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
