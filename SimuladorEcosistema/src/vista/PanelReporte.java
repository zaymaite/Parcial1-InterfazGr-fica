package vista;

public class PanelReporte extends javax.swing.JPanel {

    public PanelReporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        panelTitulos = new javax.swing.JPanel();
        lblEtiqueta = new javax.swing.JLabel();
        lblTituloReporte = new javax.swing.JLabel();
        lblTurnoFin = new javax.swing.JLabel();
        panelCentro = new javax.swing.JPanel();
        panelDestacados = new javax.swing.JPanel();
        tarjetaActividad = new javax.swing.JPanel();
        lblTituloActividad = new javax.swing.JLabel();
        lblTurnoActividad = new javax.swing.JLabel();
        lblEventosActividad = new javax.swing.JLabel();
        tarjetaLongevas = new javax.swing.JPanel();
        lblTituloLongevas = new javax.swing.JLabel();
        panelLongevas = new javax.swing.JPanel();
        lblPlantaLongeva = new javax.swing.JLabel();
        lblConejoLongevo = new javax.swing.JLabel();
        lblLoboLongevo = new javax.swing.JLabel();
        tarjetaCacerias = new javax.swing.JPanel();
        lblTituloCacerias = new javax.swing.JLabel();
        lblLoboCacerias = new javax.swing.JLabel();
        lblCantCacerias = new javax.swing.JLabel();
        panelTotales = new javax.swing.JPanel();
        tarjetaNacimiento = new javax.swing.JPanel();
        panelCabNacimientos = new javax.swing.JPanel();
        panelTitulosNac = new javax.swing.JPanel();
        lblTituloNacimientos = new javax.swing.JLabel();
        lblSubNacimientos = new javax.swing.JLabel();
        lblTotalNacimientos = new javax.swing.JLabel();
        panelBarrasNacimientos = new javax.swing.JPanel();
        filaNacPlantas = new javax.swing.JPanel();
        lblNacPlantasTxt = new javax.swing.JLabel();
        barNacPlantas = new javax.swing.JProgressBar();
        lblNacPlantas = new javax.swing.JLabel();
        filaNacConejos = new javax.swing.JPanel();
        lblNacConejosTxt = new javax.swing.JLabel();
        barNacConejos = new javax.swing.JProgressBar();
        lblNacConejos = new javax.swing.JLabel();
        filaNacLobos = new javax.swing.JPanel();
        lblNacLobosTxt = new javax.swing.JLabel();
        barNacLobos = new javax.swing.JProgressBar();
        lblNacLobos = new javax.swing.JLabel();
        tarjetaMuerte = new javax.swing.JPanel();
        panelCabMuertes = new javax.swing.JPanel();
        panelTitulosMuertes = new javax.swing.JPanel();
        lblTituloMuertes = new javax.swing.JLabel();
        lblSubMuertes = new javax.swing.JLabel();
        lblTotalMuertes = new javax.swing.JLabel();
        panelBarrasMuertes = new javax.swing.JPanel();
        filaMuePlantas = new javax.swing.JPanel();
        lblMuePlantasTxt = new javax.swing.JLabel();
        barMuePlantas = new javax.swing.JProgressBar();
        lblMuePlantas = new javax.swing.JLabel();
        filaMueConejos = new javax.swing.JPanel();
        lblMueConejosTxt = new javax.swing.JLabel();
        barMueConejos = new javax.swing.JProgressBar();
        lblMueConejos = new javax.swing.JLabel();
        filaMueLobos = new javax.swing.JPanel();
        lblMueLobosTxt = new javax.swing.JLabel();
        barMueLobos = new javax.swing.JProgressBar();
        lblMueLobos = new javax.swing.JLabel();
        panelPie = new javax.swing.JPanel();
        panelTextosPie = new javax.swing.JPanel();
        lblBalance = new javax.swing.JLabel();
        lblNotaVenenosas = new javax.swing.JLabel();
        panelBotonesPie = new javax.swing.JPanel();
        btnNuevaSimulacion = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 250, 252));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 24, 16, 24));
        setLayout(new java.awt.BorderLayout(16, 16));

        panelEncabezado.setOpaque(false);
        panelEncabezado.setLayout(new java.awt.BorderLayout());

        panelTitulos.setOpaque(false);
        panelTitulos.setLayout(new java.awt.GridLayout(2, 1));

        lblEtiqueta.setForeground(new java.awt.Color(100, 116, 139));
        lblEtiqueta.setText("REPORTE FINAL");
        panelTitulos.add(lblEtiqueta);

        lblTituloReporte.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTituloReporte.setText("Simulación Finalizada");
        panelTitulos.add(lblTituloReporte);

        panelEncabezado.add(panelTitulos, java.awt.BorderLayout.WEST);

        lblTurnoFin.setForeground(new java.awt.Color(100, 116, 139));
        lblTurnoFin.setText("Finalizada en el turno de");
        panelEncabezado.add(lblTurnoFin, java.awt.BorderLayout.EAST);

        add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelCentro.setOpaque(false);
        panelCentro.setLayout(new java.awt.GridLayout(2, 1, 0, 16));

        panelDestacados.setOpaque(false);
        panelDestacados.setLayout(new java.awt.GridLayout(1, 3, 12, 0));

        tarjetaActividad.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaActividad.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        tarjetaActividad.setLayout(new java.awt.BorderLayout());

        lblTituloActividad.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloActividad.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloActividad.setText("Turno de mayor actividad");
        tarjetaActividad.add(lblTituloActividad, java.awt.BorderLayout.NORTH);

        lblTurnoActividad.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTurnoActividad.setForeground(new java.awt.Color(21, 128, 61));
        lblTurnoActividad.setText("Turno");
        tarjetaActividad.add(lblTurnoActividad, java.awt.BorderLayout.CENTER);

        lblEventosActividad.setForeground(new java.awt.Color(100, 116, 139));
        lblEventosActividad.setText("0 eventos registrados");
        tarjetaActividad.add(lblEventosActividad, java.awt.BorderLayout.SOUTH);

        panelDestacados.add(tarjetaActividad);

        tarjetaLongevas.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaLongevas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        tarjetaLongevas.setLayout(new java.awt.BorderLayout());

        lblTituloLongevas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloLongevas.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloLongevas.setText("Entidades más longevas");
        tarjetaLongevas.add(lblTituloLongevas, java.awt.BorderLayout.NORTH);

        panelLongevas.setOpaque(false);
        panelLongevas.setLayout(new java.awt.GridLayout(3, 1));

        lblPlantaLongeva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPlantaLongeva.setForeground(new java.awt.Color(22, 163, 74));
        lblPlantaLongeva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta16.png"))); // NOI18N
        lblPlantaLongeva.setText("Planta");
        panelLongevas.add(lblPlantaLongeva);

        lblConejoLongevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblConejoLongevo.setForeground(new java.awt.Color(14, 165, 233));
        lblConejoLongevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conejo16.png"))); // NOI18N
        lblConejoLongevo.setText("Conejo");
        panelLongevas.add(lblConejoLongevo);

        lblLoboLongevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLoboLongevo.setForeground(new java.awt.Color(234, 88, 12));
        lblLoboLongevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo16.png"))); // NOI18N
        lblLoboLongevo.setText("Lobo");
        panelLongevas.add(lblLoboLongevo);

        tarjetaLongevas.add(panelLongevas, java.awt.BorderLayout.CENTER);

        panelDestacados.add(tarjetaLongevas);

        tarjetaCacerias.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaCacerias.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        tarjetaCacerias.setLayout(new java.awt.BorderLayout());

        lblTituloCacerias.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloCacerias.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloCacerias.setText("Lobo con más cacerías");
        tarjetaCacerias.add(lblTituloCacerias, java.awt.BorderLayout.NORTH);

        lblLoboCacerias.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblLoboCacerias.setForeground(new java.awt.Color(234, 88, 12));
        lblLoboCacerias.setText("0");
        tarjetaCacerias.add(lblLoboCacerias, java.awt.BorderLayout.CENTER);

        lblCantCacerias.setForeground(new java.awt.Color(100, 116, 139));
        lblCantCacerias.setText("0 cacerías realizadas");
        tarjetaCacerias.add(lblCantCacerias, java.awt.BorderLayout.SOUTH);

        panelDestacados.add(tarjetaCacerias);

        panelCentro.add(panelDestacados);

        panelTotales.setBackground(new java.awt.Color(255, 255, 255));
        panelTotales.setOpaque(false);
        panelTotales.setLayout(new java.awt.GridLayout(1, 2, 12, 0));

        tarjetaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaNacimiento.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        tarjetaNacimiento.setLayout(new java.awt.BorderLayout(0, 12));

        panelCabNacimientos.setOpaque(false);
        panelCabNacimientos.setLayout(new java.awt.BorderLayout());

        panelTitulosNac.setOpaque(false);
        panelTitulosNac.setLayout(new java.awt.GridLayout(2, 1));

        lblTituloNacimientos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloNacimientos.setText("Total de nacimientos");
        panelTitulosNac.add(lblTituloNacimientos);

        lblSubNacimientos.setForeground(new java.awt.Color(100, 116, 139));
        lblSubNacimientos.setText("Acumulado durante la simulación");
        panelTitulosNac.add(lblSubNacimientos);

        panelCabNacimientos.add(panelTitulosNac, java.awt.BorderLayout.WEST);

        lblTotalNacimientos.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTotalNacimientos.setText("0");
        panelCabNacimientos.add(lblTotalNacimientos, java.awt.BorderLayout.EAST);
        lblTotalNacimientos.getAccessibleContext().setAccessibleName("lblTotalNacimientos");

        tarjetaNacimiento.add(panelCabNacimientos, java.awt.BorderLayout.NORTH);

        panelBarrasNacimientos.setOpaque(false);
        panelBarrasNacimientos.setLayout(new java.awt.GridLayout(3, 1, 0, 8));

        filaNacPlantas.setOpaque(false);
        filaNacPlantas.setLayout(new java.awt.BorderLayout(8, 0));

        lblNacPlantasTxt.setForeground(new java.awt.Color(22, 163, 74));
        lblNacPlantasTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta16.png"))); // NOI18N
        lblNacPlantasTxt.setText("Plantas");
        lblNacPlantasTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaNacPlantas.add(lblNacPlantasTxt, java.awt.BorderLayout.WEST);

        barNacPlantas.setForeground(new java.awt.Color(22, 163, 74));
        filaNacPlantas.add(barNacPlantas, java.awt.BorderLayout.CENTER);

        lblNacPlantas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNacPlantas.setText("0");
        lblNacPlantas.setPreferredSize(new java.awt.Dimension(30, 20));
        filaNacPlantas.add(lblNacPlantas, java.awt.BorderLayout.EAST);
        lblNacPlantas.getAccessibleContext().setAccessibleName("lblNacPlantas");
        lblNacPlantas.getAccessibleContext().setAccessibleDescription("");

        panelBarrasNacimientos.add(filaNacPlantas);

        filaNacConejos.setOpaque(false);
        filaNacConejos.setLayout(new java.awt.BorderLayout(8, 0));

        lblNacConejosTxt.setForeground(new java.awt.Color(14, 165, 233));
        lblNacConejosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conejo16.png"))); // NOI18N
        lblNacConejosTxt.setText("Conejos");
        lblNacConejosTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaNacConejos.add(lblNacConejosTxt, java.awt.BorderLayout.WEST);

        barNacConejos.setForeground(new java.awt.Color(14, 165, 233));
        filaNacConejos.add(barNacConejos, java.awt.BorderLayout.CENTER);

        lblNacConejos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNacConejos.setText("0");
        lblNacConejos.setPreferredSize(new java.awt.Dimension(30, 20));
        filaNacConejos.add(lblNacConejos, java.awt.BorderLayout.EAST);

        panelBarrasNacimientos.add(filaNacConejos);

        filaNacLobos.setOpaque(false);
        filaNacLobos.setLayout(new java.awt.BorderLayout(8, 0));

        lblNacLobosTxt.setForeground(new java.awt.Color(234, 88, 12));
        lblNacLobosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo16.png"))); // NOI18N
        lblNacLobosTxt.setText("Lobos");
        lblNacLobosTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaNacLobos.add(lblNacLobosTxt, java.awt.BorderLayout.WEST);

        barNacLobos.setForeground(new java.awt.Color(234, 88, 12));
        filaNacLobos.add(barNacLobos, java.awt.BorderLayout.CENTER);

        lblNacLobos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNacLobos.setText("0");
        lblNacLobos.setPreferredSize(new java.awt.Dimension(30, 20));
        filaNacLobos.add(lblNacLobos, java.awt.BorderLayout.EAST);

        panelBarrasNacimientos.add(filaNacLobos);

        tarjetaNacimiento.add(panelBarrasNacimientos, java.awt.BorderLayout.CENTER);

        panelTotales.add(tarjetaNacimiento);

        tarjetaMuerte.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaMuerte.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        tarjetaMuerte.setOpaque(false);
        tarjetaMuerte.setLayout(new java.awt.BorderLayout(0, 12));

        panelCabMuertes.setOpaque(false);
        panelCabMuertes.setLayout(new java.awt.BorderLayout());

        panelTitulosMuertes.setOpaque(false);
        panelTitulosMuertes.setLayout(new java.awt.GridLayout(2, 1));

        lblTituloMuertes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloMuertes.setText("Total de muertes");
        panelTitulosMuertes.add(lblTituloMuertes);

        lblSubMuertes.setForeground(new java.awt.Color(100, 116, 139));
        lblSubMuertes.setText("Acumulado durante la simulación");
        panelTitulosMuertes.add(lblSubMuertes);

        panelCabMuertes.add(panelTitulosMuertes, java.awt.BorderLayout.WEST);

        lblTotalMuertes.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTotalMuertes.setText("0");
        panelCabMuertes.add(lblTotalMuertes, java.awt.BorderLayout.EAST);

        tarjetaMuerte.add(panelCabMuertes, java.awt.BorderLayout.NORTH);

        panelBarrasMuertes.setOpaque(false);
        panelBarrasMuertes.setLayout(new java.awt.GridLayout(3, 1, 0, 8));

        filaMuePlantas.setOpaque(false);
        filaMuePlantas.setLayout(new java.awt.BorderLayout(8, 0));

        lblMuePlantasTxt.setForeground(new java.awt.Color(22, 163, 74));
        lblMuePlantasTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta16.png"))); // NOI18N
        lblMuePlantasTxt.setText("Plantas");
        lblMuePlantasTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaMuePlantas.add(lblMuePlantasTxt, java.awt.BorderLayout.WEST);

        barMuePlantas.setForeground(new java.awt.Color(22, 163, 74));
        filaMuePlantas.add(barMuePlantas, java.awt.BorderLayout.CENTER);

        lblMuePlantas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMuePlantas.setText("0");
        lblMuePlantas.setPreferredSize(new java.awt.Dimension(30, 20));
        filaMuePlantas.add(lblMuePlantas, java.awt.BorderLayout.EAST);

        panelBarrasMuertes.add(filaMuePlantas);

        filaMueConejos.setOpaque(false);
        filaMueConejos.setLayout(new java.awt.BorderLayout(8, 0));

        lblMueConejosTxt.setForeground(new java.awt.Color(14, 165, 233));
        lblMueConejosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conejo16.png"))); // NOI18N
        lblMueConejosTxt.setText("Conejos");
        lblMueConejosTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaMueConejos.add(lblMueConejosTxt, java.awt.BorderLayout.WEST);

        barMueConejos.setForeground(new java.awt.Color(14, 165, 233));
        filaMueConejos.add(barMueConejos, java.awt.BorderLayout.CENTER);

        lblMueConejos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMueConejos.setText("0");
        lblMueConejos.setPreferredSize(new java.awt.Dimension(30, 20));
        filaMueConejos.add(lblMueConejos, java.awt.BorderLayout.EAST);

        panelBarrasMuertes.add(filaMueConejos);

        filaMueLobos.setOpaque(false);
        filaMueLobos.setLayout(new java.awt.BorderLayout(8, 0));

        lblMueLobosTxt.setForeground(new java.awt.Color(234, 88, 12));
        lblMueLobosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo16.png"))); // NOI18N
        lblMueLobosTxt.setText("Lobos");
        lblMueLobosTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaMueLobos.add(lblMueLobosTxt, java.awt.BorderLayout.WEST);

        barMueLobos.setForeground(new java.awt.Color(234, 88, 12));
        filaMueLobos.add(barMueLobos, java.awt.BorderLayout.CENTER);

        lblMueLobos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMueLobos.setText("0");
        lblMueLobos.setPreferredSize(new java.awt.Dimension(30, 20));
        filaMueLobos.add(lblMueLobos, java.awt.BorderLayout.EAST);

        panelBarrasMuertes.add(filaMueLobos);

        tarjetaMuerte.add(panelBarrasMuertes, java.awt.BorderLayout.CENTER);

        panelTotales.add(tarjetaMuerte);

        panelCentro.add(panelTotales);

        add(panelCentro, java.awt.BorderLayout.CENTER);

        panelPie.setOpaque(false);
        panelPie.setLayout(new java.awt.BorderLayout());

        panelTextosPie.setOpaque(false);
        panelTextosPie.setLayout(new java.awt.GridLayout(2, 1));

        lblBalance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBalance.setText("0 entidades iniciales + 0 nacimientos − 0 muertes = 0");
        panelTextosPie.add(lblBalance);

        lblNotaVenenosas.setForeground(new java.awt.Color(147, 51, 234));
        lblNotaVenenosas.setText("Las plantas venenosas se incluyen en los totales de plantas");
        panelTextosPie.add(lblNotaVenenosas);

        panelPie.add(panelTextosPie, java.awt.BorderLayout.WEST);

        panelBotonesPie.setOpaque(false);

        btnNuevaSimulacion.setBackground(new java.awt.Color(21, 128, 61));
        btnNuevaSimulacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevaSimulacion.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaSimulacion.setText("Nueva Simulación");
        btnNuevaSimulacion.setPreferredSize(new java.awt.Dimension(129, 30));
        btnNuevaSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSimulacionActionPerformed(evt);
            }
        });
        panelBotonesPie.add(btnNuevaSimulacion);

        panelPie.add(panelBotonesPie, java.awt.BorderLayout.EAST);

        add(panelPie, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSimulacionActionPerformed
        VentanaPrincipal ventana = (VentanaPrincipal) javax.swing.SwingUtilities.getWindowAncestor(this);
        ventana.mostrarConfiguracion();
    }//GEN-LAST:event_btnNuevaSimulacionActionPerformed

    public void mostrarEncabezado(String causaFin, int turnoFin, int totalTurnos) {
        lblTituloReporte.setText("Simulación Finalizada: " + causaFin);
        lblTurnoFin.setText("Finalizada en el turno " + turnoFin + " de " + totalTurnos);
    }

    public void mostrarDestacados(int turnoActividad, int eventos,
            String plantaLongeva, String conejoLongevo,
            String loboLongevo, String loboCacerias) {
        lblTurnoActividad.setText("Turno " + turnoActividad);
        lblEventosActividad.setText(eventos + " eventos registrados");
        lblPlantaLongeva.setText("Planta: " + plantaLongeva);
        lblConejoLongevo.setText("Conejo: " + conejoLongevo);
        lblLoboLongevo.setText("Lobo: " + loboLongevo);
        lblLoboCacerias.setText(loboCacerias);
        lblCantCacerias.setText("Lobo con más presas cazadas");
    }

    private void cargarBarra(javax.swing.JProgressBar barra, javax.swing.JLabel lblNumero,
            int valor, int total) {
        barra.setMaximum(total == 0 ? 1 : total);
        barra.setValue(valor);
        lblNumero.setText(String.valueOf(valor));
    }

    public void mostrarNacimientos(int plantas, int conejos, int lobos) {
        int total = plantas + conejos + lobos;
        lblTotalNacimientos.setText(String.valueOf(total));
        cargarBarra(barNacPlantas, lblNacPlantas, plantas, total);
        cargarBarra(barNacConejos, lblNacConejos, conejos, total);
        cargarBarra(barNacLobos, lblNacLobos, lobos, total);
    }

    public void mostrarMuertes(int plantas, int conejos, int lobos) {
        int total = plantas + conejos + lobos;
        lblTotalMuertes.setText(String.valueOf(total));
        cargarBarra(barMuePlantas, lblMuePlantas, plantas, total);
        cargarBarra(barMueConejos, lblMueConejos, conejos, total);
        cargarBarra(barMueLobos, lblMueLobos, lobos, total);
    }

    public void mostrarBalance(int iniciales, int nacimientos, int muertes, int vivas) {
        lblBalance.setText(iniciales + " entidades iniciales + " + nacimientos
                + " nacimientos − " + muertes + " muertes = " + vivas);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barMueConejos;
    private javax.swing.JProgressBar barMueLobos;
    private javax.swing.JProgressBar barMuePlantas;
    private javax.swing.JProgressBar barNacConejos;
    private javax.swing.JProgressBar barNacLobos;
    private javax.swing.JProgressBar barNacPlantas;
    private javax.swing.JButton btnNuevaSimulacion;
    private javax.swing.JPanel filaMueConejos;
    private javax.swing.JPanel filaMueLobos;
    private javax.swing.JPanel filaMuePlantas;
    private javax.swing.JPanel filaNacConejos;
    private javax.swing.JPanel filaNacLobos;
    private javax.swing.JPanel filaNacPlantas;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCantCacerias;
    private javax.swing.JLabel lblConejoLongevo;
    private javax.swing.JLabel lblEtiqueta;
    private javax.swing.JLabel lblEventosActividad;
    private javax.swing.JLabel lblLoboCacerias;
    private javax.swing.JLabel lblLoboLongevo;
    private javax.swing.JLabel lblMueConejos;
    private javax.swing.JLabel lblMueConejosTxt;
    private javax.swing.JLabel lblMueLobos;
    private javax.swing.JLabel lblMueLobosTxt;
    private javax.swing.JLabel lblMuePlantas;
    private javax.swing.JLabel lblMuePlantasTxt;
    private javax.swing.JLabel lblNacConejos;
    private javax.swing.JLabel lblNacConejosTxt;
    private javax.swing.JLabel lblNacLobos;
    private javax.swing.JLabel lblNacLobosTxt;
    private javax.swing.JLabel lblNacPlantas;
    private javax.swing.JLabel lblNacPlantasTxt;
    private javax.swing.JLabel lblNotaVenenosas;
    private javax.swing.JLabel lblPlantaLongeva;
    private javax.swing.JLabel lblSubMuertes;
    private javax.swing.JLabel lblSubNacimientos;
    private javax.swing.JLabel lblTituloActividad;
    private javax.swing.JLabel lblTituloCacerias;
    private javax.swing.JLabel lblTituloLongevas;
    private javax.swing.JLabel lblTituloMuertes;
    private javax.swing.JLabel lblTituloNacimientos;
    private javax.swing.JLabel lblTituloReporte;
    private javax.swing.JLabel lblTotalMuertes;
    private javax.swing.JLabel lblTotalNacimientos;
    private javax.swing.JLabel lblTurnoActividad;
    private javax.swing.JLabel lblTurnoFin;
    private javax.swing.JPanel panelBarrasMuertes;
    private javax.swing.JPanel panelBarrasNacimientos;
    private javax.swing.JPanel panelBotonesPie;
    private javax.swing.JPanel panelCabMuertes;
    private javax.swing.JPanel panelCabNacimientos;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelDestacados;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelLongevas;
    private javax.swing.JPanel panelPie;
    private javax.swing.JPanel panelTextosPie;
    private javax.swing.JPanel panelTitulos;
    private javax.swing.JPanel panelTitulosMuertes;
    private javax.swing.JPanel panelTitulosNac;
    private javax.swing.JPanel panelTotales;
    private javax.swing.JPanel tarjetaActividad;
    private javax.swing.JPanel tarjetaCacerias;
    private javax.swing.JPanel tarjetaLongevas;
    private javax.swing.JPanel tarjetaMuerte;
    private javax.swing.JPanel tarjetaNacimiento;
    // End of variables declaration//GEN-END:variables
}
