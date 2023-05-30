/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB1.interfaces;

import com.p2.TRAB1.abstratas.Pessoa;
import com.p2.TRAB1.normais.Agencia;
import com.p2.TRAB1.normais.Gerente;


public interface Conta {
    public void depositar(double valor);
    public void sacar(double valor) throws Exception;
    public double getSaldo();
    
    public String getCodConta();
    public void setCodConta(String codC);

    public Pessoa getTitular();
    public void setTitular(Pessoa titular);

    public Gerente getGerente();
    public void setGerente(Gerente gerente);

    public String getAgencia();
    public void setAgencia(Agencia agencia);


}
