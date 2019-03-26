/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafion5;

/**
 *
 * @author BMXDDT006040
 */
public class DesafioN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num= 80;
        int anterior=0;
        int actual=1;
        int fibo = 0;
            
        while(fibo<=num) {
            fibo=(anterior+actual);
            anterior=actual;
            actual=fibo;
            System.out.println (fibo+", ");
        }
    } 
}
