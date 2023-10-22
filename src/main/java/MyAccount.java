public class MyAccount {
    private long deposit;
    private long withdrawal;
    private long balance;

    public MyAccount() {
        this.deposit = 0;
        this.withdrawal = 0;
        this.balance = 0;
    }

    public void deposit(long delta) {
        if (delta > 0) {
            this.deposit += delta;
            this.balance += delta;
        }
    }

    public void withdraw(long delta) {
        if (delta > 0 && delta <= this.balance) {
            this.withdrawal += delta;
            this.balance -= delta;
        }
    }

    public long getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        MyAccount account = new MyAccount();

        account.deposit(1000);
        System.out.println("Current balance: " + account.getBalance());

        account.withdraw(500);
        System.out.println("Current balance after withdrawal: " + account.getBalance());

        account.withdraw(700); // This should not work
        System.out.println("Current balance after second withdrawal: " + account.getBalance());
    }
}
