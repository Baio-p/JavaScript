package layouts;
import javax.swing.*;

public class LayoutNull extends JFrame {
    int left,top,width,height;
    public LayoutNull(String titulo){
        super(titulo);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // podremos colocar el componente manualmente
        setLayout(null);
        // componente
        JButton btn = new JButton("botón");
        // inicializamos los valores
        left=0;top=0;width=100;height=20;
        btn.setBounds(left,top,width,height);
        add(btn);
        
    }    
}
