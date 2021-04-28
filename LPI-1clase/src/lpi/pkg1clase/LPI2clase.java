/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpi.pkg1clase;

/**
 *
 * @author edgar
 */
public class LPI2clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]  aAlumnosLPB;
        aAlumnosLPB    = new String[25];
        aAlumnosLPB[0] = "Jose A Aguilar Contreras";
        aAlumnosLPB[1] = "Edgar A Cach Tamay";
        aAlumnosLPB[2] = "Juan A Carranza Magadan";
        
        aAlumnosLPB[3] = "Kevin A Chan Guzman";
        aAlumnosLPB[4] = "Edson C Coj Uc";
        aAlumnosLPB[5] = "Carolina C Colli Aguilar";
        aAlumnosLPB[6] = "Fernanda R Cruz Naal";
        aAlumnosLPB[7] = "Rodrigo R Cruz Rendis";
        aAlumnosLPB[8] = "Jorge F Dzul Cobos";
        aAlumnosLPB[9] = "Monica A Ehuan Cisneros";
        aAlumnosLPB[10] = "Vanessa A Estrella Uc";
        aAlumnosLPB[11] = "Vicente D Gonzalez Chable";
        aAlumnosLPB[12] = "Axel J Gutierrez Paat";
        aAlumnosLPB[13] = "Yahir A Hernandez Brown";
        aAlumnosLPB[14] = "Miguel A Hernandez Pat";
        aAlumnosLPB[15] = "Felix R Larraga Vera";
        aAlumnosLPB[16] = "Adrian J Luna Kan";
        aAlumnosLPB[17] = "Jesus A Magana Aguilar";
        aAlumnosLPB[18] = "Angel G Manrero Hidalgo";
        aAlumnosLPB[19] = "Otniel E Martinez Dionicio";
        aAlumnosLPB[20] = "German G May Chan";
        aAlumnosLPB[21] = "Alexander J Medina Colli";
        aAlumnosLPB[22] = "Ricardo J Moo Vargas";
        aAlumnosLPB[23] = "Alondra S Palma Pacheco";
        aAlumnosLPB[24] = "Alex O Rios Perez";
        

        String[]  aAlumnosLPA;
        aAlumnosLPA    = new String[25];
        aAlumnosLPA[0]= "Adrian E Aguilar Quej";   
        aAlumnosLPA[1]= "Carlos A Alvarez Queb";   
        aAlumnosLPA[2]= "Javier E Balmes Castillo";   
        aAlumnosLPA[3]= "Denilson Blanco Garcia";   
        aAlumnosLPA[4]= "Mauricio A Blanquet Rodriguez";   
        aAlumnosLPA[5]= "Katia G Calan Chi";   
        aAlumnosLPA[6]= "Andre Calderon Martinez";   
        aAlumnosLPA[7]= "Karla D Carrillo Arcos";   
        aAlumnosLPA[0]= "Carolina Chi Arceo";   
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


        
        System.out.println("-----------------[Ciclo For i]---------------------");
        for (int i = 0; i <aAlumnosLPB.length; i++) {
            //String string = aAlumnosLPB[i];
            // alumno = aAlumnosLPB[i];
            System.out.println(aAlumnosLPB[i]);
            
        }
        System.out.println("-----------------[Ciclo For e]---------------------");
        for (String alumno : aAlumnosLPB) {
            System.out.println(alumno);
        }

        System.out.println("-----------------[Ciclo For e2]---------------------");        
        for (String companeros : aAlumnosLPB) {
            System.out.println(companeros);
        }
        
        int[]  matriculas = new int[11];
        //matriculas    = new int[11];
        
        matriculas[0] = 1234;
        matriculas[1] = 1224;
        matriculas[2] = 1234;
        matriculas[3] = 1134;
        matriculas[4] = 1134;
        matriculas[5] = 234;
        matriculas[6] = 123;
        matriculas[7] = 134;
        matriculas[8] = 14;
        matriculas[9] = 12;
        matriculas[10] = 34;  
        
        for (int matricula : matriculas) {
            System.out.println(matricula);
            
        }

        
    }
    
}
