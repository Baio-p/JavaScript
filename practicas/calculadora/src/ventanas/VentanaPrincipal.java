package ventanas;

import java.awt.*;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

        JButton pos1 = new JButton("Algo");
        JButton pos2 = new JButton();
        JButton pos3 = new JButton();
    
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
    
        GridBagConstraints condiciones = new GridBagConstraints();

        // 
        condiciones.gridx = 0;
        condiciones.gridy = 0;
        condiciones.gridwidth =1;
        condiciones.gridheight =1;
        condiciones.weightx = 0.1;
        condiciones.weighty = 0.1;
        condiciones.fill = GridBagConstraints.BOTH;
        add(pos1,condiciones);
        condiciones.gridy = 1;
        add(pos2,condiciones);
        condiciones.gridy = 2;
        condiciones.weightx = 0.8;
        condiciones.weighty = 0.8;
        add(pos3,condiciones);
    }
}
