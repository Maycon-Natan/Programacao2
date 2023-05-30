package com.p2.TRAB1;

import com.p2.TRAB1.interfaces.Conta;
import com.p2.TRAB1.normais.Agencia;
import com.p2.TRAB1.normais.Aluno;
import com.p2.TRAB1.normais.Banco;
import com.p2.TRAB1.normais.ContaCorrente;
import com.p2.TRAB1.normais.ContaPoupanca;
import com.p2.TRAB1.normais.Coordenador;
import com.p2.TRAB1.normais.Curso;
import com.p2.TRAB1.normais.Diretor;
import com.p2.TRAB1.normais.Disciplina;
import com.p2.TRAB1.normais.Faculdade;
import com.p2.TRAB1.normais.Gerente;
import com.p2.TRAB1.normais.Presidente;
import com.p2.TRAB1.normais.Professor;
import com.p2.TRAB1.normais.SecAcademica;
import com.p2.TRAB1.normais.SecFinanceira;
import java.util.Scanner;

public class Metodos {
    static Scanner scan = new Scanner(System.in);

    public static void CriarCoord() {
        Coordenador coordenador = new Coordenador("nome","rg", 12345);
        String nome;  
        String rg;
        int cod;
        System.out.println("Digite as informacoes do Coordenador na ordem:NOME,RG,CODIGO DIRETORIA ");
        nome = scan.next();
        coordenador.setNome(nome);
        rg = Principal.scan.next();
        coordenador.setRg(rg);
        cod = Principal.scan.nextInt();
        coordenador.setCodDiretoria(cod);
        Principal.coordenadores.add(coordenador);
        Principal.pessoas.add(coordenador);
    }

    public static void CriarBanco() {
        Banco banco = new Banco("12345", "Default", "Default");
        String cnpj;
        String nomeEmpresa;
        String nome;
        System.out.println("Digite os dados do Banco na ordem:CNPJ, NOME FANTASIA,NOME DA PESSOA FISICA ");
        cnpj = Principal.scan.next();
        banco.setCnpj(cnpj);
        nomeEmpresa = Principal.scan.next();
        banco.setNomeEmpresa(nomeEmpresa);
        nome = Principal.scan.next();
        banco.setNome(nome);
        Principal.bancos[0] = banco;
        Principal.pessoas.add(banco);
    }

    public static void CriarSecAC() {
        SecAcademica sac = new SecAcademica("Default", "Default",  1234);
        String nome;
        String rg;
        int cod,op,op1,op2;
        System.out.println("Digite as informacoes do Coordenador na ordem:NOME,RG,CODIGO SECRETARIA ");
        nome = Principal.scan.next();  
        sac.setNome(nome); 
        rg = Principal.scan.next();
        sac.setRg(rg);
        cod = Principal.scan.nextInt();
        sac.setCodSecretaria(cod);
        
        Principal.secretariosAcademicos.add(sac);
        Principal.pessoas.add(sac);
        System.out.println("Deseja adicionar alunos a fila de atendimento: 1- Sim  2- Nao");
        op = scan.nextInt();
        if(op==1){
            System.out.println("Quantos:");
            op1= scan.nextInt();
            for(int i=0;i<op1;i++){
            System.out.println("Escolha o aluno:");
                for(int j=0;j<Principal.alunos.size();j++){
                    System.out.println(j+"."+Principal.alunos.get(j)+"|");
                }
                op2= scan.nextInt();
                sac.agendarAluno(Principal.alunos.get(op2));
            }
        }
    }

    
    public static void CriarSecFN() {
        SecFinanceira secFinanceira = new SecFinanceira("Default", "Default", 1234);
        String nome;
        String rg;
        int cod,op,op1,op2;
        System.out.println("Digite as informacoes do Coordenador na ordem:NOME,RG,CODIGO SECRETARIA ");
        nome = Principal.scan.next();
        secFinanceira.setNome(nome); 
        rg = Principal.scan.next();
        secFinanceira.setRg(rg);
        cod = Principal.scan.nextInt();
        secFinanceira.setCodSecretaria(cod);
        Principal.secretariosFinanceiros.add(secFinanceira);
        Principal.pessoas.add(secFinanceira);
        Principal.pessoasFisicas.add(secFinanceira);


        System.out.println("Deseja adicionar alguem a fila de atendimento: 1- Sim  2- Nao");
        op= scan.nextInt();
        if(op==1){
            System.out.println("Quantos:");
            op1= scan.nextInt();
            for(int i=0;i<op1;i++){
                System.out.println("Escolha a pessoa:");
                for(int j=0; j<Principal.pessoasFisicas.size();j++){
                    System.out.println(j+".("+Principal.pessoasFisicas.get(j)+")|");
                }
                op2=scan.nextInt();
                secFinanceira.addFila(Principal.pessoasFisicas.get(op2));
            }
        }
    }


    public static void CriarDisciplina() {
        Disciplina disc = new Disciplina("Default", "Default");
        String nome;
        
        String sala;
        System.out.println("Digite os dados da Disciplina na ordem:NOME, SALA");
        nome = Principal.scan.next();
        disc.setNome(nome);
        sala = Principal.scan.next();
        disc.setSala(sala);
        
        Principal.disciplinas.add(disc);
       
    }

    public static void CriarPresidente() {
        Presidente pr = new Presidente("Default", "Default", 0);
        String nome;
        String rg;
        int cod;
        System.out.println("Digite as informacoes do Presidente na ordem:NOME,RG,CODIGO DIRETORIA ");
        nome = Principal.scan.next();
        pr.setNome(nome);
        rg = Principal.scan.next();
        pr.setRg(rg);
        cod = Principal.scan.nextInt();
        pr.setCodDiretoria(cod);
        Principal.presidentes.add(pr);
        Principal.pessoas.add(pr);
    }

    public static void CriarAluno() {
        Aluno aluno = new Aluno("Default", "Default", "Default");
        String nome;
        String rg;
        String matricula;
        System.out.println("Digite as informacoes do Aluno na ordem:NOME,RG,MATRICULA ");
        nome = Principal.scan.next();
        aluno.setNome(nome);
        rg = Principal.scan.next();
        aluno.setRg(rg);
        matricula = Principal.scan.next();
        aluno.setMatricula(matricula);
        Principal.alunos.add(aluno);
        Principal.pessoas.add(aluno);
    }

    public static void CriarGerente() {
        Gerente gerente = new Gerente("Default", "Default");
        String nome;
        String rg;
        int op,op1,op2;
        System.out.println("Digite as informacoes do Gerente na ordem:NOME,RG");
        nome = Principal.scan.next();
        gerente.setNome(nome);
        rg = Principal.scan.next();
        gerente.setRg(rg);

        Principal.gerentes.add(gerente);
        Principal.pessoas.add(gerente);


        System.out.println("Deseja adicionar alguem a fila de atendimento: 1- Sim  2- Nao ");
        op= scan.nextInt();
        if(op==1){
            System.out.println("Quantos:");
            op1= scan.nextInt();
            for(int i=0;i<op1;i++){
                System.out.println("Escolha a pessoa:");
                for(int j=0; j<Principal.pessoas.size();j++){
                    System.out.println(j+".("+Principal.pessoas.get(i)+")|");
                }
                op2=scan.nextInt();
                gerente.addFila(Principal.pessoas.get(op2));
            }
        }
    }

    

    public static void CriarConta() {
        String cod;
        double saldo;
        int op1;
        System.out.println("Escolha o tipo de conta: \n1- Conta Corrente 2- Conta Poupanca ");
        op1 = scan.nextInt();
        System.out.println("Digite os dados da Conta na ordem:SALDO,CODIGO CONTA");
        saldo = Principal.scan.nextDouble();
        cod = Principal.scan.next();

            System.out.println("O titular foi definido como padrao, associe um titular apos a criacao!");
            if (op1 == 1) {
                ContaCorrente conta = new ContaCorrente(cod,  saldo);
                Principal.contas.add(conta);
            } else if (op1 == 2) {
                ContaPoupanca conta = new ContaPoupanca(cod, saldo);
                Principal.contas.add(conta);
            }
        
        
        
    }

    public static void CriarAgencia() {
        Agencia agencia = new Agencia("Default", "Default");
        String nome;
        String cod;
        System.out.println("Digite os dados da Agencia na ordem: NOME, CODIGO AGENCIA");
        nome = Principal.scan.next();
        agencia.setNomeAgencia(nome);
        cod = Principal.scan.next();
        agencia.setCodAgencia(cod);
        Principal.agencias.add(agencia);
    }

    public static void CriarSecFinanceira() {
        String nome;
        String rg;
        int cod,op,op1,op2;
        System.out.println("Digite as informacoes do Coordenador na ordem:NOME,RG,CODIGO SECRETARIA ");
        nome = Principal.scan.next();
        rg = Principal.scan.next();
        cod = Principal.scan.nextInt();
        SecFinanceira secFinanceira = new SecFinanceira(rg, nome, cod);
        Principal.secretariosFinanceiros.add(secFinanceira);
        Principal.pessoas.add(secFinanceira);
        System.out.println("Deseja adicionar alguem a fila de atendimento: 1- Sim  2- Não");
        op= scan.nextInt();
        if(op==1){
            System.out.println("Quantos:");
            op1= scan.nextInt();
            for(int i=0;i<op1;i++){
                System.out.println("Escolha pelo RG:");
                for(int j=0; j<Principal.pessoasFisicas.size();j++){
                    System.out.println(j+".("+Principal.pessoasFisicas.get(i).getRg()+")|");
                }
                op2=scan.nextInt();
                secFinanceira.addFila(Principal.pessoasFisicas.get(op2));
            }
        }
    }

    public static void CriarDiretor() {
        Diretor diretor = new Diretor("Default", "Default", 123);
        String nome;
        String rg;
        int cod;
        System.out.println("Digite as informacoes do Diretor na ordem:NOME,RG,CODIGO DIRETORIA ");
        nome = Principal.scan.next();
        diretor.setNome(nome);
        rg = Principal.scan.next();
        diretor.setRg(rg);
        cod = Principal.scan.nextInt();
        diretor.setCodDiretoria(cod);
       
        Principal.diretores.add(diretor);
        Principal.pessoas.add(diretor);
    }

    public static void CriarCurso() {
        Curso curso = new Curso("Default", "Default");
        String nome;
        String cod;
        System.out.println("Digite os dados do Curso na ordem: NOME, CODIGO CURSO");
        nome = Principal.scan.next();
        curso.setNome(nome);
        cod = Principal.scan.next();
        curso.setCodCurso(cod);
        System.out.println("O coordenador e a disciplina do curso foram definidos como padrao, associe outros apos a criacao!");
        
        Principal.cursos.add(curso);
    }

    public static void CriarProfessor() {
        Professor professor = new Professor("Default", "Default", "Default");
        int op,op1,op2;
        String nome;
        String rg;
        String matricula;
        System.out.println("Digite as informacoes do Professor na ordem:NOME,RG,MATRICULA ");
        nome = Principal.scan.next();
        professor.setNome(nome);
        rg = Principal.scan.next();
        professor.setRg(rg);
        matricula = Principal.scan.next();
        professor.setMatricula(matricula);
        Principal.professores.add(professor);
        Principal.pessoas.add(professor);
        System.out.println("Deseja colocar algum aluno na fila de atendimento? 1- Sim   2- Nao");
        op = scan.nextInt();
        if(op==1){
            System.out.println("Quantos:");
            op1= scan.nextInt();
            for(int i=0;i<op1;i++){
                System.out.println("Escolha o aluno:");
                for(int j=0;j<Principal.alunos.size();j++){
                    System.out.println(j+"."+Principal.alunos.get(j)+"|");
                }
                op2= scan.nextInt();
                professor.agendarAluno(Principal.alunos.get(op2));
            }
        }
    }

    public static void CriarFaculdade() {
        Faculdade faculdade = new Faculdade("Default", "Default", "Default");
        String cnpj;
        String nomeFantasia;
        String nome;
        System.out.println("Digite as informacoes do Faculdade na ordem:CNPJ,NOME FANTASIA, NOME DA PESSOA FISICA ");
        cnpj = Principal.scan.next();
        faculdade.setCnpj(cnpj);
        nomeFantasia = Principal.scan.next();
        faculdade.setNomeEmpresa(nomeFantasia);
        nome = Principal.scan.next();
        faculdade.setNome(nome);
        
        Principal.faculdades[0] = faculdade;
        Principal.pessoas.add(faculdade);
    
    }
    
    public static void AssociarFaculdade() {
        int escolha1;
        int escolhaC;
        int escolhaD;
        int escolhaCO;
        int escolhaSA;
        int escolhaSF;
        int x;
        System.out.println("O que deseja associar: 1.Curso|2.Diretor|3.Coordenador|4.Secretario ");
        escolha1 = Principal.scan.nextInt();
        switch (escolha1) {
            case 1:
            {
                System.out.println("Escolha o curso:");
                for (int i = 0; i < Principal.cursos.size(); i++) {
                    System.out.println(i + "." + Principal.cursos.get(i).getNome() + "|");
                }
                escolhaC = Principal.scan.nextInt();
                Principal.faculdades[0].setCursos(Principal.cursos.get(escolhaC));
                break;
            }
            case 2:
            {
                System.out.println("Escolha o diretor:");
                for (int i = 0; i < Principal.diretores.size(); i++) {
                    System.out.println(i + "." + Principal.diretores.get(i).getNome() + "|");
                }
                escolhaD = Principal.scan.nextInt();
                Principal.faculdades[0].setDiretor(Principal.diretores.get(escolhaD));
                break;
            }
            case 3:
            {
                System.out.println("Escolha o coordenador:");
                for (int i = 0; i < Principal.coordenadores.size(); i++) {
                    System.out.println(i + "." + Principal.coordenadores.get(i).getNome() + "|");
                }
                escolhaCO = Principal.scan.nextInt();
                Principal.faculdades[0].setCoordenadores(Principal.coordenadores.get(escolhaCO));
                break;
            }
            case 4:
            {
                System.out.println("Digite o tipo de secretario: 1. Academico ou 2. Financeiro");
                x = Principal.scan.nextInt();
                if (x == 1) {
                    System.out.println("Escolha o Secretario(a) Academico:");
                    for (int i = 0; i < Principal.secretariosAcademicos.size(); i++) {
                        System.out.println(i + "." + Principal.secretariosAcademicos.get(i).getNome() + "|");
                    }
                    escolhaSA = Principal.scan.nextInt();
                    Principal.faculdades[0].setSecretariosAcademicos(Principal.secretariosAcademicos.get(escolhaSA));
                } else {
                    System.out.println("Escolha o Secretario(a) Financeiro:");
                    for (int i = 0; i < Principal.secretariosFinanceiros.size(); i++) {
                        System.out.println(i + "." + Principal.secretariosFinanceiros.get(i).getNome() + "|");
                    }
                    escolhaSF = Principal.scan.nextInt();
                    Principal.faculdades[0].setSecretariosFinanceiros(Principal.secretariosFinanceiros.get(escolhaSF));
                }
                break;
            }
            default:
                System.out.println("Opcao invalida!");
        }
    }
    
    public static void AssociarCurso(){
        int cursoEscolhido,escolha1,escolha2,escolha3;
        
        System.out.println("em qual o curso:");
        for(int i=0;i<Principal.cursos.size();i++){
            System.out.println(i+"."+Principal.cursos.get(i).getNome());
        }
        cursoEscolhido= scan.nextInt();
        
        System.out.println("O que deseja associar: 1.Disciplinas|2.Coordenador");
        escolha1= scan.nextInt();
        
        switch(escolha1){
            case 1:
            {
                System.out.println("Escolha as disciplinas:");
                for(int i=0;i<Principal.disciplinas.size();i++){
                    System.out.println(i+"."+Principal.disciplinas.get(i).getNome()+"|");
                }
                escolha2=scan.nextInt();
                Principal.cursos.get(cursoEscolhido).addDisciplina(Principal.disciplinas.get(escolha2));
                break;
            }
            case 2:
            {
                System.out.println("Escolha o coordenador:");
                for(int i=0;i<Principal.coordenadores.size();i++){
                    System.out.println(i+"."+Principal.coordenadores.get(i).getNome()+"|");
                }
                escolha3= scan.nextInt();
                Principal.cursos.get(cursoEscolhido).setCoordenador(Principal.coordenadores.get(escolha3));
                break;
            }
            default: System.out.println("opcao invalida!");
        }
    }
    
    public static void AssociarDisciplina() throws Exception{
        int disEscolhida,escolha1,escolha2,escolha3;
        
        System.out.println("em qual o Disciplina:");
        for(int i=0;i<Principal.disciplinas.size();i++){
            System.out.println(i+"."+Principal.disciplinas.get(i).getNome()+"|");
        }
        disEscolhida= scan.nextInt();
        System.out.println("O que deseja associar:1.Professor|2.Aluno");
        escolha1 = scan.nextInt();
        
        switch(escolha1){
            case 1:
            {
                System.out.println("Escolha o professor:");
                for(int i=0;i<Principal.professores.size();i++){
                    System.out.println(i+"."+Principal.professores.get(i)+"|");
                }
                escolha2= scan.nextInt();
                Principal.disciplinas.get(disEscolhida).setProfessor(Principal.professores.get(escolha2));
                break;
            }
            case 2:
            {
                System.out.println("Escolha o Aluno:");
                for(int i=0;i<Principal.alunos.size();i++){
                    System.out.println(i+"."+Principal.alunos.get(i)+"|");
                }
                escolha3= scan.nextInt();
                Principal.disciplinas.get(disEscolhida).addAluno(Principal.alunos.get(escolha3));
                break;
            }
            default: System.out.println("opcao invalida!");
        }
    }
    
    public static void AssociarAgencia(){
        int ageEscolhida,escolha1,escolha2;
        
        System.out.println("Em qual agencia:");
        for(int i=0;i<Principal.agencias.size();i++){
            System.out.println(i+"."+Principal.agencias.get(i)+"|");
        }
        ageEscolhida= scan.nextInt();
        
        System.out.println("O que deseja associar:1.Banco|2.Conta ");
        escolha1= scan.nextInt();
        
        switch(escolha1){
            case 1:
            {
                Principal.agencias.get(ageEscolhida).setBanco(Principal.bancos[0]);
                break;
            }
            case 2:
            {
                System.out.println("Escolha a conta:");
                for(int i=0;i<Principal.contas.size();i++){
                    System.out.println(i+"."+Principal.contas.get(i)+"|");
                }
                escolha2= scan.nextInt();
                Principal.agencias.get(ageEscolhida).addContas((Conta) Principal.contas.get(escolha2));
                break;
            }
            default: System.out.println("Opcao invalida!");
        }
    }
    
    public static void AssociarConta(){
        int contaEscolhida,escolha1,escolha2,escolha3,escolha4;
        int alun,prof,pres,dir,ger,coor,secAC,secFN;
        
        System.out.println("Em qual conta:");
        for(int i=0;i<Principal.contas.size();i++){
            System.out.println(i+"."+Principal.contas.get(i)+"|");
        }
        contaEscolhida= scan.nextInt();
        
        System.out.println("O que deseja associar:1.Titular|2.Agencia|3.Gerente");
        escolha1= scan.nextInt();
        
        switch(escolha1){
            case 1:
            {
                System.out.println("Escolha o tipo de titular:"
                        + "1.Aluno, 2.Professor, 3.Presidente, 4.Diretor,"
                        + "5.Gerente, 6.Coordenador, 7.Secretario(a) Academico,"
                        + "8. Secretario(a) Financeiro");
                escolha2= scan.nextInt();
                switch(escolha2){
                    case 1:
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.alunos.size();i++){
                            System.out.println(i+"."+Principal.alunos.get(i)+"|");
                        }
                        alun= scan.nextInt();
                        Principal.contas.get(contaEscolhida).setTitular(Principal.alunos.get(alun));
                        Principal.alunos.get(alun).setConta((Conta) Principal.contas.get(contaEscolhida));
                        break;
                    case 2:
                        System.out.println("Escolha o professor:");
                        for(int i=0;i<Principal.professores.size();i++){
                            System.out.println(i+"."+Principal.professores.get(i)+"|");
                        }
                        prof= scan.nextInt();
                        Principal.contas.get(contaEscolhida).setTitular(Principal.professores.get(prof));
                        Principal.alunos.get(prof).setConta((Conta) Principal.contas.get(contaEscolhida));
                        break;
                    case 3:
                        System.out.println("Escolha o presidente:");
                        for(int i=0;i<Principal.presidentes.size();i++){
                            System.out.println(i+"."+Principal.presidentes.get(i)+"|");
                        }
                        pres= scan.nextInt();
                        Principal.contas.get(contaEscolhida).setTitular(Principal.presidentes.get(pres));
                        Principal.alunos.get(pres).setConta((Conta) Principal.contas.get(contaEscolhida));
                        break;
                    case 4:
                        System.out.println("Escolha o diretor:");
                        for(int i=0;i<Principal.diretores.size();i++){
                            System.out.println(i+"."+Principal.diretores.get(i)+"|");
                        }
                        dir= scan.nextInt();
                        Principal.contas.get(contaEscolhida).setTitular(Principal.diretores.get(dir));
                        Principal.alunos.get(dir).setConta((Conta) Principal.contas.get(contaEscolhida));
                        break;
                    case 5:
                        System.out.println("Escolha o gerente:");
                        for(int i=0;i<Principal.gerentes.size();i++){
                            System.out.println(i+"."+Principal.gerentes.get(i)+"|");
                        }
                        ger= scan.nextInt();
                        Principal.contas.get(contaEscolhida).setTitular(Principal.gerentes.get(ger));
                        Principal.alunos.get(ger).setConta((Conta) Principal.contas.get(contaEscolhida));
                        break;
                    case 6:
                        System.out.println("Escolha o coordenador:");
                        for(int i=0;i<Principal.coordenadores.size();i++){
                            System.out.println(i+"."+Principal.coordenadores.get(i)+"|");
                        }
                        coor= scan.nextInt();
                        Principal.contas.get(contaEscolhida).setTitular(Principal.coordenadores.get(coor));
                        Principal.alunos.get(coor).setConta((Conta) Principal.contas.get(contaEscolhida));
                        break;
                    case 7:
                        System.out.println("Escolha o secretario Academico:");
                        for(int i=0;i<Principal.secretariosAcademicos.size();i++){
                            System.out.println(i+"."+Principal.secretariosAcademicos.get(i)+"|");
                        }
                        secAC= scan.nextInt();
                        Principal.contas.get(contaEscolhida).setTitular(Principal.secretariosAcademicos.get(secAC));
                        Principal.alunos.get(secAC).setConta((Conta) Principal.contas.get(contaEscolhida));
                        break;
                    case 8:
                       System.out.println("Escolha o secretario Financeiro:");
                       for(int i=0;i<Principal.secretariosFinanceiros.size();i++){
                            System.out.println(i+"."+Principal.secretariosFinanceiros.get(i)+"|");
                        }
                        secFN= scan.nextInt();
                        Principal.contas.get(contaEscolhida).setTitular(Principal.secretariosFinanceiros.get(secFN));
                        Principal.alunos.get(secFN).setConta((Conta) Principal.contas.get(contaEscolhida));
                        break;
                    default: System.out.println("Opcao invalida!");
                }
                break;
            }
            case 2:
            {
                System.out.println("Escolha a agencia:");
                for(int i=0;i<Principal.agencias.size();i++){
                    System.out.println(i+"."+Principal.agencias.get(i)+"|");
                }
                escolha3= scan.nextInt();
                Principal.contas.get(contaEscolhida).setAgencia(Principal.agencias.get(escolha3));
                Principal.agencias.get(escolha3).setConta((Conta) Principal.contas.get(escolha3));
                
                break;
            }
            case 3:
            {
                System.out.println("Escolha o gerente:");
                for(int i=0;i<Principal.gerentes.size();i++){
                    System.out.println(i+"."+Principal.gerentes.get(i)+"|");
                }
                escolha4= scan.nextInt();
                Principal.contas.get(contaEscolhida).setGerente(Principal.gerentes.get(escolha4));
                Principal.gerentes.get(escolha4).setConta((Conta) Principal.contas.get(contaEscolhida));
                break;
            }
        }
    }
    
    public static void AssociarBancos(){
        int escolha;
        
        System.out.println("Escolha a agencia:");
        for(int i=0;i<Principal.agencias.size();i++){
            System.out.println(i+"."+Principal.agencias.get(i)+"|");
        }
        escolha= scan.nextInt();
        Principal.bancos[0].setAgencia(Principal.agencias.get(escolha));    
    }
    
    public static void Manipular() throws Exception{
        int escolha,escolha1;
        int op1,op1C,op1V;
        int op2,op2C,op2V;
        int op3,op3C,op3V;
        int op4,op4C,op4V;
        int op5,op5C,op5V;
        int op6,op6C,op6V;
        int op7,op7C,op7V;
        int op8,op8C,op8V;
        int esc1,escP,SA,SF,G;
        
        System.out.println("Deseja: 1.Sacar|2.Depositar|3.Atender");
        escolha= scan.nextInt();
        
        switch(escolha){
            case 1:
            {
                System.out.println("Escolha o tipo de pessoa:");
                System.out.println("1.Aluno, 2.Professor, 3.Presidente, 4.Diretor,"
                                + "5.Gerente, 6.Coordenador, 7.Secretario(a) Academico,"
                                + "8.Secretario(a) Financeiro");   
                escolha1=scan.nextInt();
            
            switch(escolha1){
                case 1:
                {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.alunos.size();i++){
                            System.out.println(i+"."+Principal.alunos.get(i)+"|");
                        }
                        op1= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op1C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op1V= scan.nextInt();
                        
                        Principal.alunos.get(op1).getConta().get(op1C).sacar(op1V);
                        break;
                }
                    case 2:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.professores.size();i++){
                            System.out.println(i+"."+Principal.professores.get(i)+"|");
                        }
                        op2= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op2C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op2V= scan.nextInt();
                        
                        Principal.professores.get(op2).getConta().get(op2C).sacar(op2V);
                        
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.presidentes.size();i++){
                            System.out.println(i+"."+Principal.presidentes.get(i)+"|");
                        }
                        op3= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op3C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op3V= scan.nextInt();
                        
                        Principal.presidentes.get(op3).getConta().get(op3C).sacar(op3V);
                        
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.diretores.size();i++){
                            System.out.println(i+"."+Principal.diretores.get(i)+"|");
                        }
                        op4= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op4C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op4V= scan.nextInt();
                        
                        Principal.diretores.get(op4).getConta().get(op4C).sacar(op4V);
                        
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.gerentes.size();i++){
                            System.out.println(i+"."+Principal.gerentes.get(i)+"|");
                        }
                        op5= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op5C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op5V= scan.nextInt();
                        
                        Principal.gerentes.get(op5).getConta().get(op5C).sacar(op5V);
                        
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.coordenadores.size();i++){
                            System.out.println(i+"."+Principal.coordenadores.get(i)+"|");
                        }
                        op6= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op6C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op6V= scan.nextInt();
                        
                        Principal.coordenadores.get(op6).getConta().get(op6C).sacar(op6V);
                        
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.secretariosAcademicos.size();i++){
                            System.out.println(i+"."+Principal.secretariosAcademicos.get(i)+"|");
                        }
                        op7= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op7C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op7V= scan.nextInt();
                        
                        Principal.secretariosAcademicos.get(op7).getConta().get(op7C).sacar(op7V);
                        
                        break;
                    }
                    case 8:
                    {
                       System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.secretariosFinanceiros.size();i++){
                            System.out.println(i+"."+Principal.secretariosFinanceiros.get(i)+"|");
                        }
                        op8= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op8C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op8V= scan.nextInt();
                        
                        Principal.secretariosFinanceiros.get(op8).getConta().get(op8C).sacar(op8V);
                        
                        break;
                    }
                    case 0:
                    break;
                    default: System.out.println("Opcao invalida!");
                }
                break;
            }
            case 2:
            {
                System.out.println("Escolha o tipo de pessoa:");
                System.out.println("1.Aluno, 2.Professor, 3.Presidente, 4.Diretor,"
                            + "5.Gerente, 6.Coordenador, 7.Secretario(a) Academico,"
                            + "8.Secretario(a) Financeiro");   
            escolha1=scan.nextInt();
            
            switch(escolha1){
                case 1:
                {
                        System.out.println("Escolha o aluno:");
                        for(int i=0;i<Principal.alunos.size();i++){
                            System.out.println(i+"."+Principal.alunos.get(i)+"|");
                        }
                        op1= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op1C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op1V= scan.nextInt();
                        
                        Principal.alunos.get(op1).getConta().get(op1C).depositar(op1V);
                        break;
                        
                }
                    case 2:
                    {
                        System.out.println("Escolha o Profesor:");
                        for(int i=0;i<Principal.professores.size();i++){
                            System.out.println(i+"."+Principal.professores.get(i)+"|");
                        }
                        op2= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op2C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op2V= scan.nextInt();
                        
                        Principal.professores.get(op2).getConta().get(op2C).depositar(op2V);
                        
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Escolha o Presidente:");
                        for(int i=0;i<Principal.presidentes.size();i++){
                            System.out.println(i+"."+Principal.presidentes.get(i)+"|");
                        }
                        op3= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op3C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op3V= scan.nextInt();
                        
                        Principal.presidentes.get(op3).getConta().get(op3C).depositar(op3V);
                        
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Escolha o Diretor:");
                        for(int i=0;i<Principal.diretores.size();i++){
                            System.out.println(i+"."+Principal.diretores.get(i)+"|");
                        }
                        op4= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op4C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op4V= scan.nextInt();
                        
                        Principal.diretores.get(op4).getConta().get(op4C).depositar(op4V);
                        
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Escolha o Gerente:");
                        for(int i=0;i<Principal.gerentes.size();i++){
                            System.out.println(i+"."+Principal.gerentes.get(i)+"|");
                        }
                        op5= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op5C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op5V= scan.nextInt();
                        
                        Principal.gerentes.get(op5).getConta().get(op5C).depositar(op5V);
                        
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Escolha o Coordenador:");
                        for(int i=0;i<Principal.coordenadores.size();i++){
                            System.out.println(i+"."+Principal.coordenadores.get(i)+"|");
                        }
                        op6= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op6C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op6V= scan.nextInt();
                        
                        Principal.coordenadores.get(op6).getConta().get(op6C).depositar(op6V);
                        
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Escolha o Secretario(a) Academico:");
                        for(int i=0;i<Principal.secretariosAcademicos.size();i++){
                            System.out.println(i+"."+Principal.secretariosAcademicos.get(i)+"|");
                        }
                        op7= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op7C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op7V= scan.nextInt();
                        
                        Principal.secretariosAcademicos.get(op7).getConta().get(op7C).depositar(op7V);
                        
                        break;
                    }
                    case 8:
                    {
                       System.out.println("Escolha o Secretario(a) financeiro:");
                        for(int i=0;i<Principal.secretariosFinanceiros.size();i++){
                            System.out.println(i+"."+Principal.secretariosFinanceiros.get(i)+"|");
                        }
                        op8= scan.nextInt();
                        System.out.println("Escolha a conta:");
                        for(int i=0;i<Principal.contas.size();i++){
                            System.out.println(i+"."+Principal.contas.get(i)+"|");
                        }
                        op8C= scan.nextInt();
                        System.out.println("Digite o valor:");
                        op8V= scan.nextInt();
                        
                        Principal.secretariosFinanceiros.get(op8).getConta().get(op8C).depositar(op8V);
                        
                        break;
                    }
                    default: System.out.println("Opcao invalida!");
                }
                break;
            }
            case 3:
            {
                System.out.println("Escolha a fila que irá atender:\n");
                System.out.println("1.Professor | 2.Secretario(a) Academico | 3.Secretario Financeiro | 4. Gerente");
                esc1= scan.nextInt();
                switch(esc1){
                    case 1:
                    {
                        System.out.println("Escolha o Profesor:");
                        for(int i=0;i<Principal.professores.size();i++){
                            System.out.println(i+"."+Principal.professores.get(i)+"|");
                        }
                        escP= scan.nextInt();
                        Principal.professores.get(escP).atenderAluno();
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Escolha o Secretario(a) Academico:");
                        for(int i=0;i<Principal.secretariosAcademicos.size();i++){
                            System.out.println(i+"."+Principal.secretariosAcademicos.get(i)+"|");
                        }
                        SA= scan.nextInt();
                        Principal.secretariosAcademicos.get(SA).atenderAluno();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Escolha o Secretario(a) Financeiro:");
                        for(int i=0;i<Principal.secretariosFinanceiros.size();i++){
                            System.out.println(i+"."+Principal.secretariosFinanceiros.get(i)+"|");
                        }
                        SF= scan.nextInt();
                        Principal.secretariosFinanceiros.get(SF).removerFila();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Escolha o Gerente:");
                        for(int i=0;i<Principal.gerentes.size();i++){
                            System.out.println(i+"."+Principal.gerentes.get(i)+" | ");
                        }
                        G = scan.nextInt();
                        Principal.gerentes.get(G).atenderFila();
                        break;
                    }
                }
                break;
            }
        }     
    }


    public static void AtualizaPessoaFisica(){
        Principal.pessoasFisicas.addAll(Principal.alunos);
        Principal.pessoasFisicas.addAll(Principal.professores);
        Principal.pessoasFisicas.addAll(Principal.presidentes);
        Principal.pessoasFisicas.addAll(Principal.diretores);
        Principal.pessoasFisicas.addAll(Principal.coordenadores);
        Principal.pessoasFisicas.addAll(Principal.gerentes);
        Principal.pessoasFisicas.addAll(Principal.secretariosAcademicos);
        Principal.pessoasFisicas.addAll(Principal.secretariosFinanceiros);
        System.out.println("Atualizado Pessoa fisica");
    }
    
    public static void AtualizaPessoas(){
        Principal.pessoas.addAll(Principal.alunos);
        Principal.pessoas.addAll(Principal.professores);
        Principal.pessoas.addAll(Principal.presidentes);
        Principal.pessoas.addAll(Principal.diretores);
        Principal.pessoas.addAll(Principal.coordenadores);
        Principal.pessoas.addAll(Principal.gerentes);
        Principal.pessoas.addAll(Principal.secretariosAcademicos);
        Principal.pessoas.addAll(Principal.secretariosFinanceiros);
        Principal.pessoas.add(Principal.bancos[0]);
        Principal.pessoas.add(Principal.faculdades[0]);
       
        System.out.println("Atualizado Pessoas");
        }
}

