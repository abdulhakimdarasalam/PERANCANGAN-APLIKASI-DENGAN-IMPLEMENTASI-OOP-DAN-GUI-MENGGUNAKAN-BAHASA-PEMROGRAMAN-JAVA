/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlineshoeshop;

/**
 *
 * @author Abdul Hakim D
 */
public class OnlineShoeShop {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login lg = new Login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);
    }
    
}
