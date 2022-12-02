import metodoordenamiento.MetodoOrdenamiento;


public class App {
    public static void main(String[] args) {

        int[] practica11 = {11,23,9,20};

        MetodoOrdenamiento objOrdena = new MetodoOrdenamiento();

        objOrdena.imprimeArreglo("Arreglo inicial: ",practica11);
        objOrdena.saltoLinea();

        for (int i = 0; i < practica11.length; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < practica11.length - i - 1; j++) {
                objOrdena.imprimeArreglo("Arreglo comparado: ", practica11);
                System.out.println(" <----- j = " + j + " -- " + practica11[j] + " > " + practica11[j+1] + "?");
                if (practica11[j] > practica11[j+1]) {
                    System.out.println("    ------- Intercambia " + practica11[j] + " con " + practica11[j+1]);
                    int aux = practica11[j];
                    practica11[j] = practica11[j+1];
                    practica11[j+1] = aux;
                    objOrdena.imprimeArreglo("Arreglo modificado: ", practica11);
                    objOrdena.saltoLinea();
                }
            }
        }
        objOrdena.saltoLinea();
        objOrdena.imprimeArreglo("Arreglo final: ", practica11);
    }
}
