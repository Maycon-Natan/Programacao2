package com.p2.TRAB1.normais;

import java.util.ArrayList;



public class Curso {
    private String nome;
    private String codCurso;
    private Coordenador coordenador;
    private final ArrayList<Disciplina> disciplinas= new ArrayList();

    public Curso(String nome, String codCurso) {
        this.nome = nome;
        this.codCurso = codCurso;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodCurso() {
        return codCurso;
    }
    
    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }
    
    public ArrayList<Disciplina> getDisciplina(){
        return disciplinas;
    }
    public void addDisciplina(Disciplina d){
        disciplinas.add(d);
    }
    
    public void removeDisciplina(Disciplina d){
        disciplinas.remove(d);
    }

    @Override
    public String toString() {
        return this.nome;
    }  
}
