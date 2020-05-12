package pos;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<Item>();

    public Inventory() {
        this.items.add(new Item("Apple", "4877326352"));
        this.items.add(new Item("Tomato", "21366363636"));
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


   /* public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.printInventory();
        inventory.increaseQuantity("Book");
        inventory.increaseQuantity("Pen");
        inventory.printInventory();
        inventory.decreaseQuantity("Book");
        inventory.printInventory();
        inventory.createItem("Pencil", "92827234534");
        inventory.printInventory();
        inventory.increaseQuantity("Pencil");
        inventory.printInventory();
    }
*/
}