/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação3.ex01;

/**
 *
 * @author Emanuel
 */
public class Aluno {

    String MATRICULA, nome;
    float p1, p2, t;
    
    Aluno(String matricula, String nome, float p1, float p2, float t) {
        this.MATRICULA = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }
    float media() {
        return (this.p1/4) + (this.p2/4) + (this.t/2);
    }
    
    float rec() {
        float media = this.media();
        if (media < 6.0f) return 12 - media;
        else return 0;
    }
}
