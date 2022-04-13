package taller.oop.graficos;

import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import taller.oop.logica.FileManager;
import taller.oop.logica.Fecha;


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
        diaField = new javax.swing.JTextField();
        mesField = new javax.swing.JTextField();
        anioField = new javax.swing.JTextField();
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
        jLabel1.setText("Fechas");

        jLabel2.setText("Dia:");

        jLabel3.setText("Mes:");

        jLabel4.setText("Año:");

        diaField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        mesField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        anioField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "N°", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMenu(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
        }

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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(limpiarBtn)
                        .addComponent(agregarBtn)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diaField)
                            .addComponent(mesField)
                            .addComponent(anioField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(agregarBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpiarBtn)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillData() {
        this.data = new ArrayList<Object[]>();
        this.contador = 1;
        for (Fecha f : this.fechas) {
            this.data.add(f.toArray(contador));
            contador++;
        }
    }

    
    private void setTabla() {
        fillData();
        try {
            Object[][] dataset = new Object[this.data.size()][5];
            for (int i = 0; i < dataset.length; i++) {
                dataset[i] = this.data.get(i);
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(
                dataset,
                new String [] {
                    "N°", "Fecha"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        }catch(Exception e) {
            
        }       
    }
    
    private void cargarArchivo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cargarArchivo
        try {
            if (WindowEvent.WINDOW_OPENED==evt.getID()){
                this.fechas = FileManager.cargarArchivo(filepath);
                setTabla();
            }
        } catch (FileNotFoundException e){
            try {
                FileManager.crearArchivo(filepath);
            } catch (IOException ex){
                JOptionPane.showMessageDialog(this, "Error: No se pudo crear el archivo de datos.", 
                    "Error al crear archivo.", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error: No se pudo cargar los datos del archivo.", 
                    "Error al cargar datos", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_cargarArchivo

    private void guardarArchivo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_guardarArchivo
        try {
            if (WindowEvent.WINDOW_CLOSING==evt.getID()) {
                if (fechas==null) {
                    fechas=new ArrayList<Fecha>();
                }
                FileManager.guardarArchivo(filepath, fechas);
            }
        } catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error: No se pudo guardar el archivo de datos.", 
                    "Error al guardar datos", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_guardarArchivo

    private void cleanText() {
        mesField.setText("");
        diaField.setText("");
        anioField.setText("");
    }
    
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        try{
            this.fechas.add(new Fecha(
                Integer.parseInt(diaField.getText()),
                Integer.parseInt(mesField.getText()),
                Integer.parseInt(anioField.getText())
            ));
            setTabla();
            cleanText();
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(tabla, "Los valores ingreados no son válidos",
                    "Error al agregar entrada",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        try{
            int opt = JOptionPane.showConfirmDialog(tabla, "¿Desea eliminar todas las entradas?");
            if (opt == 0) {
                this.fechas.removeAll(this.fechas);
                setTabla();
                cleanText();
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        ModificarPopUp ventanaModificar = new ModificarPopUp();
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void showMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMenu
        if(SwingUtilities.isRightMouseButton(evt)){
            this.rowValue = tabla.rowAtPoint(evt.getPoint());
            jPopupMenu1.show(tabla, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_showMenu

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        try{
            if(JOptionPane.showConfirmDialog(tabla, "¿Eliminar la entrada seleccionada?")==0){
                this.fechas.remove(rowValue);
                cleanText();
                setTabla();
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: No se pudo eliminar la entrada.", 
                    "Error al eliminar datos", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private class ModificarPopUp extends javax.swing.JFrame {

        /**
         * Creates new form ModificarPopUp
         */
        public ModificarPopUp() {
            initComponents();
            setLocationRelativeTo(null);
            setVisible(true);
            this.diaFieldPopUp.setText(""+fechas.get(rowValue).getDia());
            this.mesFieldPopUp.setText(""+fechas.get(rowValue).getMes());
            this.anioFieldPopUp.setText(""+fechas.get(rowValue).getAnio());
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            cancelarBtn = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            diaFieldPopUp = new javax.swing.JTextField();
            mesFieldPopUp = new javax.swing.JTextField();
            anioFieldPopUp = new javax.swing.JTextField();
            modificarPopUpBtn = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            

            cancelarBtn.setText("Cancelar");
            cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cancelarBtnActionPerformed(evt);
                }
            });

            jLabel2.setText("Día:");

            jLabel3.setText("Mes:");

            jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
            jLabel1.setText("Modificar Entrada");

            jLabel4.setText("Año:");

            diaFieldPopUp.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

            mesFieldPopUp.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

            anioFieldPopUp.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

            modificarPopUpBtn.setText("Modificar");
            modificarPopUpBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modificarPopUpBtnActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(diaFieldPopUp)
                                .addComponent(mesFieldPopUp)
                                .addComponent(anioFieldPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cancelarBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarPopUpBtn)))
                    .addContainerGap(29, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(44, 44, 44))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(diaFieldPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(mesFieldPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(anioFieldPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modificarPopUpBtn)
                        .addComponent(cancelarBtn))
                    .addContainerGap(38, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
            this.dispose();
        }                                           

        private void modificarPopUpBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  
            try {
                Fecha fecha = new Fecha(
                        Integer.parseInt(this.diaFieldPopUp.getText()),
                        Integer.parseInt(this.mesFieldPopUp.getText()),
                        Integer.parseInt(this.anioFieldPopUp.getText())
                );
                fechas.remove(rowValue);
                fechas.add(rowValue,fecha);
                setTabla();
                cleanText();
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Los valores ingresados no son válidos", 
                        "Error al modificar entrada", JOptionPane.ERROR_MESSAGE);
            }
        }                                                                     


        // Variables declaration - do not modify                     
        private javax.swing.JButton cancelarBtn;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JButton modificarPopUpBtn;
        private javax.swing.JTextField anioFieldPopUp;
        private javax.swing.JTextField diaFieldPopUp;
        private javax.swing.JTextField mesFieldPopUp;
        // End of variables declaration                   

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JTextField anioField;
    private javax.swing.JTextField diaField;
    private javax.swing.JMenuItem eliminarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField mesField;
    private javax.swing.JMenuItem modificarBtn;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Fecha> fechas;
    private final String filepath = "./src/resources/data.json";
    private ArrayList<Object[]> data;
    private int contador;
    private int rowValue;
}