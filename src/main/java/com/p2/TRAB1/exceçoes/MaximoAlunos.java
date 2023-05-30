/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.exceçoes;

public class MaximoAlunos  extends Exception{
    private int num;
    
    public MaximoAlunos(int valor){
        System.out.println("A disciplina alcançou o numero maximo de alunos");
        System.out.println("Remova pelo menos " + (valor-60) + " alunos" );
    }

    public int getNum() {
        return num;
    }
}
