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
        houseCost = hCost;
        downPayment = dPayment;
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
        double percentDown = downPayment/houseCost;
        
        if(rate < IMortgage.RATETOOHIGH && percentDown >= IMortgage.MIN_PERCENT_DOWN && DebtToIncomeRatio(percentDown) <= IMortgage.DTOITOOHIGH){
            return true;
        }
        else{
            return false;
        }
    }


   public double getPayment(){
        double rate = getRate()/12;
        int numPayements = years * IMortgage.MONTHS_IN_YEAR;
        double principal = getPrincipal();
        return ((rate) * principal) / (1-Math.pow(1+(rate), -numPayements));
    }

   public double getRate(){
        double baseAPR = 0.025; 
        if (customer.getCreditScore() < 500)  // very bad
           baseAPR += 0.1; 
        else if (customer.getCreditScore() >= 500 && customer.getCreditScore() < 600)  // bad
           baseAPR += 0.05; 
        else if (customer.getCreditScore() >= 600 && customer.getCreditScore() < 700)  // fair
           baseAPR += 0.01; 
        else if (customer.getCreditScore() >= 700 && customer.getCreditScore() < 750)  // good
           baseAPR += 0.005; 
        
        if (years < 30) 
            baseAPR += 0.005; 
        else 
            baseAPR += 0.01; 
    
        if (downPayment / houseCost < 0.2) 
            baseAPR += 0.005;
    
        return baseAPR;
    }
    
   public double getPrincipal(){
        return houseCost - downPayment;
    }

    public int getYears(){
        return years;
    }

}
