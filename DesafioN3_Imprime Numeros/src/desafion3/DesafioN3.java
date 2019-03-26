/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafion3;

/**
 *
 * @author BMXDDT006040
 */
public class DesafioN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=1;
           
        while (cont <= 50) {
           
                
           if ( cont%3 == 0 & cont%5 == 0){
                System.out.println("BestDay");
           } else 
                    if ( cont%3 == 0){
                System.out.println("Best");
           } else 
                    if ( cont%5 == 0){
                System.out.println("Day");
           } else System.out.println(cont);
                
            
            cont = cont + 1;
           
        }
    } 
}
