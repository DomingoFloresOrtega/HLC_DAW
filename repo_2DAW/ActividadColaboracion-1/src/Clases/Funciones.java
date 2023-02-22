package Clases;

import java.util.Scanner;

public class Funciones {

    public static Scanner in = new Scanner(System.in);
    
    public static void crearTriangulo() {
        Double base = 0.0;
        Double altura = 0.0;
        System.out.println("Indica la base del triangulo");
        base = in.nextDouble();
        System.out.println("indica la altura del triangulo");
        altura = in.nextDouble();
        Triangulo t = new Triangulo(base, altura);

        Resultado();
        System.out.println(t.area());

    }

    public static void crearRectangulo() {
        Double base = 0.0;
        Double altura = 0.0;
        System.out.println("Indica la base del rectangulo");
        base = in.nextDouble();
        System.out.println("indica la altura del rectangulo");
        altura = in.nextDouble();
        Rectangulo r = new Rectangulo(base, altura);

        Resultado();
        System.out.println(r.area());
    }

    public static void crearCirculo() {
        Double radio = 0.0;
        System.out.println("Indica el radio del Circulo");
        radio = in.nextDouble();
        Circulo c = new Circulo(radio);

        Resultado();
        System.out.println(c.area());
    }

    public static void crearPentagono() {
        Double lado = 0.0;
        Double radio = 0.0;
        System.out.println("Indica el lado  del pentagono");
        lado = in.nextDouble();
        System.out.println("indica el apotema o radio  del pentagono");
        radio = in.nextDouble();
        Pentagono p = new Pentagono(lado, radio);

        Resultado();
        System.out.println(p.area());

    }

    public static void crearCuadrado() {
        Double lado = 0.0;
        System.out.println("Indica el valor del lado del Cuadrado");
        lado = in.nextDouble();
        Cuadrado c = new Cuadrado(lado);

        Resultado();
        System.out.println(c.area());
    }

    public static void crearHexagono() {
        Double lado = 0.0;
        Double radio = 0.0;
        System.out.println("Indica el lado  del Hexagono");
        lado = in.nextDouble();
        System.out.println("indica el apotema o radio del Hexagono");
        radio = in.nextDouble();
        Hexagono h = new Hexagono(lado, radio);

        Resultado();
        System.out.println(h.area());

    }
    
    public static void Resultado() {
        System.out.print("El Resultado del Area es: ");

    }
}