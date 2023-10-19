/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_tallas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int talla = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce tu talla en valor númerico");
        
        switch(talla){
                case 29:
                     System.out.println("small");
                     break;
                case 42:
                    System.out.println("medium");
                    break;
                case 44:
                    System.out.println("large");
                    break;
                case 48:
                    System.out.println("xlarge");
                    break;
                default:
                    System.out.println("talla desconocida");
                    
                    
        }
                    
                        
            
        
    }
    
}
