/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpi.pkg1clase;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class LPI1clase {

    public static void ejercicio1() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // crrear dos variables, una booleana que evaluarà el IF, y una de tipo string para imprimir un mensaje
    boolean linea;
    String sMensaje = "1.- Hola Grupo B de Lenguajes de Programcación I ";
    String sMsgElse = "2.- La programación es lo máximo ... ";
      
         // Modificar la variable para que el if funcione en ambias vias, con verdadero y falso
       linea = false;
       // Primera Condición IF
        System.out.println("-----------[Primer Ejemplo]-{Valor Booleano}--------------------------");
        
       if (linea) {
           System.out.println(sMensaje);      
       }else{
           System.out.println(sMsgElse);
       }     
       System.out.println("-----------[Segundo Ejemplo]-{Mayor Que}--------------------------");
       int valor1 = 2;
       int valor2 = 2;
       
       if (valor1 > valor2) {
          System.out.println(sMensaje);
       } else {
           System.out.println(sMsgElse);
       }

       System.out.println("-----------[Tercer Ejemplo]-{Igualdad}--------------------------");
       if (valor1 == valor2) {
          System.out.println(sMensaje);
       }

       System.out.println("-----------[Cuarto Ejemplo]-{Mayor Que}--------------------------");
       valor1 = 3;
       valor2 = 3;
       
       if (valor1 > valor2) {
          System.out.println(sMensaje);
       } else {
           if (valor1 < valor2){
               System.out.println(sMsgElse);
           }else{
               System.out.println("3.- Numeros Iguales");
           }
       }

       System.out.println("-----------[Quinto Ejemplo]-{Mayor Que}--------------------------");
       valor1 = 3;
       valor2 = 1;
       
       if (valor1 > valor2) {
          System.out.println(sMensaje);
       } else if (valor1 < valor2){
            System.out.println(sMsgElse);
       }else{
            System.out.println("3.- Numeros Iguales");
       }     
    }
    
}
