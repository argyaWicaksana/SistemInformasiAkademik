/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sisteminformasiakademik;
import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ar
 */
public class SistemInformasiAkademik extends javax.swing.JFrame {

    /**
     * Creates new form SistemInformasiAkademik
     */
    public SistemInformasiAkademik() {
        initComponents();
        showData();
        searchScore("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioL = new javax.swing.JRadioButton();
        radioP = new javax.swing.JRadioButton();
        txtNISN = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTglLahir = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNISN2 = new javax.swing.JTextField();
        txtNilai = new javax.swing.JTextField();
        saveButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        scoreTable = new javax.swing.JTable();
        cbMapel = new javax.swing.JComboBox<>();
        txtSearch2 = new javax.swing.JTextField();
        searchButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("NISN");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("Kelas");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Tgl Lahir");

        radioL.setText("Laki - laki");
        radioL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLActionPerformed(evt);
            }
        });

        radioP.setText("Perempuan");
        radioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPActionPerformed(evt);
            }
        });

        txtNISN.setToolTipText("");
        txtNISN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNISNActionPerformed(evt);
            }
        });

        txtKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKelasActionPerformed(evt);
            }
        });

        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NISN", "Nama", "Kelas", "Nilai rata-rata", "Rank"
            }
        ));
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentTable);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("sort by");

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rank", "Class" }));
        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNISN)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioL)
                                .addGap(18, 18, 18)
                                .addComponent(radioP))
                            .addComponent(txtNama)
                            .addComponent(txtTglLahir)
                            .addComponent(txtAlamat)
                            .addComponent(txtKelas)))
                    .addComponent(deleteButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioL)
                    .addComponent(radioP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(jLabel7)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Siswa", jPanel1);

        jLabel8.setText("NISN");

        jLabel9.setText("Mapel");

        jLabel10.setText("Nilai");

        saveButton2.setText("Save");
        saveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton2ActionPerformed(evt);
            }
        });

        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NISN", "Mapel", "Nilai"
            }
        ));
        scoreTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(scoreTable);

        cbMapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BI", "BIG", "IPA", "MM" }));
        cbMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMapelActionPerformed(evt);
            }
        });

        searchButton2.setText("Search");
        searchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNISN2)
                            .addComponent(cbMapel, 0, 160, Short.MAX_VALUE)
                            .addComponent(txtNilai)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(saveButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNISN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton2)
                    .addComponent(jButton3))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nilai", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLActionPerformed
        radioP.setSelected(false);
    }//GEN-LAST:event_radioLActionPerformed

    private void txtNISNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNISNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNISNActionPerformed

    private void txtKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKelasActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
        int row = studentTable.getSelectedRow();
        
        Siswa siswa = new Siswa().getById(model.getValueAt(row, 0).toString());
        siswa.delete();
        showData();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
        int row = studentTable.getSelectedRow();
        String nisn = model.getValueAt(row, 0).toString();
        
        Siswa siswa = new Siswa().getById(nisn);
        txtNISN.setText(siswa.getId());
        txtNama.setText(siswa.getName());
        txtAlamat.setText(siswa.getAddress());
        txtKelas.setText(siswa.getKelas());
        txtTglLahir.setText(siswa.getBirthDate());
        if(siswa.getGender() == 'L') {
            radioL.setSelected(true);
            radioP.setSelected(false);
        }
        else {
            radioP.setSelected(true);
            radioL.setSelected(false);
        }
        
    }//GEN-LAST:event_studentTableMouseClicked

    private void radioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPActionPerformed
        radioL.setSelected(false);
    }//GEN-LAST:event_radioPActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Siswa siswa = new Siswa();
        siswa.setId(txtNISN.getText());
        siswa.setName(txtNama.getText());
        siswa.setKelas(txtKelas.getText());
        siswa.setAddress(txtAlamat.getText());
        siswa.setBirthDate(txtTglLahir.getText());
        if(radioL.isSelected()) siswa.setGender('L');
        else siswa.setGender('P');
        
        if(studentTable.getSelectionModel().isSelectionEmpty()){
            siswa.save();
        } else {
            siswa.update();
        }

        showData();
        resetForm();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String[] col ={"NISN", "Nama", "Kelas", "Nilai rata-rata", "Rank"};
        ArrayList<Siswa> listSiswa = new Siswa().search(txtSearch.getText());
        Object rowData[] = new Object[5];
        
        studentTable.setModel(new DefaultTableModel(new Object[][] {}, col));
        
        for(Siswa s : listSiswa){
            rowData[0] = s.getId();
            rowData[1] = s.getName();
            rowData[2] = s.getKelas();
            rowData[3] = s.getNilaiRata();
            rowData[4] = s.getRank();
                  
            ((DefaultTableModel)studentTable.getModel()).addRow(rowData);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        if(cb1.getSelectedItem().toString().equals("Rank")){
            showData();
        } else {
            showDataSortByClass();
        }
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged

    }//GEN-LAST:event_cb1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        resetForm2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMapelActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        if(jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex()).equals("Nilai")){
            
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void searchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton2ActionPerformed
        searchScore(txtSearch2.getText());
    }//GEN-LAST:event_searchButton2ActionPerformed

    private void scoreTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)scoreTable.getModel();
        int row = scoreTable.getSelectedRow();
        String nisn = model.getValueAt(row, 0).toString();
        String mapel = model.getValueAt(row, 1).toString();
        String nilai = model.getValueAt(row, 2).toString();
        
        txtNISN2.setText(nisn);
        txtNilai.setText(nilai);
        cbMapel.setSelectedItem(mapel);
    }//GEN-LAST:event_scoreTableMouseClicked

    private void saveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton2ActionPerformed
        
        Siswa siswa = new Siswa();
        siswa.setId(txtNISN2.getText());
        Pelajaran mapel = new Pelajaran();
        mapel.setIdMapel(cbMapel.getSelectedItem().toString());
        
        Nilai nilai = new Nilai(Double.parseDouble(txtNilai.getText()), siswa, mapel);

        nilai.insertNilai();
        resetForm2();
        searchScore(siswa.getId());
    }//GEN-LAST:event_saveButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void searchScore(String keyword){
        String[] col = {"NISN", "Mapel", "Nilai"};
        ArrayList<Nilai> nilai = new Nilai().search(keyword);
        Object rowData[] = new Object[3];
        
        scoreTable.setModel(new DefaultTableModel(new Object[][] {}, col));
        
        for(Nilai n : nilai){
            rowData[0] = n.getSiswa().getId();
            rowData[1] = n.getMapel().getIdMapel();
            rowData[2] = n.getNilai();
            
            ((DefaultTableModel)scoreTable.getModel()).addRow(rowData);
        }
    }
    
    public void showData(){
        String[] col ={"NISN", "Nama", "Kelas", "Nilai rata-rata", "Rank"};
        ArrayList<Siswa> listSiswa = new Siswa().getAll();
        Object rowData[] = new Object[5];
        
        studentTable.setModel(new DefaultTableModel(new Object[][] {}, col));
        
        for(Siswa s : listSiswa){
            rowData[0] = s.getId();
            rowData[1] = s.getName();
            rowData[2] = s.getKelas();
            rowData[3] = s.getNilaiRata();
            rowData[4] = s.getRank();
                  
            ((DefaultTableModel)studentTable.getModel()).addRow(rowData);
        }
    }
    
    public void showDataSortByClass(){
        String[] col ={"NISN", "Nama", "Kelas", "Nilai rata-rata", "Rank"};
        ArrayList<Siswa> listSiswa = new Siswa().getAllByClass();

        Object rowData[] = new Object[5];
        
        studentTable.setModel(new DefaultTableModel(new Object[][] {}, col));
        
        for(Siswa s : listSiswa){
            rowData[0] = s.getId();
            rowData[1] = s.getName();
            rowData[2] = s.getKelas();
            rowData[3] = s.getNilaiRata();
            rowData[4] = s.getRank();

            ((DefaultTableModel)studentTable.getModel()).addRow(rowData);
        }
    }
    
    public void resetForm(){
        txtNISN.setText("");
        txtNama.setText("");
        txtKelas.setText("");
        txtAlamat.setText("");
        txtTglLahir.setText("");
        
        radioL.setSelected(false);
        radioP.setSelected(false);
        studentTable.clearSelection();
    }
    
    public void resetForm2(){
        txtNISN2.setText("");
        txtNilai.setText("");
        cbMapel.setSelectedItem("BI");
        scoreTable.clearSelection();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemInformasiAkademik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemInformasiAkademik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemInformasiAkademik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemInformasiAkademik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemInformasiAkademik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cbMapel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioL;
    private javax.swing.JRadioButton radioP;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton2;
    private javax.swing.JTable scoreTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchButton2;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNISN;
    private javax.swing.JTextField txtNISN2;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNilai;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearch2;
    private javax.swing.JTextField txtTglLahir;
    // End of variables declaration//GEN-END:variables
}
