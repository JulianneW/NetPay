/*
 * Julianne Wojdak
 * 18/09/18
 * Calculate NetPay
 */

package netpay;

/**
 *
 * @author JuWoj8013
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n=0.0;
        double h=40;
        double w=5.00;
        double i=2.00;
        double t=0.22;
        n=(h*w-i)-t*(h*w-i);
        System.out.println("Net pay = "+n+("$"));
        // TODO code application logic here
    }
    
}
