/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.exceçoes;

public class SaldoInsuficiente extends Exception {
    private double valor;

    public SaldoInsuficiente(double valor){
        this.valor= valor;
        System.out.println("Saldo insuficiente para saque! \nSaldo atual:" +valor);
    }
    
    public double getValor(){
        return valor;
    }
}
