package objects.Encapsulation;

import java.time.LocalDate;

public class Accounts {
    private int acctId;
    private AcctType acctType;
    private double bal;
    private LocalDate dop;

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }

    public AcctType getAcctType() {
        return acctType;
    }

    public void setAcctType(AcctType acctType) {
        this.acctType = acctType;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public LocalDate getDop() {
        return dop;
    }

    public void setDop(LocalDate dop) {
        this.dop = dop;
    }

    @Override
public String toString() {
    return "Account ID: " + acctId + "\n" +
           "Account Type: " + acctType + "\n" +
           "Balance: " + bal + "\n" +
           "Date of Opening: " + dop + "\n";
}

}