/**
 * This class, written for CPSC2151, stores information 
 * for a receipt. Specifically, the class stores the taxable
 * and nontaxable subtotals, allows users to add items to the
 * receipt, and returns the net receipt total according to 
 * a user-specified tax rate.
 *
 * @authors 
 * @version 1.0
 *
 * @invariant taxRate >= 0 AND taxableTotal >= 0 AND nontaxableTotal >= 0
 */
 
public class Receipt {

    private final static double taxRateConst;
    private double taxableTotal;
    private double nontaxableTotal;
    
    /** 
     * Constructs a receipt object with a certain taxRate that will be applied to items.
     *
     * @param
     * @pre 
     * @post 
     */
    public Receipt(double taxRate) {}

    /** 
     * Adds items to the receipt having a cost and quantity.
     * Can be taxable or non-taxable.
     *
     * @param 
     * @param 
     * @param 
     *
     * @pre 
     *
     * @post 
     */
    public void addToReceipt(double cost, int quantity, boolean isTaxable) {}

    /** 
     * Returns the sum of all non-taxable items on the receipt.
     *
     * @return 
     *
     * @pre
     *
     * @post 
     */
    public double getNonTaxableSubtotal() {}

    /**  
     * Returns the sum of all taxable items on the receipt.
     *
     * @return 
     *
     * @pre 
     *
     * @post 
     */
    public double getTaxableSubtotal() {}

    /** 
     * Returns the taxRate for the receipt object.
     *
     * @return
     * 
     * @pre 
     *
     * @post 
     */
    public double getTaxRate() {}

    /** 
     * Returns the total price for the receipt.
     *
     * @return 
     *
     * @pre 
     *
     * @post 
     */
    public double computeTotal() {}
}
