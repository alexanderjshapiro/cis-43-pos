package pos;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<Item>();

    public Inventory() {
        this.items.add(new Item("Apple", "4877326352", 0.55, 100));
        this.items.add(new Item("Tomato", "21366363636",0.5,50));
        this.items.add(new Item("Corn", "21366363637",0.75,150));
        this.items.add(new Item("Garlic","045888655",2.00,30));
    }
    
    
    
    public void increaseQuantity(String itemName) {
        for (Item item : this.items) {
            if (itemName.equals(item.getName())) {
                item.add();
                return;
            }
        }
    }

    public void decreaseQuantity(String itemName) {
        for (Item item : this.items) {
            if (itemName.equals(item.getName())) {
                if (item.getQuantity()>=0) {
                    item.remove();
                }
                return;
            }
        }
    }


    public void createItem(String name, String itemId) {
        this.items.add(new Item(name,  itemId));
    }
     public void createItem(String name, String itemId, double price) {
        this.items.add(new Item(name,  itemId, price));
    } 
    public void createItem(String name, String itemId, double price, int quantity) {
        this.items.add(new Item(name,  itemId, price, quantity));
    }
    public String toString() {
        String s="";
        s+="Inventory contains:\n";
        for (Item item:this.items) {
            s+=item.getName()+'\t' +item.getQuantity()+'\n';
        }
        return s;
    }


    public void printInventory() {
        System.out.println(this.toString());
    }


   
}