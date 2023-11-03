package cpsc2150.banking.models;

/*
 * @invariant houseCost >= 0 AND downPayment >= 0 AND years >= 0 AND
 * [customer must be an instance of an implmentation of ICustomer]
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
    * @post
    * houseCost = hCost AND downPayment = dPayment AND years = yrs AND customer =  cx
    * 
    */
    public Mortgage(double hCost, double dPayment, int yrs, ICustomer cx) {
        houseCost = hCost;
        downPayment = dPayment;
        years = yrs;
        customer = cx;
    }

    /** DebtToIncomeRatio Contracts
     * preforms the calcuations for a ratio of debt to income
     *
     * @param monthlyP The monthly payments
     * @pre getIncome() >= 0
     * @post Mortgage = #Mortgage [Object remains unchanged]
     * @return [ratio of debt to income]
     */
   private double DebtToIncomeRatio(double monthlyP){
        double total = customer.getMonthlyDebtPayments() + monthlyP;
        double monthlyIncome = customer.getIncome() / IMortgage.MONTHS_IN_YEAR;
        return total / monthlyIncome;
   }
   /** loanApproved Contracts
    * @pre rate >= 0 && downPayment >= 0 && houseCost >= 0
    * @post Mortgage = #Mortgage [Object remains unchanged]
    * @return [return true of rate isn't too high AND percent down isn't too low AND DtoI isn't too high | False if otherwise]
    */
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

    /** getPayemnt Contracts 
     * @pre getRate >= 0 
     * @post getPayment >= 0 AND Mortgage = #Mortgage [Object remains unchanged]
     * @return [monthly payment required] 
     */
   public double getPayment(){
        double rate = getRate()/12;
        int numPayements = years * IMortgage.MONTHS_IN_YEAR;
        double principal = getPrincipal();
        return ((rate) * principal) / (1-Math.pow(1+(rate), -numPayements));
    }

    /**getRate Contracts
     * @pre years >= 0
     * @post baseAPR >= 0 AND Mortgage = #Mortgage [State of Object remains unchanged]
     * @return calculated baseAPR
     */
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
    /** getPrinciple Contracts
     * @pre houseCost >= 0 AND downPayment >= 0
     * @post Mortgage = #Mortgage [State of Object remains unchanged]
     * @return principle = houseCost - downPayment
     */
   public double getPrincipal(){
        return houseCost - downPayment;
    }
    /** getYears Contracts 
     * @pre years >= 0
     * @post Mortgage = #Mortgage [State of object remains unchanged]
     * @return years
     */
    public int getYears(){
        return years;
    }

}
