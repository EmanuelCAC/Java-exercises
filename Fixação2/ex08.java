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
public class ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp=0, max=0, v1[] = {1, 4, 77, 3, 5, 2, 13, 54, 23}, v2[] = new int[v1.length];
    
        max = v1[0];
        for (int i = 0; i < v1.length; i++) {
            if (max < v1[i]) {
                max = v1[i];
                System.out.println(max);
            } 
        }
        
        
        for (int i = 0; i < v1.length; i++) {
            temp = 0;
            for (int j = 0; j < v1.length; j++) {
                if (v1[temp] > v1[j]) temp = j;
            }
            v2[i] = v1[temp];
            v1[temp] = max+1;
        }
        
        System.out.println(Arrays.toString(v2));
    }
    
}
