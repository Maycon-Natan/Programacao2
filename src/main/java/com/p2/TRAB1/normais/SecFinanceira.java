package com.p2.TRAB1.normais;

import com.p2.TRAB1.Fila;
import com.p2.TRAB1.abstratas.Funcionario;
import com.p2.TRAB1.interfaces.Conta;
import com.p2.TRAB1.interfaces.PessoaFisica;
import com.p2.TRAB1.interfaces.Secretaria;
import java.util.ArrayList;




public class SecFinanceira extends Funcionario implements Secretaria {
 
    private int codSecretaria;
    private Fila<PessoaFisica> fila= new Fila();

    public SecFinanceira(String nome, String rg, int codSecretaria) {
        super(nome, rg);
        this.codSecretaria = codSecretaria;
    }

    public Fila<PessoaFisica> getFila() {
        return fila;
    }
    public void addFila(PessoaFisica p){
        fila.enfileirar(p);
    }
    public void removerFila(){
        fila.encerrarAtendimento();
    }

    @Override
    public String getRg() {
        return super.getRg();
    }

    @Override
    public void setRg(String rg) {
        super.setRg(rg);
    }

    @Override
    public ArrayList<Conta> getConta() {
        return super.getConta();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    
    public void setConta(Conta conta) {
        super.setConta(conta);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getCodSecretaria() {
        return codSecretaria;
    }

    @Override
    public void setCodSecretaria(int num) {
        this.codSecretaria = num;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
