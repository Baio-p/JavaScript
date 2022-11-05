public class Fibonacci {
    public static void main(String[] args) {

    	//definimos 3 variables para empezar la secuencia
        int x1 = 0, x2 = 1, x3;

    	//como ya sabemos los primeros dos valores entonces podemos imprimirlos
        System.out.print("0,1");

    	//iniciamos un ciclo for y definimos hasta que valor queremos llegar
        for (int i = 2; i <= 15; i++) {

   	//definimos el tercer valor que sera siempre el ultimo en el ciclo
            x3 = x1 + x2;

    	//los imprimimos en una sola linea
            System.out.print("," + x3);

        //recorremos los valores para obtener el siguiente resultado en la secuencia
            x1 = x2;
            x2 = x3;
        }
    }
}