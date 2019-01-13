/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author dn
 */
public class Livro {
    private static int number = 100;
    private int id;
    private String titulo;
    private String tipo_emprestimo;

    public Livro(String titulo, String tipo_emprestimo) {
        this.titulo = titulo;
        this.tipo_emprestimo = tipo_emprestimo;
        this.id = number;
        number++;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
        this.tipo_emprestimo = "NORMAL"; //default
        this.id = number;
        number++;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Livro.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo_emprestimo() {
        return tipo_emprestimo;
    }

    public void setTipo_emprestimo(String tipo_emprestimo) {
        this.tipo_emprestimo = tipo_emprestimo;
    }

    @Override
    public String toString() {
        return "Livro " + this.getId() + ": " + this.getTitulo() + ", " + this.getTipo_emprestimo(); //To change body of generated methods, choose Tools | Templates.
    }


}
