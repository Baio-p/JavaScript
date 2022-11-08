package condicionales;

import java.util.Scanner;

public class Condicionales {
    
    private static Scanner sc = new Scanner(System.in);
    
    public Condicionales(String nombre) {
        // inicializar variables o instrucciones de la clase
        System.out.println("Hola " +nombre+" desde el constructor");
    }

    public String saludo(){

        int edad = sc.nextInt();
        if (edad>=18){
            return "Eres mayor de edad";
        } else {
            return "Eres menor de edad";
        }
    }
}

