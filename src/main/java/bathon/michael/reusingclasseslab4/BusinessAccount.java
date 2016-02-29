package bathon.michael.reusingclasseslab4;

/**
 * Created by michaelbathon on 2/7/16.
 */
public class BusinessAccount extends Account {

    BusinessAccount(String accHold, String accountNum, int accBal){
        this.accountHolder = accHold;
        this.accountNum = accountNum;
        this.accountBalance = accBal;
    }


    @Override
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    @Override
    public String getAccountNum() {
        return this.accountNum;
    }

    @Override
    public void changeAccountBalance(int funds) {
        this.accountBalance += funds;
    }

    @Override
    public int getAccountBalance() {
        return this.accountBalance;
    }


}
