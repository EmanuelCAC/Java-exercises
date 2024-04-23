/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação08.ex01;

/**
 *
 * @author cg3028691
 */
public class Circulo {
    double raio;
    
    public Circulo(double r) {
        this.raio = r;
    }
    
    public double area() {
        return 3.14 * (this.raio * this.raio);
    }
}
