
package PendataanSekolah;

import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;



/**
 *
 * @author sherina laraswati
 */
public class Pendataan extends javax.swing.JFrame {
    DefaultTableModel model;
    
    public Pendataan() {
        initComponents();
        
        String []penamaan = {"Nama", "Kelas", "NISN", "Alamat", "JENIS KELAMIN","Tempat Tanggal Lahir"};
        model = new DefaultTableModel(penamaan,0);
        Tabel1.setModel(model);
        HasilData();
        
        Tabel1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int selectedRow = Tabel1.getSelectedRow();
                if(selectedRow != -1){
                    txtnma.setText(model.getValueAt(selectedRow, 0).toString());
                    cmbKelas.setSelectedItem(model.getValueAt(selectedRow, 1).toString());
                    txtNomer.setText(model.getValueAt(selectedRow, 2).toString());
                    txtalmt.setText(model.getValueAt(selectedRow, 3).toString());
                    String gender = model.getValueAt(selectedRow, 4).toString();
                    txtTTL.setText(model.getValueAt(selectedRow, 5).toString());
                   
                    if(gender.equals("Perempuan")){
                        rbWanita.setSelected(true);
                    }else if (gender.equals("Laki-Laki")){
                        rbPria.setSelected(true);
                    }
                    txtNomer.setEditable(true);
                }
            }
        });
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomerK = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnma = new javax.swing.JTextField();
        rbWanita = new javax.swing.JRadioButton();
        txtalmt = new javax.swing.JTextField();
        cmbKelas = new javax.swing.JComboBox<>();
        txtNomer = new javax.swing.JTextField();
        rbPria = new javax.swing.JRadioButton();
        txtTTL = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();
        btnDel = new javax.swing.JButton();
        btnSend1 = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        btnExt = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();

        jButton1.setText("jButton1");

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
        setTitle("Landing Page");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l.setText("-- Tabel Pendataan Siswa Sekolah --");

        l1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l1.setText("-- Pendataan Siswa Sekolah --");

        txtNama.setText("Nama ");

        jLabel2.setText("Kelas");

        txtNomerK.setText("NISN");

        txtAlamat.setText("Alamat");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Tempat, Tanggal-Lahir");

        rbWanita.setText("Perempuan");

        cmbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIPA 1", "MIPA 2", "MIPA 3", "Sosial 1", "Sosial 2", " " }));
        cmbKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKelasActionPerformed(evt);
            }
        });

        rbPria.setText("Laki-Laki");

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        jScrollPane2.setViewportView(Tabel1);

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnSend1.setText("Send");
        btnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend1ActionPerformed(evt);
            }
        });

        btnUp.setText("Update");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        btnExt.setText("Exit");
        btnExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbWanita, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtTTL, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSend1))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtalmt)
                                                    .addComponent(txtNomer)
                                                    .addComponent(cmbKelas, 0, 116, Short.MAX_VALUE)
                                                    .addComponent(txtnma))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnBatal)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnUp)
                                            .addComponent(btnExt)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbPria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomerK))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(btnDel)
                        .addContainerGap(22, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama)
                    .addComponent(btnBatal)
                    .addComponent(btnExt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomerK))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamat)
                    .addComponent(txtalmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbWanita)
                    .addComponent(rbPria))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSend1)
                            .addComponent(btnUp)
                            .addComponent(btnDel))
                        .addGap(55, 55, 55)))
                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend1ActionPerformed
        // TODO add your handling code here:
        String gender = "-";
        String nama = txtnma.getText();
        String kelas = (String) cmbKelas.getSelectedItem();
        String nisn = txtNomer.getText();
        String alamat = txtalmt.getText();
        String TTL = txtTTL.getText();
        
        if (nama.isEmpty() || kelas.isEmpty() || nisn.isEmpty() || alamat.isEmpty() || gender.isEmpty()|| TTL.isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if (rbWanita.isSelected()) {
                gender = "Perempuan";
            } else if (rbPria.isSelected()) {
                gender = "Laki-Laki";
            } try {
                int nomerKartu = Integer.parseInt(nisn);

                try (Connection conn = koneksi.getkoneksi()) {
                    Statement stnt = conn.createStatement();
                    String query = "SELECT * FROM datasekolah WHERE nomer_kartu = " + nomerKartu;
                    ResultSet rs = stnt.executeQuery(query);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Nomer Kartu Telah Terdaftar", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        query = "INSERT INTO datasekolah (nama, kelas, nomer_kartu, alamat, gender, ttl) VALUES ('" + nama + "','" + kelas + "'," + nomerKartu + ",'"
                                + alamat + "','" + gender + "','" + TTL + "')";
                        stnt.executeUpdate(query);
                        JOptionPane.showMessageDialog(this, "Data Siswa Dengan Nomer Kartu " + nomerKartu + " Berhasil Ditambahkan", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }del();
                } catch (SQLException ex) {
                    System.out.println("Data Siswa dengan nomer Kartu " + nisn + " Gagal Ditambahkan!!");
                    del();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Nomer Kartu harus berupa angka!", "Warning", JOptionPane.WARNING_MESSAGE);
            }txtNomer.setEditable(true);
        }HasilData();
    }//GEN-LAST:event_btnSend1ActionPerformed

    private void del(){
        txtnma.setText("");
        cmbKelas.setSelectedIndex(0);
        txtNomer.setText("");
        txtalmt.setText("");
        txtTTL.setText("");
    }
    
    
    private void HasilData() {
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        model.removeRow(0);
    }try {
        String query = "SELECT * FROM datasekolah";
        Connection conn = koneksi.getkoneksi();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            String[] data = {
                rs.getString("nama"), rs.getString("kelas"), rs.getString("nomer_kartu"), rs.getString("alamat"), rs.getString("gender"), rs.getString("ttl")
            };
            model.addRow(data);
        }
        conn.close();
    } catch (SQLException e) {
        System.out.println("Data Gagal Dibaca!!");
    }
}

    
    private void cmbKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKelasActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        // TODO add your handling code here:
       
        String nama = txtnma.getText();
        String kelas = (String) cmbKelas.getSelectedItem();
        String nisn = txtNomer.getText();
        String gender = "-";
        String alamat = txtalmt.getText();
        String TTL = txtTTL.getText();
        int nomerKartu = Integer.parseInt(nisn);
        if(rbWanita.isSelected()){
            gender="Perempuan";
        }else if (rbPria.isSelected()) {
            gender = "Laki-Laki";
        }
        try{
            String nomerKartuText = txtNomer.getText();
            int validasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Mengupdate Data siswa dengan NISN "+ nomerKartuText + "?", "Information" , JOptionPane.YES_NO_OPTION);
                if(validasi == JOptionPane.YES_OPTION){
                    String upSql = "UPDATE datasekolah SET nama ='"+nama+"',kelas='"+kelas+"',nomer_kartu='"+nisn+"',alamat='" +alamat+"',ttl='" +TTL+"',gender='"+gender+"' WHERE nomer_kartu ='"+txtNomer.getText()+"'";
                    Connection conn = koneksi.getkoneksi();
                    Statement stnt = conn.createStatement();
                    stnt.execute(upSql);
                    JOptionPane.showMessageDialog(null,"Data Siswa dengan NISN " + nomerKartu + " Berhasil di Update"); 
                    HasilData();
                    del();  
                }
        }catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Data Siswa dengan NISN " + nomerKartu + " Gagal di Update");
           del();
        }
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        String nisn = txtNomer.getText();
        int nomerKartu = Integer.parseInt(nisn);
        try{
            String nomerKartuText = txtNomer.getText();
            int validasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus Data siswa dengan NISN "+ nomerKartuText + "?", "Information" , JOptionPane.YES_NO_OPTION);
                if(validasi == JOptionPane.YES_OPTION){                    
                    String delete = "DELETE FROM datasekolah WHERE nomer_kartu = ?";
                    Connection conn = koneksi.getkoneksi();
                    PreparedStatement stnt = conn.prepareStatement(delete);
                    stnt.setInt(1, nomerKartu);
                    stnt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data Siswa dengan NISN " + nomerKartu + " Berhasil dihapus");
                    HasilData();
                    del();
                }
        }catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Data Siswa dengan NISN " + nomerKartu + " Gagal di Update");
           del();
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExtActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        del();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Nomer Kartu");
        model.addColumn("Alamat");
        model.addColumn("Gender");
        model.addColumn("TTL");
        try {
            String searchText = "%" + txtCari.getText() + "%";
            String sql = "SELECT * FROM datasekolah WHERE nama LIKE ? OR kelas LIKE ? OR nomer_kartu LIKE ? OR alamat LIKE ? OR gender LIKE ? OR ttl LIKE ?";
            Connection conn = koneksi.getkoneksi();
            PreparedStatement statement = conn.prepareStatement(sql);
            for (int i = 1; i <= 6; i++) {
                statement.setString(i, searchText);
            }
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String[] data = {
                    rs.getString("nama"), rs.getString("kelas"), rs.getString("nomer_kartu"), rs.getString("alamat"), rs.getString("gender"), rs.getString("ttl")
                };
                model.addRow(data);
            }Tabel1.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Data Gagal Ditemukan");
        }
    }//GEN-LAST:event_txtCariActionPerformed


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
            java.util.logging.Logger.getLogger(Pendataan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pendataan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pendataan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pendataan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pendataan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel1;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnExt;
    private javax.swing.JButton btnSend1;
    private javax.swing.JButton btnUp;
    private javax.swing.JComboBox<String> cmbKelas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton rbPria;
    private javax.swing.JRadioButton rbWanita;
    private javax.swing.JLabel txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JLabel txtNama;
    private javax.swing.JTextField txtNomer;
    private javax.swing.JLabel txtNomerK;
    private javax.swing.JTextField txtTTL;
    private javax.swing.JTextField txtalmt;
    private javax.swing.JTextField txtnma;
    // End of variables declaration//GEN-END:variables
}