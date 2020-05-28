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
public class Macchina extends Thread{
    private Parcheggio park;
    
    public Macchina(String nome, Parcheggio p)
    {
        super(nome);
        this.park = p;
        start();
    }
    
    public void run()
    {
        while(true)
        {
            try
            {
                sleep((int) (Math.random() * 20000));
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            synchronized(park)
            {
                park.entra();
                System.out.println(getName() + " : è entrata liberi : " + park.posti);
            }
            try
            {
                sleep((int)(Math.random() * 10000));
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            synchronized(park)
            {
                park.esce();
                System.out.println(getName() + " : è uscita liberi : " + park.posti);
            }
        }
    }
}
