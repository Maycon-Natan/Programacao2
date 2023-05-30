/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.exceçoes;

public class MinimoAlunos extends Exception {
    private int num;
    
    public MinimoAlunos(int valor){
        System.out.println("A disciplina alcançou o numero minimo de alunos");
        System.out.println("Adicione pelo menos " + (valor-10) + " alunos" );
    }

    public int getNum() {
        return num;
    }
}
