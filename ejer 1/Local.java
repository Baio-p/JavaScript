public class Local {
    public static void main(String[] args) {
        // variable local
        String prueba;
        prueba = "Alfonso";
        cosa(prueba);
    }

    // Método estatico
    public static void cosa(String nombre){ // nombre es variable local
        // variable local
        String saludo = "Hola ";
        // tamaño de las variables locales
        System.out.println("Tamaño de saludo = "+ saludo.length());
        System.out.println("Tamaño de nombre = "+ nombre.length());
        System.out.println(saludo + nombre);
    }
}