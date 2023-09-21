package objects.Encapsulation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEntry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Accounts> accounts = new ArrayList<>();
        boolean continueEntry = true;

        do {
            accounts.add(new Accounts());
            int currRec = accounts.size() - 1;
            System.out.println("Enter Account Number");
            int aid = input.nextInt();
            accounts.get(currRec).setAcctId(aid);
            System.out.println("Enter Account Name");
            System.out.println("Enter 1 for Savings");
            System.out.println("Enter 2 for Current");
            System.out.println("Enter 3 for Loan");
            System.out.println("Enter 4 for Fixed");
            int atype = input.nextInt();

            if (atype == 1)
                accounts.get(currRec).setAcctType(AcctType.SAVINGS);
            else if (atype == 2)
                accounts.get(currRec).setAcctType(AcctType.CURRENT);
            else if (atype == 3)
                accounts.get(currRec).setAcctType(AcctType.LOAN);
            else if (atype == 4)
                accounts.get(currRec).setAcctType(AcctType.FIXED);
            System.out.println("Enter balance");
            double abal = input.nextDouble();

            accounts.get(currRec).setBal(abal);
            accounts.get(currRec).setDop(LocalDate.now());

            System.out.println("Enter another?");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n"))
                continueEntry = false;

        } while (continueEntry);

        for (Accounts acc : accounts) {
            System.out.println(acc.toString());
        }

    }
}