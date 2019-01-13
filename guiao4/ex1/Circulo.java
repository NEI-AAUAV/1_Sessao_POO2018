/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author dn
 */
public class Circulo extends Figura{
    private double raio;

    public Circulo(double raio, String cor, Ponto centro) {
        super(cor, centro);
        this.raio = raio;
    }

    public Circulo(double raio, String cor, double Coordenada_x, double Coordenada_y) {
        super(cor, Coordenada_x, Coordenada_y);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo= [ " + super.toString() + ", raio: " + this.getRaio() + " ]"; //To change body of generated methods, choose Tools | Templates.
    }

    public double area(){
        return Math.PI + Math.pow(this.getRaio(), 2);
    }

    public double perimetro(){
        return 2 * Math.PI + this.getRaio();
    }

    public boolean intersecao(Circulo c2){
        Double soma_raios = this.getRaio() + c2.getRaio();
        Double distancia_centros = Math.sqrt(Math.pow(c2.getCentro().getX() - this.getCentro().getX(), 2)
                                        + Math.pow(c2.getCentro().getY() - this.getCentro().getY(), 2));
        return (soma_raios >= distancia_centros) ? true : false;
    }

    public boolean equals(Circulo c2) {
        if(this.getCor().equals(c2.getCor()) && this.getCentro().getX()==c2.getCentro().getX() &&
                    this.getCentro().getY()==c2.getCentro().getY() && this.getRaio()==c2.getRaio()){
            return true;
        }else{
            return false;
        }
    }


}
