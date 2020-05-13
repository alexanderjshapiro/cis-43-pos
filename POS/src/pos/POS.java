package pos;

import javax.swing.JFrame;

/**
 * Runner for Dashboard.java
 *
 * @author Alexander Shapiro, Edwin Mejia
 * @version 0.1
 */
public class POS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grocery grocery = new Grocery();
        
        grocery.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grocery.setVisible(true);

    }
    
}
