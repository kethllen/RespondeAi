package org.example;

public class Materias {
    private String nome;

    private String professor;
    private String categoria;

    public Materias(String nome, String professor, String categoria) {
        this.nome = nome;
        this.professor = professor;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
