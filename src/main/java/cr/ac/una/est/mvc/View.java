package cr.ac.una.est.mvc;

public class View extends javax.swing.JPanel {
    public View() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        Red = new javax.swing.JButton();
        Green = new javax.swing.JButton();
        Yellow = new javax.swing.JButton();
        Blue = new javax.swing.JButton();

        Red.setText("Rojo");
        Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedActionPerformed(evt);
            }
        });

        Green.setText("Verde");

        Yellow.setText("Amarillo");

        Blue.setText("Azul");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(Yellow)
                        .addGap(18, 18, 18)
                        .addComponent(Blue))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(Red)
                        .addGap(18, 18, 18)
                        .addComponent(Green)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Red)
                    .addComponent(Green))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yellow)
                    .addComponent(Blue))
                .addContainerGap(133, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blue;
    private javax.swing.JButton Green;
    private javax.swing.JButton Red;
    private javax.swing.JButton Yellow;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
