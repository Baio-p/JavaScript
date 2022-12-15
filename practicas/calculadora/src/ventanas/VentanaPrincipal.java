package ventanas;
// importammos las librerias de java para poder utilizar sus clases y funciones.
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

// esta clase extiende de Jframe por lo que heredara los metodos de para la imterfaz.
// esta clase puede recibir eventos para interpretarlos como acciones por que implementa ActionListener.
public class VentanaPrincipal extends JFrame implements ActionListener {


    JTextField display = new JTextField("0");
    JButton resultado = new JButton("RESULTADO");
    JButton teclas[];
    String datosUsuario = "0";
    Queue<String> valores = new LinkedList<String>();
    double rG = 0.0;
    
    //nuestro constructor contiene los metodos y funciones para iniciar nuestra ventana.
    public VentanaPrincipal(String titulo){
        
        // este es el titulo que recibira nuestra ventana.
        super(titulo);
        // tamaño de la ventana (ancho,alto).
        setSize(400, 500);
        //operacion por defecto para cerrar.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        disenioElementos();
    }

    public void disenioElementos (){
        
        // definimos el tipo de layoot para acomodar los elementos. 
        setLayout(new GridBagLayout());
        
        /*
        las condiciones para este tipo de layout se guardan en un objeto de 
        tipo GridBagConstrains y se inicializan con diferentes valores.
        */ 
        GridBagConstraints condiciones = new GridBagConstraints();
        
        // definimos en que columna empezara nuestro elemento.
        condiciones.gridx = 0;
        // definimos en que fila empezara nuestro elemento.
        condiciones.gridy = 0;
        // definimos el ancho de columnas tendra nuestro elemento.
        condiciones.gridwidth =1;
        // definimos el alto de filas que tendra nuestro elemento.
        condiciones.gridheight =1;
        /*
         * las columnas y las filas se van definiendo segun las vayamos 
         * agregando, por ejemplo, si solo tenemos 3 columnas y agregamos
         * un elemento en la columna 8, dicho elemento pasara a estar
         * en la columna 4.
         */
        
        // definimos el ancho proporcional en la ventana.
        condiciones.weightx = 0.1;
        // definimos el alto proporcional en la ventana.
        condiciones.weighty = 0.1;
        /*
         * la propiedad "fill = GridBagConstraints.BOTH" hara crecer
         * ambos lados del elemento aunque la ventana cambie de tamaño.
         */
        condiciones.fill = GridBagConstraints.BOTH;
        // agregamos el elemento a la ventana.
        add(display,condiciones);
        condiciones.gridy = 1;
        add(resultado,condiciones);
        condiciones.gridy = 2;
        condiciones.weightx = 0.3;
        condiciones.weighty = 0.3;
        add(crearTeclado(),condiciones);
        resultado.addActionListener(this);
        
    }

    /**
     * Crea botones asignando un valor a cada uno, la accion para poder
     * escucharlos y los agrega a un contendor.
     * @return Contendor de botones.
     */
    private Container crearTeclado() {
        String valores[] = {"7","8","9","/","4","5","6","*","1","2","3","-","C","0",".","+"};
        teclas = new JButton[16];
        Container tec = new Container();
        tec.setLayout(new GridLayout(4,4));
        
        for (int i = 0; i < valores.length ; i++) {
            teclas[i] = new JButton(valores[i]);
            teclas[i].addActionListener(this);
            tec.add(teclas[i]);
        }
        return tec;
    }
    
    /**
     * se invoka cuando se procesa un evento y ejecuta su metodo correspiente.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == resultado){
            resultadoValores(datosUsuario);
            datosUsuario = Double.toString(rG);
            display.setText(datosUsuario);
            rG = 0.0;
        }
        
        for (int i = 0; i < teclas.length; i++) {
            if (e.getSource() == teclas[i]) {
                datosUsuario = datosUsuario=="0" ? "" : datosUsuario;
                datosUsuario += teclas[i].getText();
                display.setText(datosUsuario);
            }
        }

        if (e.getSource() == teclas[12]) {
            datosUsuario = "0";
            display.setText(datosUsuario);
        }
    }

    /**
     * Recibe un String separando cada caracter para concatenar valores y diferenciarlos de
     * operadores.
     * @param String datosUsuario
     */
    private void convertirDatos(String datosUsuario) {
        String aux = "";
        char elemento = ' ';
        for (int i = 0; i < datosUsuario.length(); i++) {
            elemento = datosUsuario.charAt(i);
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
    }

    /**
     * Recibe un String para realizar operaciones segun su contenido.
     * @param datosUsuario
     */
    private void resultadoValores(String datosUsuario){
        convertirDatos(datosUsuario);
        suma(Double.parseDouble(valores.poll()));
        while(!valores.isEmpty()){
            switch  (valores.poll()){
                case "+":
                    suma(Double.parseDouble(valores.poll()));
                    break;
                case "-":
                    resta(Double.parseDouble(valores.poll()));
                    break;
                case "*":
                    multiplica(Double.parseDouble(valores.poll()));
                    break;
                case "/":
                    divide(Double.parseDouble(valores.poll()));
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Divide un resultado global entre un valor double obtenido.
     * @param parseDouble
     */
    private void divide(double parseDouble) {
        rG /= parseDouble;
    }

    /**
     * Multiplica un resultado global por un valor double obtenido.
     * @param parseDouble
     */
    private void multiplica(double parseDouble) {
        rG *= parseDouble;
    }

    /**
     * Resta un resultado global menos un valor double obtenido.
     * @param parseDouble
     */
    private void resta(double parseDouble) {
        rG -= parseDouble;
    }

    /**
     * Suma un resultado global más un valor double obtenido.
     * @param parseDouble
     */
    private void suma(double parseDouble) {
        rG += parseDouble;
    }
}





