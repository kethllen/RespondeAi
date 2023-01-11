package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("RespondeAi");
        System.out.println("1-Cadastrar Aluno");
        System.out.println("2-Cadastrar Materia");

        Scanner opcao = new Scanner(System.in);
        int teste = opcao.nextInt();

        if(teste == 1){
            System.out.println("Informe o nome do Aluno que deseja cadastrar");
            Scanner nome = new Scanner(System.in);
            if (nome.next() != "") {
                System.out.println("Informe a idade do Aluno que deseja cadastrar");
                Scanner idade = new Scanner(System.in);
                if (idade.next() != "") {
                    System.out.println("Informe o ano de ingresso do Aluno que deseja cadastrar");
                    Scanner ano = new Scanner(System.in);
                    if (ano.next() != "") {
                        System.out.println("Informe o periodo do Aluno que deseja cadastrar");
                        Scanner periodo = new Scanner(System.in);
                        if (periodo.next() != "") {
                            System.out.println("Informe o curso do Aluno que deseja cadastrar");
                            Scanner curso = new Scanner(System.in);
                            if(curso.next()!="") {
                                try {
                                    Aluno aluno = new Aluno(nome.next(), idade.next(), curso.next(), ano.next(), periodo.next());
                                    System.out.println("Aluno Cadastrado com sucesso");
                                } catch (Exception e) {
                                    System.out.println("Não foi possivel realizar o cdastro");
                                }
                            }
                        }
                    }
                }
            }
        }if(teste == 2){
            System.out.println("Informe o nome da  Materia que deseja cadastrar");
            Scanner nome = new Scanner(System.in);
            if(nome.next() !="") {
                System.out.println("Informe o nome do professor da Materia que deseja cadastrar");
                Scanner professor = new Scanner(System.in);
                if (professor.next() != "") {
                    System.out.println("Informe a categoria da Materia que deseja cadastrar");
                    Scanner categoria = new Scanner(System.in);
                    if (categoria.next() != ""){
                        try {
                            Materias materias = new Materias(nome.next(), professor.next(), categoria.next());
                            System.out.println("Materia Cadastrado com sucesso");
                        } catch (Exception e) {
                            System.out.println("Não foi possivel realizar o cdastro");
                        }
                }
                }
            }
        }else{
            System.out.println("Não foi digitada nenhuma opção valida");
        }
    }
}