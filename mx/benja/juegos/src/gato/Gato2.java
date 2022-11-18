package gato;

import java.util.Scanner;

public class Gato2 {

    static Scanner leer = new Scanner(System.in);
    static char[][] tablero = {
        {'r','-','-'},
        {'-','r','-'},
        {'-','-','r'}
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
        for (int turno = 1; turno < 10; turno++) {
            System.out.println("tira fila");
            fila = leer.nextInt();
            System.out.println("tira columna");
            columna = leer.nextInt();
            tablero[fila][columna] = 'o';
            verTablero();
        }
    }

    public static void condiciones(char figura) {
        // tablero[fila][colum]
        // [0-0 ,0-1 ,0-2 ]
        // [1-0 ,1-1 , ]
        // [2-0 , , ]
        int victoria1, victoria2, victoria3;
        for (int fila = 0; fila < tablero.length; fila++) {
            victoria1=0;
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                if (tablero[fila][columna] == figura ){
                    victoria1++;
                    if (victoria1==3) {
                        System.out.println("ganaste");
                    }
                } 
            }
        }

        for (int fila = 0; fila < tablero.length; fila ++) {
            victoria2 =0;
            for (int columna =+ fila; columna < tablero.length; columna =- 0) {
                if (tablero[fila][columna] == figura ){
                    victoria2++;
                    if (victoria2==3) {
                        System.out.println("ganaste");
                        
                    }
                } 
            }break;
        }

    }
}