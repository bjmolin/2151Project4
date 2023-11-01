package cpsc2150.banking.models;

/*
 * @invariant
 */


public class Mortgage extends AbsMortgage implements IMortgage {
    double houseCost;
    double downPayment;
    int years;
    ICustomer customer;
   
    /*Mortgage Constructor Contracts
    *
    * @pre hCost >= 0 AND dPayment >= 0 AND yrs >= 0 AND Mortgage = #Mortgage
    * 
    */
    public Mortgage(double hCost, double dPayment, int yrs, ICustomer cx) {
        hCost = houseCost;
        dPayment = downPayment;
        years = yrs;
        customer = cx;
    }

   private double DebtToIncomeRatio(double monthlyP){
        double total = customer.getMonthlyDebtPayments() + monthlyP;
        double monthlyIncome = customer.getIncome() / IMortgage.MONTHS_IN_YEAR;
        return total / monthlyIncome;
   }

   public boolean loanApproved(){
        double rate = getRate() * 12;
        double PercentDown = downPayment/houseCost;
        
        if(rate < IMortgage.RATETOOHIGH && PercentDown >= IMortgage.MIN_PERCENT_DOWN && DebtToIncomeRatio(PercentDown) <= IMortgage.DTOITOOHIGH){
            return true;
        }
        else{
            return false;
        }
    }


   public double getPayment(){
        double rate = getRate();
        int numPayements = years * IMortgage.MONTHS_IN_YEAR;

        return(getRate() * getPrincipal()) / ()
    }

   public double getRate(){

    }

   public double getPrincipal(){
        return houseCost - downPayment;
    }

    public int getYears(){
        return years;
    }

}
