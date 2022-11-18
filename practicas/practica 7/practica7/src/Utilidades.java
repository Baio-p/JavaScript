import java.util.Scanner;

/**
 * cosas para trabajar mejor
 *  
 * 
 * */
public class Utilidades {
    private static Scanner leer = new Scanner(System.in);
    /**
     * Este metodo pide los datos de la mascota y la regresa     
     * * @return Mascota
     */
    public static RecibiMascota crearMascota(){
        System.out.println("ingresa el nombre de tu mascota");
        String nombrePerro = leer.nextLine();
        System.out.println("ingresa su edad");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println("ingresa su tamaño");
        String tamanio = leer.nextLine();
        System.out.println("ingresa su raza");
        String raza = leer.nextLine();
        System.out.println("ingresa quien es su dueño");
        String nombreDuenio = leer.nextLine(); 
        return new RecibiMascota(nombrePerro, edad, raza, tamanio, nombreDuenio);
    }
}
