# JavaScript
Practicas para JavaScript

Al final de cada instruccion se debe finalizar la instruccion el ";".

1.-variables

Las variables se deben declarar dese el principio para poder guardar el espacio para la compilacion y ejecucion del programa.
Se de debe declarar de que tipo de dato sera la variable y el nombre de la misma. Por ejemplo:

        int peso

Es recomendable darle un nombre a la variable relacionado al tipo de dato que se vaya a guardar en ella. 
Debemos tratar de no declarar variables ue no se vayan a utilizar para no desperdiciar memoria.
Los nombres de las variables que tengan mas de una plabara, se usa el camel case para poder nombrarlas:

        int pesoFruta

Al darle el valor a una valor declarada se debe respetar su valor declarado. de lo contario marcara error.

Es diferente declarar una variable e iniializarla. Al inicializar una variable ya se le esta asignando un valor;

        int peso = 30;

Una variable constante es una variable que se inicializa con un valor en especifico y que ya no se puede cambiar y se define con <final> al principio:

        final <tipo> identificador = <valor>;
        final float PI = 3.141592;

Los nombres de las constantes se deben poner en mayusculas para poder identificarlas por buena practica. Tambien si las constantes tienen nombres con varias palabras, se puede usar el camel case:

        final float VALOR_DE_PI = 3.141592;

Hay tres tipos de variables:

    locales
    instancia
    estaticas

Las variables locales solo viven dentro del los metodos o bloques en los que son declaradas y/o inicializadas, es decir, cuando empieza un metodo con n variables, cuando el bloque termine y nos arroje el resultado deseado, las variables seran destruidas para liberar memoria. 

        public clas App {
            public static void main(string[] args){
                String nombre;
                nombre ="Alfonso";
                System.out.printl"hola"+nombre
                }
        }

las variables de instancia son variables no estaticas que se declaran en una clase fuera de de cualquier metodo, constructor o bloque. 
se crean despues de ina nstancia, osea hasta que se instancie un objeto.
fuera de los metodos pero dentro de una clase
normalmente las variables de instancia son privadas.

las variables estaticas son variables que se cran una sola vez y se repite cada vez que sea llamada. Si esa variable se modifica, tambien cambia el valor en todos los lugares en los que haya sido llamada.

