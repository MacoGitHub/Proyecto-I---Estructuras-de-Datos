package cr.ac.una.est.proyecto_1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Proyecto_1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (Exception ex) {};
        
        window = new JFrame();
        
        cr.ac.una.est.proyecto_1.Presentation.Model model = new cr.ac.una.est.proyecto_1.Presentation.Model();
        cr.ac.una.est.proyecto_1.Presentation.View view = new cr.ac.una.est.proyecto_1.Presentation.View();
        controller = new cr.ac.una.est.proyecto_1.Presentation.Controller(view, model);
        
        window.getContentPane().add(view.getPanel());
        
        window.setSize(700,600);
        window.setResizable(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Simon");
        window.setVisible(true);
    }
    public static cr.ac.una.est.proyecto_1.Presentation.Controller controller;
    public static int MODE_EDIT = 2;
    public static JFrame window;
    //public static int cantSec;
}
