import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTEst {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount("Alice", 1000.0);
          System.out.println("Setup complete...");
    }

    @AfterEach
    public void tearDown() {
        account = null;
        System.out.println("Teardown complete...");
    }

    @Test
    public void testDeposit(){

        account.deposit(500.0);
          assertEquals(1500.0, account.getBalance(), "Deposit should increase balance...");
    }

    @Test
    public void testWithdraw() {
        account.withdraw(400.0);
          assertEquals(600.0, account.getBalance(), "Withdraw should decrease balance.");
    }

    @Test
    public void testWithdrawMoreThanBalance()
    {
         account.withdraw(1200.0);

          assertEquals(1000.0, account.getBalance(), "Balance should not change on overdraft attempt.");
    }
}
