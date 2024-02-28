/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação2;

import java.util.Arrays;

/**
 *
 * @author Emanuel
 */
public class ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v1[] = {1, 5, 8, 3, 9}, v2[] = {8, 6, 2, 0, 7}, v3[] = new int[6];
        int temp, i;

        for (i = v1.length-1; i >= 0; i--) {
            v3[i+1] += v1[i] + v2[i];
            temp = v3[i+1]/10;
            v3[i+1] = v3[i+1]%10;
            v3[i] = temp;
        }
        
        System.out.println(Arrays.toString(v3));
    }
    
}
