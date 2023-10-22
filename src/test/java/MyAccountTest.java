public class MyAccountTest {
    public static void main(String[] args) {
        MyAccount account = new MyAccount();

        // Test 1: Deposit positive amount
        account.deposit(1000);
        assert account.getBalance() == 1000;

        // Test 2: Withdraw valid amount
        account.withdraw(500);
        assert account.getBalance() == 500;

        // Test 3: Withdraw invalid amount
        account.withdraw(700);
        assert account.getBalance() == 500; // Balance should remain unchanged
    }
}
