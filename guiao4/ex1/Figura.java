/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dn
 */
public class Figura {
    private String cor;
    private Ponto centro;

    public Figura(String cor, Ponto centro) {
        this.cor = cor;
        this.centro = centro;
    }

    public Figura(String cor, double Coordenada_x, double Coordenada_y) {
        this.cor = cor;
        this.centro = new Ponto(Coordenada_x, Coordenada_y);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "cor: " + this.getCor() + this.getCentro().toString() + ""; //To change body of generated methods, choose Tools | Templates.
    }

}
