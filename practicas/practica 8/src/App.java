import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Ingresa tu nombre completo:");
        nombre = datos.nextLine();

        System.out.println("Ingresa tu edad:");
        edad = datos.nextInt();

        if (edad >= 18) {
            System.out.println("Tu nombre es " + nombre + ", tienes "+edad+" años y eres mayor de edad.");
        } else {
            System.out.println("Tu nombre es " + nombre + ", tienes "+edad+" años y eres menor de edad.");
        }
        System.out.println("Tu nombre tiene "+ nombre.length()+" caracteres.");
        datos.close();
    }
}
