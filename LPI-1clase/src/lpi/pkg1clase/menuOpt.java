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
public class menuOpt {

    static void imprimirMensaje(String sMensaje){
        System.out.println(sMensaje);
    }

    public static void main(String[] args) {
        int opcionmenu; 
        do {
           imprimirMensaje("1.- Comparar dos Números ");
           imprimirMensaje("2.- Calcular el área de un Triangulo ");
           imprimirMensaje("3.- Calcular el área de un Cuadrado");
           imprimirMensaje("4.- Calcular el área de un Circulo");
           imprimirMensaje("5.- Calcular el área del Pentagono");
           imprimirMensaje("9.- Salir");           

           Scanner entrada = new Scanner( System.in );
           imprimirMensaje("Teccle la opción deseada __ ");        
           opcionmenu = entrada.nextInt();
          //submenu(opcionmenu);
       } while (opcionmenu != 9);
    }
}
