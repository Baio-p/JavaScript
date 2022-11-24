import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack <String> camisas = new Stack<String>();
        camisas.push("camisa azul");
        camisas.push("camisa verde");
        camisas.push("camisa negra");

        System.out.println("La última camisa agregada es "+ camisas.peek());

        while(!camisas.empty()) {
            System.err.println("Se esta sacando la " + camisas.pop());
        }

        System.out.println(camisas.empty() ? "Ya no hay camisas":"Aun hay camisas");
    }
}
