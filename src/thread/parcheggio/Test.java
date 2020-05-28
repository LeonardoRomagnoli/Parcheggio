/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.parcheggio;

/**
 *
 * @author Leonardo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Parcheggio p = new Parcheggio(5);
        
        for (int i = 0; i < 10; i++) 
        {
            Macchina m = new Macchina("Auto : " + i, p);
        }
    }
}
