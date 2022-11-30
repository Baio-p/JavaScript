import java.util.Arrays;

import ordenaminetos.Ordenamiento;

public class App {

    static int listaDesordenada[] = {5,8,9,3,50,25,12,1,37,25};
    static int listaDesordenada2[] = {56,85,25,20,10,1,3,60,201,51,30};
    public static void main(String[] args){
        
        // System.out.println(Arrays.toString(listaDesordenada2));
        // Ordenamiento.burbuja(listaDesordenada2);
        // System.out.println(Arrays.toString(listaDesordenada2));

        System.out.println(Arrays.toString(listaDesordenada));
        Ordenamiento.insercion(listaDesordenada);
        System.out.println(Arrays.toString(listaDesordenada));
    }

}
