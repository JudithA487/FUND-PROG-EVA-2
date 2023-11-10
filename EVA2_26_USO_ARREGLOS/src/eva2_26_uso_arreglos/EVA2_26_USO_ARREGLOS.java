/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_26_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] platillos = new String[10];
        platillos[0] = "Tacos";
        platillos[1] = "Tortas de lomo";
        platillos[2] = "Tortas ahogadas";
        platillos[3] = "Tamales";
        platillos[4] = "Tripitas";
        platillos[5] = "Tripotas";
        platillos[6] = "Tlayudas";
        platillos[7] = "Tlacoyos";
        platillos[8] = "Chilaquiles";
        platillos[9] = "T-BONE";
        double[] precio = {20, 50, 60, 25, 80, 90, 55, 30, 100, 400};
        
        System.out.println("--------MENÚ-------");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + "- " + platillos[i] + ": $" + precio[i]);
        }
        int opc, cant;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué quiere ordenar?");
        opc = input.nextInt();
        System.out.println("¿Cuántas órdenes quieres?");
        cant = input.nextInt();
        System.out.println("El costo de tu pedido es: " + (cant * precio[opc]));
    }
    
}
