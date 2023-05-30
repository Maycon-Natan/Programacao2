
package com.p2.TRAB1.normais;

import com.p2.TRAB1.abstratas.Pessoa;
import com.p2.TRAB1.exceçoes.SaldoInsuficiente;
import com.p2.TRAB1.interfaces.Conta;



public class ContaPoupanca implements Conta {
    private String codConta;
    private Pessoa titular;
    private Gerente gerente;
    private double saldo;
    private Agencia agencia;
    private float rendimento;


    public ContaPoupanca(String codConta,  double saldo) {
        this.codConta = codConta;

      
        this.saldo = saldo;
        
    }

    @Override
    public Gerente getGerente() {
        return gerente;
    }

    @Override
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    @Override
    public Pessoa getTitular() {
        return titular;
    }

    @Override
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
    
    @Override
    public String getAgencia() {
        return agencia.getCodAgencia();
    }

    @Override
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.saldo = this.saldo * rendimento;
    }

    
    @Override
    public void depositar(double valor) {
        this.saldo+= valor;
    }

    @Override
    public void sacar(double valor) throws Exception {
        if(saldo < valor){
            throw new SaldoInsuficiente(saldo);
        }
        else
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!\n" + "Valor em saldo" + this.saldo);
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
        this.codConta= codConta;
    }

    @Override
    public String toString() {
        return this.codConta;
    }



    
}
