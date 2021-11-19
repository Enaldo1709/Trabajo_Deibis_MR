package taller.oop.graficos;

import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import taller.oop.logica.Empleado;
import taller.oop.logica.FileManager;

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
        aumentoBtn = new javax.swing.JMenuItem();
        modificarBtn = new javax.swing.JMenuItem();
        eliminarBtn = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        apellidoField = new javax.swing.JTextField();
        salarioField = new javax.swing.JTextField();
        agregarBtn = new javax.swing.JButton();
        porcentajeField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aumentarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        limpiarBtn = new javax.swing.JButton();

        aumentoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/aumentar.png"))); // NOI18N
        aumentoBtn.setText("Aumentar");
        aumentoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentoBtnActionPerformed(evt);
            }
        });
        jPopupMenu1.add(aumentoBtn);

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
        jLabel1.setText("Administracion de Empleados");

        jLabel2.setText("Empleados:");

        jLabel3.setText("Aumentos:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido: ");

        jLabel6.setText("Salario Mensual:");

        jLabel7.setText("Porcentaje:");

        salarioField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        porcentajeField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel8.setText("%");

        aumentarBtn.setText("Aumentar");
        aumentarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarBtnActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "N°", "Nombre Completo", "Salario Anual"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
                showPopUp(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(3);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(agregarBtn)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(porcentajeField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aumentarBtn)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(limpiarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcentajeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aumentarBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(salarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpiarBtn)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        if (this.empleados == null){
            this.empleados = new ArrayList<Empleado>();
        }
        
        try{
            if ("".equals(nombreField.getText()) || "".equals(apellidoField.getText())){
                throw new IllegalArgumentException();
            }
            double salario = Double.parseDouble(salarioField.getText());
            
            this.empleados.add(new Empleado(nombreField.getText(), apellidoField.getText(), salario));
            
            cleanText();
            setTabla();
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(tabla, "Valores ingresados no válidos.",
                    "Error al agregar entrada",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        try{
            int opt = JOptionPane.showConfirmDialog(tabla, "¿Desea eliminar todas las entradas?");
            if (opt == 0) {
                this.empleados = new ArrayList<Empleado>();
                cleanText();
                setTabla();
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void cargarArchivo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cargarArchivo
        try {
            if (WindowEvent.WINDOW_OPENED==evt.getID()){
                this.empleados = FileManager.cargarArchivo(filepath);
            }
        } catch (FileNotFoundException e){
            try {
                this.empleados = new ArrayList<Empleado>();
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
        setTabla();
    }//GEN-LAST:event_cargarArchivo

    private void guardarArchivo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_guardarArchivo
        try {
            if (WindowEvent.WINDOW_CLOSING==evt.getID()) {
                if (empleados==null) {
                    empleados=new ArrayList<Empleado>();
                }
                FileManager.guardarArchivo(filepath, empleados);
            }
        } catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error: No se pudo guardar el archivo de datos.", 
                    "Error al guardar datos", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_guardarArchivo

    private void aumentarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarBtnActionPerformed
        int index=0;
        for (Empleado t:empleados){
            double porcentaje = Double.parseDouble(porcentajeField.getText());
            t.aumentar(porcentaje);
        }
        setTabla();
        cleanText();
    }//GEN-LAST:event_aumentarBtnActionPerformed

    private void showPopUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPopUp
        if(SwingUtilities.isRightMouseButton(evt)){
            jPopupMenu1.show(tabla, evt.getX(), evt.getY());
            this.rowValue = tabla.rowAtPoint(evt.getPoint());
        }
    }//GEN-LAST:event_showPopUp

    private void aumentoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentoBtnActionPerformed
        double porcentaje = Double.parseDouble(JOptionPane.showInputDialog("Digite el porcentaje a aumentar al empleado.","0"));
        Empleado empleado = this.empleados.get(rowValue);
        empleado.aumentar(porcentaje);
        this.empleados.remove(rowValue);
        this.empleados.add(rowValue,empleado);
        setTabla();
        cleanText();
    }//GEN-LAST:event_aumentoBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        try {
            Empleado empleado = this.empleados.get(rowValue);
            this.empleados.remove(rowValue);
            String nombre = JOptionPane.showInputDialog("Digite el nombre del empleado.",empleado.getNombre());
            String apellido = JOptionPane.showInputDialog("Digite el apellido del empleado.",empleado.getApellido());
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario mensual del empleado.",""+empleado.getSalario()));
            empleado = new Empleado(nombre, apellido, salario);
            this.empleados.add(rowValue,empleado);
            setTabla();
            cleanText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: No se pudo modificar la entrada.", 
                    "Error al modificar datos", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        try{
            if(JOptionPane.showConfirmDialog(tabla, "¿Eliminar la entrada seleccionada?")==0){
                this.empleados.remove(rowValue);
                cleanText();
                setTabla();
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: No se pudo eliminar la entrada.", 
                    "Error al eliminar datos", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

   private void cleanText() {
        this.nombreField.setText("");
        this.apellidoField.setText("");
        this.salarioField.setText("");
        this.porcentajeField.setText("");
    }
   
   private void fillData() {
        this.data = new ArrayList<Object[]>();
        this.contador = 1;
        for (Empleado t : this.empleados) {
            this.data.add(t.toArray(contador));
            contador++;
        }
    }
    
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
                   "N°", "Nombre Completo", "Salario Anual"
                }
            ) {
                Class[] types = new Class [] {
                   Integer.class, Integer.class, Integer.class, Double.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
            });
        } catch(Exception e) {
            
        }
        
    }
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JTextField apellidoField;
    private javax.swing.JButton aumentarBtn;
    private javax.swing.JMenuItem aumentoBtn;
    private javax.swing.JMenuItem eliminarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JMenuItem modificarBtn;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField porcentajeField;
    private javax.swing.JTextField salarioField;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Object[]> data;
    private int contador;
    private ArrayList<Empleado> empleados;
    private final String filepath = "./src/resources/data.json";
    private int rowValue;
}
