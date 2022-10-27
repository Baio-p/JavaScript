# JavaScript
Practicas para Java

Al final de cada instruccion se debe finalizar con ";".
Java no nescesita identacion; puede correr todo el codigo siempre y cuando esten bien definidos todos los procesos eh instrucciones en 
el codigo.


1.-variables

Las variables se deben declarar o inicializar antes de empezar un algun metodo o funcion para poder guardar el espacio en la compilacion y ejecucion del programa.
Se de debe declarar de que tipo de dato sera la variable y el nombre de la misma:

        int peso

Es recomendable darle un nombre a la variable relacionado al tipo de dato que se vaya a guardar en ella. 
Debemos tratar de no declarar variables que no se vayan a utilizar para no desperdiciar memoria.
Los nombres de las variables que tengan mas de una palabra se nombran con camel case:

        int pesoFruta;

Al darle el valor a una variable declarada se debe respetar ese valor declarado. de lo contario marcara error.

Al inicializar una variable ya se le esta asignando un valor;

        int peso = 30;

Una variable constante es una variable que se inicializa con un valor en especifico que ya no se puede cambiar y se define con <final> al principio:

        final <tipo> identificador = <valor>;
        final float PI = 3.141592;

Como buena practica los nombres de las constantes se ponen en mayusculas para poder identificarlas. Tambien si las constantes tienen nombres con varias palabras, se puede usar el sneake case:

        final float VALOR_DE_PI = 3.141592;

Hay tres tipos de variables:

    locales
    instancia
    estaticas

Las variables locales solo viven dentro del los metodos o bloques en los que son declaradas y/o inicializadas, es decir, cuando empieza un metodo con n variables y el bloque termina, las variables seran destruidas para liberar memoria. 

las variables de instancia son variables no estaticas que se declaran en una clase fuera de de cualquier metodo, constructor o bloque. 
se crean despues de ina nstancia, osea hasta que se instancie un objeto, fuera de los metodos pero dentro de una clase y comunmente las variables de instancia son privadas.

las variables estaticas son variables que se cran una sola vez, se guardan y se repiten cada vez que son llamadas. Si esa variable se modifica, tambien cambia el valor en todos los lugares en los que haya sido llamada.

