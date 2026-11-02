package vista;

public class PanelReporte extends javax.swing.JPanel {

    public PanelReporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelEncabezado = new javax.swing.JPanel();
        panelTitulos = new javax.swing.JPanel();
        lblEtiqueta = new javax.swing.JLabel();
        lblTurnoFin = new javax.swing.JLabel();
        lblTituloReporte = new javax.swing.JLabel();
        panelCentro = new javax.swing.JPanel();
        panelDestacados = new javax.swing.JPanel();
        tarjetaActividad = new javax.swing.JPanel();
        filaTituloActividad = new javax.swing.JPanel();
        lblTituloActividad = new javax.swing.JLabel();
        lblIconoActividad = new javax.swing.JLabel();
        lblTurnoActividad = new javax.swing.JLabel();
        lblEventosActividad = new javax.swing.JLabel();
        tarjetaLongevas = new javax.swing.JPanel();
        filaTituloLongevas = new javax.swing.JPanel();
        lblTituloLongevas = new javax.swing.JLabel();
        lblIconoLongevas = new javax.swing.JLabel();
        panelLongevas = new javax.swing.JPanel();
        lblPlantaLongeva = new javax.swing.JLabel();
        lblConejoLongevo = new javax.swing.JLabel();
        lblLoboLongevo = new javax.swing.JLabel();
        tarjetaCacerias = new javax.swing.JPanel();
        filaTituloCacerias = new javax.swing.JPanel();
        lblTituloCacerias = new javax.swing.JLabel();
        lblIconoCacerias = new javax.swing.JLabel();
        lblLoboCacerias = new javax.swing.JLabel();
        lblCantCacerias = new javax.swing.JLabel();
        panelContenedorTotales = new javax.swing.JPanel();
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
        contNacPlantas = new javax.swing.JPanel();
        barNacPlantas = new javax.swing.JProgressBar();
        lblNacPlantas = new javax.swing.JLabel();
        filaNacConejos = new javax.swing.JPanel();
        lblNacConejosTxt = new javax.swing.JLabel();
        contNacConejos = new javax.swing.JPanel();
        barNacConejos = new javax.swing.JProgressBar();
        lblNacConejos = new javax.swing.JLabel();
        filaNacLobos = new javax.swing.JPanel();
        lblNacLobosTxt = new javax.swing.JLabel();
        contNacLobos = new javax.swing.JPanel();
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
        contMuePlantas = new javax.swing.JPanel();
        barMuePlantas = new javax.swing.JProgressBar();
        lblMuePlantas = new javax.swing.JLabel();
        filaMueConejos = new javax.swing.JPanel();
        lblMueConejosTxt = new javax.swing.JLabel();
        contMueConejos = new javax.swing.JPanel();
        barMueConejos = new javax.swing.JProgressBar();
        lblMueConejos = new javax.swing.JLabel();
        filaMueLobos = new javax.swing.JPanel();
        lblMueLobosTxt = new javax.swing.JLabel();
        contMueLobos = new javax.swing.JPanel();
        barMueLobos = new javax.swing.JProgressBar();
        lblMueLobos = new javax.swing.JLabel();
        panelPie = new javax.swing.JPanel();
        panelTextosPie = new javax.swing.JPanel();
        lblBalance = new javax.swing.JLabel();
        lblNotaVenenosas = new javax.swing.JLabel();
        panelBotonesPie = new javax.swing.JPanel();
        btnNuevaSimulacion = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 250, 252));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 24, 20, 24));
        setLayout(new java.awt.BorderLayout(16, 16));

        panelEncabezado.setOpaque(false);
        panelEncabezado.setLayout(new java.awt.BorderLayout(0, 6));

        panelTitulos.setOpaque(false);
        panelTitulos.setLayout(new java.awt.BorderLayout());

        lblEtiqueta.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblEtiqueta.setForeground(new java.awt.Color(100, 116, 139));
        lblEtiqueta.setText("REPORTE FINAL");
        panelTitulos.add(lblEtiqueta, java.awt.BorderLayout.LINE_START);

        lblTurnoFin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTurnoFin.setForeground(new java.awt.Color(100, 116, 139));
        lblTurnoFin.setText("Finalizada en el turno de");
        panelTitulos.add(lblTurnoFin, java.awt.BorderLayout.LINE_END);

        panelEncabezado.add(panelTitulos, java.awt.BorderLayout.PAGE_START);

        lblTituloReporte.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTituloReporte.setForeground(new java.awt.Color(23, 37, 56));
        lblTituloReporte.setText("Simulación Finalizada");
        panelEncabezado.add(lblTituloReporte, java.awt.BorderLayout.CENTER);

        add(panelEncabezado, java.awt.BorderLayout.PAGE_START);

        panelCentro.setOpaque(false);
        panelCentro.setLayout(new java.awt.BorderLayout(0, 16));

        panelDestacados.setOpaque(false);
        panelDestacados.setLayout(new java.awt.GridLayout(1, 3, 16, 0));

        tarjetaActividad.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaActividad.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        tarjetaActividad.setLayout(new java.awt.BorderLayout(0, 8));

        filaTituloActividad.setOpaque(false);
        filaTituloActividad.setLayout(new java.awt.BorderLayout());

        lblTituloActividad.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloActividad.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloActividad.setText("Turno de mayor actividad");
        filaTituloActividad.add(lblTituloActividad, java.awt.BorderLayout.LINE_START);

        lblIconoActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/actividad24.png"))); // NOI18N
        filaTituloActividad.add(lblIconoActividad, java.awt.BorderLayout.LINE_END);

        tarjetaActividad.add(filaTituloActividad, java.awt.BorderLayout.PAGE_START);

        lblTurnoActividad.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTurnoActividad.setForeground(new java.awt.Color(47, 133, 90));
        lblTurnoActividad.setText("Turno");
        tarjetaActividad.add(lblTurnoActividad, java.awt.BorderLayout.CENTER);

        lblEventosActividad.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblEventosActividad.setForeground(new java.awt.Color(100, 116, 139));
        lblEventosActividad.setText("0 eventos registrados");
        tarjetaActividad.add(lblEventosActividad, java.awt.BorderLayout.PAGE_END);

        panelDestacados.add(tarjetaActividad);

        tarjetaLongevas.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaLongevas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        tarjetaLongevas.setLayout(new java.awt.BorderLayout(0, 8));

        filaTituloLongevas.setOpaque(false);
        filaTituloLongevas.setLayout(new java.awt.BorderLayout());

        lblTituloLongevas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloLongevas.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloLongevas.setText("Entidades más longevas");
        filaTituloLongevas.add(lblTituloLongevas, java.awt.BorderLayout.LINE_START);

        lblIconoLongevas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta24.png"))); // NOI18N
        filaTituloLongevas.add(lblIconoLongevas, java.awt.BorderLayout.LINE_END);

        tarjetaLongevas.add(filaTituloLongevas, java.awt.BorderLayout.PAGE_START);

        panelLongevas.setOpaque(false);
        panelLongevas.setLayout(new java.awt.GridLayout(3, 1, 0, 6));

        lblPlantaLongeva.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblPlantaLongeva.setForeground(new java.awt.Color(16, 185, 129));
        lblPlantaLongeva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta16.png"))); // NOI18N
        lblPlantaLongeva.setText("Planta");
        lblPlantaLongeva.setIconTextGap(8);
        panelLongevas.add(lblPlantaLongeva);

        lblConejoLongevo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblConejoLongevo.setForeground(new java.awt.Color(14, 165, 233));
        lblConejoLongevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conejo16.png"))); // NOI18N
        lblConejoLongevo.setText("Conejo");
        lblConejoLongevo.setIconTextGap(8);
        panelLongevas.add(lblConejoLongevo);

        lblLoboLongevo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblLoboLongevo.setForeground(new java.awt.Color(249, 115, 22));
        lblLoboLongevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo16.png"))); // NOI18N
        lblLoboLongevo.setText("Lobo");
        lblLoboLongevo.setIconTextGap(8);
        panelLongevas.add(lblLoboLongevo);

        tarjetaLongevas.add(panelLongevas, java.awt.BorderLayout.CENTER);

        panelDestacados.add(tarjetaLongevas);

        tarjetaCacerias.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaCacerias.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        tarjetaCacerias.setLayout(new java.awt.BorderLayout(0, 8));

        filaTituloCacerias.setOpaque(false);
        filaTituloCacerias.setLayout(new java.awt.BorderLayout());

        lblTituloCacerias.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloCacerias.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloCacerias.setText("Lobo con más cacerías");
        filaTituloCacerias.add(lblTituloCacerias, java.awt.BorderLayout.LINE_START);

        lblIconoCacerias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo24.png"))); // NOI18N
        filaTituloCacerias.add(lblIconoCacerias, java.awt.BorderLayout.LINE_END);

        tarjetaCacerias.add(filaTituloCacerias, java.awt.BorderLayout.PAGE_START);

        lblLoboCacerias.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblLoboCacerias.setForeground(new java.awt.Color(249, 115, 22));
        lblLoboCacerias.setText("0");
        tarjetaCacerias.add(lblLoboCacerias, java.awt.BorderLayout.CENTER);

        lblCantCacerias.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblCantCacerias.setForeground(new java.awt.Color(100, 116, 139));
        lblCantCacerias.setText("0 cacerías realizadas");
        tarjetaCacerias.add(lblCantCacerias, java.awt.BorderLayout.PAGE_END);

        panelDestacados.add(tarjetaCacerias);

        panelCentro.add(panelDestacados, java.awt.BorderLayout.PAGE_START);

        panelContenedorTotales.setOpaque(false);
        panelContenedorTotales.setLayout(new java.awt.BorderLayout());

        panelTotales.setOpaque(false);
        panelTotales.setLayout(new java.awt.GridLayout(1, 2, 16, 0));

        tarjetaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaNacimiento.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        tarjetaNacimiento.setLayout(new java.awt.BorderLayout(0, 16));

        panelCabNacimientos.setOpaque(false);
        panelCabNacimientos.setLayout(new java.awt.BorderLayout());

        panelTitulosNac.setOpaque(false);
        panelTitulosNac.setLayout(new java.awt.GridLayout(2, 1, 0, 2));

        lblTituloNacimientos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloNacimientos.setForeground(new java.awt.Color(23, 37, 56));
        lblTituloNacimientos.setText("Total de nacimientos");
        panelTitulosNac.add(lblTituloNacimientos);

        lblSubNacimientos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblSubNacimientos.setForeground(new java.awt.Color(100, 116, 139));
        lblSubNacimientos.setText("Acumulado durante la simulación");
        panelTitulosNac.add(lblSubNacimientos);

        panelCabNacimientos.add(panelTitulosNac, java.awt.BorderLayout.LINE_START);

        lblTotalNacimientos.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTotalNacimientos.setForeground(new java.awt.Color(23, 37, 56));
        lblTotalNacimientos.setText("0");
        panelCabNacimientos.add(lblTotalNacimientos, java.awt.BorderLayout.LINE_END);

        tarjetaNacimiento.add(panelCabNacimientos, java.awt.BorderLayout.PAGE_START);

        panelBarrasNacimientos.setOpaque(false);
        panelBarrasNacimientos.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        filaNacPlantas.setOpaque(false);
        filaNacPlantas.setLayout(new java.awt.BorderLayout(12, 0));

        lblNacPlantasTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNacPlantasTxt.setForeground(new java.awt.Color(16, 185, 129));
        lblNacPlantasTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta16.png"))); // NOI18N
        lblNacPlantasTxt.setText("Plantas");
        lblNacPlantasTxt.setIconTextGap(6);
        lblNacPlantasTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaNacPlantas.add(lblNacPlantasTxt, java.awt.BorderLayout.LINE_START);

        contNacPlantas.setOpaque(false);
        contNacPlantas.setLayout(new java.awt.GridBagLayout());

        barNacPlantas.setBackground(new java.awt.Color(241, 245, 249));
        barNacPlantas.setForeground(new java.awt.Color(16, 185, 129));
        barNacPlantas.setBorderPainted(false);
        barNacPlantas.setPreferredSize(new java.awt.Dimension(100, 8));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        contNacPlantas.add(barNacPlantas, gridBagConstraints);

        filaNacPlantas.add(contNacPlantas, java.awt.BorderLayout.CENTER);

        lblNacPlantas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNacPlantas.setForeground(new java.awt.Color(23, 37, 56));
        lblNacPlantas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNacPlantas.setText("0");
        lblNacPlantas.setPreferredSize(new java.awt.Dimension(30, 20));
        filaNacPlantas.add(lblNacPlantas, java.awt.BorderLayout.LINE_END);

        panelBarrasNacimientos.add(filaNacPlantas);

        filaNacConejos.setOpaque(false);
        filaNacConejos.setLayout(new java.awt.BorderLayout(12, 0));

        lblNacConejosTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNacConejosTxt.setForeground(new java.awt.Color(14, 165, 233));
        lblNacConejosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conejo16.png"))); // NOI18N
        lblNacConejosTxt.setText("Conejos");
        lblNacConejosTxt.setIconTextGap(6);
        lblNacConejosTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaNacConejos.add(lblNacConejosTxt, java.awt.BorderLayout.LINE_START);

        contNacConejos.setOpaque(false);
        contNacConejos.setLayout(new java.awt.GridBagLayout());

        barNacConejos.setBackground(new java.awt.Color(241, 245, 249));
        barNacConejos.setForeground(new java.awt.Color(14, 165, 233));
        barNacConejos.setBorderPainted(false);
        barNacConejos.setPreferredSize(new java.awt.Dimension(100, 8));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        contNacConejos.add(barNacConejos, gridBagConstraints);

        filaNacConejos.add(contNacConejos, java.awt.BorderLayout.CENTER);

        lblNacConejos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNacConejos.setForeground(new java.awt.Color(23, 37, 56));
        lblNacConejos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNacConejos.setText("0");
        lblNacConejos.setPreferredSize(new java.awt.Dimension(30, 20));
        filaNacConejos.add(lblNacConejos, java.awt.BorderLayout.LINE_END);

        panelBarrasNacimientos.add(filaNacConejos);

        filaNacLobos.setOpaque(false);
        filaNacLobos.setLayout(new java.awt.BorderLayout(12, 0));

        lblNacLobosTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNacLobosTxt.setForeground(new java.awt.Color(249, 115, 22));
        lblNacLobosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo16.png"))); // NOI18N
        lblNacLobosTxt.setText("Lobos");
        lblNacLobosTxt.setIconTextGap(6);
        lblNacLobosTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaNacLobos.add(lblNacLobosTxt, java.awt.BorderLayout.LINE_START);

        contNacLobos.setOpaque(false);
        contNacLobos.setLayout(new java.awt.GridBagLayout());

        barNacLobos.setBackground(new java.awt.Color(241, 245, 249));
        barNacLobos.setForeground(new java.awt.Color(249, 115, 22));
        barNacLobos.setBorderPainted(false);
        barNacLobos.setPreferredSize(new java.awt.Dimension(100, 8));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        contNacLobos.add(barNacLobos, gridBagConstraints);

        filaNacLobos.add(contNacLobos, java.awt.BorderLayout.CENTER);

        lblNacLobos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNacLobos.setForeground(new java.awt.Color(23, 37, 56));
        lblNacLobos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNacLobos.setText("0");
        lblNacLobos.setPreferredSize(new java.awt.Dimension(30, 20));
        filaNacLobos.add(lblNacLobos, java.awt.BorderLayout.LINE_END);

        panelBarrasNacimientos.add(filaNacLobos);

        tarjetaNacimiento.add(panelBarrasNacimientos, java.awt.BorderLayout.CENTER);

        panelTotales.add(tarjetaNacimiento);

        tarjetaMuerte.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaMuerte.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        tarjetaMuerte.setLayout(new java.awt.BorderLayout(0, 16));

        panelCabMuertes.setOpaque(false);
        panelCabMuertes.setLayout(new java.awt.BorderLayout());

        panelTitulosMuertes.setOpaque(false);
        panelTitulosMuertes.setLayout(new java.awt.GridLayout(2, 1, 0, 2));

        lblTituloMuertes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloMuertes.setForeground(new java.awt.Color(23, 37, 56));
        lblTituloMuertes.setText("Total de muertes");
        panelTitulosMuertes.add(lblTituloMuertes);

        lblSubMuertes.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblSubMuertes.setForeground(new java.awt.Color(100, 116, 139));
        lblSubMuertes.setText("Acumulado durante la simulación");
        panelTitulosMuertes.add(lblSubMuertes);

        panelCabMuertes.add(panelTitulosMuertes, java.awt.BorderLayout.LINE_START);

        lblTotalMuertes.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTotalMuertes.setForeground(new java.awt.Color(23, 37, 56));
        lblTotalMuertes.setText("0");
        panelCabMuertes.add(lblTotalMuertes, java.awt.BorderLayout.LINE_END);

        tarjetaMuerte.add(panelCabMuertes, java.awt.BorderLayout.PAGE_START);

        panelBarrasMuertes.setOpaque(false);
        panelBarrasMuertes.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        filaMuePlantas.setOpaque(false);
        filaMuePlantas.setLayout(new java.awt.BorderLayout(12, 0));

        lblMuePlantasTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMuePlantasTxt.setForeground(new java.awt.Color(16, 185, 129));
        lblMuePlantasTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta16.png"))); // NOI18N
        lblMuePlantasTxt.setText("Plantas");
        lblMuePlantasTxt.setIconTextGap(6);
        lblMuePlantasTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaMuePlantas.add(lblMuePlantasTxt, java.awt.BorderLayout.LINE_START);

        contMuePlantas.setOpaque(false);
        contMuePlantas.setLayout(new java.awt.GridBagLayout());

        barMuePlantas.setBackground(new java.awt.Color(241, 245, 249));
        barMuePlantas.setForeground(new java.awt.Color(16, 185, 129));
        barMuePlantas.setBorderPainted(false);
        barMuePlantas.setPreferredSize(new java.awt.Dimension(100, 8));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        contMuePlantas.add(barMuePlantas, gridBagConstraints);

        filaMuePlantas.add(contMuePlantas, java.awt.BorderLayout.CENTER);

        lblMuePlantas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMuePlantas.setForeground(new java.awt.Color(23, 37, 56));
        lblMuePlantas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMuePlantas.setText("0");
        lblMuePlantas.setPreferredSize(new java.awt.Dimension(30, 20));
        filaMuePlantas.add(lblMuePlantas, java.awt.BorderLayout.LINE_END);

        panelBarrasMuertes.add(filaMuePlantas);

        filaMueConejos.setOpaque(false);
        filaMueConejos.setLayout(new java.awt.BorderLayout(12, 0));

        lblMueConejosTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMueConejosTxt.setForeground(new java.awt.Color(14, 165, 233));
        lblMueConejosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conejo16.png"))); // NOI18N
        lblMueConejosTxt.setText("Conejos");
        lblMueConejosTxt.setIconTextGap(6);
        lblMueConejosTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaMueConejos.add(lblMueConejosTxt, java.awt.BorderLayout.LINE_START);

        contMueConejos.setOpaque(false);
        contMueConejos.setLayout(new java.awt.GridBagLayout());

        barMueConejos.setBackground(new java.awt.Color(241, 245, 249));
        barMueConejos.setForeground(new java.awt.Color(14, 165, 233));
        barMueConejos.setBorderPainted(false);
        barMueConejos.setPreferredSize(new java.awt.Dimension(100, 8));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        contMueConejos.add(barMueConejos, gridBagConstraints);

        filaMueConejos.add(contMueConejos, java.awt.BorderLayout.CENTER);

        lblMueConejos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMueConejos.setForeground(new java.awt.Color(23, 37, 56));
        lblMueConejos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMueConejos.setText("0");
        lblMueConejos.setPreferredSize(new java.awt.Dimension(30, 20));
        filaMueConejos.add(lblMueConejos, java.awt.BorderLayout.LINE_END);

        panelBarrasMuertes.add(filaMueConejos);

        filaMueLobos.setOpaque(false);
        filaMueLobos.setLayout(new java.awt.BorderLayout(12, 0));

        lblMueLobosTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMueLobosTxt.setForeground(new java.awt.Color(249, 115, 22));
        lblMueLobosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo16.png"))); // NOI18N
        lblMueLobosTxt.setText("Lobos");
        lblMueLobosTxt.setIconTextGap(6);
        lblMueLobosTxt.setPreferredSize(new java.awt.Dimension(90, 20));
        filaMueLobos.add(lblMueLobosTxt, java.awt.BorderLayout.LINE_START);

        contMueLobos.setOpaque(false);
        contMueLobos.setLayout(new java.awt.GridBagLayout());

        barMueLobos.setBackground(new java.awt.Color(241, 245, 249));
        barMueLobos.setForeground(new java.awt.Color(249, 115, 22));
        barMueLobos.setBorderPainted(false);
        barMueLobos.setPreferredSize(new java.awt.Dimension(100, 8));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        contMueLobos.add(barMueLobos, gridBagConstraints);

        filaMueLobos.add(contMueLobos, java.awt.BorderLayout.CENTER);

        lblMueLobos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMueLobos.setForeground(new java.awt.Color(23, 37, 56));
        lblMueLobos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMueLobos.setText("0");
        lblMueLobos.setPreferredSize(new java.awt.Dimension(30, 20));
        filaMueLobos.add(lblMueLobos, java.awt.BorderLayout.LINE_END);

        panelBarrasMuertes.add(filaMueLobos);

        tarjetaMuerte.add(panelBarrasMuertes, java.awt.BorderLayout.CENTER);

        panelTotales.add(tarjetaMuerte);

        panelContenedorTotales.add(panelTotales, java.awt.BorderLayout.PAGE_START);

        panelCentro.add(panelContenedorTotales, java.awt.BorderLayout.CENTER);

        add(panelCentro, java.awt.BorderLayout.CENTER);

        panelPie.setOpaque(false);
        panelPie.setLayout(new java.awt.BorderLayout(16, 0));

        panelTextosPie.setOpaque(false);
        panelTextosPie.setLayout(new java.awt.GridLayout(2, 1, 0, 4));

        lblBalance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(23, 37, 56));
        lblBalance.setText("0 entidades iniciales + 0 nacimientos − 0 muertes = 0");
        panelTextosPie.add(lblBalance);

        lblNotaVenenosas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblNotaVenenosas.setForeground(new java.awt.Color(139, 92, 246));
        lblNotaVenenosas.setText("Las plantas venenosas se incluyen en los totales de plantas");
        panelTextosPie.add(lblNotaVenenosas);

        panelPie.add(panelTextosPie, java.awt.BorderLayout.LINE_START);

        panelBotonesPie.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 0, 0, 0));
        panelBotonesPie.setOpaque(false);
        panelBotonesPie.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 0));

        btnNuevaSimulacion.setBackground(new java.awt.Color(47, 133, 90));
        btnNuevaSimulacion.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNuevaSimulacion.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaSimulacion.setText("Nueva Simulación");
        btnNuevaSimulacion.setBorderPainted(false);
        btnNuevaSimulacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaSimulacion.setFocusPainted(false);
        btnNuevaSimulacion.setPreferredSize(new java.awt.Dimension(180, 40));
        btnNuevaSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSimulacionActionPerformed(evt);
            }
        });
        panelBotonesPie.add(btnNuevaSimulacion);

        panelPie.add(panelBotonesPie, java.awt.BorderLayout.LINE_END);

        add(panelPie, java.awt.BorderLayout.PAGE_END);
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
    private javax.swing.JPanel contMueConejos;
    private javax.swing.JPanel contMueLobos;
    private javax.swing.JPanel contMuePlantas;
    private javax.swing.JPanel contNacConejos;
    private javax.swing.JPanel contNacLobos;
    private javax.swing.JPanel contNacPlantas;
    private javax.swing.JPanel filaMueConejos;
    private javax.swing.JPanel filaMueLobos;
    private javax.swing.JPanel filaMuePlantas;
    private javax.swing.JPanel filaNacConejos;
    private javax.swing.JPanel filaNacLobos;
    private javax.swing.JPanel filaNacPlantas;
    private javax.swing.JPanel filaTituloActividad;
    private javax.swing.JPanel filaTituloCacerias;
    private javax.swing.JPanel filaTituloLongevas;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCantCacerias;
    private javax.swing.JLabel lblConejoLongevo;
    private javax.swing.JLabel lblEtiqueta;
    private javax.swing.JLabel lblEventosActividad;
    private javax.swing.JLabel lblIconoActividad;
    private javax.swing.JLabel lblIconoCacerias;
    private javax.swing.JLabel lblIconoLongevas;
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
    private javax.swing.JPanel panelContenedorTotales;
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
