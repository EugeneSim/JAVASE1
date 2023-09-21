package InnerClass;

/**
 * LoanManager
 */
public class LoanManager {

    private double principleAmount;
    private double annualInterestRate;
    private int LoanTenureMonths;

    

    public class EmiCalculator {
        public double calculateEmi() {
            double monthlyInterestRate = (annualInterestRate/12) /100;
            double emi = (principleAmount * monthlyInterestRate) / LoanTenureMonths;
            return emi;
        }
    }

    public static void main(String[] args) {
        double principleAmount = 10000;
        double annualInterestRate = 3.0 ;
        int LoanTenureMonths = 36 ;

        LoanManager loanManager = new LoanManager(principleAmount, annualInterestRate, LoanTenureMonths);
        EmiCalculator emiCalculator = loanManager.new EmiCalculator();

        double emi = emiCalculator.calculateEmi();
        System.out.println(emi);


    }

    public LoanManager(double principleAmount, double annualInterestRate, int loanTenureMonths) {
        this.principleAmount = principleAmount;
        this.annualInterestRate = annualInterestRate;
        LoanTenureMonths = loanTenureMonths;
    }
}