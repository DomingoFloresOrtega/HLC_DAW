package Clases;

// INICIO - Antonio Martin Alarcon 14/02/2023
public class Pentagono {

    private double lado;
    private double radio;

    public Pentagono(double lado, double radio) {

        this.lado = lado;
        this.radio = radio;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {

        double resultado;

        resultado = (5 * getLado() * getRadio()) / 2;

        return resultado;

    }

}
// FIN - Antonio Martin Alarcon 14/02/2023