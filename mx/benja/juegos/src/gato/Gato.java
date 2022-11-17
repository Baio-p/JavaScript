package gato;

import java.util.Scanner;

public class Gato {

    Scanner leer = new Scanner(System.in);
    private char[][] tablero = {
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}
    };

    public Gato() {
        System.out.println("juguemos gato");
    }
    public void iniciarTablero() {
        
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna]);
            }
            System.out.print("\n");
        }
    }

    public void Tiros(int fila, int columna, char f){
        this.tablero[fila][columna] = f;
        for (int i = 0; i < 9; i++) {
            System.out.println("tira fila");
            fila = leer.nextInt();
            System.out.println("tira columna");
            columna = leer.nextInt();
            if (i % 2 == 0){
                this.tablero[fila][columna] = 'O';
            } else {
                this.tablero[fila][columna] = 'X';
            }
        }
    }
}

