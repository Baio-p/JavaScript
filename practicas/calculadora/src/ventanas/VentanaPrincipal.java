package ventanas;

import java.awt.*;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

        JButton pos1 = new JButton("Algo");
        JButton pos2 = new JButton();
        JButton pos3 = new JButton();
        JButton pos4 = new JButton();
        JButton pos5 = new JButton();
    
    public VentanaPrincipal(String titulo){
        super(titulo);
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
        add(pos1,condiciones);

        condiciones.gridy = 1;
        add(pos2,condiciones);
        condiciones.gridy = 2;
        condiciones.weightx = 0.5;
        condiciones.weighty = 0.5;
        add(pos3,condiciones);
    }

    public void teclado() {
        char teclas[] = {
            '7','8','9','/','4','5','6','*','1','2','3','-','C','0','.','+'
        };
        setLayout(new GridLayout());
        for (int i = 0; i < teclas.length ; i++) {
            add(new JButton());
            
        }
    }
}
