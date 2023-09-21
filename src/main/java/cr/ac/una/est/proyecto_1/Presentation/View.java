package cr.ac.una.est.proyecto_1.Presentation;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JPanel;
import cr.ac.una.est.proyecto_1.Proyecto_1;

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
        int changedProps = (int) properties;
        
//        if(_model.getMode()==Proyecto_1.MODE_EDIT){
//            
//        }
        
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
        saveSequence = new javax.swing.JButton();
        cantSeqText = new javax.swing.JTextField();

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

        saveSequence.setText("Ingresar");

        cantSeqText.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Red, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Yellow, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Green, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Blue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(saveSequence)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cantSeqText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(saveSequence))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(cantSeqText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_RedActionPerformed

    private void BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BlueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blue;
    private javax.swing.JButton Green;
    private javax.swing.JButton Red;
    private javax.swing.JButton Yellow;
    private javax.swing.JTextField cantSeqText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton saveSequence;
    // End of variables declaration//GEN-END:variables
}
