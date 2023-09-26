package cr.ac.una.est.proyecto_1.Presentation;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import cr.ac.una.est.proyecto_1.Proyecto_1;
import java.awt.Color;

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
    public JTextField getText(){return cantSeqText;}
//------------------------------------------------------------------------------
    private boolean valid(){
        boolean isValid = true;
        
        if(cantSeqText.getText().isEmpty()){
            cantSeqText.setToolTipText("0");
            isValid = false;
        } else {
            cantSeqText.setToolTipText(null);
        }
        
        return isValid;
    }
    @Override
    public void update(Observable updatedModel, Object properties){
        int changedProps = (int) properties;
        
        if ((changedProps & Model.CURRENT) == Model.CURRENT) {
            cantSeqText.setText("Cantidad de secuencias: " + String.valueOf(_model.getCola().size()));
        }
        if(_model.getMode()==Proyecto_1.MODE_EDIT){
            start.setEnabled(false);
            cantSeqText.setEnabled(true);
        } else {
            start.setEnabled(true);
            cantSeqText.setEnabled(false);
        }
        
        this.mainPanel.revalidate();
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
        save = new javax.swing.JButton();
        cantSeqText = new javax.swing.JTextField();
        start = new javax.swing.JButton();

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        Red.setIcon(new javax.swing.ImageIcon("C:\\Users\\Malcolm\\Desktop\\Universidad\\Estructuras\\Estructuras de Datos\\Proyectos\\Proyecto I\\Proyecto_1\\src\\main\\resources\\cr\\ac\\una\\est\\proyecto_1\\presentation\\images\\Red.png")); // NOI18N
        Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedActionPerformed(evt);
            }
        });

        Green.setIcon(new javax.swing.ImageIcon("C:\\Users\\Malcolm\\Desktop\\Universidad\\Estructuras\\Estructuras de Datos\\Proyectos\\Proyecto I\\Proyecto_1\\src\\main\\resources\\cr\\ac\\una\\est\\proyecto_1\\presentation\\images\\Green.png")); // NOI18N

        Yellow.setIcon(new javax.swing.ImageIcon("C:\\Users\\Malcolm\\Desktop\\Universidad\\Estructuras\\Estructuras de Datos\\Proyectos\\Proyecto I\\Proyecto_1\\src\\main\\resources\\cr\\ac\\una\\est\\proyecto_1\\presentation\\images\\Yellow.png")); // NOI18N

        Blue.setIcon(new javax.swing.ImageIcon("C:\\Users\\Malcolm\\Desktop\\Universidad\\Estructuras\\Estructuras de Datos\\Proyectos\\Proyecto I\\Proyecto_1\\src\\main\\resources\\cr\\ac\\una\\est\\proyecto_1\\presentation\\images\\Blue.png")); // NOI18N
        Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueActionPerformed(evt);
            }
        });

        save.setText("Ingresar Secuencia");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cantSeqText.setBackground(new java.awt.Color(204, 204, 204));
        cantSeqText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantSeqTextActionPerformed(evt);
            }
        });

        start.setText("Iniciar");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(170, 170, 170)
                        .addComponent(cantSeqText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(start)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Red, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Yellow, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Green, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Blue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Green)
                    .addComponent(Red))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Blue)
                    .addComponent(Yellow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantSeqText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(start))
                    .addComponent(save))
                .addGap(0, 8, Short.MAX_VALUE))
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

    private void RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedActionPerformed
        
    }//GEN-LAST:event_RedActionPerformed

    private void BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BlueActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
    }//GEN-LAST:event_saveActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        _controller.createSequences(Proyecto_1.cantSec);
        Proyecto_1.cantSec++;
    }//GEN-LAST:event_startActionPerformed

    private void cantSeqTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantSeqTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantSeqTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blue;
    private javax.swing.JButton Green;
    private javax.swing.JButton Red;
    private javax.swing.JButton Yellow;
    private javax.swing.JTextField cantSeqText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton save;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
