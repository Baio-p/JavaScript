import java.awt.*;
import javax.swing.*;

public class Componentes extends JFrame {
    public Componentes() {
        super("Componentes");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2,30,5));
        JLabel lblboton = new JLabel("JButton");
        JLabel lbletiqueta = new JLabel("JLabel");
        JLabel lbltexto = new JLabel("JTextField");
        JLabel lblcheck = new JLabel("JCheckBox");
        JLabel lblradio = new JLabel("JRadioButton");
        JButton boton = new JButton("Bóton");
        JLabel etiqueta = new JLabel("Etiqueta: ");
        JTextField texto = new JTextField("Texto");
        JCheckBox cbox = new JCheckBox("Caja de verificación");
        JRadioButton rbtn = new JRadioButton("Botones de radio");
        add(boton);
        add(lblboton);
        add(etiqueta);
        add(lbletiqueta);
        add(texto);
        add(lbltexto);
        add(cbox);
        add(lblcheck);
        add(rbtn);
        add(lblradio);
    }
}
