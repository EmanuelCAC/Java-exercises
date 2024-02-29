/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação3.ex04;

import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class Data {
    int dia, mes, ano;
    
    Data (int dia, int mes, int ano) {
        boolean v;
        if ((ano%400 == 0 || ano%4 == 0) && ano%100 != 0) {
            switch (mes){
                case 1, 3, 5, 7, 8, 10, 12 -> v = dia <= 31 && dia > 0;
                case 4, 6, 9, 11 -> v = dia <= 30 && dia > 0;
                case 2 -> v = dia <= 29 && dia > 0;
                default -> v = false;
            }
        }
        else {
            switch (mes){
                case 1, 3, 5, 7, 8, 10, 12 -> v = dia <= 31 && dia > 0;
                case 4, 6, 9, 11 -> v = dia <= 30 && dia > 0;
                case 2 -> v = dia <= 28 && dia > 0;
                default -> v = false;
            }
        }
        
        if (v) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else System.out.println("Data invalida!");
    }
    
    Data() {
        LocalDateTime now = LocalDateTime.now(); 
        this.dia =  now.getDayOfMonth();
        this.mes =  now.getMonthValue();
        this.ano =  now.getYear();
    }
    
    String ToString() {
        return Integer.toString(dia) + "/" +
               Integer.toString(mes) + "/" +
               Integer.toString(ano);
    }
    
    void proximoDia() {
        if ((this.ano%400 == 0 || this.ano%4 == 0) && this.ano%100 != 0) {
            switch (this.mes){
                case 1, 3, 5, 7, 8, 10 -> {
                    if (this.dia < 31) this.dia++;
                    else {
                        this.dia = 1;
                        this.mes++;
                    }
                }
                case 4, 6, 9, 11 -> {
                    if (this.dia < 30) this.dia++;
                        else {
                            this.dia = 1;
                            this.mes++;
                        }
                }
                case 12 -> {
                    if (this.dia < 31) this.dia++;
                    else {
                       this.dia = 1;
                       this.mes = 1;
                       this.ano++;
                   }
                }
                case 2 -> {
                    if (this.dia < 29) this.dia++;
                    else {
                       this.dia = 1;
                       this.mes++;
                   }
                }
                default -> JOptionPane.showMessageDialog(null, "Erro: proximoDia()");
            }
        }
        else {
            switch (mes){
               case 1, 3, 5, 7, 8, 10 -> {
                    if (this.dia < 31) this.dia++;
                    else {
                        this.dia = 1;
                        this.mes++;
                    }
                }
                case 4, 6, 9, 11 -> {
                    if (this.dia < 30) this.dia++;
                        else {
                            this.dia = 1;
                            this.mes++;
                        }
                }
                case 12 -> {
                    if (this.dia < 31) this.dia++;
                    else {
                       this.dia = 1;
                       this.mes = 1;
                       this.ano++;
                   }
                }
                case 2 -> {
                    if (this.dia < 28) this.dia++;
                    else {
                       this.dia = 1;
                       this.mes++;
                   }
                }
                default -> JOptionPane.showMessageDialog(null, "Erro: proximoDia()");
            }
        }
    }
    
    int comparação(int dia, int mes, int ano) {
        if (this.dia == dia && this.mes == mes && this.ano == ano) return 0;
        else if (this.ano > ano) return 1;
        else if (this.ano < ano) return -1;
        else if (this.ano == ano) {
            if (this.mes > mes) return 1;
            else if (this.mes < mes) return -1;
            else if (this.mes == mes) {
                if (this.dia > dia) return 1;
                else return -1;
            }
        }
        return 0;
    }
    
    boolean isBissexto() {
        return (this.ano%400 == 0 || this.ano%4 == 0) && this.ano%100 != 0;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

