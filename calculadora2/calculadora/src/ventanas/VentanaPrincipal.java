package ventanas;
import java.awt.*;
import javax.swing.*;

import funciones.Funciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class VentanaPrincipal extends JFrame implements ActionListener {

    JTextField display = new JTextField("0");
    JButton resultado = new JButton("RESULTADO");
    JButton teclas[];
    String datosUsuario = "0";
    double auxRes = 0.0;

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
        setLayout(new GridBagLayout());
        GridBagConstraints condiciones = new GridBagConstraints();
        condiciones.gridx = 0;
        condiciones.gridy = 0;
        condiciones.gridwidth =1;
        condiciones.gridheight =1;
        condiciones.weightx = 0.1;
        condiciones.weighty = 0.1;
        condiciones.fill = GridBagConstraints.BOTH;
        add(display,condiciones);
        condiciones.gridy = 1;
        add(resultado,condiciones);
        condiciones.gridy = 2;
        condiciones.weightx = 0.3;
        condiciones.weighty = 0.3;
        add(crearTeclado(),condiciones);
        resultado.addActionListener(this);
    }

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

        if (e.getSource() == resultado) {
            Funciones.resultadoValores(datosUsuario);
            

        }


    }
}
