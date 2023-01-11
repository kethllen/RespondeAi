package org.example;

import java.util.Date;

public class Aluno {
    private String nome;
    private String idade;
    private String curso;

    private String anoIngreço;

    private String periodo;
    public Aluno(String nome, String idade, String curso, String anoIngreço, String periodo) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.anoIngreço = anoIngreço;
        this.periodo = periodo;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAnoIngreço() {
        return anoIngreço;
    }

    public void setAnoIngreço(String anoIngreço) {
        this.anoIngreço = anoIngreço;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
