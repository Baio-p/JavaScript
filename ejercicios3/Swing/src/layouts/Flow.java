package layouts;

import javax.swing.*;
import java.awt.*;

public class Flow extends JFrame {
    public Flow(String titulo) {
        setTitle(titulo);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // defenimos el layout
        setLayout(new FlowLayout());
        add(new TextField("texto"));
        add(new TextField("...", 8));
        add(new Button("botón"));
        add(new Label("etiqueta"));
        add(new Checkbox("interruptor"));
        Choice ch = new Choice();
        ch.add("uno");
        ch.add("dos");
        ch.add("tres");
        add(ch);
        add(new TextArea(5, 10));
        CheckboxGroup g = new CheckboxGroup();
        add(new Checkbox("si", g, true));
        add(new Checkbox("no", g, false));
        add(new Checkbox("tal vez", g, false));
        List l = new List(4, true);
        l.add("uno");
        l.add("dos");
        l.add("tres");
        l.add("cuatro");
        l.add("cinco");
        l.add("seis");
        add(l);
    }
}
