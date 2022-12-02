import java.util.Arrays;

import ordenaminetos.Ordenamiento;

public class App {

    static int[] practica11 = {11,23,9,20};
    static int listaDesordenada[] = {5,8,9,3,50,25,12,1,37,25};
    static int listaDesordenada2[] = {56,85,25,20,10,1,3,60,201,51,30};
    public static void main(String[] args){
        
        System.out.println(Arrays.toString(practica11));
        Ordenamiento.burbuja(practica11);
        System.out.println(Arrays.toString(practica11));

        // System.out.println(Arrays.toString(listaDesordenada));
        // Ordenamiento.insercion(listaDesordenada);
        // System.out.println(Arrays.toString(listaDesordenada));

        // System.out.println(Arrays.toString(listaDesordenada));
        // Ordenamiento.quickSort(listaDesordenada, 0, listaDesordenada.length -1);
        // System.out.println(Arrays.toString(listaDesordenada));
        
        // System.out.println("\n");

        // System.out.println(Arrays.toString(listaDesordenada2));
        // Ordenamiento.quickSort(listaDesordenada2, 0, listaDesordenada2.length -1);
        // System.out.println(Arrays.toString(listaDesordenada2)); 
    }
}
