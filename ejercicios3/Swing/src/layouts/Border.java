package layouts;

import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
    int sepH=0,sepV=0;
    public Border(String titulo){
        setTitle(titulo);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // definimos el layout
        setLayout(new BorderLayout());
        // agregamos componentes
        add("North",new TextField("Norte"));
        add("South",new TextField("Sur"));
        add("East",new JButton("Este"));
        add("West",new JButton("Oeste"));
        Label lbl= new Label("Centro");
        lbl.setAlignment(Label.CENTER);
        add("Center",lbl);
    }

}
