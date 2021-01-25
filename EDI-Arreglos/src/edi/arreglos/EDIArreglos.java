/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edi.arreglos;

/**
 *
 * @author edgar
 */
public class EDIArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] bnums = (int[]) nums.clone() ;
        
        System.out.println("FOR i");
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
            
        }

        System.out.println("For each");
        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println("Clone");
        for (int bnum : bnums) {
            System.out.println(bnum);
        }
        
       int[] sarraycopy;
        sarraycopy = new int[5];

        System.arraycopy(bnums, 5, sarraycopy, 0,3);
        for (int i : sarraycopy) {
            System.out.println(i);
        }
    }
    
}
