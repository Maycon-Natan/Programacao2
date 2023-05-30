/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.abstratas;

import com.p2.TRAB1.interfaces.Conta;

import java.util.ArrayList;


public abstract class Pessoa {
    protected String nome;
    private final ArrayList<Conta> contas = new ArrayList();
    
    public Pessoa(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getConta() {
        return contas;
    }

    public void setConta(Conta conta) {
        contas.add(conta);
    }
    
}