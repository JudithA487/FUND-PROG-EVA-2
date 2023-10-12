/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_operaciones;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int var1, var2, resu;
        
        var1 = 100;
        var2 = 200;
        
        
        //OPERADOR +
        //SUMA
        //CONCATENAR --> UNIR CADENAS DE TEXTO
        resu = var1 + var2;
        System.out.println("Var1 = " + var2);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 + var2 = " + resu);
       
        //RESTA
        resu = var1 - var2;
        System.out.println(); //SALTO DE INEA (ENTER)
        System.out.println("resta: " );
        System.out.println("Var1 = " + var2);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 - var2 = " + resu);
        
        //MULTIPLICACION 
        //OPERADOR *
        resu= var1 * var2;
        System.out.println(); //SALTO DE INEA (ENTER)
        System.out.println("multiplicación: " );
        System.out.println("Var1 = " + var2);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 * var2 = " + resu);
        
        //DIVISIÓN
        //OPERADOR /
        //OJO: El tipo de dato importante, si quieren
        //el resultado de una división, hay que manejarlo flotante
        //si lo manejan entero, les dará el # de veces que cabe el
        //divisor en el dividendo (de forma entera)
        var1 = 15;
        var2 = 7;
        resu= var1 / var2;
        System.out.println(); //SALTO DE INEA (ENTER)
        System.out.println("DIVISIÓN: " );
        System.out.println("Var1 = " + var2);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 / var2 = " + resu);
        
        //DIVISIÓN FLOTANTE
        double resuExacto;
        resuExacto = var1 / var2;
        System.out.println(); //SALTO DE INEA (ENTER)
        System.out.println("DIVISIÓN EXACTA: " );
        System.out.println("Var1 = " + var2);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 / var2 = " + resuExacto);
        
        double var2F = 7;
        resuExacto = var1 / var2F;
        System.out.println(); //SALTO DE INEA (ENTER)
        System.out.println("DIVISIÓN EXACTA (SERÁ?: " );
        System.out.println("Var1 = " + var2);
        System.out.println("Var2 = " + var2F);
        System.out.println("Var1 / var2 = " + resuExacto);
        
        
        int cifra = 7;
        double cifraDouble = 7.0;
        
        double division = 100 / 10;  //es diferente a:
        //double division = 100 / 10.0 //SE TOMA EL DIVISOR COMO FLOTANTE
        
        //PRECEDENCIA DE OPERACIONES:
        int a = 5, b = 3, c = 2;
        int resultado = (a * b) + (a - c) * (b - a);//(15)+(3)*(_2)// 15-6 = 9
        System.out.println("RESULTADO PRECEDENCIA:" + resultado);
        
        //POTENCIAS Y RAICES:
        double potencia;
        potencia = Math.pow(100, 2);
        System.out.println("POTENCIA = " + potencia);
        
        
        
        
        
        
        
        
        
        
        

       
        
        
        
        
    }
    
}
