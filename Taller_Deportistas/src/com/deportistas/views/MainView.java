/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.deportistas.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.deportistas.models.deportista.Deportista;
import com.deportistas.models.deportista.ListaDeportistas;
import com.deportistas.models.disciplinas.ListaDisciplina;

/**
 *
 * @author enaldo1709
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainViews
     */
    public MainView() {
        initComponents();
        this.deportistas = new ListaDeportistas();
        this.disciplinas = new ListaDisciplina();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addDeportista = new javax.swing.JButton();
        addDisciplina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        editDeportista = new javax.swing.JButton();
        deleteDeportista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Disciplina", "Experiencia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tipo de letra del sistema", 0, 24)); // NOI18N
        jLabel1.setText("Deportistas");

        addDeportista.setText("Agregar Deportista");
        addDeportista.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                try {
                    addDeportistaActionPerformed(evt);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        addDisciplina.setText("Agregar disciplina");
        addDisciplina.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                addDisciplinaActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar por ID:");

        search.setText("🔍️");

        editDeportista.setText("Editar");

        deleteDeportista.setText("Eliminar");
        deleteDeportista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteDeportistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(addDeportista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addDisciplina)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(editDeportista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteDeportista)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDeportista)
                    .addComponent(addDisciplina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editDeportista)
                    .addComponent(deleteDeportista))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteDeportistaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteDeportistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteDeportistaActionPerformed

    private void addDeportistaActionPerformed(ActionEvent evt) throws InterruptedException{
        new AddDeportista(deportistas,disciplinas);
    }
    private void addDisciplinaActionPerformed(ActionEvent evt) {
        new AddDisciplina(disciplinas);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDeportista;
    private javax.swing.JButton addDisciplina;
    private javax.swing.JButton deleteDeportista;
    private javax.swing.JButton editDeportista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables


    //Variables de lógica
    private ListaDeportistas deportistas;
    private ListaDisciplina disciplinas;
}
