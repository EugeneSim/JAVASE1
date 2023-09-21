package objects.Encapsulation;

import java.time.LocalDate;

public class CreateAccounts {
    public static void main(String[] args) {
        Accounts accounts = new Accounts();
        accounts.setAcctId(100);
        accounts.setAcctType(AcctType.SAVINGS);
        accounts.setBal(1000);
        accounts.setDop(LocalDate.now());

        System.out.println(
                accounts.getAcctId()
                        + " "
                        + accounts.getAcctType()
                        + " "
                        + accounts.getBal()
                        + " "
                        + accounts.getDop());
    }
}