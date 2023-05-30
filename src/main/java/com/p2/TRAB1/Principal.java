package com.p2.TRAB1;

import com.p2.TRAB1.abstratas.Pessoa;
import com.p2.TRAB1.interfaces.Conta;
import com.p2.TRAB1.interfaces.PessoaFisica;
import com.p2.TRAB1.normais.Agencia;
import com.p2.TRAB1.normais.Aluno;
import com.p2.TRAB1.normais.Banco;
import com.p2.TRAB1.normais.ContaCorrente;
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
import java.util.ArrayList;
import java.util.Scanner;


@Autores(Nome = "Maycon Natan, Jalbert Ramon, João Victor Barbosa",
Matricula = "201903268036, 201903263328, 201901322637")


       

public class Principal {
    static Scanner scan = new Scanner(System.in);

    static ArrayList<PessoaFisica> pessoasFisicas = new ArrayList();
    static ArrayList<Pessoa> pessoas = new ArrayList();
    static ArrayList<Coordenador> coordenadores = new ArrayList();
    static ArrayList<Aluno> alunos = new ArrayList();
    static Banco[] bancos= new Banco[1];
    static ArrayList<SecAcademica> secretariosAcademicos = new ArrayList();
    static ArrayList<SecFinanceira> secretariosFinanceiros = new ArrayList();
    static ArrayList<Disciplina> disciplinas = new ArrayList();
    static ArrayList<Presidente> presidentes = new ArrayList();
    static ArrayList<Gerente> gerentes = new ArrayList();
    static ArrayList<Professor> professores = new ArrayList();
    static ArrayList<Conta> contas = new ArrayList();
    static ArrayList<Agencia> agencias = new ArrayList();
    static ArrayList<Diretor> diretores = new ArrayList();

    static ArrayList<Curso> cursos = new ArrayList();
    static Faculdade[] faculdades = new Faculdade[1];

    
    @Aviso(Aviso = "Instancie todos os objetos antes de qualquer associação ou manipulação")
    public static void main(String[] args) throws Exception {
        String[] tiposPessoas = {"Aluno","Professor","Presidente","Diretor","Coordenador",
                            "Secretario(a) Academico","Secretario(a) Financeiro","Gerente"};
        int opI,opF,opP,opB,opA,x;

        
        do{

            MenuCriacao();
            System.out.println("Escolha uma opcao:(0 para sair)");
            opI= scan.nextInt();
            
            
            switch(opI){
                case 1:
                {
                    System.out.println("Quantas pessoas deseja criar:");
                    opP= scan.nextInt();
                    
                    System.out.println();
                    
                    for(int i=0; i<opP; i++ ){
                       System.out.print("Escolha um dos:");
                        for(int j=0;j<tiposPessoas.length;j++){
                            System.out.print(j+"."+tiposPessoas[j]+"|");
                        } 
                        x = scan.nextInt();
                        switch(x){
                            case 0:
                            {
                                Metodos.CriarAluno();
                                System.out.println("Criado com sucesso");
                                break;
                            }   
                            case 1:
                            {
                                Metodos.CriarProfessor();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 2:
                            {
                                Metodos.CriarPresidente();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 3:
                            {
                                Metodos.CriarDiretor();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 4:
                            {
                                Metodos.CriarCoord();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 5:
                            {
                                Metodos.CriarSecAC();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 6:
                            {
                                Metodos.CriarSecFN();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            case 7:
                            {
                                Metodos.CriarGerente();
                                System.out.println("Criado com sucesso");
                                break;
                            }
                            default:
                               System.out.println("Opcao invalida");
                        
                        }
                    }
                    break;
                }
                case 2:
                {
                    System.out.print("Escolha um dos: 1.Faculdade | 2.Curso | 3.Disciplina ");
                    opF= scan.nextInt();
                    
                    switch(opF){
                        case 1:
                        {
                            if(faculdades[0]!=null){
                                System.out.println("Ja existe uma faculdade");
                            }else
                                Metodos.CriarFaculdade();
                            break;
                        }
                        case 2:
                        {
                            Metodos.CriarCurso();
                            break;
                        }
                        case 3:
                        {
                            Metodos.CriarDisciplina();
                            break;
                        }
                        default:
                            System.out.println("Opcao invalida");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Escolha um dos: 0.Banco | 1.Agencia | 2.Conta ");
                    opB = scan.nextInt();
                    
                    switch(opB){
                        case 0:
                        {
                            if(bancos[0]!=null){
                                System.out.println("Ja existe um banco");
                            }else
                                Metodos.CriarBanco();
                            break;
                        }
                        case 1: 
                        {
                            Metodos.CriarAgencia();
                            break;
                        }
                        case 2:
                        {
                            Metodos.CriarConta();
                            break;
                        }
                    }
                    break;
                }
                case 4:
                {
                    MenuAssociacao();
    
                    System.out.println("Escolha uma opcao:");
                    opA= scan.nextInt();
                    switch(opA){
                        case 1:
                        {
                            Metodos.AssociarFaculdade();
                            break;
                        }
                        case 2:
                        {
                            Metodos.AssociarCurso();
                            break;
                        }
                        case 3:
                        {
                            Metodos.AssociarDisciplina();
                            break;
                        }
                        case 4:
                        {
                            Metodos.AssociarAgencia();
                            break;
                        }
                        case 5:
                        {
                            Metodos.AssociarConta();
                            break;
                        }
                        case 6:
                        {
                            Metodos.AssociarBancos();
                            break;
                        }
                        default: System.out.println("Opcao invalida!");
                    }
                    break;
                }
                case 5:
                {
                    Metodos.Manipular();
                    break;
                }
                default: System.out.println("Opcao invalida!");
            }   
        
          }while(opI!=0); 
            
    
            }

    public static void MenuCriacao(){
        System.out.println("""
                           ====== ABA DE CRIACAO ========
                           |1.Criar pessoas             |
                           |2.Criar faculdade           |
                           |3.Criar bancos              |
                           |4.Associar                  |
                           |5.Manipular                 |
                           ==============================
                           """);
        }

        public static void MenuAssociacao(){
            System.out.println("""
                               ========= ASSOCIAR EM: =========
                               |1.Faculdade        4.Agencia  |
                               |2.Curso            5.Conta    |
                               |3.Disciplina       6.Banco    |
                               ================================
                               """);
        }

        
}
