/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package taller.oop.graficos;

import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import taller.oop.logica.Coche;
import taller.oop.logica.FileManager;

/**
 *
 * @author enaldo1709
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        modificarBtn = new javax.swing.JMenuItem();
        eliminarBtn = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        caballosField = new javax.swing.JTextField();
        matriculaField = new javax.swing.JTextField();
        puertasField = new javax.swing.JTextField();
        modeloField = new javax.swing.JTextField();
        marcaField = new javax.swing.JTextField();
        colorField = new javax.swing.JTextField();
        agregarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        limpiarBtn = new javax.swing.JButton();

        modificarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/edit.png"))); // NOI18N
        modificarBtn.setText("Modificar");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });
        jPopupMenu1.add(modificarBtn);

        eliminarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/delete.png"))); // NOI18N
        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });
        jPopupMenu1.add(eliminarBtn);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                guardarArchivo(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                cargarArchivo(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel1.setText("Coches");

        jLabel2.setText("Color:");

        jLabel3.setText("Marca: ");

        jLabel4.setText("Modelo: ");

        jLabel5.setText("# Puertas: ");

        jLabel6.setText("# Caballos: ");

        jLabel7.setText("Matricula: ");

        caballosField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        puertasField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Color", "Marca", "Modelo", "# Puertas", "# Caballos", "Matricula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPopUp(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        limpiarBtn.setText("Limpiar");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
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
                        .addGap(0, 172, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marcaField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modeloField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(puertasField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(caballosField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(matriculaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(limpiarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(agregarBtn))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(colorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(marcaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(modeloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(puertasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(caballosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(matriculaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(limpiarBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setTabla() {
        fillData();
        try {
            Object[][] dataset = new Object[this.data.size()][5];
            for (int i = 0; i < dataset.length; i++) {
                Object[] objects = this.data.get(i);
                dataset[i] = objects;
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(
                dataset,
                new String [] {
                    "N°", "Color", "Marca", "Modelo", "# Puertas", 
                    "# Caballos", "Matricula"}
            ) {
                Class[] types = new Class [] {
                    Integer.class, String.class, String.class, String.class, 
                    Integer.class, Double.class, String.class };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
            });
        }catch(Exception e) {
            
        }       
    }
    
    private void fillData() {
        this.data = new ArrayList<Object[]>();
        this.contador = 1;
        for (Coche c : this.coches) {
            this.data.add(c.toArray(contador));
            contador++;
        }
    }
    
    private void cleanText() {
        colorField.setText("");
        marcaField.setText("");
        modeloField.setText("");
        puertasField.setText("");
        caballosField.setText("");
        matriculaField.setText("");
    }
    
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        if ("".equals(puertasField.getText())){
            puertasField.setText("0");
        }
        if ("".equals(caballosField.getText())) {
            caballosField.setText("0");
        }
        this.coches.add( new Coche(
                colorField.getText(),
                marcaField.getText(),
                modeloField.getText(),
                Integer.parseInt(puertasField.getText()),
                Double.parseDouble(caballosField.getText()),
                matriculaField.getText()
            )
        );
        cleanText();
        setTabla();
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void cargarArchivo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cargarArchivo
        if (WindowEvent.WINDOW_OPENED == evt.getID()) {
            try{
                this.coches = FileManager.cargarArchivo(filepath);
                this.contador=1;
                setTabla();
            } catch(FileNotFoundException e) {
                try{
                    FileManager.crearArchivo(filepath);
                } catch(IOException ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al crear el archivo.",
                        "Error",JOptionPane.ERROR_MESSAGE);
                }
            } catch(IOException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cargar los datos.",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cargarArchivo

    private void guardarArchivo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_guardarArchivo
        if (WindowEvent.WINDOW_CLOSING == evt.getID()) {
            try{
                FileManager.guardarArchivo(filepath, coches);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo.",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_guardarArchivo

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        try{
            int opt = JOptionPane.showConfirmDialog(tabla, "¿Desea eliminar todas las entradas?");
            if (opt == 0) {
                this.coches = new ArrayList<Coche>();
                setTabla();
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        try{
            int opt = JOptionPane.showConfirmDialog(tabla, "¿Desea eliminar la entrada seleccionada?");
            if (opt == 0) {
                this.coches.remove(this.rowValue);
                setTabla();
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void showPopUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPopUp
        if(SwingUtilities.isRightMouseButton(evt)) {
            this.rowValue = tabla.rowAtPoint(evt.getPoint());
            jPopupMenu1.show(tabla, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_showPopUp

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        
        PopUp popup = new PopUp();
    }//GEN-LAST:event_modificarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pantalla ui = new Pantalla();
                ui.setLocationRelativeTo(null);
                ui.setVisible(true);
            }
        });
    }
    
    private class PopUp extends javax.swing.JFrame {

        /**
         * Creates new form PopUp
         */
        public PopUp() {
            initComponents();
            setLocationRelativeTo(null);
            setVisible(true);
        }



        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            puertasField = new javax.swing.JTextField();
            modeloField = new javax.swing.JTextField();
            marcaField = new javax.swing.JTextField();
            colorField = new javax.swing.JTextField();
            agregarBtn = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            caballosField = new javax.swing.JTextField();
            matriculaField = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowOpened(java.awt.event.WindowEvent evt) {
                    setUp(evt);
                }
            });

            puertasField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

            agregarBtn.setText("Aceptar");
            agregarBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    agregarBtnActionPerformed(evt);
                }
            });

            jLabel2.setText("Color:");

            jLabel3.setText("Marca: ");

            jLabel4.setText("Modelo: ");

            jLabel5.setText("# Puertas: ");

            jLabel6.setText("# Caballos: ");

            jLabel7.setText("Matricula: ");

            caballosField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

            jButton1.setText("Cancelar");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
            jLabel1.setText("Modificar Coche");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                    .addComponent(agregarBtn)
                    .addGap(55, 55, 55))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(caballosField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(puertasField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(colorField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(marcaField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modeloField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(matriculaField)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(jLabel1)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(colorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(marcaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(modeloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(puertasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(caballosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(matriculaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(agregarBtn)
                        .addComponent(jButton1))
                    .addContainerGap(37, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
            
            coches.remove(rowValue);
            coches.add(rowValue,new Coche(
                    colorField.getText(),
                    marcaField.getText(),
                    modeloField.getText(),
                    Integer.parseInt(puertasField.getText()),
                    Double.parseDouble(caballosField.getText()),
                    matriculaField.getText()
            ));
            setTabla();
            cleanText();
            this.dispose();
        }                                          

        private void setUp(java.awt.event.WindowEvent evt) {                       
            colorField.setText(coches.get(rowValue).getColor());
            marcaField.setText(coches.get(rowValue).getMarca());
            modeloField.setText(coches.get(rowValue).getModelo());
            puertasField.setText(""+coches.get(rowValue).getPuertas());
            caballosField.setText(""+coches.get(rowValue).getCaballos());
            matriculaField.setText(coches.get(rowValue).getMatricula());
        }                      

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            this.dispose();
        }                                        

                                          

        public void run(){
            setVisible(true);
            setLocationRelativeTo(null);
        }

        
        // Variables declaration - do not modify                     
        private javax.swing.JButton agregarBtn;
        private javax.swing.JTextField caballosField;
        private javax.swing.JTextField colorField;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JTextField marcaField;
        private javax.swing.JTextField matriculaField;
        private javax.swing.JTextField modeloField;
        private javax.swing.JTextField puertasField;
        // End of variables declaration                   
        
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JTextField caballosField;
    private javax.swing.JTextField colorField;
    private javax.swing.JMenuItem eliminarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField marcaField;
    private javax.swing.JTextField matriculaField;
    private javax.swing.JTextField modeloField;
    private javax.swing.JMenuItem modificarBtn;
    private javax.swing.JTextField puertasField;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    
    private ArrayList<Coche> coches = new ArrayList<Coche>();
    private ArrayList<Object[]> data;
    private Coche coche;
    private int contador;
    private int rowValue;
    private static final String filepath = "./src/resources/data.json";
}