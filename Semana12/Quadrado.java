package Semana12;

public class Quadrado{
    public double lado;

    // Construtor

    /* public Quadrado(double l){
        lado = l;
    } */

    /* public Quadrado(double lado){
        this.lado = lado;
    } */

    //metodos

    public double calcularArea() {
        return lado * lado;
    }
    public double calcularPerimetro(){
        return 4 * lado;
    }
}