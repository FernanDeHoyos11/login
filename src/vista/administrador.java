/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static vista.login.controlMenu;

/**
 *
 * @author LENOVO CELERON
 */
public class administrador extends javax.swing.JFrame {

    public static boolean controlMenu = false;

    /**
     * Creates new form administrador
     */
    public administrador() {
        initComponents();
        setTitle("administrador");
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon icono = new ImageIcon("src/images/logo.png");
        Icon l = new ImageIcon(icono.getImage().getScaledInstance(label_logo.getWidth(),
                label_logo.getHeight(), Image.SCALE_DEFAULT));
        label_logo.setIcon(l);
        this.repaint();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/fondo.jpg"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txcodigo = new javax.swing.JTextField();
        txnombre = new javax.swing.JTextField();
        txcreditos = new javax.swing.JTextField();
        txsemestre = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txbuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setText("CODIGO:");

        jLabel2.setText("MATERIA:");

        jLabel3.setText("CREDITOS:");

        jLabel4.setText("SEMESTRE:");

        jLabel5.setText("Ingrese los respectivos cusrsos");

        jLabel6.setText("del programa de ingenieria de sistemas.");

        txnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnombreActionPerformed(evt);
            }
        });

        txcreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcreditosActionPerformed(evt);
            }
        });

        txsemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txsemestreActionPerformed(evt);
            }
        });

        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnmostrar.setText("VER CURSOS DEL PROGRAMA");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel7.setText("creado por fernan  ®");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("UNIVERSIDAD DE CORDOBA");

        jLabel9.setText("INGENIERIA  DE  SISTEMAS");

        jLabel10.setText(" MONTERIA   CORDOBA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel10))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(128, 128, 128))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txcodigo)
                                    .addComponent(txsemestre)
                                    .addComponent(txcreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnmodificar)
                                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btneliminar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txbuscar)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txcreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btneliminar)
                    .addComponent(btnmodificar))
                .addGap(4, 4, 4)
                .addComponent(btnmostrar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnombreActionPerformed

    private void txcreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcreditosActionPerformed

    private void txsemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txsemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txsemestreActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        String curso;
        String codigo, semestre, creditos;
        int validacion = 0;

        codigo = txcodigo.getText().trim();
        curso = txnombre.getText().trim();
        creditos = txcreditos.getText().trim();
        semestre = txsemestre.getText().trim();

        if (codigo.equals("") || curso.equals("") || creditos.equals("") || semestre.equals("")) {

            txcodigo.setBackground(Color.red);
            txnombre.setBackground(Color.red);
            txcreditos.setBackground(Color.red);
            txsemestre.setBackground(Color.red);

            JOptionPane.showMessageDialog(rootPane, "Debes llenar todos los campos");

            txcodigo.setBackground(Color.white);
            txnombre.setBackground(Color.WHITE);
            txcreditos.setBackground(Color.white);
            txsemestre.setBackground(Color.white);

        }

        try {
            Connection cn = conexion.conectar();
            PreparedStatement pst2 = cn.prepareStatement("select curso from cursos_sistemas where curso = '" + curso + "'");
            ResultSet rs = pst2.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Curso ya inscrito");
                cn.close();
            } else {
                cn.close();
                try {

                    Connection cn2 = conexion.conectar();
                    PreparedStatement pst = cn2.prepareStatement("insert into cursos_sistemas values(?,?,?,?)");

                    pst.setString(1, codigo);
                    pst.setString(2, curso);
                    pst.setString(3, semestre);
                    pst.setString(4, creditos);
                    pst.executeUpdate();

                    cn2.close();

                    txcodigo.setText("");
                    txnombre.setText("");
                    txcreditos.setText("");
                    txsemestre.setText("");

                    JOptionPane.showMessageDialog(rootPane, "Curso guardado con exito");

                } catch (SQLException e) {
                    System.err.println("error al guardar curso " + e);
                    JOptionPane.showMessageDialog(rootPane, "error\n contacte a su proovedor de software");
                }
            }

        } catch (SQLException e) {

        }
    }

    /*try{
        Connection cn = conexion.conectar();
        PreparedStatement pst = cn.prepareStatement("insert into cursos values(?,?,?,?,?,?,?,?,?,?,?)"); 
        
        pst.setInt(1, 0);
        pst.setInt(2, 0);
        pst.setString(3, codigo);
        pst.setString(4, curso);
        pst.setString(5, "");
        pst.setString(6, "");
        pst.setString(7, "");
        pst.setString(8, "");
        pst.setString(9, semestre);
        pst.setString(10, creditos);
        pst.setString(11, "");
        pst.executeUpdate();
        cn.close();
        txcodigo.setText("");
        txnombre.setText("");
        txcreditos.setText("");
        txsemestre.setText("");
        
        JOptionPane.showMessageDialog(null, "curso guardado");
        }catch(SQLException e){
            System.err.println("error al guardar curso " + e);
             JOptionPane.showMessageDialog(null, "error\n contacte a su proovedor de software");
        }
        
    }//GEN-LAST:event_btnagregarActionPerformed
*/
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        String codigo = txbuscar.getText().trim();

        if (txcodigo.getText().equals("") && txnombre.getText().equals("")
                && txcreditos.getText().equals("") && txsemestre.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "Campos vacios \n No se puede modificar");

        } else {
            try {
                Connection c = conexion.conectar();
                PreparedStatement p = c.prepareStatement("UPDATE cursos_sistemas SET codigo = ?, curso = ?, creditos=? ,semestre= ?  WHERE codigo = " + codigo);

                p.setString(1, txcodigo.getText().trim());
                p.setString(2, txnombre.getText().trim());
                p.setString(3, txcreditos.getText().trim());
                p.setString(4, txsemestre.getText().trim());

                p.executeUpdate();

                JOptionPane.showMessageDialog(null, "curso modificado");
            } catch (SQLException e) {
                System.err.println("error al guardar curso " + e);
                JOptionPane.showMessageDialog(rootPane, "error\n contacte a su proovedor de software");
            }
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        if (txbuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Indique codigo de materia para buscar");
        } else {
            try {
                Connection con = conexion.conectar();
                PreparedStatement ps = con.prepareStatement("select * from cursos_sistemas where codigo = ?");
                ps.setString(1, txbuscar.getText().trim());

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    txcodigo.setText(rs.getString("codigo"));
                    txnombre.setText(rs.getString("curso"));
                    txcreditos.setText(rs.getString("creditos"));
                    txsemestre.setText(rs.getString("semestre"));
                } else {
                    JOptionPane.showMessageDialog(rootPane, "no disponible");
                }
            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(rootPane, "error de software");
            }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if (txbuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "No hay nada para eliminar");
        } else {
            try {
                Connection con = conexion.conectar();
                PreparedStatement pst = con.prepareStatement("delete from cursos_sistemas where codigo = ?");

                pst.setString(1, txbuscar.getText().trim());
                pst.executeUpdate();

                txcodigo.setText("");
                txnombre.setText("");
                txcreditos.setText("");
                txsemestre.setText("");
                JOptionPane.showMessageDialog(rootPane, "Curso eliminado");

            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(rootPane, "error de software");
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed
    vistacursos vs = new vistacursos();
    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed

        if (controlMenu == false) {
            vs.setVisible(true);
        }

    }//GEN-LAST:event_btnmostrarActionPerformed

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
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JFrame jFrame1;
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
    private javax.swing.JLabel label_logo;
    private javax.swing.JTextField txbuscar;
    private javax.swing.JTextField txcodigo;
    private javax.swing.JTextField txcreditos;
    private javax.swing.JTextField txnombre;
    private javax.swing.JTextField txsemestre;
    // End of variables declaration//GEN-END:variables
}
