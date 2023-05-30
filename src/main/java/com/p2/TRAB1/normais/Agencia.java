package com.p2.TRAB1.normais;

import com.p2.TRAB1.interfaces.Conta;
import java.util.ArrayList;

public class Agencia {
    private String nomeAgencia;
    private String codAgencia;
    private Banco banco;
    private final ArrayList<Conta> contas = new ArrayList();

    public Agencia(String nomeAgencia, String codAgencia) {
        this.nomeAgencia = nomeAgencia;
        this.codAgencia = codAgencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public ArrayList<Conta> getConta() {
        return contas;
    }

    public void setConta(Conta conta) {
        contas.add(conta);
    }
    
    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getCodAgencia() {
        return codAgencia;
    }

    public void setCodAgencia(String codAgencia) {
        this.codAgencia = codAgencia;
    }

    public String getContas() {
        return contas.toString();
    }
    
    public void addContas(Conta conta){
        contas.add(conta);
    }

    @Override
    public String toString() {
        return this.nomeAgencia;
    } 
}
