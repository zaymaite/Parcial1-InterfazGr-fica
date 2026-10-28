package vista;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        
        this.controlador = new controlador.ControladorPrincipal(this);
        
        this.panelSimulacion.setControlador(this.controlador);
        
        habilitarReporte(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabecera = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIdentificador = new javax.swing.JLabel();
        pestanias = new javax.swing.JTabbedPane();
        panelConfiguracion = new vista.PanelConfiguracion();
        panelSimulacion = new vista.PanelSimulacion();
        panelReporte = new vista.PanelReporte();
        panelEstado = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        lblAplicacion = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuSimulacion = new javax.swing.JMenu();
        itemNuevaSimulacion = new javax.swing.JMenuItem();
        itemGuardarPartida = new javax.swing.JMenuItem();
        itemCargarPartida = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        itemVerReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Ecosistema");
        setMinimumSize(new java.awt.Dimension(900, 650));

        panelCabecera.setBackground(new java.awt.Color(255, 255, 255));
        panelCabecera.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 24, 12, 24));
        panelCabecera.setLayout(new java.awt.BorderLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(23, 37, 56));
        lblTitulo.setText("Simulador de Ecosistema");
        panelCabecera.add(lblTitulo, java.awt.BorderLayout.LINE_START);

        lblIdentificador.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblIdentificador.setForeground(new java.awt.Color(100, 116, 139));
        lblIdentificador.setText("SIN SIMULACIÓN ACTIVA");
        panelCabecera.add(lblIdentificador, java.awt.BorderLayout.LINE_END);

        getContentPane().add(panelCabecera, java.awt.BorderLayout.PAGE_START);

        pestanias.setBackground(new java.awt.Color(255, 255, 255));
        pestanias.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        pestanias.addTab("Configuración", panelConfiguracion);
        pestanias.addTab("Simulación", panelSimulacion);
        pestanias.addTab("Reporte", panelReporte);

        getContentPane().add(pestanias, java.awt.BorderLayout.CENTER);

        panelEstado.setBackground(new java.awt.Color(248, 250, 252));
        panelEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(226, 232, 240)));
        panelEstado.setLayout(new java.awt.BorderLayout());

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(100, 116, 139));
        lblEstado.setText("Sin simulación en curso");
        lblEstado.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 24, 6, 24));
        panelEstado.add(lblEstado, java.awt.BorderLayout.LINE_START);

        lblAplicacion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAplicacion.setForeground(new java.awt.Color(100, 116, 139));
        lblAplicacion.setText("Simulador de Ecosistema");
        lblAplicacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 24, 6, 24));
        panelEstado.add(lblAplicacion, java.awt.BorderLayout.LINE_END);

        getContentPane().add(panelEstado, java.awt.BorderLayout.PAGE_END);

        barraMenu.setBackground(new java.awt.Color(243, 244, 246));
        barraMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(55, 65, 81)));

        menuSimulacion.setText("Simulación");
        menuSimulacion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        menuSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSimulacionActionPerformed(evt);
            }
        });

        itemNuevaSimulacion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        itemNuevaSimulacion.setText("Nueva Simulación");
        itemNuevaSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevaSimulacionActionPerformed(evt);
            }
        });
        menuSimulacion.add(itemNuevaSimulacion);

        itemGuardarPartida.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        itemGuardarPartida.setText("Guardar Partida");
        itemGuardarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarPartidaActionPerformed(evt);
            }
        });
        menuSimulacion.add(itemGuardarPartida);

        itemCargarPartida.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        itemCargarPartida.setText("Cargar Partida");
        itemCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCargarPartidaActionPerformed(evt);
            }
        });
        menuSimulacion.add(itemCargarPartida);

        barraMenu.add(menuSimulacion);

        menuReportes.setText("Reportes");
        menuReportes.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        menuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportesActionPerformed(evt);
            }
        });

        itemVerReporte.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        itemVerReporte.setText("Ver Reporte");
        itemVerReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerReporteActionPerformed(evt);
            }
        });
        menuReportes.add(itemVerReporte);

        barraMenu.add(menuReportes);

        setJMenuBar(barraMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemNuevaSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevaSimulacionActionPerformed
        mostrarConfiguracion();
    }//GEN-LAST:event_itemNuevaSimulacionActionPerformed
  
   
    private void itemGuardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarPartidaActionPerformed
        if (controlador != null) {
            controlador.guardarPartida();
        }
    }//GEN-LAST:event_itemGuardarPartidaActionPerformed

    private void itemCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCargarPartidaActionPerformed
        if (controlador != null) {
            controlador.cargarPartida();
        }
    }//GEN-LAST:event_itemCargarPartidaActionPerformed

    private void itemVerReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerReporteActionPerformed
        mostrarReporte();
    }//GEN-LAST:event_itemVerReporteActionPerformed

    private void menuSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSimulacionActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_menuSimulacionActionPerformed

    private void menuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuReportesActionPerformed

    public void mostrarConfiguracion() {
        pestanias.setSelectedComponent(panelConfiguracion);
    }

    public void mostrarSimulacion() {
        pestanias.setSelectedComponent(panelSimulacion);
    }

    public void mostrarReporte() {
        pestanias.setSelectedComponent(panelReporte);
    }

    public void habilitarReporte(boolean habilitado) {
        pestanias.setEnabledAt(pestanias.indexOfComponent(panelReporte), habilitado);
        itemVerReporte.setEnabled(habilitado);
    }

    public void habilitarGuardado(boolean habilitado) {
        itemGuardarPartida.setEnabled(habilitado);
    }

    public void setIdentificador(String texto) {
        lblIdentificador.setText(texto);
    }

    public void setEstado(String texto) {
        lblEstado.setText(texto);
    }

    public void mostrarMensaje(String mensaje) {
        javax.swing.JOptionPane.showMessageDialog(this, mensaje, "Simulador de Ecosistema", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarError(String mensaje) {
        javax.swing.JOptionPane.showMessageDialog(this, mensaje, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    public boolean confirmar(String mensaje) {
        int opcion = javax.swing.JOptionPane.showConfirmDialog(this, mensaje, "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
        return opcion == javax.swing.JOptionPane.YES_OPTION;
    }

    public PanelConfiguracion getPanelConfiguracion() {
        return panelConfiguracion;
    }

    public PanelSimulacion getPanelSimulacion() {
        return panelSimulacion;
    }

    public PanelReporte getPanelReporte() {
        return panelReporte;
    }
    
    
    private controlador.ControladorPrincipal controlador;
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemCargarPartida;
    private javax.swing.JMenuItem itemGuardarPartida;
    private javax.swing.JMenuItem itemNuevaSimulacion;
    private javax.swing.JMenuItem itemVerReporte;
    private javax.swing.JLabel lblAplicacion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIdentificador;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuSimulacion;
    private javax.swing.JPanel panelCabecera;
    private vista.PanelConfiguracion panelConfiguracion;
    private javax.swing.JPanel panelEstado;
    private vista.PanelReporte panelReporte;
    private vista.PanelSimulacion panelSimulacion;
    private javax.swing.JTabbedPane pestanias;
    // End of variables declaration//GEN-END:variables
}
