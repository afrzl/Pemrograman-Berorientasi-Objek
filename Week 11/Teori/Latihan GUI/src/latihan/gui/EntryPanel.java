/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package latihan.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author muham
 */
public class EntryPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntryPanel
     */
    public EntryPanel() {
        initComponents();
        clearForm();
        loadTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jkButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        provinsiComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        membacaCheckBox = new javax.swing.JCheckBox();
        menyanyiCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nimTextField = new javax.swing.JTextField();
        namaTextField = new javax.swing.JTextField();
        lakiRadioButton = new javax.swing.JRadioButton();
        perempuanRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        berenangCheckBox = new javax.swing.JCheckBox();
        umurSpinner = new javax.swing.JSpinner();
        simpanButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mahasiswaTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jLabel5.setText("tahun");

        jLabel6.setText("Alamat :");

        alamatTextArea.setColumns(20);
        alamatTextArea.setRows(5);
        jScrollPane1.setViewportView(alamatTextArea);

        jLabel7.setText("Provinsi :");

        provinsiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceh", "DKI Jakarta", "Jawa Timur", "Bali", "Maluku", "Papua" }));

        jLabel8.setText("Hobi :");

        membacaCheckBox.setText("Membaca");

        menyanyiCheckBox.setText("Menyanyi");

        jLabel1.setText("NIM :");

        jLabel2.setText("Jenis Kelamin :");

        jLabel3.setText("Nama :");

        jkButtonGroup.add(lakiRadioButton);
        lakiRadioButton.setText("Laki-laki");

        jkButtonGroup.add(perempuanRadioButton);
        perempuanRadioButton.setText("Perempuan");

        jLabel4.setText("Umur :");

        berenangCheckBox.setText("Berenang");

        umurSpinner.setModel(new javax.swing.SpinnerNumberModel(15, 10, 60, 1));

        simpanButton.setBackground(new java.awt.Color(0, 100, 0));
        simpanButton.setForeground(new java.awt.Color(255, 255, 255));
        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simpanButton)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(berenangCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menyanyiCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(perempuanRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lakiRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(nimTextField))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(provinsiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(membacaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(simpanButton)
                    .addComponent(deleteButton))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lakiRadioButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(perempuanRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(provinsiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(membacaCheckBox))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(menyanyiCheckBox)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(berenangCheckBox)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        mahasiswaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Umur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mahasiswaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mahasiswaTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mahasiswaTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        Mahasiswa mhs = new Mahasiswa();
        if (validation()) {
            mhs.setNim(nimTextField.getText());
            mhs.setNama(namaTextField.getText());
            if(lakiRadioButton.isSelected()) {
                mhs.setJenisKelamin("Laki-laki");
            }
            if(perempuanRadioButton.isSelected()) {
                mhs.setJenisKelamin("Perempuan");
            }
            int umur = (Integer) umurSpinner.getValue();
            mhs.setUmur(umur);
            mhs.setAlamat(alamatTextArea.getText());

            mhs.setProvinsi(provinsiComboBox.getSelectedItem().toString());
            ArrayList<String> hobiList = new ArrayList<>();
            if(membacaCheckBox.isSelected()) {
                hobiList.add("membaca");
            }
            if(menyanyiCheckBox.isSelected()) {
                hobiList.add("menyanyi");
            }
            if(berenangCheckBox.isSelected()) {
                hobiList.add("berenang");
            }
            mhs.setHobi(hobiList);

            try {
                if (Database.getInstance().getMahasiswa(mhs.getNim()) == null) {
                    Database.getInstance().insertMahasiswa(mhs);
                } else {
                    Database.getInstance().updateMahasiswa(mhs);
                }
                clearForm();
                JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
                loadTableData();
            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data.", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lengkapi semua isian.", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private boolean validation() {
        if (nimTextField.getText() == "" || namaTextField.getText() == "" || !(lakiRadioButton.isSelected() || perempuanRadioButton.isSelected()) || (Integer)umurSpinner.getValue() < 15 || alamatTextArea.getText() == "" || provinsiComboBox.getSelectedIndex() < 0) {
            return false;
        }
        return true;
    }

    private void mahasiswaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahasiswaTableMouseClicked
        // TODO add your handling code here:
        String nim = mahasiswaTable.getValueAt(mahasiswaTable.getSelectedRow(),0).toString();
        try {
            Mahasiswa mhs = Database.getInstance().getMahasiswa(nim);
            clearForm();
            deleteButton.setVisible(true);
            resetButton.setVisible(true);
            nimTextField.setEditable(false);

            nimTextField.setText(mhs.getNim());
            namaTextField.setText(mhs.getNama());
            if (mhs.getJenisKelamin().equals("Laki-laki")) {
                lakiRadioButton.setSelected(true);
            } else  {
                perempuanRadioButton.setSelected(true);
            }
            umurSpinner.setValue(mhs.getUmur());
            alamatTextArea.setText(mhs.getAlamat());
            provinsiComboBox.setSelectedItem(mhs.getProvinsi());

            mhs.getHobi().forEach((hobi) -> {
                if (hobi.equals("membaca")) {
                    membacaCheckBox.setSelected(true);
                }
                if (hobi.equals("menyanyi")) {
                    menyanyiCheckBox.setSelected(true);
                }
                if (hobi.equals("berenang")) {
                    berenangCheckBox.setSelected(true);
                }
            });

        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data.", "Gagal", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_mahasiswaTableMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah kamu yakin akan menghapus data?");
        if (confirm == 0) {
            try {
                Database.getInstance().deleteMahasiswa(nimTextField.getText());
                clearForm();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
                loadTableData();
            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(this, "Gagal menghapus data.", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void loadTableData() {
        DefaultTableModel dtm = (DefaultTableModel) mahasiswaTable.getModel();
        
        //refresh table
        while(dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        
        //isi tabel
        try {
            for(Mahasiswa mhs : Database.getInstance().getListMahasiswa()) {
                dtm.addRow(new Object[]{mhs.getNim(), mhs.getNama(), mhs.getJenisKelamin(), mhs.getUmur()});
            }
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data.", "Gagal", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private void clearForm() {
        nimTextField.setEditable(true);
        nimTextField.setText("");
        namaTextField.setText("");
        jkButtonGroup.clearSelection();
        umurSpinner.setValue(15);
        alamatTextArea.setText("");
        provinsiComboBox.setSelectedIndex(-1);
        membacaCheckBox.setSelected(false);
        menyanyiCheckBox.setSelected(false);
        berenangCheckBox.setSelected(false);

        deleteButton.setVisible(false);
        resetButton.setVisible(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatTextArea;
    private javax.swing.JCheckBox berenangCheckBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jkButtonGroup;
    private javax.swing.JRadioButton lakiRadioButton;
    private javax.swing.JTable mahasiswaTable;
    private javax.swing.JCheckBox membacaCheckBox;
    private javax.swing.JCheckBox menyanyiCheckBox;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JRadioButton perempuanRadioButton;
    private javax.swing.JComboBox<String> provinsiComboBox;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton simpanButton;
    private javax.swing.JSpinner umurSpinner;
    // End of variables declaration//GEN-END:variables
}
