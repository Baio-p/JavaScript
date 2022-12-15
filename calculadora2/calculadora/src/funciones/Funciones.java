package funciones;

import java.util.LinkedList;
import java.util.Queue;

public class Funciones {

    static Queue<String> valores = new LinkedList<String>();
    double rG = 0.0;
    
    static public void convertirDatos(String datos) {
        String aux = "";
        char elemento = ' ';
        for (int i = 0; i < datos.length(); i++) {
            elemento = datos.charAt(i);
            if (elemento != '+' && elemento != '-' &&  elemento != '*' && elemento != '/'){
                aux += elemento;
            } else {
                valores.add(aux);
                valores.add(Character.toString(elemento));
                aux ="";
            }
        }
        if(aux != ""){
            valores.add(aux);
        }
        System.out.println(valores);
    }

    static public void resultadoValores(String datosUsuario){
        convertirDatos(datosUsuario);
        suma(Double.parseDouble(valores.poll()));
        while(!valores.isEmpty()){
            switch  (valores.poll()){
                case "+":
                    suma(Double.parseDouble(valores.poll()));
                    break;
            }
        }
    }

    private static void suma(double parseDouble) {
        double rG = 0.0;
        rG += parseDouble;
    }
}
