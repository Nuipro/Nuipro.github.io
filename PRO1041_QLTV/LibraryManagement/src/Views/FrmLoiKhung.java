/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

/**
 *
 * @author Admin
 */
public class FrmLoiKhung extends javax.swing.JPanel {

    /**
     * Creates new form FrmLoiKhung
     */
    public FrmLoiKhung() {
        initComponents();
    }
    
    public void setDisplay(String tenLoi){
        chkLoi.setText(tenLoi);
    }
    public boolean check(){
        return chkLoi.isSelected();
    }
    public String getTen(){
        return chkLoi.getText();
    }
    public void setTen(String ten){
         chkLoi.setText(ten);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkLoi = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(300, 41));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 0));

        chkLoi.setBackground(new java.awt.Color(255, 255, 255));
        chkLoi.setText("Tên lỗi gì gì đó!");
        chkLoi.setPreferredSize(new java.awt.Dimension(270, 38));
        add(chkLoi);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox chkLoi;
    // End of variables declaration//GEN-END:variables
}
