/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author Edwin
 */
public class Sale {
    double subtotal=0;
    double tax=0;
    double total=0;
    
    public void updateTotal(double price)
    {
        this.subtotal = this.subtotal + price;
        this.tax = this.subtotal *0.0925;
        this.total = this.subtotal + this.tax;
        //subTotalLabel.setText(String.format("%.2f", subtotal));
        //taxLabel.setText(String.format("%.2f",tax));
        //totalLabel.setText(String.format("%.2f",total));
    }
    public double getSubTotal()
    {
        return subtotal;
    }
    
    public String toString()
    {
        return String.format("%.2f \tdfdfd %.2f \t %.2f", getSubTotal());
    }
                   
    
}
