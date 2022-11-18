import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        ArrayList <RecibiMascota> registros = new ArrayList<RecibiMascota>();
        char optMenu;
        System.out.println("registremos tu mascota");
        do {
            registros.add(new RecibiMascota ());
            System.out.println("quieres registrar otra mascota ?");
            System.out.println("1.- ingrsar mascota");
            System.out.println("0.- terminar");
            optMenu = leer.next().charAt(0);
        } while (optMenu == '1');

    System.out.println("Perros actuales en la estética:" + registros.size());
    }
}
