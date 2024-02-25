//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account a1 = new Account("123","Ahmed", 5000);
        Account a2 = new Account("124","Ali", 10000);

        System.out.println(a1.getName() + " New balance: " + a1.transerTo(a2, 1000));
        System.out.println("balance after debit : " + a1.debit(2000));
        System.out.println("balance after credit: " +a1.credit(1000));
        System.out.println("balance after debit : " + a1.debit(5000));
        System.out.println(a2.getName() + " New balance: " + a2.transerTo(a1, 15000));

        System.out.println(a1.getName() + "  balance: " + a1.getBalance());
        System.out.println(a2.getName() + "  balance: " + a2.getBalance());
        System.out.println(a1.toString());
        System.out.println(a2.toString());


        System.out.println("\n============== Employee =================");
        Employee e1 = new Employee("1234", "Mohammed", 10000);
        Employee e2 = new Employee("1235", "Salman", 12000);

        System.out.println(e1.getName() + " Salary : " + e1.getSalary());
        System.out.println(e1.getName() + " Annual Salary: " + e1.getAnnualSalary());
        System.out.println(e1.getName() + " Salary after raise: " + e1.raisedSalary(10));

        System.out.println("\n");

        System.out.println(e2.getName() + " Salary : " + e2.getSalary());
        System.out.println(e2.getName() + " Annual Salary: " + e2.getAnnualSalary());
        System.out.println(e2.getName() + " Salary after raise: " + e2.raisedSalary(10));

    }
}