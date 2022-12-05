package gato;

import java.util.Scanner;

public class Gato2 {

    static Scanner leer = new Scanner(System.in);

    //nuestro tablero es un arreglo bidimensional. Cada valor del arreglo es una casilla en nuestro tablero
    static char[][] tablero = {
        {'-','-','r'},
        {'-','r','-'},
        {'r','-','-'}
    };

    public Gato2() {
        System.out.println("juguemos gato");
    }

    //recorremos el arreglo para imprimir cada casilla.
    public static void verTablero() {
        
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna]);
            }
            System.out.print("\n");
        }
    }

    /*
     * cada turno se piden dos valores para hacer un tiro, el primero busca una fila en el arreglo
     * y el segundo valor la columna en la fila
     */
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
        // [0-0, 0-1 ,0-2]
        // [1-0, 1-1 ,1-2]
        // [2-0, 2-1 ,2-2]

        // las condiciones para ganar son::
        //     1- Cuando 3 figuras en la misma fila sean iguales
        //     2- Cuando 3 figuras en la misma columna sean iguales
        //     3- Cuando 3 figuras en las posiciones 0-0, 1-1 y 2-2 sean iguales
        //     4- Cuando 3 figuras en las posiciones 0-2, 1-1 y 2-0 sean iguales
        
        int victoria1 = 0; 
        int victoria2 = 0;
        int victoria3 = 0;
        int victoria4 = 0;

        // revisamos la condicion 1:
        // recorremos cada fila aumentando en uno cada vez
        for (int fila = 0; fila < tablero.length; fila++) {
            // recorremos cada columna en la fila aumentando en uno cada vez hasta el tamaño de la fila.
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                // si la posicion es igual a la figura del jugador se suma en un contador.
                if (tablero[fila][columna] == figura ){
                    victoria1 ++;
                    // si el contador llega a 3 se termina el juego
                    if (victoria1==3) {
                        System.out.println("ganaste");
                    }
                } 
            }
        }

        // revisamos la condicion 2:
        // usamos un valor para la columna
        for (int columna = 0; columna < tablero.length; columna++) {
            // despues recorremos todas las filas del arreglo pero solo la posicion anterior de la columna.
            for (int fila = 0; fila < tablero[fila].length; fila++) {
                // si la posicion es igual a la figura del jugador se suma en un contador.
                if (tablero[fila][columna] == figura ){
                    victoria2 ++;
                    // si el contador llega a 3 se termina el juego
                    if (victoria2==3) {
                        System.out.println("ganaste");
                    }
                } 
            }
        }

        // revisamos la condicion 3:
        // recorremos solo las posiciones 0-0, 1-1 y 2-2 aumentando un solo valor hasta el tamaño de la tablero.
        for (int fila = 0; fila < tablero.length; fila ++) {
            // usamos el mismo valor como dos valores en las posiciones del arreglo.
            if ( tablero [fila][fila] == figura) {
                // si la posicion es igual a la figura del jugador se suma en un contador.
                victoria3 ++;
                // si el contador llega a 3 se termina el juego.
                if (victoria3 == 3){
                    System.out.println("ganaste");
                }
            }
        }
        // revisamos la condicion 4:
        // recorremos solo las posiciones 2-0, 1-1 y 0-2 aumentando un solo valor hasta el tamaño del tablero.
        for (int fila = 0; fila < tablero.length; fila ++) {
            // usamos resultados algebraicos para encontrar el primer valor en el arreglo.
            if ( tablero [(fila -2)*-1][fila] == figura) {
                victoria4 ++;
                if (victoria4 == 3){
                    System.out.println("ganaste");
                }
            }
        }
    }
}