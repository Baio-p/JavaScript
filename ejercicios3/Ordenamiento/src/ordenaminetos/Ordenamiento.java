package ordenaminetos;

public class Ordenamiento {

    static public void burbuja(int[] arreglo){
        //primero recorremos el numero de veces igual al tamaño del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            /*despues recorremos cada poscicion del arrgelo disminuyeno la el recorrido
            en una poscicion cada vez.
             */
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                /*comprobamos las pimeras dos posciciones buscando el mayor valor */
                if (arreglo[j] > arreglo[j+1]) {
                    /*  si el valor de la izquierda es mayor lo guardamos en un auxiliar
                    para no pederlo y recuperarlo despues 
                     */
                    int aux = arreglo[j];
                    /*sustituimos el valor de la izquierda con el de la derecha */
                    arreglo[j] = arreglo[j+1];
                    /*por ultimo guardamos el valor del auxiliar en la poscicion de la derecha.
                    Asi se va recorriendo el valor mayor a la derecha cada vez.
                     */
                    arreglo[j+1] = aux;
                }
            }
        }
    }

    static public void insercion(int[] arreglo) {
        int key,ant,aux;    
        for (int i = 1; i < arreglo.length; i++) {
            key = i;
            ant = i - 1;

            while (ant >= 0 && arreglo[key] < arreglo[ant]){
                aux = arreglo[key];
                arreglo[key] = arreglo[ant];
                arreglo[ant] = aux;
                key = ant;
                ant--;
            }
        }
    }

    static public void quickSort(int[] arreglo) {

    }
}
