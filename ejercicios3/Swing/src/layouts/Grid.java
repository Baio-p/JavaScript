package layouts;
import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame{
    public Grid(String titulo){
        super(titulo);
        int filas,columnas,sepH,sepV;
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // definimos el grid 
        filas = 4;columnas=3;sepH = 2;sepV = 2;
        setLayout(new GridLayout(filas,columnas,sepH,sepV));
        // creamos 9 botones, # elementos filas*columnas
        for(int i = 1;i<10;i++){
            add(new JButton(Integer.toString(i)));
        }
        add(new JButton("*"));
        add(new JButton("0"));
        add(new JButton("#"));
    }
}
