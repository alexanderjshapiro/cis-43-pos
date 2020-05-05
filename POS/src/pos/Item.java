

package pos;

import static java.lang.String.format;


public class Item {

    private String name;
    private String itemId;
    private int quantity;
    private double price;
    
    public Item(String name,  double price) {
        this.name=name;
        this.itemId="0000";
        this.price=price;
        this.quantity=0;
    }
    public Item(String name, String itemId, double price) {
        this.name=name;
        this.itemId=itemId;
        this.price=price;
        this.quantity=0;
    }
    public Item(String name, String itemId, double price, int quantity) {
        this.name=name;
        this.itemId=itemId;
        this.price=price;
        this.quantity=quantity;
    }


    public void add() {
        this.quantity++;
    }

    public void remove() {
        this.quantity--;
    }
    public void setNewPrice(double newPrice){
        this.price=newPrice;
    }

    public String getName() {
        return this.name;
    }

    public String getItemId() {
        return this.itemId;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    public int getQuantity() {
        return this.quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s \t $%.2f %n", getName(), getPrice()); 
    }
}
