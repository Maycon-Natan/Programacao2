package com.p2.TRAB1.normais;

import com.p2.TRAB1.abstratas.Funcionario;
import com.p2.TRAB1.interfaces.Conta;

import com.p2.TRAB1.interfaces.Diretoria;
import java.util.ArrayList;



public class Diretor extends Funcionario implements Diretoria {

    private int codDiretoria;

    public Diretor(String nome, String rg, int codDiretoria) {
        super(nome, rg);
        this.codDiretoria = codDiretoria;    
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
    public int getCodDiretoria() {
        return codDiretoria;
    }

    @Override
    public void setCodDiretoria(int num) {
        this.codDiretoria = num;        
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
