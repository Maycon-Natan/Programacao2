package com.p2.TRAB1.normais;

import com.p2.TRAB1.abstratas.Pessoa;
import com.p2.TRAB1.exceçoes.SaldoInsuficiente;
import com.p2.TRAB1.interfaces.Conta;


public class ContaCorrente implements Conta {
    private String codConta;
    private Pessoa titular;
    private Gerente gerente;
    private double saldo;
    private Agencia agencia;

    public ContaCorrente(String codConta,  double saldo) {
        this.codConta = codConta;
        this.saldo = saldo;
    }

    
    public String getAgencia() {
        return agencia.getCodAgencia();
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    
    @Override
    public void depositar(double valor) {
        this.saldo+= valor;
        System.out.println("Deposito realizado com sucesso!\n" + "Valor em saldo " + this.saldo);
    }

    @Override
    public void sacar(double valor) throws Exception {
        if(saldo < valor){
            throw new SaldoInsuficiente(saldo);
        }
        else
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!\n" + "Valor em saldo " + this.saldo);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String getCodConta() {
        return codConta;
    }

    @Override
    public void setCodConta(String codConta) {
        this.codConta = codConta;
    }

    @Override
    public String toString() {
        return this.codConta;
    }


    @Override
    public Gerente getGerente() { 
        return gerente;
    }


    @Override
    public Pessoa getTitular() {
        return titular;
    }


    @Override
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;     
    }


    @Override
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    
}
