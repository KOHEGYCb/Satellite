package by.kutovoy.satellite.jFrames;

import by.kutovoy.satellite.beans.Satellite;
import by.kutovoy.satellite.beans.Satellites;
import javax.swing.JComboBox;

/**
 *
 * @author dmitry
 */
public class Remove extends javax.swing.JFrame {

    /**
     * Creates new form SatelliteRemove
     */
    public Remove() {
        initComponents();
//        jComboBox1 = new JComboBox<String>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnRemove = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setTitle("Remove");

        btnRemove.setText("Remove");
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMouseClicked(evt);
            }
        });

        btnCancel.setText("Update");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) { 
        Satellites.getINSTANCE().remove(Satellites.getElementByName((String) jComboBox1.getSelectedItem()));
//        System.out.println(jComboBox1.getSelectedItem());
    }                                      

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {                                       
        jComboBox1.removeAllItems();
        for (Satellite satellite : Satellites.getINSTANCE()) {
            jComboBox1.addItem(satellite.getName());
        }
    }                                      

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration                   
}
