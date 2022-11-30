// creamos el package que seria la ruta de donde se va a ejecutar nuestro proyecto
package Iterativas;
//importamos las clases que vayamos a utilizar para nuestro proyecto definiendo ruta.objeto
import java.util.Scanner;

//creamos la clase con su privacidad y nombre 
public class Iterativas {

    /* 
    creamos los objetos que vayamos a utilizar de las clases importadas.
    de igual forma definimos si privacidad para la visibilidad dentro de la clase y si es statico o no por si 
    solo uno o varios metodos lo van a utilizar
    */ 
    private static Scanner leer = new Scanner(System.in);

    /*
    El metodo main es nescesario solo en la clase desde donde se va a compilar y a ejecutar el programa. Si la clase 
    no contiene un metodo main, puede almacenar un constructor y uno o varios metodos pero tiene que ser instanciada 
    desde un metodo main de otra clase para compilar y ejecutar su contenido.
     */


    /*creamos el constructor de la clase. A difernecia del main, el constructor es completamente nescesario 
    para que los metodos se ejecuten. Es preferible que contengan un metodo referente al codigo que se esta
    construyendo pero se debe recordar que es lo primero que se va a mostrar en consola cuando se compile y se ejecute.
    de igual forma se debe definir su privacidad, si es estatica y se debe definir si el metodo va a regresar algun valor seguido del
    nombre y el campo "()" para definir si que tipo de valores va a recibir. Si se define "void" osea que no regresara nada, 
    este ultimo campo quedara vacio*/
    public Iterativas() {
        System.out.println("Soy el constructor");
    }

    //ya podemos regresar los valores con los atributos ya mencionados

    /*
     * Calcular la media de los números pares e impares, sólo se ingresará diez números.
     */

    public void Ejer1() {

        float numeros[] = new float[10];
        float sumaPares = 0;
        float sumaImpares = 0;
        int contPares = 0;
        int contImpares = 0;
        for (int posicion = 0; posicion < 10; posicion++) {
            System.out.println("digita un número");
                numeros[posicion] = leer.nextFloat();
                if (numeros[posicion] % 2 == 0) {
                    sumaPares = sumaPares + numeros[posicion];
                    contPares = contPares += 1;
                } else {
                    sumaImpares = sumaImpares + numeros[posicion];
                    contImpares = contImpares += 1;
                }
        }
        /*comprobar variables */
        float promPar = sumaPares / contPares;
        float promImpar = sumaImpares / contImpares;

        System.out.println("el promedio de " + contPares+ " numeros pares que ingresaste es de " + promPar + 
                            "\ny el promedio de "+ contImpares+ 
                            "\nnumeros impares que ingresaste es de "+promImpar);       
    } 

    /*
     * Calcular la suma de los n primeros números.
     */
    public void Ejer2() {
        System.out.println("hagamos una suma con los numeros que quieras");
        float suma = 0;
        int contador = 0;
        System.out.println("ingresa tu primer numero");
        float numero = leer.nextFloat();
        do {
            if (numero != 0) {
                suma = suma + numero;
                contador = contador + 1;
            } else {
                System.out.println("no puedes sumarle 0 a otro numero");
            }
            System.out.println("ingresa otro numero para sumar o 0 para terminar");
            numero = leer.nextFloat();
        } while (numero != 0);
        if (contador > 1) {
            System.out.println("el resultado de sumar tus " + contador + " numeros es " + suma );
        } else if (contador == 1) {
            System.out.println("no se puede hacer la suma con un solo numero :(");
        } else {
            System.out.println("no ingresaste ningun numero");
        }
    }

    /*
     * Ejercicio 3
    Se quiere saber cuál es la ciudad con la población de más personas, 
    son tres estados con once ciudades, hacer un algoritmo que nos permita saber eso.
     */

    public void Ejer3() {
        String estados[] = new String[3];
        int ciudades[][] = new int[3][11];
        String estadoMax[] = new String[1];
        int ciudadMax[][] = new int[1][1];

        for (int numEstado = 0; numEstado < estados.length; numEstado++) {
            leer.nextLine();
            System.out.println("ingresa el nombre del "+(numEstado+1)+"° estado");
            estados[numEstado] = leer.nextLine();
            for (int numCiudad = 0; numCiudad < ciudades[numEstado].length; numCiudad++) { 
                System.out.println("ingresa la "+ (numCiudad+1) + "° poblacion");
                ciudades[numEstado][numCiudad] = leer.nextInt();
                if (numEstado == 0) {
                    estadoMax[0] = estados[numEstado];
                    ciudadMax[0][0] = ciudades[numEstado][numCiudad];
                } else if (ciudades[numEstado][numCiudad] > ciudadMax[0][0]) {
                    estadoMax[0] = estados[numEstado];
                    ciudadMax[0][0] = ciudades[numEstado][numCiudad];
                }
            }
        }
        System.out.println("el estado de " + estadoMax[0]+ " con la poblacion de " + ciudadMax[0][0] + " es el mayor.");
        /*crear objetos */
        for (int i = 0; i < estados.length; i++) {
            System.out.println(estados[i]);
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.print(ciudades[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    /*
     * Imprimir las tablas de multiplicar de los números del uno al nueve.
     */

    public void ejer4() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int resultado = i * j;
                System.out.println(i +" X "+ j + " = " + resultado +"\n");
            }
        }
    }

    /*
     * clacular factorial de un numero.
     */

    public void ejer5() {
        
    }
}