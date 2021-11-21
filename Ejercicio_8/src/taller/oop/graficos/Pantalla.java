package taller.oop.graficos;

import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import taller.oop.logica.FileManager;
import taller.oop.logica.Funcion;
import taller.oop.logica.Teatro;


public class Pantalla extends javax.swing.JFrame {

    
    public Pantalla() {
        this.teatros = new ArrayList<Teatro>();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        modificarBtn = new javax.swing.JMenuItem();
        eliminarBtn = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        teatrosCombo = new javax.swing.JComboBox<>();
        agregarTeatroBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreFuncionField = new javax.swing.JTextField();
        precioFuncionField = new javax.swing.JTextField();
        agregarFuncionBtn = new javax.swing.JButton();
        limpiarFuncionBtn = new javax.swing.JButton();

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

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombre Teatro", "Dirección", "Nombre Funcion", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel1.setText("Funciones");

        jLabel2.setText("Teatro:");

        teatrosCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        agregarTeatroBtn.setText("Agregar Teatro");
        agregarTeatroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTeatroBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Precio:");

        agregarFuncionBtn.setText("Agregar");
        agregarFuncionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarFuncionBtnActionPerformed(evt);
            }
        });

        limpiarFuncionBtn.setText("Limpiar");
        limpiarFuncionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarFuncionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(teatrosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreFuncionField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(precioFuncionField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(agregarTeatroBtn)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(limpiarFuncionBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(agregarFuncionBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(teatrosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarTeatroBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreFuncionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precioFuncionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarFuncionBtn)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpiarFuncionBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void agregarFuncionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarFuncionBtnActionPerformed
        try{
            int teatroSeleccionado = teatrosCombo.getSelectedIndex();
            this.teatros.set(teatroSeleccionado, 
                    this.teatros.get(teatroSeleccionado).addFuncion(
                            new Funcion(nombreFuncionField.getText(),
                                    Double.parseDouble(precioFuncionField.getText()))
                    ));
            setCombo();
            setTabla();
            cleanText();
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "El teatro ya tiene 4 funciones.",
                    "Error: No se pudo agregar función.",JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Ocurrió un error al agregar la función.",
                    "Error al agregar función.",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_agregarFuncionBtnActionPerformed

    private void agregarTeatroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTeatroBtnActionPerformed
        PantallaTeatro uiTeatro = new PantallaTeatro();
        uiTeatro.setVisible(true);
    }//GEN-LAST:event_agregarTeatroBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        Teatro teatro;
        switch(JOptionPane.showOptionDialog(this, "Seleccione el objeto que desea modificar:", 
                "Que desea modificar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                new ImageIcon("./src/resources/icons/edit.png"), new String[]{"Teatro","Funcion","Cancelar"},null)){
            case 0:
                buscarFuncion();
                teatro = teatros.get(numTeatro);
                PantallaTeatro uiTeatro = new PantallaTeatro();
                uiTeatro.toModify(teatro);
                uiTeatro.setVisible(true);
                break;
            case 1:
                buscarFuncion();
                teatro = teatros.get(numTeatro);
                PantallaModificar uiModificar = new PantallaModificar();
                break;
            case 2:   
                break;
        }
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void cleanText(){
        this.nombreFuncionField.setText("");
        this.precioFuncionField.setText("");
        this.teatrosCombo.setSelectedIndex(0);
    }
    
    private void showPopUp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPopUp
        if (SwingUtilities.isRightMouseButton(evt)){
            rowValue = tabla.rowAtPoint(evt.getPoint());
            jPopupMenu1.show(tabla, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_showPopUp

    private void limpiarFuncionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarFuncionBtnActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea eliminar todas las entradas?")==0){
            this.teatros = new ArrayList<Teatro>();
            setTabla();
            setCombo();
        }
        
    }//GEN-LAST:event_limpiarFuncionBtnActionPerformed

    private void cargarArchivo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cargarArchivo
        try {
            if (WindowEvent.WINDOW_OPENED==evt.getID()){
                this.teatros = FileManager.cargarArchivo(filepath);
                setTabla();
                setCombo();
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
                if (this.teatros==null) {
                    this.teatros=new ArrayList<Teatro>();
                }
                FileManager.guardarArchivo(filepath, this.teatros);
            }
        } catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error: No se pudo guardar el archivo de datos.", 
                    "Error al guardar datos", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_guardarArchivo

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        Teatro teatro;
        switch(JOptionPane.showOptionDialog(this, "Seleccione el objeto que desea modificar:", 
                "Que desea modificar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                new ImageIcon("./src/resources/icons/edit.png"), new String[]{"Teatro","Funcion","Cancelar"},null)){
            case 0:
                buscarFuncion();
                teatro = teatros.get(numTeatro);
                try{
                    if(JOptionPane.showConfirmDialog(tabla, "¿Eliminar el teatro: "+teatro.getNombre()+" y sus funciones?")==0){
                        this.teatros.remove(numTeatro);
                        cleanText();
                        setTabla();
                        setCombo();
                    }

                } catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Error: No se pudo eliminar la entrada.", 
                            "Error al eliminar datos", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
                break;
            case 1:
                buscarFuncion();
                teatro = teatros.get(numTeatro);
                
                try{
                    if(JOptionPane.showConfirmDialog(tabla, "¿Eliminar la función : "+
                            teatro.getFunciones().get(numFuncion).getNombre()+" del teatro: "+teatro.getNombre()+"?")==0){
                        ArrayList<Funcion> newFunciones = teatro.getFunciones();
                        newFunciones.remove(numFuncion);
                        teatro.setFunciones(newFunciones);
                        teatros.set(numTeatro, teatro);
                        cleanText();
                        setTabla();
                        setCombo();
                    }

                } catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Error: No se pudo eliminar la entrada.", 
                            "Error al eliminar datos", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
                break;
            case 2:
                break;
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void fillData() {
        this.data = new ArrayList<Object[]>();
        this.contador=1;
        for (Teatro t:teatros){
            for (int i = 0; i < t.getNumeroFunciones(); i++){
                this.data.add(t.toArray(this.contador, i));
                this.contador++;
            }
        }
    }
    
    private void setTabla(){
        fillData();
        Object[][] dataset;
        try{
            dataset = new Object[this.data.size()][this.data.get(0).length];
            for (int i = 0; i < dataset.length; i++) {
                dataset[i] = this.data.get(i);
            }
        } catch(IndexOutOfBoundsException e){
            dataset = new Object[0][0];
        }
        
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            dataset,
            new String [] {
                "N°", "Nombre Teatro", "Dirección", "Nombre Funcion", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class, String.class, String.class, Double.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
    }
    
    private void setCombo() {
        String[] nombreTeatros = new String[this.teatros.size()];
        for (int i = 0; i < nombreTeatros.length; i++) {
            nombreTeatros[i] = this.teatros.get(i).getNombre();
        }
        this.teatrosCombo.setModel(new javax.swing.DefaultComboBoxModel<>(nombreTeatros));
    }
    
    private void buscarFuncion() {
        numTeatro =0;
        numFuncion=0;
        for(Teatro t:this.teatros){
            if (this.data.get(rowValue)[1].equals(t.getNombre()) && 
                    this.data.get(rowValue)[2].equals(t.getDireccion())) break;
            numTeatro++;
        }
        for(Funcion f:this.teatros.get(numTeatro).getFunciones()){
            if (this.data.get(rowValue)[3].equals(f.getNombre()) && 
                    this.data.get(rowValue)[4].equals(f.getPrecio())) break;
            numFuncion++;
        }
    }
    
    private class PantallaTeatro extends javax.swing.JFrame {
        
        public PantallaTeatro() {
            initComponents();
            this.modificando=false;
            setLocationRelativeTo(null);
        }

        
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            titulo = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            nombreTeatroField = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            direccionTeatroField = new javax.swing.JTextField();
            agregarTeatroBtn = new javax.swing.JButton();
            cancelarTeatroBtn = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            titulo.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
            titulo.setText("Agregar Teatro");

            jLabel2.setText("Nombre:");

            jLabel3.setText("Dirección: ");

            agregarTeatroBtn.setText("Agregar");
            agregarTeatroBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    agregarTeatroBtnActionPerformed(evt);
                }
            });

            cancelarTeatroBtn.setText("Cancelar");
            cancelarTeatroBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cancelarTeatroBtnActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(titulo))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(cancelarTeatroBtn))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombreTeatroField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(direccionTeatroField)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(agregarTeatroBtn)
                                    .addGap(14, 14, 14)))))
                    .addContainerGap(32, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(titulo)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nombreTeatroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(direccionTeatroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(agregarTeatroBtn)
                        .addComponent(cancelarTeatroBtn))
                    .addContainerGap(33, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void cancelarTeatroBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  
            this.dispose();
        }                                                 

        private void agregarTeatroBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                 
            
            if (!(("".equals(this.nombreTeatroField.getText()) && ("".equals(this.direccionTeatroField.getText()))))){
                if (modificando){
                    Teatro newTeatro = new Teatro(this.nombreTeatroField.getText(),this.direccionTeatroField.getText());
                    newTeatro.setFunciones(teatros.get(numTeatro).getFunciones());
                    teatros.remove(numTeatro);
                    teatros.add(numTeatro,newTeatro);
                    setCombo();
                    setTabla();
                    this.dispose();
                    
                } else {
                    teatros.add(new Teatro(this.nombreTeatroField.getText(),this.direccionTeatroField.getText()));
                    setCombo();
                    this.dispose();
                }
            }else {
                JOptionPane.showMessageDialog(this, "Los valores ingresados no son válidos",
                    (modificando?"Error al modificar teatro":"Error al agregar teatro"),JOptionPane.ERROR_MESSAGE);
            }
            
        }                                                

        public void toModify(Teatro teatro) {
            this.modificando = true;
            this.titulo.setText("Modificar Teatro");
            this.agregarTeatroBtn.setText("Modificar");
            this.nombreTeatroField.setText(teatro.getNombre());
            this.direccionTeatroField.setText(teatro.getDireccion());
        }



        // Variables declaration - do not modify                     
        private javax.swing.JButton agregarTeatroBtn;
        private javax.swing.JButton cancelarTeatroBtn;
        private javax.swing.JTextField direccionTeatroField;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JTextField nombreTeatroField;
        private javax.swing.JLabel titulo;
        // End of variables declaration                   
        private boolean modificando;
    }
    
    private class PantallaModificar extends javax.swing.JFrame {

        
        public PantallaModificar() {
            initComponents();
            setLocationRelativeTo(null);
            setVisible(true);
            this.modificarTeatroCombo.setText(teatros.get(numTeatro).getNombre());
            this.modificarNombreField.setText(teatros.get(numTeatro).getFunciones().get(numFuncion).getNombre());
            this.modificarPrecioField.setText(String.valueOf(teatros.get(numTeatro).getFunciones().get(numFuncion).getPrecio()));
        }

        
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            modificarTeatroCombo = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            modificarNombreField = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            modificarPrecioField = new javax.swing.JTextField();
            modificarFuncionBtn = new javax.swing.JButton();
            cancelarFuncionBtn = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
            jLabel1.setText("Modificar Función");

            jLabel2.setText("Teatro:");

            modificarTeatroCombo.setText(teatrosCombo.getSelectedItem().toString());

            jLabel3.setText("Nombre: ");

            jLabel4.setText("Precio: ");

            modificarFuncionBtn.setText("Modificar");
            modificarFuncionBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modificarFuncionBtnActionPerformed(evt);
                }
            });

            cancelarFuncionBtn.setText("Cancelar");
            cancelarFuncionBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cancelarFuncionBtnActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jLabel1)
                            .addGap(0, 39, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modificarPrecioField)
                                .addComponent(modificarTeatroCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modificarNombreField)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(cancelarFuncionBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarFuncionBtn)
                            .addGap(17, 17, 17)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(modificarTeatroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(modificarNombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(modificarPrecioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modificarFuncionBtn)
                        .addComponent(cancelarFuncionBtn))
                    .addContainerGap(38, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void modificarFuncionBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                    
            try{
                if (!(("".equals(this.modificarNombreField.getText())) && ("".equals(this.modificarPrecioField.getText())))){
                    Teatro newTeatro = teatros.get(numTeatro);
                    ArrayList<Funcion> newFunciones = newTeatro.getFunciones();
                    newFunciones.set(numFuncion,new Funcion(this.modificarNombreField.getText(),
                        Double.parseDouble(this.modificarPrecioField.getText())));
                    newTeatro.setFunciones(newFunciones);
                    teatros.set(numTeatro, newTeatro);
                    setTabla();
                    this.dispose();
                } else {
                    throw new Exception();
                }
                    
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "Los valores ingresados no son válidos",
                    "Error al modificar función.",JOptionPane.ERROR_MESSAGE);
            } 
        }                                                   

        private void cancelarFuncionBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                   
            this.dispose();
        }                                                  
        


        // Variables declaration - do not modify                     
        private javax.swing.JButton cancelarFuncionBtn;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JButton modificarFuncionBtn;
        private javax.swing.JTextField modificarNombreField;
        private javax.swing.JTextField modificarPrecioField;
        private javax.swing.JLabel modificarTeatroCombo;
        // End of variables declaration                   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarFuncionBtn;
    private javax.swing.JButton agregarTeatroBtn;
    private javax.swing.JMenuItem eliminarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarFuncionBtn;
    private javax.swing.JMenuItem modificarBtn;
    private javax.swing.JTextField nombreFuncionField;
    private javax.swing.JTextField precioFuncionField;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> teatrosCombo;
    // End of variables declaration//GEN-END:variables
    
    private String filepath = "./data.json";
    private ArrayList<Teatro> teatros;
    private int numTeatro;
    private int numFuncion;
    private int rowValue;
    private int contador;
    private ArrayList<Object[]> data;
    
}
