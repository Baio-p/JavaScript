package layouts;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class GridBag extends JFrame implements ActionListener {
    JTextArea area;
    JScrollPane scroll;
    JTextField texto;
    JButton boton;
    JButton salir;
    public GridBag(String titulo){
        super(titulo);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // gridBag
        setLayout(new GridBagLayout());
        // especifica restricciones para los componentes
        GridBagConstraints gbc = new GridBagConstraints();
        // columna donde se posicona el componente
        gbc.gridx = 0;
        // fila
        gbc.gridy = 0;
        // ancho, cantidad de columnas
        gbc.gridwidth = 3;
        // cantidad de filas
        gbc.gridheight = 1;
        // define que tanto crecera cuando cresca la ventana
        gbc.weightx = 1.0;
        // el ancho en "y"
        gbc.weighty = 1.0;
        // modo en que crecera, ambos lados
        gbc.fill = GridBagConstraints.BOTH;
        area = new JTextArea();
        scroll = new JScrollPane(area);
        add(scroll,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        texto = new JTextField(20);
        add(texto,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        boton = new JButton("Enviar"); 
        add(boton,gbc);
        
        gbc.gridx = 2;
        salir = new JButton("Salir"); 
        add(salir,gbc);
        boton.addActionListener(this);
        salir.addActionListener(this);

        // evito que cambie el tamaño
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
            area.append(texto.getText()+"\n");
            texto.setText("");
        } 
        if(e.getSource() == salir){
            // cerrar programa
            System.exit(0);
        }
        
    }
}
