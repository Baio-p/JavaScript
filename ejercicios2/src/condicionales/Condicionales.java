package Condicionales;

import java.util.Scanner;

public class Condicionales {
    
    private static Scanner leer = new Scanner(System.in);
    
    public Condicionales(String nombre) {
         // inicializar variables o instrucciones de la clase
        System.out.println("Hola " +nombre+" desde el constructor");
    }

    /**
     * Escribir un programa que pregunte al usuario su edad y muestre 
     * por pantalla si es mayor de edad o no.
     * @return Muestra si eres mayor de edad.
     */
    public String Ejer1(){

        int edad = leer.nextInt();
        if (edad>=18){
            return "Eres mayor de edad";
        } else {
            return "Eres menor de edad";
        }
    }

    /**
     * Escribir un programa que almacene una contraseña en una 
     * variable, pregunte al usuario por la contraseña e imprima 
     * por pantalla si la contraseña introducida por el usuario 
     * coincide con la guardada en la variable sin tener en cuenta 
     * mayúsculas y minúsculas.
     * @return Muestra si la contraseña es correcta o incorrecta.
     */
    public String Ejer2(String passDB) {
        
        String passUser = leer.nextLine();
        if (passDB.equals(passUser)){
            return "La contraseña es correcta";
        } else {
            return "La contraseña es incorrecta";
        }
    }

    /**
     * Escribir un programa que pida al usuario dos números 
     * y muestre por pantalla su división. Si el divisor es 
     * cero el programa debe mostrar un error.
     * @return Muestra el esultado de la division.
     */
    public void Ejer3() {
        System.out.println("Dividamos dos numeros cualesquiera \n"+
                            "ingresa un numero");
        float dividendo = leer.nextInt();
        System.out.println("entre que numero lo quieres dividir ?");
        float divisor = leer.nextInt();
        if (divisor!=0) {
            float division = dividendo/divisor;
            System.out.println("el resultado es "+ division);
            
        } else {
            System.out.println("error");
            
        }
    }

    /**
     * Escribir un programa que pida al usuario un número entero y muestre por
     * pantalla si es par o impar.
     * @return Muestra si tu numero es par o impar.
     */
    public void Ejer4() {
        System.out.println("Revisemos numeros pares e impares \n ingresa un numero entero");
        int numEnt = leer.nextInt();
        System.out.println((numEnt % 2 == 0) ? "Tu numero es par" : "Tu numero es impar");
    }

    /**
     * Para pagar un determinado impuesto se debe ser mayor de 16 años y tener
     *  unos ingresos iguales o superiores a $5000 mensuales. Escribir un 
     * programa que pregunte al usuario su edad y sus ingresos mensuales y 
     * muestre por pantalla si el usuario tiene que pagar o no.
     * @return Muestra si puedes pagar impuestos o no.
     */
    public void Ejer5() {
        System.out.println("Veamos si puedes pagar impuestos\n" + 
                            "que edad tienes ?");
        int edad = leer.nextInt();
        System.out.println("cuanto ganas mensualmente?");
        float ingMens = leer.nextFloat();
        System.out.println((edad >= 16 && ingMens >= 5000.00) ? "Puedes pagar impuestos" : "No puedes pagar impuestos");
        return;
    }

    /*
     *Ejercicio 6
    Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. El grupo A esta formado por 
    las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto. 
    Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.
     */
    public void Ejer6() {
        System.out.println("ingresa tu nombre");
        char nombre = leer.next().charAt(0);
        System.out.println("ingresa tu homoclave");
        char genero = leer.next().charAt(0);

        if ((genero == 'M' && nombre < 'M') || (genero == 'H' && nombre > 'M')) {
            System.out.println("eres del grupo A");
        } else {
            System.out.println("eres del grupo B");
        }
    }

    /**
     * En una determinada empresa, sus empleados son evaluados al final
     *  de cada año. Los puntos que pueden obtener en la evaluación 
     * comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores 
     * beneficios. Los puntos que pueden conseguir los empleados pueden 
     * ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las
     *  cifras mencionadas. A continuación se muestra una tabla con los 
     * niveles correspondientes a cada puntuación. La cantidad de dinero 
     * conseguida en cada nivel es de $2,400 multiplicada por la 
     * puntuación del nivel.

    Nivel	Puntuación
    Inaceptable	0.0
    Aceptable	0.4
    Meritorio	0.6 o más

    Escribir un programa que lea la puntuación del usuario e indique su 
    nivel de rendimiento, así como la cantidad de dinero que recibirá el 
    usuario.
     * @return Muestra el nivel de puntuacion y la cantidad recibida.
     */
    public  void Ejer7() {
        System.out.println("Veamos tu nivel de rendimiento laboral segun tu puntaje \ningresa tu puntuacion");
        System.out.println("0.0 ? \n 0.4 ? \n 0.6 o mas ?");
        float puntos = leer.nextFloat();
        double dineroRec = puntos * 2400;
        if (puntos == 0.0) {
            System.out.println("Inaceptable");
        }
        else if (puntos == 0.4) {
            System.out.println("Aceptable");
        }
        else if (puntos >= 0.6) {
            System.out.println("Meritorio");
        }
        System.out.println("Te daremos " + dineroRec + " por tu rendimiento");
        return;
    }

    /**
     * Ejercicio 8
Escribir un programa para una empresa que tiene salas de juegos para todas las 
edades y quiere calcular de forma automática el precio que debe cobrar a sus clientes 
por entrar. El programa debe preguntar al usuario la edad del cliente y mostrar el precio 
de la entrada. Si el cliente es menor de 4 años puede entrar gratis, si tiene entre 4 y 18 años 
debe pagar $5 y si es mayor de 18 años, $10.
     * 
     */
    public void Ejer8() {
        System.out.println("Para jugar en alguna de mis salas me debes decir primero tu edad \nque edad tienes ?");
        int edad = leer.nextInt();
        if (edad < 4) {
            System.out.println("Tu entras gratis");
        } else if (edad >= 4 && edad <= 18) {
            System.out.println("La entrada cuesta $5 pesos");
        } else {
            System.out.println("La entrada cuesta $10 pesos");
        }
        return;
    }

/*
 * Ejercicio 9
La pizzería Planeta ofrece pizzas vegetarianas y no vegetarianas a sus clientes. 
Los ingredientes para cada tipo de pizza aparecen a continuación.

Vegetarianos: Pimiento y tofu.
No vegetarianos: Peperoni, Jamón y Salmón.

Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y en función de su respuesta
le muestre un menú con los ingredientes disponibles para que elija. Solo se puede eligir un ingrediente además 
de la mozzarella y el tomate que están en todas la pizzas. Al final se debe mostrar por pantalla si la pizza 
elegida es vegetariana o no y todos los ingredientes que lleva.
 */

    public void Ejer9() {
        System.out.println("todas nuestras pizzas llevan queso mozzarella y tomate" +
                            "\n quieres una pizza vegetariana ?");
        char tipoPizza = leer.next().charAt(0);
        if (tipoPizza == 'S'){
            System.out.println("Elije una de nuestras opciones vegetarianas:\n" +
                            "1:Pimineto \n"+ 
                            "2:Tofu");
            int ingrediente = leer.nextInt();
            switch (ingrediente){
                case 1:
                    System.out.println("Tu pizza vegetariana es de Pimiento con tomate y Mozzarella");
                    break;
                case 2:
                    System.out.println("Tu pizza vegetariana es de Tofu con tomate y Mozzarella");
                    break;
                default:
                    System.out.println("no tenemos ese ingrediente");
                    break;
            }
        } else {
            System.out.println("Elije una de nuestras opciones no vegetarianas:\n" +
                            "1:Peperoni \n"+ 
                            "2:Jamon \n"+
                            "3:Salmón");
            int ingrediente = leer.nextInt();
            switch (ingrediente){
                case 1:
                    System.out.println("Tu pizza no vegetariana es de Pimiento con tomate y Mozzarella");
                    break;
                case 2:
                    System.out.println("Tu pizza no vegetariana es de Jamon con tomate y Mozzarella");
                    break;
                case 3:
                    System.out.println("Tu pizza no vegetariana es de Salmon con tomate y Mozzarella");
                    break;
                default:
                    System.out.println("no tenemos ese ingrediente");
                    break;
            }
        }
    }
}

