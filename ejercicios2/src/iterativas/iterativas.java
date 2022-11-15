// creamos el package que seria la ruta de donde se va a ejecutar nuestro proyecto
package iterativas;
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

        float numeros[] = new float[9];
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
        float promPar = sumaPares / contPares;
        float promImpar = sumaImpares / contImpares;

        System.out.println("el promedio de " + contPares+ " numeros pares que ingresaste es de " + promPar + 
                            "\ny el promedio de "+ contImpares+ 
                            "\nnumeros impares que ingresaste es de "+promImpar);       
    } 

    public void Ejer2() {
        float suma = 0;
        
    }
} 
