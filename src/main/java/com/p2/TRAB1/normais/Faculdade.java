package com.p2.TRAB1.normais;

import com.p2.TRAB1.abstratas.Empresa;
import com.p2.TRAB1.interfaces.Conta;
import java.util.ArrayList;



public class Faculdade extends Empresa{
    
    private final ArrayList<Curso> cursos = new ArrayList();
    private final ArrayList<Coordenador> coordenadores= new ArrayList();
    private final ArrayList<SecAcademica> secretariosAcademicos= new ArrayList();
    private ArrayList<SecFinanceira> secretariosFinanceiros= new ArrayList();
    private Diretor diretor;

    public Faculdade(String cnpj, String nomeFaculdade, String nome) {
        super(cnpj, nomeFaculdade, nome);
    }

    public void setCursos(Curso curso) {
        cursos.add(curso);
    }
    
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCoordenadores(Coordenador coordenador) {
        coordenadores.add(coordenador);
    }
    
    public ArrayList<Coordenador> getCoordenadores() {
        return coordenadores;
    }
    
    public void setSecretariosAcademicos(SecAcademica secretario) {
        secretariosAcademicos.add(secretario);
    }
    
    public ArrayList<SecAcademica> getSecretariosAcademicos() {
        return secretariosAcademicos;
    }

    
    public void setSecretariosFinanceiros(SecFinanceira secretario) {
        secretariosFinanceiros.add(secretario);
    }

    public ArrayList<SecFinanceira> getSecretariosFinanceiros() {
        return secretariosFinanceiros;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    @Override
    public String getCnpj() {
        return super.getCnpj();
    }

    @Override
    public String getNomeEmpresa() {
        return super.getNomeEmpresa();
    }

    @Override
    public void setCnpj(String cnpj) {
        super.setCnpj(cnpj);
    }

    @Override
    public void setNomeEmpresa(String nomeFuncionario) {
        super.setNomeEmpresa(nomeFuncionario);
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
    public String toString() {
        return this.nome;
    }  

  
    
}
