import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue <String> usuarios = new LinkedList<String>();

        usuarios.offer("Abraham");
        usuarios.offer("Ivonne");
        usuarios.offer("Jannet");
        usuarios.offer("Miguel");
        usuarios.offer("Hector");
        
        int cont =0;
        while((cont < 3) && !usuarios.isEmpty()){
            System.out.println("El nombre a eliminar es: " + usuarios.remove());
            cont ++;
        }

        System.out.println("El proximo nombre a eliminar es: "+usuarios.peek());
    }
}
