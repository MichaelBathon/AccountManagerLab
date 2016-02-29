package bathon.michael.reusingclasseslab4;

/**
 * Created by michaelbathon on 2/7/16.
 */
public abstract class Account {

    Account(){

    }

    protected String accountHolder;

    protected String accountNum;

    protected int accountBalance;

    public abstract void setAccountNum(String accountNum);

    public abstract String getAccountNum();

    public abstract void changeAccountBalance(int funds);

    public abstract int getAccountBalance();


}
