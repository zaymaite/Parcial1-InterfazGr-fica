package vista;

public class PanelConfiguracion extends javax.swing.JPanel {

    private controlador.ControladorPrincipal controlador;

    public PanelConfiguracion() {
        initComponents();
    }

    public void setControlador(controlador.ControladorPrincipal controlador) {
        this.controlador = controlador;
    }

    public void limpiarFormulario() {
        txtPlantas.setText("");
        txtConejos.setText("");
        txtLobos.setText("");
        txtTurnos.setText("");
        cmbClima.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tarjeta = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        panelFilaTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblInsignia = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        panelCuerpo = new javax.swing.JPanel();
        seccionPoblacion = new javax.swing.JPanel();
        lblPoblacion = new javax.swing.JLabel();
        seccionPoblacionCampos = new javax.swing.JPanel();
        campoPlantas = new javax.swing.JPanel();
        lblPlantas = new javax.swing.JLabel();
        txtPlantas = new javax.swing.JTextField();
        lblAyudaPlantas = new javax.swing.JLabel();
        campoConejos = new javax.swing.JPanel();
        lblConejos = new javax.swing.JLabel();
        txtConejos = new javax.swing.JTextField();
        lblAyudaConejos = new javax.swing.JLabel();
        campoLobos = new javax.swing.JPanel();
        lblLobos = new javax.swing.JLabel();
        txtLobos = new javax.swing.JTextField();
        lblAyudaLobos = new javax.swing.JLabel();
        seccionCondiciones = new javax.swing.JPanel();
        lblCondiciones = new javax.swing.JLabel();
        seccionCondicionesCampos = new javax.swing.JPanel();
        campoClima = new javax.swing.JPanel();
        lblClima = new javax.swing.JLabel();
        cmbClima = new javax.swing.JComboBox<>();
        lblAyudaClima = new javax.swing.JLabel();
        campoTurnos = new javax.swing.JPanel();
        lblTurnos = new javax.swing.JLabel();
        txtTurnos = new javax.swing.JTextField();
        lblAyudaTurnos = new javax.swing.JLabel();
        panelPie = new javax.swing.JPanel();
        lblAyudaPie = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnContinuar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 250, 252));
        setLayout(new java.awt.GridBagLayout());

        tarjeta.setBackground(new java.awt.Color(255, 255, 255));
        tarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)));
        tarjeta.setLayout(new java.awt.BorderLayout());

        panelEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        panelEncabezado.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(28, 28, 24, 28)));
        panelEncabezado.setLayout(new java.awt.BorderLayout(0, 10));

        panelFilaTitulo.setOpaque(false);
        panelFilaTitulo.setLayout(new java.awt.BorderLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(23, 37, 56));
        lblTitulo.setText("Configuración Inicial");
        panelFilaTitulo.add(lblTitulo, java.awt.BorderLayout.LINE_START);

        lblInsignia.setBackground(new java.awt.Color(241, 245, 249));
        lblInsignia.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblInsignia.setForeground(new java.awt.Color(71, 85, 105));
        lblInsignia.setText("Nueva simulación");
        lblInsignia.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        lblInsignia.setOpaque(true);
        panelFilaTitulo.add(lblInsignia, java.awt.BorderLayout.LINE_END);

        panelEncabezado.add(panelFilaTitulo, java.awt.BorderLayout.PAGE_START);

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(100, 116, 139));
        lblSubtitulo.setText("Defina la población y las condiciones de partida del ecosistema.");
        panelEncabezado.add(lblSubtitulo, java.awt.BorderLayout.CENTER);

        tarjeta.add(panelEncabezado, java.awt.BorderLayout.PAGE_START);

        panelCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        panelCuerpo.setBorder(javax.swing.BorderFactory.createEmptyBorder(24, 28, 28, 28));
        panelCuerpo.setLayout(new java.awt.BorderLayout(0, 28));

        seccionPoblacion.setBackground(new java.awt.Color(255, 255, 255));
        seccionPoblacion.setLayout(new java.awt.BorderLayout(0, 14));

        lblPoblacion.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblPoblacion.setForeground(new java.awt.Color(100, 116, 139));
        lblPoblacion.setText("POBLACIÓN INICIAL");
        seccionPoblacion.add(lblPoblacion, java.awt.BorderLayout.PAGE_START);

        seccionPoblacionCampos.setBackground(new java.awt.Color(255, 255, 255));
        seccionPoblacionCampos.setLayout(new java.awt.GridLayout(1, 3, 16, 0));

        campoPlantas.setBackground(new java.awt.Color(255, 255, 255));
        campoPlantas.setLayout(new java.awt.BorderLayout(0, 8));

        lblPlantas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblPlantas.setForeground(new java.awt.Color(16, 185, 129));
        lblPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta16.png"))); // NOI18N
        lblPlantas.setText("Cantidad de Plantas");
        campoPlantas.add(lblPlantas, java.awt.BorderLayout.PAGE_START);

        txtPlantas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPlantas.setForeground(new java.awt.Color(23, 37, 56));
        txtPlantas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        txtPlantas.setPreferredSize(new java.awt.Dimension(200, 40));
        campoPlantas.add(txtPlantas, java.awt.BorderLayout.CENTER);

        lblAyudaPlantas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAyudaPlantas.setForeground(new java.awt.Color(100, 116, 139));
        lblAyudaPlantas.setText("Entre 5 y 30 plantas");
        campoPlantas.add(lblAyudaPlantas, java.awt.BorderLayout.PAGE_END);

        seccionPoblacionCampos.add(campoPlantas);

        campoConejos.setBackground(new java.awt.Color(255, 255, 255));
        campoConejos.setLayout(new java.awt.BorderLayout(0, 8));

        lblConejos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblConejos.setForeground(new java.awt.Color(14, 165, 233));
        lblConejos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conejo16.png"))); // NOI18N
        lblConejos.setText("Cantidad de Conejos");
        campoConejos.add(lblConejos, java.awt.BorderLayout.PAGE_START);

        txtConejos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConejos.setForeground(new java.awt.Color(23, 37, 56));
        txtConejos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        txtConejos.setPreferredSize(new java.awt.Dimension(200, 40));
        campoConejos.add(txtConejos, java.awt.BorderLayout.CENTER);

        lblAyudaConejos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAyudaConejos.setForeground(new java.awt.Color(100, 116, 139));
        lblAyudaConejos.setText("Entre 2 y 15 conejos");
        campoConejos.add(lblAyudaConejos, java.awt.BorderLayout.PAGE_END);

        seccionPoblacionCampos.add(campoConejos);

        campoLobos.setBackground(new java.awt.Color(255, 255, 255));
        campoLobos.setLayout(new java.awt.BorderLayout(0, 8));

        lblLobos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblLobos.setForeground(new java.awt.Color(249, 115, 22));
        lblLobos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo16.png"))); // NOI18N
        lblLobos.setText("Cantidad de Lobos");
        campoLobos.add(lblLobos, java.awt.BorderLayout.PAGE_START);

        txtLobos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLobos.setForeground(new java.awt.Color(23, 37, 56));
        txtLobos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        txtLobos.setPreferredSize(new java.awt.Dimension(200, 40));
        campoLobos.add(txtLobos, java.awt.BorderLayout.CENTER);

        lblAyudaLobos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAyudaLobos.setForeground(new java.awt.Color(100, 116, 139));
        lblAyudaLobos.setText("Entre 1 y 5 lobos");
        campoLobos.add(lblAyudaLobos, java.awt.BorderLayout.PAGE_END);

        seccionPoblacionCampos.add(campoLobos);

        seccionPoblacion.add(seccionPoblacionCampos, java.awt.BorderLayout.CENTER);

        panelCuerpo.add(seccionPoblacion, java.awt.BorderLayout.PAGE_START);

        seccionCondiciones.setBackground(new java.awt.Color(255, 255, 255));
        seccionCondiciones.setLayout(new java.awt.BorderLayout(0, 14));

        lblCondiciones.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblCondiciones.setForeground(new java.awt.Color(100, 116, 139));
        lblCondiciones.setText("CONDICIONES INICIALES");
        seccionCondiciones.add(lblCondiciones, java.awt.BorderLayout.PAGE_START);

        seccionCondicionesCampos.setBackground(new java.awt.Color(255, 255, 255));
        seccionCondicionesCampos.setLayout(new java.awt.GridLayout(1, 2, 16, 0));

        campoClima.setBackground(new java.awt.Color(255, 255, 255));
        campoClima.setLayout(new java.awt.BorderLayout(0, 8));

        lblClima.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblClima.setForeground(new java.awt.Color(23, 37, 56));
        lblClima.setText("Clima Inicial");
        campoClima.add(lblClima, java.awt.BorderLayout.PAGE_START);

        cmbClima.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbClima.setForeground(new java.awt.Color(23, 37, 56));
        cmbClima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soleado", "Lluvioso", "Sequia", "Invierno" }));
        cmbClima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)));
        cmbClima.setPreferredSize(new java.awt.Dimension(200, 40));
        campoClima.add(cmbClima, java.awt.BorderLayout.CENTER);

        lblAyudaClima.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAyudaClima.setForeground(new java.awt.Color(100, 116, 139));
        lblAyudaClima.setText("Condición al comenzar la simulación");
        campoClima.add(lblAyudaClima, java.awt.BorderLayout.PAGE_END);

        seccionCondicionesCampos.add(campoClima);

        campoTurnos.setBackground(new java.awt.Color(255, 255, 255));
        campoTurnos.setLayout(new java.awt.BorderLayout(0, 8));

        lblTurnos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblTurnos.setForeground(new java.awt.Color(23, 37, 56));
        lblTurnos.setText("Cantidad de Turnos");
        campoTurnos.add(lblTurnos, java.awt.BorderLayout.PAGE_START);

        txtTurnos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTurnos.setForeground(new java.awt.Color(23, 37, 56));
        txtTurnos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 225)), javax.swing.BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        txtTurnos.setPreferredSize(new java.awt.Dimension(200, 40));
        campoTurnos.add(txtTurnos, java.awt.BorderLayout.CENTER);

        lblAyudaTurnos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAyudaTurnos.setForeground(new java.awt.Color(100, 116, 139));
        lblAyudaTurnos.setText("Entre 10 y 50 turnos");
        campoTurnos.add(lblAyudaTurnos, java.awt.BorderLayout.PAGE_END);

        seccionCondicionesCampos.add(campoTurnos);

        seccionCondiciones.add(seccionCondicionesCampos, java.awt.BorderLayout.CENTER);

        panelCuerpo.add(seccionCondiciones, java.awt.BorderLayout.CENTER);

        tarjeta.add(panelCuerpo, java.awt.BorderLayout.CENTER);

        panelPie.setBackground(new java.awt.Color(248, 250, 252));
        panelPie.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 28, 16, 28)));
        panelPie.setLayout(new java.awt.BorderLayout());

        lblAyudaPie.setForeground(new java.awt.Color(100, 116, 139));
        lblAyudaPie.setText("Complete todos los campos para iniciar.");
        panelPie.add(lblAyudaPie, java.awt.BorderLayout.LINE_START);

        panelBotones.setOpaque(false);
        panelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 0));

        btnContinuar.setBackground(new java.awt.Color(241, 245, 249));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(23, 37, 56));
        btnContinuar.setText("Continuar Partida Guardada");
        btnContinuar.setBorderPainted(false);
        btnContinuar.setFocusPainted(false);
        btnContinuar.setPreferredSize(new java.awt.Dimension(230, 38));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        panelBotones.add(btnContinuar);

        btnIniciar.setBackground(new java.awt.Color(47, 133, 90));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar Simulación");
        btnIniciar.setBorderPainted(false);
        btnIniciar.setFocusPainted(false);
        btnIniciar.setPreferredSize(new java.awt.Dimension(180, 38));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        panelBotones.add(btnIniciar);

        panelPie.add(panelBotones, java.awt.BorderLayout.LINE_END);

        tarjeta.add(panelPie, java.awt.BorderLayout.PAGE_END);

        add(tarjeta, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (controlador != null) {
            controlador.cargarPartida();
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (controlador != null) {
            controlador.iniciarNuevaSimulacion(txtPlantas.getText(), txtConejos.getText(), txtLobos.getText(), txtTurnos.getText(), String.valueOf(cmbClima.getSelectedItem()));
        }
    }//GEN-LAST:event_btnIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel campoClima;
    private javax.swing.JPanel campoConejos;
    private javax.swing.JPanel campoLobos;
    private javax.swing.JPanel campoPlantas;
    private javax.swing.JPanel campoTurnos;
    private javax.swing.JComboBox<String> cmbClima;
    private javax.swing.JLabel lblAyudaClima;
    private javax.swing.JLabel lblAyudaConejos;
    private javax.swing.JLabel lblAyudaLobos;
    private javax.swing.JLabel lblAyudaPie;
    private javax.swing.JLabel lblAyudaPlantas;
    private javax.swing.JLabel lblAyudaTurnos;
    private javax.swing.JLabel lblClima;
    private javax.swing.JLabel lblCondiciones;
    private javax.swing.JLabel lblConejos;
    private javax.swing.JLabel lblInsignia;
    private javax.swing.JLabel lblLobos;
    private javax.swing.JLabel lblPlantas;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTurnos;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelFilaTitulo;
    private javax.swing.JPanel panelPie;
    private javax.swing.JPanel seccionCondiciones;
    private javax.swing.JPanel seccionCondicionesCampos;
    private javax.swing.JPanel seccionPoblacion;
    private javax.swing.JPanel seccionPoblacionCampos;
    private javax.swing.JPanel tarjeta;
    private javax.swing.JTextField txtConejos;
    private javax.swing.JTextField txtLobos;
    private javax.swing.JTextField txtPlantas;
    private javax.swing.JTextField txtTurnos;
    // End of variables declaration//GEN-END:variables
}
