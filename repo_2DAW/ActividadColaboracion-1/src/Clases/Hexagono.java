package Clases;

public class Hexagono {
    private double lado;
    private double radio;

    public Hexagono(double lado, double radio) {
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
        return (this.lado * 6) * (this.radio / 2);
    }
}
