
public class Local {
    public static void main(String[] args) {
        String h;
        h = "Variables locales";
        System.out.println(h);
        //instanciar objeto de tipo local
        Local v1 = new Local();
        //onjeto v1 y el metodo saludo
        v1.saludo("Alfonso"); 
    }
    public void saludo(String nombre) {
        System.out.println(nombre.length());
        System.out.println("hola "+ nombre);
    }
}
