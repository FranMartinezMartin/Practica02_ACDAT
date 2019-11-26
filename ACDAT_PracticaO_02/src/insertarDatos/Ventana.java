package insertarDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    // CONSTRUCTOR DE LA VENTANA
    public Ventana() {
        initComponents();
    }

    // INSTANCIAS DE TODOS LOS COMPONENETES DE LOS DIFERENTES PANELES
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        raiz = new javax.swing.JTabbedPane();
        alumno = new javax.swing.JPanel();
        Label_Expediente = new javax.swing.JLabel();
        expediente = new javax.swing.JTextField();
        Label_Nombre = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        Label_apellidoP = new javax.swing.JLabel();
        apellidoP = new javax.swing.JTextField();
        Label_apellidoM = new javax.swing.JLabel();
        apellidoM = new javax.swing.JTextField();
        Label_Fecha = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JCalendar();
        delegado = new javax.swing.JRadioButton();
        limpiar = new javax.swing.JButton();
        Insertar1 = new javax.swing.JButton();
        profesor = new javax.swing.JPanel();
        modulo = new javax.swing.JPanel();
        moduloAlumno = new javax.swing.JPanel();
        verTablas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoSelect = new javax.swing.JTextArea();
        verModulo = new javax.swing.JButton();
        verProfesor = new javax.swing.JButton();
        verAlumno = new javax.swing.JButton();
        verModuloAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        raiz.setBackground(new java.awt.Color(204, 255, 204));

        alumno.setBorder(new javax.swing.border.LineBorder(java.awt.Color.red, 2, true));

        Label_Expediente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Expediente.setText("Expediente:");

        Label_Nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Nombre.setText("Nombre: ");

        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        Label_apellidoP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_apellidoP.setText("Apellido  paterno: ");

        apellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoPKeyTyped(evt);
            }
        });

        Label_apellidoM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_apellidoM.setText("Apellido materno: ");

        apellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoMKeyTyped(evt);
            }
        });

        Label_Fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Fecha.setText("Fecha de nacimiento:");

        calendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        delegado.setText("Delegado");

        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarAlumno(evt);
            }
        });

        Insertar1.setText("INSERTAR");
        Insertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarAlumno(evt);
            }
        });

        javax.swing.GroupLayout alumnoLayout = new javax.swing.GroupLayout(alumno);
        alumno.setLayout(alumnoLayout);
        alumnoLayout.setHorizontalGroup(
            alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alumnoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Insertar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(alumnoLayout.createSequentialGroup()
                        .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alumnoLayout.createSequentialGroup()
                                .addComponent(Label_Expediente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(expediente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(alumnoLayout.createSequentialGroup()
                                .addComponent(Label_Nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Label_apellidoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Label_apellidoM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(alumnoLayout.createSequentialGroup()
                                .addComponent(Label_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delegado)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        alumnoLayout.setVerticalGroup(
            alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Expediente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delegado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insertar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        raiz.addTab("ALUMNO", alumno);

        profesor.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.orange, 2));

        javax.swing.GroupLayout profesorLayout = new javax.swing.GroupLayout(profesor);
        profesor.setLayout(profesorLayout);
        profesorLayout.setHorizontalGroup(
            profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
        );
        profesorLayout.setVerticalGroup(
            profesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        raiz.addTab("PROFESOR", profesor);

        modulo.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));

        javax.swing.GroupLayout moduloLayout = new javax.swing.GroupLayout(modulo);
        modulo.setLayout(moduloLayout);
        moduloLayout.setHorizontalGroup(
            moduloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
        );
        moduloLayout.setVerticalGroup(
            moduloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        raiz.addTab("MODULO", modulo);

        moduloAlumno.setBorder(new javax.swing.border.LineBorder(java.awt.Color.cyan, 2, true));

        javax.swing.GroupLayout moduloAlumnoLayout = new javax.swing.GroupLayout(moduloAlumno);
        moduloAlumno.setLayout(moduloAlumnoLayout);
        moduloAlumnoLayout.setHorizontalGroup(
            moduloAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
        );
        moduloAlumnoLayout.setVerticalGroup(
            moduloAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        raiz.addTab("MODULO_ALUMNO", moduloAlumno);

        TextoSelect.setColumns(20);
        TextoSelect.setRows(5);
        jScrollPane1.setViewportView(TextoSelect);

        verModulo.setText("TABLA MODULO");

        verProfesor.setText("TABLA PROFESOR");

        verAlumno.setText("TABLA ALUMNOS");
        verAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAlumnoActionPerformed(evt);
            }
        });

        verModuloAlumno.setText("jButton1");
        verModuloAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verModuloAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout verTablasLayout = new javax.swing.GroupLayout(verTablas);
        verTablas.setLayout(verTablasLayout);
        verTablasLayout.setHorizontalGroup(
            verTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(verTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(verTablasLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(verAlumno)
                        .addGap(72, 72, 72)
                        .addComponent(verProfesor)
                        .addGap(89, 89, 89)
                        .addComponent(verModulo)
                        .addGap(61, 61, 61)
                        .addComponent(verModuloAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        verTablasLayout.setVerticalGroup(
            verTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verTablasLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(verTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verModuloAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        raiz.addTab("VER TABLAS", verTablas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(raiz)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(raiz, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // EVENTOS DE LOS DIFERENTOS COMPONENTES
    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        if (nombre.getText().length() == 25) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoPKeyTyped
        if (apellidoP.getText().length() == 25) {
            evt.consume();
        }
    }//GEN-LAST:event_apellidoPKeyTyped

    private void apellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoMKeyTyped
        if (apellidoM.getText().length() == 25) {
            evt.consume();
        }
    }//GEN-LAST:event_apellidoMKeyTyped

    private void InsertarAlumno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarAlumno
        java.sql.Date sqlDate = new java.sql.Date(calendario.getDate().getTime());

        if (new Metodos().insertarAlumno(Integer.parseInt(expediente.getText()), nombre.getText(), apellidoP.getText(), apellidoM.getText(), sqlDate, delegado.isSelected())) {
            JOptionPane.showMessageDialog(this, "Alumno añadido correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Se ha producido un fallo al insertar los datos");
        }

    }//GEN-LAST:event_InsertarAlumno

    private void LimpiarAlumno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarAlumno
        expediente.setText("");
        nombre.setText("");
        apellidoP.setText("");
        apellidoM.setText("");
        delegado.setSelected(false);
    }//GEN-LAST:event_LimpiarAlumno

    private void verModuloAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verModuloAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verModuloAlumnoActionPerformed

    private void verAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAlumnoActionPerformed
        TextoSelect.setText(new Metodos().selectAlumno());
    }//GEN-LAST:event_verAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insertar1;
    private javax.swing.JLabel Label_Expediente;
    private javax.swing.JLabel Label_Fecha;
    private javax.swing.JLabel Label_Nombre;
    private javax.swing.JLabel Label_apellidoM;
    private javax.swing.JLabel Label_apellidoP;
    private javax.swing.JTextArea TextoSelect;
    private javax.swing.JPanel alumno;
    private javax.swing.JTextField apellidoM;
    private javax.swing.JTextField apellidoP;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JRadioButton delegado;
    private javax.swing.JTextField expediente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JPanel modulo;
    private javax.swing.JPanel moduloAlumno;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel profesor;
    private javax.swing.JTabbedPane raiz;
    private javax.swing.JButton verAlumno;
    private javax.swing.JButton verModulo;
    private javax.swing.JButton verModuloAlumno;
    private javax.swing.JButton verProfesor;
    private javax.swing.JPanel verTablas;
    // End of variables declaration//GEN-END:variables
}
