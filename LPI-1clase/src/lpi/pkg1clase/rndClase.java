/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpi.pkg1clase;

import java.util.Random;


/**
 *
 * @author edgar
 */
public class rndClase {
    public static String almVisual(){
        int    totAlumnos = 32; 
        double semAlumno;
        int    idAlumno;
        
        String[]  aAlumnosLPA;
        aAlumnosLPA    = new String[totAlumnos];
        aAlumnosLPA[0]= "Adrian E Aguilar Quej";   
        aAlumnosLPA[1]= "Carlos A Alvarez Queb";   
        aAlumnosLPA[2]= "Javier E Balmes Castillo";   
        aAlumnosLPA[3]= "Denilson Blanco Garcia";   
        aAlumnosLPA[4]= "Mauricio A Blanquet Rodriguez";   
        aAlumnosLPA[5]= "Katia G Calan Chi";   
        aAlumnosLPA[6]= "Andre Calderon Martinez";   
        aAlumnosLPA[7]= "Karla D Carrillo Arcos";   
        aAlumnosLPA[8]= "Carolina Chi Arceo";   
        aAlumnosLPA[9]= "William J Chi Rico";   
        aAlumnosLPA[10]= "Samuel J Dzec Lopez";   
        aAlumnosLPA[11]= "Miguel A Dzib Alayola";   
        aAlumnosLPA[12]= "Maria J Gonzalez Barahona";   
        aAlumnosLPA[13]= "Johnny A Heredia Reveles";   
        aAlumnosLPA[14]= "Jossmar O Ku Cupul";   
        aAlumnosLPA[15]= "Alonso Medina Reyes";   
        aAlumnosLPA[16]= "Victor M Mora Alvarez";   
        aAlumnosLPA[17]= "Eduardo A Morales Espinosa";   
        aAlumnosLPA[18]= "Rafael A Moreno Chel";   
        aAlumnosLPA[19]= "Rey A Paz Carrillo";   
        aAlumnosLPA[20]= "Geder N Perez Dzib";   
        aAlumnosLPA[21]= "Luis R Perez Martinez";   
        aAlumnosLPA[22]= "Miguel A Rivas Gomez";   
        aAlumnosLPA[23]= "Adriana L Rosado Uicab";   
        aAlumnosLPA[24]= "Oscar A Ruiz Velazquez";   
        aAlumnosLPA[25]= "Arely S Salazar Uc";   
        aAlumnosLPA[26]= "Michael A Salvador Cocom";   
        aAlumnosLPA[27]= "Jorge A Sulub Xool";   
        aAlumnosLPA[28]= "Salvador M Valle Saenz";   
        aAlumnosLPA[29]= "Victor B Vazquez Mejia";   
        aAlumnosLPA[30]= "Santiago J Vela Mena";   
        aAlumnosLPA[31]= "Jesus D Zapata Leon";       
        
        Random rndAlumnos = new Random();
        
        semAlumno = ((rndAlumnos.nextDouble()*totAlumnos));
        idAlumno  = (int)(semAlumno);
        return idAlumno+ " - " +aAlumnosLPA[idAlumno];
    }
    
    public static void main(String[] args) {
        // System.out.println(almVisual());    
        // 22 - Miguel A Rivas Gomez
        int totAlumnos = 6;
        String[]  aAlumnosLPA;
        aAlumnosLPA    = new String[totAlumnos];
        aAlumnosLPA[0]= "Adrian E Aguilar Quej";   
        aAlumnosLPA[1]= "Carlos A Alvarez Queb";   
        aAlumnosLPA[2]= "Javier E Balmes Castillo";   
        aAlumnosLPA[3]= "Denilson Blanco Garcia";   
        aAlumnosLPA[4]= "Mauricio A Blanquet Rodriguez";   
        aAlumnosLPA[5]= "Katia G Calan Chi";   

        int[]  matricula;
        matricula    = new int[3];
        matricula[0]= 10;   
        matricula[1]= 11;   
        matricula[2]= 12;   

        
        for (int i = 0; i < aAlumnosLPA.length; i++) {
            System.out.println(i);
            System.out.println(aAlumnosLPA[i]);
        }
        
        for (String alumnos : aAlumnosLPA) {
            System.out.println(alumnos);
            
        }
        for (int mat : matricula) {
            System.out.println(mat);
        }
        
        
        // Ciclico decremental 
        int x = 11;
        while (x <= 10){
            System.out.println("Valor de x: " + x);
            x++;
        }
        
        int y = 11;
        do {
            System.out.println("Valor de -y- : " + y);
            y++;
        } while (y <= 10);

        
        
        // Ciclo con condición Booleana
        boolean valor = true;
        x = 1;
        while (valor){
            System.out.println("Valor de x: " + x);
            x++;
            if (x == 30){
                valor = false;
             }
        }

        // Ciclo con condicion booleana II
        valor = true;
        x = 1;
        int suma = 0;
        while (valor)
        {
            System.out.println("Valor de x: " + x+ "  = "+suma );
             x++;
             suma += x;  
            if (suma >= 30){
                valor = false;
                
            }
        }

        
    }
    
}
