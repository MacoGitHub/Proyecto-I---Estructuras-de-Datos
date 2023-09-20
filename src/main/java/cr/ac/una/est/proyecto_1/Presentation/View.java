package cr.ac.una.est.proyecto_1.Presentation;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JPanel;

public class View extends javax.swing.JPanel implements Observer{
    public View() {
        initComponents();
    }
//------------------------------------------------------------------------------
    Model _model;
    Controller _controller;
//------------------------------------------------------------------------------
    public void setModel(Model model) { this._model = model; }
    public void setController(Controller controller){ this._controller = controller; }
    public JPanel getPanel(){return mainPanel;}
//------------------------------------------------------------------------------
    @Override
    public void update(Observable updatedModel, Object properties){
        
    }
    
//------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        Red = new javax.swing.JButton();
        Green = new javax.swing.JButton();
        Yellow = new javax.swing.JButton();
        Blue = new javax.swing.JButton();

        Red.setText("Rojo");

        Green.setText("Verde");

        Yellow.setText("Amarillo");

        Blue.setText("Azul");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(Yellow)
                        .addGap(18, 18, 18)
                        .addComponent(Blue))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(Red)
                        .addGap(18, 18, 18)
                        .addComponent(Green)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Red)
                    .addComponent(Green))
                .addGap(37, 37, 37)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yellow)
                    .addComponent(Blue))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blue;
    private javax.swing.JButton Green;
    private javax.swing.JButton Red;
    private javax.swing.JButton Yellow;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
