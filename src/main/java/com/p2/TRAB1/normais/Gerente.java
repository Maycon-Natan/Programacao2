package com.p2.TRAB1.normais;

import com.p2.TRAB1.Fila;
import com.p2.TRAB1.abstratas.Funcionario;
import com.p2.TRAB1.abstratas.Pessoa;
import com.p2.TRAB1.interfaces.Conta;
import java.util.ArrayList;



public class Gerente extends Funcionario{ 
   
    private Fila<Pessoa> fila= new Fila();

    public Gerente(String nome, String rg) {
        super(nome, rg);
    }

    public Fila<Pessoa> getFila() {
        return fila;
    }

    public void addFila(Pessoa pessoa){
        fila.enfileirar(pessoa);
    }
    public void atenderFila(){
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

    @Override
    public void setConta(Conta conta) {
        super.setConta(conta);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
