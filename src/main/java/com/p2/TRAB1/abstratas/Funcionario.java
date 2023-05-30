/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.abstratas;

import com.p2.TRAB1.interfaces.PessoaFisica;



public abstract class Funcionario extends Pessoa implements PessoaFisica {

    private String rg;

    public Funcionario(String nome, String rg) {
        super(nome);
        this.rg = rg;        
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public void setRg(String rg) {
        this.rg = rg;   
    }
    
}
