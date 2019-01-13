/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dn
 */
public class Utilizador {
    private String nome;
    private int nmec;
    private String curso;

    public Utilizador() {
    }

    public Utilizador(String nome, int nmec, String curso) {
        this.nome = nome;
        this.nmec = nmec;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNmec() {
        return nmec;
    }

    public void setNmec(int nmec) {
        this.nmec = nmec;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + this.getNmec() + "; " + this.getNome() + "; " + this.getCurso(); //To change body of generated methods, choose Tools | Templates.
    }


}
