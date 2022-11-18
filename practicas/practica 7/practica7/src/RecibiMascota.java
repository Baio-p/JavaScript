import java.util.Scanner;
public class RecibiMascota {
    Scanner leer = new Scanner(System.in);
    
    String nombrePerro;
    int edad;
    String raza;
    String tamanio;
    String nombreDuenio;

    public RecibiMascota(){

        System.out.println("ingresa el nombre de tu mascota");
        nombrePerro = leer.nextLine();
        System.out.println("ingresa su edad");
        edad = leer.nextInt();
        System.out.println("ingresa su tamaño");
        tamanio = leer.nextLine();
        System.out.println("ingresa su raza");
        raza = leer.nextLine();
        System.out.println("ingresa quien es su dueño");
        nombreDuenio = leer.nextLine();
    }
}