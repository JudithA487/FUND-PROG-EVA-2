/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_carreras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carrera;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la carrera: ");
        carrera = input.next();
        
        switch(carrera){
            case "ISC":
                System.out.println("Ingenieria sistemas computacionales");
                break;
            case "INF":
                System.out.println("Ingenieria en informatica");
                break;
            case "IND":
                System.out.println("Ingenieria");
                break;
            case "IDI":
                System.out.println("Ingenieria diseño industrial");
                break;
            case "LA":
                System.out.println("Icenciatua en administración");
                break;
            case "IGE":
                System.out.println("Ingenieria gestion empresarial");
                break;
            case "ARQ":
                System.out.println("Arquitectura");
                break;
        }
                     

        }
    
}
