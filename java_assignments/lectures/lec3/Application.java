package lectures.lec3;

public class Application {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.value);
        account.value = 2000;
        System.out.println(account.value);

        account.printAccountReport();

    }
}
