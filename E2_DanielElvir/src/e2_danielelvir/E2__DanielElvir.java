/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e2_danielelvir;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class E2__DanielElvir extends javax.swing.JFrame {

    ArrayList<Numero> numeros = new ArrayList<>();
    static Scanner leer = new Scanner(System.in);

    /**
     * Creates new form E2__DanielElvir
     */
    public E2__DanielElvir() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Examen II");

        jButton1.setText("Numeros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Operaciones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String opcionStr = JOptionPane.showInputDialog(
                "Bienvenido a la opcion de Numeros\n"
                + "1. Agregar Numero\n"
                + "2. Eliminar Numero\n"
                + "3. Para volver al menu principal\n"
                + "Ingrese su opcion"
        );

        int opcion = Integer.parseInt(opcionStr);

        switch (opcion) {
            case 1: {
                boolean confirmar1 = true;
                boolean confirmar2 = true;
                String input = JOptionPane.showInputDialog("Ingrese la base del número:");
                int base = Integer.parseInt(input);
                while (confirmar1) {
                    if (base < 2 || base > 35) {
                        JOptionPane.showMessageDialog(null, "BASE FUERA DE LOS PARAMETROS");
                        input = JOptionPane.showInputDialog("Ingrese la base del número:");
                        base = Integer.parseInt(input);
                    } else {
                        confirmar1 = false;
                    }
                }
                input = JOptionPane.showInputDialog("Ingrese el valor decimal del número:");
                int valorDecimal = Integer.parseInt(input);
                while (confirmar2) {
                    if (valorDecimal < 0) {
                        JOptionPane.showMessageDialog(null, "El valor es muy pequeño");
                        input = JOptionPane.showInputDialog("Ingrese el valor decimal del número:");
                        valorDecimal = Integer.parseInt(input);
                    } else {
                        confirmar2 = false;
                    }
                }
                Numero numero = new Numero(base, valorDecimal);
                numeros.add(numero);
                JOptionPane.showMessageDialog(null, "Número agregado correctamente.");

                Respuesta();

                break;
            }

            case 2: {
                if (numeros.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía, primero debe llenarla.");
                } else {
                    String input = JOptionPane.showInputDialog("Ingrese el índice del número que desea eliminar:");
                    Respuesta();
                    int indice = Integer.parseInt(input);
                    int indiceReal = indice - 1;

                    if (indiceReal >= 0 && indiceReal < numeros.size()) {
                        numeros.remove(indiceReal);
                        JOptionPane.showMessageDialog(null, "Número eliminado correctamente.");
                        System.out.println("Nueva lista");
                        System.out.println("");
                        Respuesta();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido.");
                    }
                }
                break;
            }

            case 3: {
                JOptionPane.showMessageDialog(null, "Volviendo al menu principal");

                break;
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean seguir = true;
        while (seguir) {
            if (numeros.isEmpty()) {
                System.out.println("La lista está vacia, necesita llenarla primero");
            } else {
                String opcionStr = JOptionPane.showInputDialog(
                        "Bienvenido a la opcion de Numeros\n"
                        + "1. Sumar Numeros\n"
                        + "2. Restar Numeros\n"
                        + "3. Multiplicar numeros\n"
                        + "4. Para volver al numero principal\n"
                        + "Ingrese su opcion"
                );

                int opcion = Integer.parseInt(opcionStr);

                switch (opcion) {
                    case 1: {
                        Respuesta();
                        String input1 = JOptionPane.showInputDialog("Ingrese el índice del primer número para sumar:");
                        int indice1 = Integer.parseInt(input1) - 1;
                        String input2 = JOptionPane.showInputDialog("Ingrese el índice del segundo número para sumar:");
                        int indice2 = Integer.parseInt(input2) - 1;

                        if (indice1 >= 0 && indice1 < numeros.size() && indice2 >= 0 && indice2 < numeros.size()) {

                        } else {
                            JOptionPane.showMessageDialog(null, "Índices inválidos.");
                        }

                        break;
                    }

                    case 2: {
                        Respuesta();
                        String input1 = JOptionPane.showInputDialog("Ingrese el índice del primer número para sumar:");
                        int indice1 = Integer.parseInt(input1) - 1;
                        String input2 = JOptionPane.showInputDialog("Ingrese el índice del segundo número para sumar:");
                        int indice2 = Integer.parseInt(input2) - 1;

                        if (indice1 >= 0 && indice1 < numeros.size() && indice2 >= 0 && indice2 < numeros.size()) {

                        } else {
                            JOptionPane.showMessageDialog(null, "Índices inválidos.");
                        }

                        break;
                    }

                    case 3: {
                        Respuesta();
                        String input1 = JOptionPane.showInputDialog("Ingrese el índice del primer número para sumar:");
                        int indice1 = Integer.parseInt(input1) - 1;
                        String input2 = JOptionPane.showInputDialog("Ingrese el índice del segundo número para sumar:");
                        int indice2 = Integer.parseInt(input2) - 1;

                        if (indice1 >= 0 && indice1 < numeros.size() && indice2 >= 0 && indice2 < numeros.size()) {

                        } else {
                            JOptionPane.showMessageDialog(null, "Índices inválidos.");
                        }

                        break;

                    }

                    case 4: {
                        JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                        seguir = false;
                        break;
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    public void Respuesta() {
        System.out.println("Números disponibles:");
        for (int i = 0; i < numeros.size(); i++) {
            Numero num = numeros.get(i);
            System.out.println((i + 1) + ". " + num.getNumero() + " en base " + num.getBase() + " : " + num.getDecimal());
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
