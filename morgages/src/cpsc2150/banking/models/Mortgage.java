package cpsc2150.banking.models;

/*
 * @invariant 
 */


public class Mortgage extends AbsMortgage implements IMortgage {
    double houseCost;
    double downPayment;
    int years;
    ICustomer customer;
    public Mortgage(double hCost, double dPayment, int yrs, ICustomer cx) {
        hCost = houseCost;
        dPayment = downPayment;
        years = yrs;
        customer = cx;
    }
    
    boolean loanApproved(){
        
    }
    

    double getPayment(){

    }

    double getRate(){
        
    }

    double getPrincipal(){
        return houseCost - downPayment;
    }

    int getYears(){
        return years;
    }
    
}
