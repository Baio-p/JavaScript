package gato;

import java.util.Scanner;

public class Gato2 {

    static Scanner leer = new Scanner(System.in);
    static char[][] tablero = {
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}
    };

    public Gato2() {
        System.out.println("juguemos gato");
    }
    public static void verTablero() {
        
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna]);
            }
            System.out.print("\n");
        }
    }

    public static void tirar () {
        int fila,columna;
        for (int turno = 1; turno == 9; turno++) {
            System.out.println("tira fila");
            fila = leer.nextInt();
            System.out.println("tira columna");
            columna = leer.nextInt();
            tablero[fila][columna] = 'o';
        }
    }
}