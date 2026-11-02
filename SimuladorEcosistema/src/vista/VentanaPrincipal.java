package vista;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        
        this.controlador = new controlador.ControladorPrincipal(this);
        
        this.panelConfiguracion.setControlador(this.controlador);
        this.panelSimulacion.setControlador(this.controlador);
        
        habilitarReporte(false);
        mostrarConfiguracion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        java.awt.GridBagConstraints gridBagConstraints;

        panelCabecera = new javax.swing.JPanel();
        panelIdentidad = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIdentificador = new javax.swing.JLabel();
        panelSecciones = new javax.swing.JPanel();
        seccionConfiguracion = new javax.swing.JPanel();
        btnSeccionConfiguracion = new javax.swing.JToggleButton();
        subrayadoConfiguracion = new javax.swing.JPanel();
        seccionSimulacion = new javax.swing.JPanel();
        btnSeccionSimulacion = new javax.swing.JToggleButton();
        subrayadoSimulacion = new javax.swing.JPanel();
        seccionReporte = new javax.swing.JPanel();
        btnSeccionReporte = new javax.swing.JToggleButton();
        subrayadoReporte = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
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
        panelCabecera.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(226, 232, 240)));
        panelCabecera.setLayout(new java.awt.BorderLayout());

        panelIdentidad.setOpaque(false);
        panelIdentidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 24, 2, 24));
        panelIdentidad.setLayout(new java.awt.BorderLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(23, 37, 56));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/logo32.png"))); // NOI18N
        lblTitulo.setText("Simulador de Ecosistema");
        lblTitulo.setIconTextGap(12);
        panelIdentidad.add(lblTitulo, java.awt.BorderLayout.LINE_START);

        lblIdentificador.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblIdentificador.setForeground(new java.awt.Color(100, 116, 139));
        lblIdentificador.setText("SIN SIMULACIÓN ACTIVA");
        panelIdentidad.add(lblIdentificador, java.awt.BorderLayout.LINE_END);

        panelCabecera.add(panelIdentidad, java.awt.BorderLayout.PAGE_START);

        panelSecciones.setOpaque(false);
        panelSecciones.setLayout(new java.awt.GridBagLayout());

        seccionConfiguracion.setOpaque(false);
        seccionConfiguracion.setLayout(new java.awt.BorderLayout());

        btnSeccionConfiguracion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSeccionConfiguracion.setForeground(new java.awt.Color(100, 116, 139));
        btnSeccionConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/configuracion16.png"))); // NOI18N
        btnSeccionConfiguracion.setText("Configuración");
        btnSeccionConfiguracion.setBorder(javax.swing.BorderFactory.createEmptyBorder(13, 0, 11, 0));
        btnSeccionConfiguracion.setBorderPainted(false);
        btnSeccionConfiguracion.setContentAreaFilled(false);
        btnSeccionConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeccionConfiguracion.setFocusPainted(false);
        btnSeccionConfiguracion.setIconTextGap(8);
        btnSeccionConfiguracion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/configuracion16activo.png"))); // NOI18N
        btnSeccionConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeccionConfiguracionActionPerformed(evt);
            }
        });
        seccionConfiguracion.add(btnSeccionConfiguracion, java.awt.BorderLayout.CENTER);

        subrayadoConfiguracion.setBackground(new java.awt.Color(47, 133, 90));
        subrayadoConfiguracion.setPreferredSize(new java.awt.Dimension(10, 2));
        subrayadoConfiguracion.setLayout(new java.awt.BorderLayout());
        seccionConfiguracion.add(subrayadoConfiguracion, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 0);
        panelSecciones.add(seccionConfiguracion, gridBagConstraints);

        seccionSimulacion.setOpaque(false);
        seccionSimulacion.setLayout(new java.awt.BorderLayout());

        btnSeccionSimulacion.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSeccionSimulacion.setForeground(new java.awt.Color(100, 116, 139));
        btnSeccionSimulacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/simulacion16.png"))); // NOI18N
        btnSeccionSimulacion.setText("Simulación");
        btnSeccionSimulacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(13, 0, 11, 0));
        btnSeccionSimulacion.setBorderPainted(false);
        btnSeccionSimulacion.setContentAreaFilled(false);
        btnSeccionSimulacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeccionSimulacion.setFocusPainted(false);
        btnSeccionSimulacion.setIconTextGap(8);
        btnSeccionSimulacion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/simulacion16activo.png"))); // NOI18N
        btnSeccionSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeccionSimulacionActionPerformed(evt);
            }
        });
        seccionSimulacion.add(btnSeccionSimulacion, java.awt.BorderLayout.CENTER);

        subrayadoSimulacion.setBackground(new java.awt.Color(47, 133, 90));
        subrayadoSimulacion.setPreferredSize(new java.awt.Dimension(10, 2));
        subrayadoSimulacion.setLayout(new java.awt.BorderLayout());
        seccionSimulacion.add(subrayadoSimulacion, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 28, 0, 0);
        panelSecciones.add(seccionSimulacion, gridBagConstraints);

        seccionReporte.setOpaque(false);
        seccionReporte.setLayout(new java.awt.BorderLayout());

        btnSeccionReporte.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSeccionReporte.setForeground(new java.awt.Color(100, 116, 139));
        btnSeccionReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reporte16.png"))); // NOI18N
        btnSeccionReporte.setText("Reporte");
        btnSeccionReporte.setBorder(javax.swing.BorderFactory.createEmptyBorder(13, 0, 11, 0));
        btnSeccionReporte.setBorderPainted(false);
        btnSeccionReporte.setContentAreaFilled(false);
        btnSeccionReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeccionReporte.setFocusPainted(false);
        btnSeccionReporte.setIconTextGap(8);
        btnSeccionReporte.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/reporte16activo.png"))); // NOI18N
        btnSeccionReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeccionReporteActionPerformed(evt);
            }
        });
        seccionReporte.add(btnSeccionReporte, java.awt.BorderLayout.CENTER);

        subrayadoReporte.setBackground(new java.awt.Color(47, 133, 90));
        subrayadoReporte.setPreferredSize(new java.awt.Dimension(10, 2));
        subrayadoReporte.setLayout(new java.awt.BorderLayout());
        seccionReporte.add(subrayadoReporte, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 28, 0, 0);
        panelSecciones.add(seccionReporte, gridBagConstraints);

        panelCabecera.add(panelSecciones, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelCabecera, java.awt.BorderLayout.PAGE_START);

        panelContenido.setBackground(new java.awt.Color(248, 250, 252));
        panelContenido.setLayout(new java.awt.CardLayout());
        panelContenido.add(panelConfiguracion, "configuracion");
        panelContenido.add(panelSimulacion, "simulacion");
        panelContenido.add(panelReporte, "reporte");

        getContentPane().add(panelContenido, java.awt.BorderLayout.CENTER);

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
        menuSimulacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 80, 7, 56));
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
        menuReportes.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 59, 7, 51));
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

    private void btnSeccionConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionConfiguracionActionPerformed
        mostrarConfiguracion();
    }//GEN-LAST:event_btnSeccionConfiguracionActionPerformed

    private void btnSeccionSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionSimulacionActionPerformed
        mostrarSimulacion();
    }//GEN-LAST:event_btnSeccionSimulacionActionPerformed

    private void btnSeccionReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeccionReporteActionPerformed
        mostrarReporte();
    }//GEN-LAST:event_btnSeccionReporteActionPerformed

    private void menuSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSimulacionActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_menuSimulacionActionPerformed

    private void menuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuReportesActionPerformed

    public void mostrarConfiguracion() {
        mostrarSeccion("configuracion", btnSeccionConfiguracion);
    }

    public void mostrarSimulacion() {
        mostrarSeccion("simulacion", btnSeccionSimulacion);
    }

    public void mostrarReporte() {
        mostrarSeccion("reporte", btnSeccionReporte);
    }

    private void mostrarSeccion(String tarjeta, javax.swing.JToggleButton activa) {
        ((java.awt.CardLayout) panelContenido.getLayout()).show(panelContenido, tarjeta);
        javax.swing.JToggleButton[] secciones = {btnSeccionConfiguracion, btnSeccionSimulacion, btnSeccionReporte};
        javax.swing.JPanel[] subrayados = {subrayadoConfiguracion, subrayadoSimulacion, subrayadoReporte};
        for (int i = 0; i < secciones.length; i++) {
            boolean seleccionada = secciones[i] == activa;
            secciones[i].setSelected(seleccionada);
            secciones[i].setForeground(seleccionada ? COLOR_ACTIVO : COLOR_INACTIVO);
            subrayados[i].setVisible(seleccionada);
        }
    }

    public void habilitarReporte(boolean habilitado) {
        btnSeccionReporte.setEnabled(habilitado);
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
    
    
    private static final java.awt.Color COLOR_ACTIVO = new java.awt.Color(47, 133, 90);
    private static final java.awt.Color COLOR_INACTIVO = new java.awt.Color(100, 116, 139);

    private controlador.ControladorPrincipal controlador;
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JToggleButton btnSeccionConfiguracion;
    private javax.swing.JToggleButton btnSeccionReporte;
    private javax.swing.JToggleButton btnSeccionSimulacion;
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
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelIdentidad;
    private vista.PanelReporte panelReporte;
    private javax.swing.JPanel panelSecciones;
    private vista.PanelSimulacion panelSimulacion;
    private javax.swing.JPanel seccionConfiguracion;
    private javax.swing.JPanel seccionReporte;
    private javax.swing.JPanel seccionSimulacion;
    private javax.swing.JPanel subrayadoConfiguracion;
    private javax.swing.JPanel subrayadoReporte;
    private javax.swing.JPanel subrayadoSimulacion;
    // End of variables declaration//GEN-END:variables
}
