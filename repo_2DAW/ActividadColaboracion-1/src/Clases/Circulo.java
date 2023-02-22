package Clases;
// INICIO - Antonio Martin Alarcon 14/02/2023
public class Circulo {

    private double radio;

    public Circulo(double radio) {

        this.radio = radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {

        double resultado;

        resultado = Math.PI * Math.pow(getRadio(), 2);

        return resultado;

    }

}
// FIN - Antonio Martin Alarcon 14/02/2023