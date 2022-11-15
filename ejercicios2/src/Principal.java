

import Iterativas.Iterativas;
import condicionales.Condicionales;

public class Principal{
    public static void main(String[] args) {

        System.out.println("ingresa tu nombre");
        Condicionales condicionales = new Condicionales("Benjamin");
        System.out.println(condicionales);

        Iterativas iterativas = new Iterativas();

        /*condicionales.Ejer9();*/
        iterativas.Ejer1();

    }

}