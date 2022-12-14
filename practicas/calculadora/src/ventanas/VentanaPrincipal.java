package ventanas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class VentanaPrincipal extends JFrame implements ActionListener {

    JTextField display = new JTextField("0");
    JButton resultado = new JButton("RESULTADO");
    JButton teclas[];
    String datosUsuario = "0";
    Queue<String> paConvertir = new LinkedList<String>();
    double rG;
    
    public VentanaPrincipal(String titulo){
        super(titulo);
        rG = 0.0;
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        disenioElementos();
    }

    public void disenioElementos (){
        // definimos el tipo de layoot para acomodar los elementos
        /*
        GridLayout crea un enrrejado que se puede manipular en cantidad de celdas,
        tamaño de lasceldas y en cual celda pondremos cada elemeto.
        */ 
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
        
        /*
         * definimos el tamaño proporcional del elemento con respecto a
         * nuestra ventana donde 1.0 es el tamaño completo de la misma.
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
     * asdfasdfsadf
     * @return sadfasdf
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
                System.out.println(teclas[i].getText());
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
     * 
     * @param datosUsuario
     */
    private void convertirDatos(String datosUsuario) {
        String aux = "";
        char elemento = ' ';
        //26519849
        for (int i = 0; i < datosUsuario.length(); i++) {
            elemento = datosUsuario.charAt(i);
            if (elemento != '+' && elemento != '-' &&  elemento != '*' && elemento != '/'){
                aux += elemento;
            } else{
                paConvertir.add(aux);
                paConvertir.add(Character.toString(elemento));
                aux ="";
            }
        }
        if(aux != ""){
            paConvertir.add(aux);
        }
        System.out.println(paConvertir);
    }

    /**
     * 
     * @param datosUsuario
     */
    private void resultadoValores(String datosUsuario){ //[56,*,5,+,7]
        convertirDatos(datosUsuario);
        suma(Double.parseDouble(paConvertir.poll()));
        while(!paConvertir.isEmpty()){
            switch  (paConvertir.poll()){
                case "+":
                    suma(Double.parseDouble(paConvertir.poll()));
                    break;
                case "-":
                    resta(Double.parseDouble(paConvertir.poll()));
                    break;
                case "*":
                    multiplica(Double.parseDouble(paConvertir.poll()));
                    break;
                case "/":
                    divide(Double.parseDouble(paConvertir.poll()));
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * 
     * @param parseDouble
     */
    private void divide(double parseDouble) {
        rG /= parseDouble;
    }

    private void multiplica(double parseDouble) {
        rG *= parseDouble;
    }

    private void resta(double parseDouble) {
        rG -= parseDouble;
    }

    private void suma(double parseDouble) {
        rG += parseDouble;
    }
}





