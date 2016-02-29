package bathon.michael.reusingclasseslab4;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by michaelbathon on 2/7/16.
 */
public class SpecAtm {




     @Test
    public void testDeposit(){

        Account account = new CheckingAccount("Mike", "B347692SD23", 1000);
        Atm atm = new Atm();

        atm.depositFunds(account, 1000);
        int balance = account.getAccountBalance();
        int expectedDeposit = 2000;

        assertEquals("Fails if the account balance doesn't match the increase of the deposit", expectedDeposit, balance);

    }


    @Test
    public void testWithdrawal(){

        Account account1 = new BusinessAccount("Billy", "K345N245D75", 5000);
        Atm atm1 = new Atm();

        atm1.withdrawalFunds(account1, 1000);
        int balance = account1.getAccountBalance();
        int expectedDeposit = 4000;

        assertEquals("Fails if the account balance doesn't match the increase of the deposit", expectedDeposit, balance);

    }






}
