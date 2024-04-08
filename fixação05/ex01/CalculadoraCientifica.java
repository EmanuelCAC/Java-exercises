/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação05.ex01;
import java.lang.Math;

/**
 *
 * @author cg3028691
 */
public class CalculadoraCientifica extends Calculadora {
    
    public double raiz(double a){
        return Math.sqrt(a);
    }
    
    public double potencia(double a, double b){
        return Math.pow(a, b);
    }
}
