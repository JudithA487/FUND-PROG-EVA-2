/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_año_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EVA2_4_AÑO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int year;
        int residuo;
        
        System.out.println("introduce el año");
        year = input.nextInt();
        
        residuo = year % 4;
        if(residuo == 0){  //divisible entre 4, no es garantia de que sea año bisiesto
            residuo = year % 100;
            if(residuo > 0)
                System.out.println("Es año bisiesto");
            else{ 
                residuo = year % 400;
                if(residuo == 0)
                    System.out.println("No es año bisiesto");
            }
        }else
            System.out.println("no es bisiesto");
        
        
        
        
        
        
        }
     
        
    
                
    }
    
}
