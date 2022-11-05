public class Impares {
    public static void main(String[] args) {
        // iniciamos el ciclo for y definimos hasta que valor queremos que llegue
        for (int imp = 0; imp <= 15; imp++) {
            //definimos una condicion if para que arroje el resultado que buscamos cuando se cumpla
            if (imp % 2 != 0)
            //imprimimos el resultado hasta que termine el ciclo for
                System.out.print(imp + " ");
        }
    }
}