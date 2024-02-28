/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v1[]= {1, 4, 5, 2, 52, 8}, v2[] = {1, 4, 7, 2, 52, 5, 9, 10};
        int temp[] = new int[v1.length + v2.length], c=0;
        boolean unique=true;
        
        for (int i = 0; i < temp.length; i++) {
            if (i < v1.length) {
                temp[c] = v1[i];  
                c++;
            }
            else {
                for(int j = 0; j < v1.length; j++) {
                    unique = true;
                    if(temp[j] == v2[i-v1.length]) {
                        unique = false;
                        break;
                    }
                }
                if(unique) {
                    temp[c] = v2[i-v1.length];
                    c++;
                }
            }
            
        }
        
        v1 = new int[c];
        for (int i = 0; i < c; i++) {
            v1[i] = temp[i];
        }
        
        System.out.println(Arrays.toString(v1));
    }
    
}
