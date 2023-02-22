
// parte logica de trabajo de  Jose Luis Roman
import java.util.Scanner;
import Clases.*;

public class usoGeometrias {

    public static String menu() {
        String cadena = "";
        cadena += "======================  MENU  ======================";
        cadena += "\n\n\t 1.- Area de un Triangulo";
        cadena += "\n\t 2.- Area de un Rectangulo";
        cadena += "\n\t 3.- Area de un Circulo";
        cadena += "\n\t 4.- Area de un Pentagono";
        cadena += "\n\t 5.- Area de un Cuadrado";
        cadena += "\n\t 6.- Area de un Hexagono";
        cadena += "\n\t 0.- Salir del menu";
        cadena += "\n\n\t  Escoja una opcion del menu: ";

        return cadena;
    }

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int key;

        do {
            System.out.println(menu());

            key = in.nextInt();

            switch (key) {
                case 1:
                    Funciones.crearTriangulo();
                    break;
                case 2:
                    Funciones.crearRectangulo();
                    break;
                case 3:
                    Funciones.crearCirculo();
                    break;
                case 4:
                    Funciones.crearPentagono();
                    break;
                case 5:
                    Funciones.crearCuadrado();
                    break;
                case 6:
                    Funciones.crearHexagono();

                    break;
                case 0:
                    System.out.println("=================0==================");
                    System.out.println("Gracias por interactuar con Nosotros");
                    System.out.println("=================0==================");

                    break;

                default:
                    System.out.println("la opcioon escogida no es valida");
                    System.out.println("Repita la Acción");

                    break;
            }

        } while (key != 0);

    }

}