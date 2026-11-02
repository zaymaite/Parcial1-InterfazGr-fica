package vista;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PanelSimulacion extends javax.swing.JPanel {

    public PanelSimulacion() {
        initComponents();
        mostrarSinSimulacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelSuperior = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        panelTitulos = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        panelEstadoClima = new javax.swing.JPanel();
        lblSinIniciar = new javax.swing.JLabel();
        lblEstadoSimulacion = new javax.swing.JLabel();
        lblClima = new javax.swing.JLabel();
        panelContadores = new javax.swing.JPanel();
        tarjetaTurno = new javax.swing.JPanel();
        filaTituloTurno = new javax.swing.JPanel();
        lblTituloTurno = new javax.swing.JLabel();
        lblIconoTurno = new javax.swing.JLabel();
        filaValorTurno = new javax.swing.JPanel();
        lblTurno = new javax.swing.JLabel();
        lblTotalTurnos = new javax.swing.JLabel();
        tarjetaPlantas = new javax.swing.JPanel();
        filaTituloPlantas = new javax.swing.JPanel();
        lblTituloPlantas = new javax.swing.JLabel();
        lblIconoPlantas = new javax.swing.JLabel();
        filaValorPlantas = new javax.swing.JPanel();
        lblPlantas = new javax.swing.JLabel();
        lblDescPlantas = new javax.swing.JLabel();
        tarjetaConejos = new javax.swing.JPanel();
        filaTituloConejos = new javax.swing.JPanel();
        lblTituloConejos = new javax.swing.JLabel();
        lblIconoConejos = new javax.swing.JLabel();
        filaValorConejos = new javax.swing.JPanel();
        lblConejos = new javax.swing.JLabel();
        lblDescConejos = new javax.swing.JLabel();
        tarjetaLobos = new javax.swing.JPanel();
        filaTituloLobos = new javax.swing.JPanel();
        lblTituloLobos = new javax.swing.JLabel();
        lblIconoLobos = new javax.swing.JLabel();
        filaValorLobos = new javax.swing.JPanel();
        lblLobos = new javax.swing.JLabel();
        lblDescLobos = new javax.swing.JLabel();
        panelEntidades = new javax.swing.JPanel();
        pnlTituloTabla = new javax.swing.JPanel();
        lblTituloTabla = new javax.swing.JLabel();
        lblCantidadEntidades = new javax.swing.JLabel();
        panelCuerpoTabla = new javax.swing.JPanel();
        jScrollTabla = new javax.swing.JScrollPane();
        tablaEntidades = new javax.swing.JTable();
        panelVacioTabla = new javax.swing.JPanel();
        panelVacioTablaIcono = new javax.swing.JLabel();
        panelVacioTablaTitulo = new javax.swing.JLabel();
        panelVacioTablaDesc = new javax.swing.JLabel();
        panelBotonesVacio = new javax.swing.JPanel();
        btnCargarPartida = new javax.swing.JButton();
        btnNuevaSimulacion = new javax.swing.JButton();
        lblPieTabla = new javax.swing.JLabel();
        panelEventos = new javax.swing.JPanel();
        pnlTituloEventos = new javax.swing.JPanel();
        lblTituloEventos = new javax.swing.JLabel();
        lblIconoEventos = new javax.swing.JLabel();
        panelCuerpoEventos = new javax.swing.JPanel();
        jScrollEventos = new javax.swing.JScrollPane();
        listaEventos = new javax.swing.JList<>();
        panelVacioEventos = new javax.swing.JPanel();
        panelVacioEventosIcono = new javax.swing.JLabel();
        panelVacioEventosTitulo = new javax.swing.JLabel();
        panelVacioEventosDesc = new javax.swing.JLabel();
        lblPieEventos = new javax.swing.JLabel();
        panelZonaIntervencion = new javax.swing.JPanel();
        panelIntervencion = new javax.swing.JPanel();
        panelTextoIntervencion = new javax.swing.JPanel();
        lblTituloIntervencion = new javax.swing.JLabel();
        lblDisponibilidad = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnCambiarClima = new javax.swing.JButton();
        btnAgregarEntidad = new javax.swing.JButton();
        btnAvanzarTurno = new javax.swing.JButton();
        panelIntervencionInactiva = new javax.swing.JPanel();
        panelTextoInactiva = new javax.swing.JPanel();
        lblTituloInactiva = new javax.swing.JLabel();
        lblDescInactiva = new javax.swing.JLabel();
        panelBotonesInactiva = new javax.swing.JPanel();
        btnClimaInactivo = new javax.swing.JButton();
        btnAgregarInactivo = new javax.swing.JButton();
        btnAvanzarInactivo = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 250, 252));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 24, 20, 24));
        setLayout(new java.awt.BorderLayout(16, 16));

        panelSuperior.setOpaque(false);
        panelSuperior.setLayout(new java.awt.BorderLayout(0, 16));

        panelEncabezado.setOpaque(false);
        panelEncabezado.setLayout(new java.awt.BorderLayout());

        panelTitulos.setOpaque(false);
        panelTitulos.setLayout(new java.awt.GridLayout(2, 1, 0, 2));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(23, 37, 56));
        lblTitulo.setText("Dashboard de Simulación");
        panelTitulos.add(lblTitulo);

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(100, 116, 139));
        lblSubtitulo.setText("Sin simulación en curso");
        panelTitulos.add(lblSubtitulo);

        panelEncabezado.add(panelTitulos, java.awt.BorderLayout.LINE_START);

        panelEstadoClima.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 0, 0, 0));
        panelEstadoClima.setOpaque(false);
        panelEstadoClima.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 12, 0));

        lblSinIniciar.setBackground(new java.awt.Color(241, 245, 249));
        lblSinIniciar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblSinIniciar.setForeground(new java.awt.Color(71, 85, 105));
        lblSinIniciar.setText("Sin iniciar");
        lblSinIniciar.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        lblSinIniciar.setOpaque(true);
        panelEstadoClima.add(lblSinIniciar);

        lblEstadoSimulacion.setBackground(new java.awt.Color(240, 255, 244));
        lblEstadoSimulacion.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblEstadoSimulacion.setForeground(new java.awt.Color(47, 133, 90));
        lblEstadoSimulacion.setText("En curso");
        lblEstadoSimulacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        lblEstadoSimulacion.setOpaque(true);
        panelEstadoClima.add(lblEstadoSimulacion);

        lblClima.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblClima.setForeground(new java.awt.Color(100, 116, 139));
        lblClima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/sol16.png"))); // NOI18N
        lblClima.setText("Clima: -");
        lblClima.setIconTextGap(6);
        panelEstadoClima.add(lblClima);

        panelEncabezado.add(panelEstadoClima, java.awt.BorderLayout.LINE_END);

        panelSuperior.add(panelEncabezado, java.awt.BorderLayout.PAGE_START);

        panelContadores.setOpaque(false);
        panelContadores.setLayout(new java.awt.GridLayout(1, 4, 16, 0));

        tarjetaTurno.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaTurno.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        tarjetaTurno.setLayout(new java.awt.BorderLayout(0, 8));

        filaTituloTurno.setOpaque(false);
        filaTituloTurno.setLayout(new java.awt.BorderLayout());

        lblTituloTurno.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloTurno.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloTurno.setText("Turno actual");
        filaTituloTurno.add(lblTituloTurno, java.awt.BorderLayout.LINE_START);

        lblIconoTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/turno24.png"))); // NOI18N
        filaTituloTurno.add(lblIconoTurno, java.awt.BorderLayout.LINE_END);

        tarjetaTurno.add(filaTituloTurno, java.awt.BorderLayout.PAGE_START);

        filaValorTurno.setOpaque(false);
        filaValorTurno.setLayout(new java.awt.BorderLayout(8, 0));

        lblTurno.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(47, 133, 90));
        lblTurno.setText("0");
        filaValorTurno.add(lblTurno, java.awt.BorderLayout.LINE_START);

        lblTotalTurnos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblTotalTurnos.setForeground(new java.awt.Color(100, 116, 139));
        lblTotalTurnos.setText("de 0 turnos");
        lblTotalTurnos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 8, 0));
        lblTotalTurnos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        filaValorTurno.add(lblTotalTurnos, java.awt.BorderLayout.CENTER);

        tarjetaTurno.add(filaValorTurno, java.awt.BorderLayout.CENTER);

        panelContadores.add(tarjetaTurno);

        tarjetaPlantas.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaPlantas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        tarjetaPlantas.setLayout(new java.awt.BorderLayout(0, 8));

        filaTituloPlantas.setOpaque(false);
        filaTituloPlantas.setLayout(new java.awt.BorderLayout());

        lblTituloPlantas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloPlantas.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloPlantas.setText("Plantas");
        filaTituloPlantas.add(lblTituloPlantas, java.awt.BorderLayout.LINE_START);

        lblIconoPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta24.png"))); // NOI18N
        filaTituloPlantas.add(lblIconoPlantas, java.awt.BorderLayout.LINE_END);

        tarjetaPlantas.add(filaTituloPlantas, java.awt.BorderLayout.PAGE_START);

        filaValorPlantas.setOpaque(false);
        filaValorPlantas.setLayout(new java.awt.BorderLayout(8, 0));

        lblPlantas.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblPlantas.setForeground(new java.awt.Color(16, 185, 129));
        lblPlantas.setText("0");
        filaValorPlantas.add(lblPlantas, java.awt.BorderLayout.LINE_START);

        lblDescPlantas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblDescPlantas.setForeground(new java.awt.Color(100, 116, 139));
        lblDescPlantas.setText("Población actual");
        lblDescPlantas.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 8, 0));
        lblDescPlantas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        filaValorPlantas.add(lblDescPlantas, java.awt.BorderLayout.CENTER);

        tarjetaPlantas.add(filaValorPlantas, java.awt.BorderLayout.CENTER);

        panelContadores.add(tarjetaPlantas);

        tarjetaConejos.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaConejos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        tarjetaConejos.setLayout(new java.awt.BorderLayout(0, 8));

        filaTituloConejos.setOpaque(false);
        filaTituloConejos.setLayout(new java.awt.BorderLayout());

        lblTituloConejos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloConejos.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloConejos.setText("Conejos");
        filaTituloConejos.add(lblTituloConejos, java.awt.BorderLayout.LINE_START);

        lblIconoConejos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conejo24.png"))); // NOI18N
        filaTituloConejos.add(lblIconoConejos, java.awt.BorderLayout.LINE_END);

        tarjetaConejos.add(filaTituloConejos, java.awt.BorderLayout.PAGE_START);

        filaValorConejos.setOpaque(false);
        filaValorConejos.setLayout(new java.awt.BorderLayout(8, 0));

        lblConejos.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblConejos.setForeground(new java.awt.Color(14, 165, 233));
        lblConejos.setText("0");
        filaValorConejos.add(lblConejos, java.awt.BorderLayout.LINE_START);

        lblDescConejos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblDescConejos.setForeground(new java.awt.Color(100, 116, 139));
        lblDescConejos.setText("Población actual");
        lblDescConejos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 8, 0));
        lblDescConejos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        filaValorConejos.add(lblDescConejos, java.awt.BorderLayout.CENTER);

        tarjetaConejos.add(filaValorConejos, java.awt.BorderLayout.CENTER);

        panelContadores.add(tarjetaConejos);

        tarjetaLobos.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaLobos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        tarjetaLobos.setLayout(new java.awt.BorderLayout(0, 8));

        filaTituloLobos.setOpaque(false);
        filaTituloLobos.setLayout(new java.awt.BorderLayout());

        lblTituloLobos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloLobos.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloLobos.setText("Lobos");
        filaTituloLobos.add(lblTituloLobos, java.awt.BorderLayout.LINE_START);

        lblIconoLobos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo24.png"))); // NOI18N
        filaTituloLobos.add(lblIconoLobos, java.awt.BorderLayout.LINE_END);

        tarjetaLobos.add(filaTituloLobos, java.awt.BorderLayout.PAGE_START);

        filaValorLobos.setOpaque(false);
        filaValorLobos.setLayout(new java.awt.BorderLayout(8, 0));

        lblLobos.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblLobos.setForeground(new java.awt.Color(249, 115, 22));
        lblLobos.setText("0");
        filaValorLobos.add(lblLobos, java.awt.BorderLayout.LINE_START);

        lblDescLobos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblDescLobos.setForeground(new java.awt.Color(100, 116, 139));
        lblDescLobos.setText("Población actual");
        lblDescLobos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 8, 0));
        lblDescLobos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        filaValorLobos.add(lblDescLobos, java.awt.BorderLayout.CENTER);

        tarjetaLobos.add(filaValorLobos, java.awt.BorderLayout.CENTER);

        panelContadores.add(tarjetaLobos);

        panelSuperior.add(panelContadores, java.awt.BorderLayout.CENTER);

        add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        panelEntidades.setBackground(new java.awt.Color(255, 255, 255));
        panelEntidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)));
        panelEntidades.setLayout(new java.awt.BorderLayout());

        pnlTituloTabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlTituloTabla.setOpaque(false);
        pnlTituloTabla.setLayout(new java.awt.BorderLayout());

        lblTituloTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloTabla.setForeground(new java.awt.Color(23, 37, 56));
        lblTituloTabla.setText("Entidades del ecosistema");
        pnlTituloTabla.add(lblTituloTabla, java.awt.BorderLayout.LINE_START);

        lblCantidadEntidades.setBackground(new java.awt.Color(241, 245, 249));
        lblCantidadEntidades.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblCantidadEntidades.setForeground(new java.awt.Color(71, 85, 105));
        lblCantidadEntidades.setText("0 entidades");
        lblCantidadEntidades.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 8, 4, 8));
        lblCantidadEntidades.setOpaque(true);
        pnlTituloTabla.add(lblCantidadEntidades, java.awt.BorderLayout.LINE_END);

        panelEntidades.add(pnlTituloTabla, java.awt.BorderLayout.PAGE_START);

        panelCuerpoTabla.setBackground(new java.awt.Color(255, 255, 255));
        panelCuerpoTabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(226, 232, 240)));
        panelCuerpoTabla.setLayout(new java.awt.CardLayout());

        jScrollTabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tablaEntidades.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tablaEntidades.setForeground(new java.awt.Color(23, 37, 56));
        tablaEntidades.setFillsViewportHeight(true);
        tablaEntidades.setGridColor(new java.awt.Color(241, 245, 249));
        tablaEntidades.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tablaEntidades.setRowHeight(30);
        tablaEntidades.setSelectionBackground(new java.awt.Color(240, 255, 244));
        tablaEntidades.setSelectionForeground(new java.awt.Color(23, 37, 56));
        tablaEntidades.setShowVerticalLines(false);
        tablaEntidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
        
            },
            new String [] {
                "ID", "Tipo", "Energía", "Edad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };
        
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollTabla.setViewportView(tablaEntidades);

        panelCuerpoTabla.add(jScrollTabla, "tabla");

        panelVacioTabla.setBackground(new java.awt.Color(255, 255, 255));
        panelVacioTabla.setLayout(new java.awt.GridBagLayout());

        panelVacioTablaIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/vacio32.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelVacioTabla.add(panelVacioTablaIcono, gridBagConstraints);

        panelVacioTablaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        panelVacioTablaTitulo.setForeground(new java.awt.Color(23, 37, 56));
        panelVacioTablaTitulo.setText("No hay una simulación en curso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        panelVacioTabla.add(panelVacioTablaTitulo, gridBagConstraints);

        panelVacioTablaDesc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        panelVacioTablaDesc.setForeground(new java.awt.Color(100, 116, 139));
        panelVacioTablaDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelVacioTablaDesc.setText("<html><div style=\"text-align:center\">Inicie una simulación nueva o cargue una partida guardada<br>para ver las entidades del ecosistema.</div></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 24);
        panelVacioTabla.add(panelVacioTablaDesc, gridBagConstraints);

        panelBotonesVacio.setOpaque(false);
        panelBotonesVacio.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0));

        btnCargarPartida.setBackground(new java.awt.Color(241, 245, 249));
        btnCargarPartida.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCargarPartida.setForeground(new java.awt.Color(23, 37, 56));
        btnCargarPartida.setText("Cargar Partida");
        btnCargarPartida.setBorderPainted(false);
        btnCargarPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarPartida.setFocusPainted(false);
        btnCargarPartida.setIconTextGap(8);
        btnCargarPartida.setPreferredSize(new java.awt.Dimension(150, 38));
        btnCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPartidaActionPerformed(evt);
            }
        });
        panelBotonesVacio.add(btnCargarPartida);

        btnNuevaSimulacion.setBackground(new java.awt.Color(47, 133, 90));
        btnNuevaSimulacion.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNuevaSimulacion.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaSimulacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/iniciar16.png"))); // NOI18N
        btnNuevaSimulacion.setText("Nueva Simulación");
        btnNuevaSimulacion.setBorderPainted(false);
        btnNuevaSimulacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaSimulacion.setFocusPainted(false);
        btnNuevaSimulacion.setIconTextGap(8);
        btnNuevaSimulacion.setPreferredSize(new java.awt.Dimension(180, 38));
        btnNuevaSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSimulacionActionPerformed(evt);
            }
        });
        panelBotonesVacio.add(btnNuevaSimulacion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 0, 0);
        panelVacioTabla.add(panelBotonesVacio, gridBagConstraints);

        panelCuerpoTabla.add(panelVacioTabla, "vacio");

        panelEntidades.add(panelCuerpoTabla, java.awt.BorderLayout.CENTER);

        lblPieTabla.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPieTabla.setForeground(new java.awt.Color(100, 116, 139));
        lblPieTabla.setText("Sin entidades vivas");
        lblPieTabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 16, 10, 16));
        panelEntidades.add(lblPieTabla, java.awt.BorderLayout.PAGE_END);

        add(panelEntidades, java.awt.BorderLayout.CENTER);

        panelEventos.setBackground(new java.awt.Color(255, 255, 255));
        panelEventos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)));
        panelEventos.setPreferredSize(new java.awt.Dimension(340, 0));
        panelEventos.setLayout(new java.awt.BorderLayout());

        pnlTituloEventos.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlTituloEventos.setOpaque(false);
        pnlTituloEventos.setLayout(new java.awt.BorderLayout());

        lblTituloEventos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloEventos.setForeground(new java.awt.Color(23, 37, 56));
        lblTituloEventos.setText("Log de Eventos");
        pnlTituloEventos.add(lblTituloEventos, java.awt.BorderLayout.LINE_START);

        lblIconoEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lista16.png"))); // NOI18N
        pnlTituloEventos.add(lblIconoEventos, java.awt.BorderLayout.LINE_END);

        panelEventos.add(pnlTituloEventos, java.awt.BorderLayout.PAGE_START);

        panelCuerpoEventos.setBackground(new java.awt.Color(255, 255, 255));
        panelCuerpoEventos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(226, 232, 240)));
        panelCuerpoEventos.setLayout(new java.awt.CardLayout());

        jScrollEventos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollEventos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        listaEventos.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        listaEventos.setForeground(new java.awt.Color(23, 37, 56));
        listaEventos.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 14, 6, 14));
        listaEventos.setFixedCellHeight(28);
        listaEventos.setSelectionBackground(new java.awt.Color(240, 255, 244));
        listaEventos.setSelectionForeground(new java.awt.Color(23, 37, 56));
        jScrollEventos.setViewportView(listaEventos);

        panelCuerpoEventos.add(jScrollEventos, "lista");

        panelVacioEventos.setBackground(new java.awt.Color(255, 255, 255));
        panelVacioEventos.setLayout(new java.awt.GridBagLayout());

        panelVacioEventosIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/sinEventos28.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelVacioEventos.add(panelVacioEventosIcono, gridBagConstraints);

        panelVacioEventosTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        panelVacioEventosTitulo.setForeground(new java.awt.Color(23, 37, 56));
        panelVacioEventosTitulo.setText("Sin eventos registrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        panelVacioEventos.add(panelVacioEventosTitulo, gridBagConstraints);

        panelVacioEventosDesc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        panelVacioEventosDesc.setForeground(new java.awt.Color(100, 116, 139));
        panelVacioEventosDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelVacioEventosDesc.setText("<html><div style=\"text-align:center\">Los eventos aparecerán al avanzar<br>el primer turno.</div></html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 24);
        panelVacioEventos.add(panelVacioEventosDesc, gridBagConstraints);

        panelCuerpoEventos.add(panelVacioEventos, "vacio");

        panelEventos.add(panelCuerpoEventos, java.awt.BorderLayout.CENTER);

        lblPieEventos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPieEventos.setForeground(new java.awt.Color(100, 116, 139));
        lblPieEventos.setText("Eventos más recientes primero");
        lblPieEventos.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 16, 10, 16));
        panelEventos.add(lblPieEventos, java.awt.BorderLayout.PAGE_END);

        add(panelEventos, java.awt.BorderLayout.LINE_END);

        panelZonaIntervencion.setOpaque(false);
        panelZonaIntervencion.setLayout(new java.awt.CardLayout());

        panelIntervencion.setBackground(new java.awt.Color(240, 255, 244));
        panelIntervencion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 230, 180)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        panelIntervencion.setLayout(new java.awt.BorderLayout(16, 0));

        panelTextoIntervencion.setOpaque(false);
        panelTextoIntervencion.setLayout(new java.awt.GridLayout(2, 1, 0, 4));

        lblTituloIntervencion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloIntervencion.setForeground(new java.awt.Color(47, 133, 90));
        lblTituloIntervencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/intervencion16.png"))); // NOI18N
        lblTituloIntervencion.setText("Panel de Intervención");
        lblTituloIntervencion.setIconTextGap(8);
        panelTextoIntervencion.add(lblTituloIntervencion);

        lblDisponibilidad.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDisponibilidad.setForeground(new java.awt.Color(100, 116, 139));
        lblDisponibilidad.setText("Sin simulación en curso");
        panelTextoIntervencion.add(lblDisponibilidad);

        panelIntervencion.add(panelTextoIntervencion, java.awt.BorderLayout.LINE_START);

        panelBotones.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 0, 0, 0));
        panelBotones.setOpaque(false);
        panelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 0));

        btnCambiarClima.setBackground(new java.awt.Color(255, 255, 255));
        btnCambiarClima.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCambiarClima.setForeground(new java.awt.Color(23, 37, 56));
        btnCambiarClima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/clima16.png"))); // NOI18N
        btnCambiarClima.setText("Cambiar Clima");
        btnCambiarClima.setBorderPainted(false);
        btnCambiarClima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarClima.setFocusPainted(false);
        btnCambiarClima.setIconTextGap(8);
        btnCambiarClima.setPreferredSize(new java.awt.Dimension(150, 38));
        btnCambiarClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarClimaActionPerformed(evt);
            }
        });
        panelBotones.add(btnCambiarClima);

        btnAgregarEntidad.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarEntidad.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAgregarEntidad.setForeground(new java.awt.Color(23, 37, 56));
        btnAgregarEntidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/agregar16.png"))); // NOI18N
        btnAgregarEntidad.setText("Agregar Entidad");
        btnAgregarEntidad.setBorderPainted(false);
        btnAgregarEntidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEntidad.setFocusPainted(false);
        btnAgregarEntidad.setIconTextGap(8);
        btnAgregarEntidad.setPreferredSize(new java.awt.Dimension(165, 38));
        btnAgregarEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEntidadActionPerformed(evt);
            }
        });
        panelBotones.add(btnAgregarEntidad);

        btnAvanzarTurno.setBackground(new java.awt.Color(47, 133, 90));
        btnAvanzarTurno.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAvanzarTurno.setForeground(new java.awt.Color(255, 255, 255));
        btnAvanzarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/avanzar16.png"))); // NOI18N
        btnAvanzarTurno.setText("Avanzar Turno");
        btnAvanzarTurno.setBorderPainted(false);
        btnAvanzarTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvanzarTurno.setFocusPainted(false);
        btnAvanzarTurno.setIconTextGap(8);
        btnAvanzarTurno.setPreferredSize(new java.awt.Dimension(155, 38));
        btnAvanzarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarTurnoActionPerformed(evt);
            }
        });
        panelBotones.add(btnAvanzarTurno);

        panelIntervencion.add(panelBotones, java.awt.BorderLayout.LINE_END);

        panelZonaIntervencion.add(panelIntervencion, "activa");

        panelIntervencionInactiva.setBackground(new java.awt.Color(248, 250, 252));
        panelIntervencionInactiva.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        panelIntervencionInactiva.setLayout(new java.awt.BorderLayout(16, 0));

        panelTextoInactiva.setOpaque(false);
        panelTextoInactiva.setLayout(new java.awt.GridLayout(2, 1, 0, 4));

        lblTituloInactiva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloInactiva.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloInactiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/intervencion16.png"))); // NOI18N
        lblTituloInactiva.setText("Intervención no disponible");
        lblTituloInactiva.setEnabled(false);
        lblTituloInactiva.setIconTextGap(8);
        panelTextoInactiva.add(lblTituloInactiva);

        lblDescInactiva.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblDescInactiva.setForeground(new java.awt.Color(100, 116, 139));
        lblDescInactiva.setText("Inicie una simulación para habilitar las acciones");
        panelTextoInactiva.add(lblDescInactiva);

        panelIntervencionInactiva.add(panelTextoInactiva, java.awt.BorderLayout.LINE_START);

        panelBotonesInactiva.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 0, 0, 0));
        panelBotonesInactiva.setOpaque(false);
        panelBotonesInactiva.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 0));

        btnClimaInactivo.setBackground(new java.awt.Color(226, 232, 240));
        btnClimaInactivo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnClimaInactivo.setForeground(new java.awt.Color(100, 116, 139));
        btnClimaInactivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/clima16.png"))); // NOI18N
        btnClimaInactivo.setText("Cambiar Clima");
        btnClimaInactivo.setBorderPainted(false);
        btnClimaInactivo.setEnabled(false);
        btnClimaInactivo.setFocusPainted(false);
        btnClimaInactivo.setIconTextGap(8);
        btnClimaInactivo.setPreferredSize(new java.awt.Dimension(150, 38));
        panelBotonesInactiva.add(btnClimaInactivo);

        btnAgregarInactivo.setBackground(new java.awt.Color(226, 232, 240));
        btnAgregarInactivo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAgregarInactivo.setForeground(new java.awt.Color(100, 116, 139));
        btnAgregarInactivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/agregar16.png"))); // NOI18N
        btnAgregarInactivo.setText("Agregar Entidad");
        btnAgregarInactivo.setBorderPainted(false);
        btnAgregarInactivo.setEnabled(false);
        btnAgregarInactivo.setFocusPainted(false);
        btnAgregarInactivo.setIconTextGap(8);
        btnAgregarInactivo.setPreferredSize(new java.awt.Dimension(165, 38));
        panelBotonesInactiva.add(btnAgregarInactivo);

        btnAvanzarInactivo.setBackground(new java.awt.Color(226, 232, 240));
        btnAvanzarInactivo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAvanzarInactivo.setForeground(new java.awt.Color(100, 116, 139));
        btnAvanzarInactivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/avanzar16.png"))); // NOI18N
        btnAvanzarInactivo.setText("Avanzar Turno");
        btnAvanzarInactivo.setBorderPainted(false);
        btnAvanzarInactivo.setEnabled(false);
        btnAvanzarInactivo.setFocusPainted(false);
        btnAvanzarInactivo.setIconTextGap(8);
        btnAvanzarInactivo.setPreferredSize(new java.awt.Dimension(155, 38));
        panelBotonesInactiva.add(btnAvanzarInactivo);

        panelIntervencionInactiva.add(panelBotonesInactiva, java.awt.BorderLayout.LINE_END);

        panelZonaIntervencion.add(panelIntervencionInactiva, "inactiva");

        add(panelZonaIntervencion, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarClimaActionPerformed
        // TODO add your handling code here:
        
        if (controlador == null) return;
        String[] climas = {"SOLEADO", "LLUVIOSO", "SEQUIA", "INVIERNO"};
        String seleccion = (String) javax.swing.JOptionPane.showInputDialog(
                this, 
                "Selecciona el nuevo clima:", 
                "Cambiar Clima", 
                javax.swing.JOptionPane.QUESTION_MESSAGE, 
                null, 
                climas, 
                climas[0]
        );
        if (seleccion != null) {
            controlador.aplicarCambioClima(seleccion);
        }
    }//GEN-LAST:event_btnCambiarClimaActionPerformed

    private void btnAgregarEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEntidadActionPerformed
        // TODO add your handling code here:
        
        if (controlador == null) return;
        String[] opciones = {"planta", "conejo", "lobo"};
        String seleccion = (String) javax.swing.JOptionPane.showInputDialog(
                this, 
                "¿Qué entidad deseas agregar?", 
                "Agregar Entidad", 
                javax.swing.JOptionPane.QUESTION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]
        );
        if (seleccion != null) {
            controlador.aplicarAgregarEntidad(seleccion);
        }
    }//GEN-LAST:event_btnAgregarEntidadActionPerformed

    private void btnAvanzarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarTurnoActionPerformed
        // TODO add your handling code here:
        
        if (controlador != null) {
            controlador.avanzarTurno();
        }
    }//GEN-LAST:event_btnAvanzarTurnoActionPerformed

    private void btnCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPartidaActionPerformed
        if (controlador != null) {
            controlador.cargarPartida();
        }
    }//GEN-LAST:event_btnCargarPartidaActionPerformed

    private void btnNuevaSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSimulacionActionPerformed
        VentanaPrincipal ventana = (VentanaPrincipal) javax.swing.SwingUtilities.getWindowAncestor(this);
        ventana.mostrarConfiguracion();
    }//GEN-LAST:event_btnNuevaSimulacionActionPerformed

    public void actualizarEstado(int turno, int totalTurnos, String clima, int plantas, int conejos, int lobos) {
        lblTurno.setText(String.valueOf(turno));
        lblTotalTurnos.setText("de " + totalTurnos + " turnos");
        lblClima.setText("Clima: " + clima);
        lblPlantas.setText(String.valueOf(plantas));
        lblConejos.setText(String.valueOf(conejos));
        lblLobos.setText(String.valueOf(lobos));
    }

    public void cargarTabla(List<Object[]> filas) {
        DefaultTableModel modelo = (DefaultTableModel) tablaEntidades.getModel();
        modelo.setRowCount(0);
        for (Object[] fila : filas) {
            modelo.addRow(fila);
        }
        lblCantidadEntidades.setText(filas.size() + " entidades");
        lblPieTabla.setText(filas.isEmpty() ? "Sin entidades vivas" : filas.size() + " entidades vivas");
    }

    public void mostrarEventos(List<String> eventos) {
        if (eventos.isEmpty()) {
            listaEventos.setListData(new String[]{"Sin eventos en este turno"});
        } else {
            listaEventos.setListData(eventos.toArray(new String[0]));
        }
    }

    public void habilitarIntervencion(boolean habilitada, String mensaje) {
        btnCambiarClima.setEnabled(habilitada);
        btnAgregarEntidad.setEnabled(habilitada);
        lblDisponibilidad.setText(mensaje);
    }

    public void mostrarSinSimulacion() {
        actualizarEstado(0, 0, "—", 0, 0, 0);
        cargarTabla(new java.util.ArrayList<>());
        listaEventos.setListData(new String[0]);
        habilitarIntervencion(false, "Sin simulación en curso");
        btnAvanzarTurno.setEnabled(false);
        lblSinIniciar.setVisible(true);
        lblEstadoSimulacion.setVisible(false);
        lblSubtitulo.setText("Todavía no hay una simulación en curso");
        mostrarContadores(false);
        mostrarTarjeta(panelCuerpoTabla, "vacio");
        mostrarTarjeta(panelCuerpoEventos, "vacio");
        mostrarTarjeta(panelZonaIntervencion, "inactiva");
    }

    public void mostrarEnCurso(String subtitulo) {
        btnAvanzarTurno.setEnabled(true);
        lblSinIniciar.setVisible(false);
        lblEstadoSimulacion.setVisible(true);
        lblSubtitulo.setText(subtitulo);
        mostrarContadores(true);
        mostrarTarjeta(panelCuerpoTabla, "tabla");
        mostrarTarjeta(panelCuerpoEventos, "lista");
        mostrarTarjeta(panelZonaIntervencion, "activa");
    }

    private void mostrarContadores(boolean conDatos) {
        javax.swing.JLabel[] valores = {lblTurno, lblPlantas, lblConejos, lblLobos};
        javax.swing.JLabel[] descripciones = {lblTotalTurnos, lblDescPlantas, lblDescConejos, lblDescLobos};
        javax.swing.JLabel[] iconos = {lblIconoTurno, lblIconoPlantas, lblIconoConejos, lblIconoLobos};
        for (int i = 0; i < valores.length; i++) {
            valores[i].setEnabled(conDatos);
            iconos[i].setEnabled(conDatos);
            if (!conDatos) {
                valores[i].setText("—");
                descripciones[i].setText("Sin datos");
            } else if (i > 0) {
                descripciones[i].setText("Población actual");
            }
        }
    }

    private void mostrarTarjeta(javax.swing.JPanel contenedor, String tarjeta) {
        ((java.awt.CardLayout) contenedor.getLayout()).show(contenedor, tarjeta);
    }
    
    
    
    private controlador.ControladorPrincipal controlador;

    public void setControlador(controlador.ControladorPrincipal controlador) {
        this.controlador = controlador;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEntidad;
    private javax.swing.JButton btnAgregarInactivo;
    private javax.swing.JButton btnAvanzarInactivo;
    private javax.swing.JButton btnAvanzarTurno;
    private javax.swing.JButton btnCambiarClima;
    private javax.swing.JButton btnCargarPartida;
    private javax.swing.JButton btnClimaInactivo;
    private javax.swing.JButton btnNuevaSimulacion;
    private javax.swing.JPanel filaTituloConejos;
    private javax.swing.JPanel filaTituloLobos;
    private javax.swing.JPanel filaTituloPlantas;
    private javax.swing.JPanel filaTituloTurno;
    private javax.swing.JPanel filaValorConejos;
    private javax.swing.JPanel filaValorLobos;
    private javax.swing.JPanel filaValorPlantas;
    private javax.swing.JPanel filaValorTurno;
    private javax.swing.JScrollPane jScrollEventos;
    private javax.swing.JScrollPane jScrollTabla;
    private javax.swing.JLabel lblCantidadEntidades;
    private javax.swing.JLabel lblClima;
    private javax.swing.JLabel lblConejos;
    private javax.swing.JLabel lblDescConejos;
    private javax.swing.JLabel lblDescInactiva;
    private javax.swing.JLabel lblDescLobos;
    private javax.swing.JLabel lblDescPlantas;
    private javax.swing.JLabel lblDisponibilidad;
    private javax.swing.JLabel lblEstadoSimulacion;
    private javax.swing.JLabel lblIconoConejos;
    private javax.swing.JLabel lblIconoEventos;
    private javax.swing.JLabel lblIconoLobos;
    private javax.swing.JLabel lblIconoPlantas;
    private javax.swing.JLabel lblIconoTurno;
    private javax.swing.JLabel lblLobos;
    private javax.swing.JLabel lblPieEventos;
    private javax.swing.JLabel lblPieTabla;
    private javax.swing.JLabel lblPlantas;
    private javax.swing.JLabel lblSinIniciar;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloConejos;
    private javax.swing.JLabel lblTituloEventos;
    private javax.swing.JLabel lblTituloInactiva;
    private javax.swing.JLabel lblTituloIntervencion;
    private javax.swing.JLabel lblTituloLobos;
    private javax.swing.JLabel lblTituloPlantas;
    private javax.swing.JLabel lblTituloTabla;
    private javax.swing.JLabel lblTituloTurno;
    private javax.swing.JLabel lblTotalTurnos;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JList<String> listaEventos;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBotonesInactiva;
    private javax.swing.JPanel panelBotonesVacio;
    private javax.swing.JPanel panelContadores;
    private javax.swing.JPanel panelCuerpoEventos;
    private javax.swing.JPanel panelCuerpoTabla;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelEntidades;
    private javax.swing.JPanel panelEstadoClima;
    private javax.swing.JPanel panelEventos;
    private javax.swing.JPanel panelIntervencion;
    private javax.swing.JPanel panelIntervencionInactiva;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelTextoInactiva;
    private javax.swing.JPanel panelTextoIntervencion;
    private javax.swing.JPanel panelTitulos;
    private javax.swing.JPanel panelVacioEventos;
    private javax.swing.JLabel panelVacioEventosDesc;
    private javax.swing.JLabel panelVacioEventosIcono;
    private javax.swing.JLabel panelVacioEventosTitulo;
    private javax.swing.JPanel panelVacioTabla;
    private javax.swing.JLabel panelVacioTablaDesc;
    private javax.swing.JLabel panelVacioTablaIcono;
    private javax.swing.JLabel panelVacioTablaTitulo;
    private javax.swing.JPanel panelZonaIntervencion;
    private javax.swing.JPanel pnlTituloEventos;
    private javax.swing.JPanel pnlTituloTabla;
    private javax.swing.JTable tablaEntidades;
    private javax.swing.JPanel tarjetaConejos;
    private javax.swing.JPanel tarjetaLobos;
    private javax.swing.JPanel tarjetaPlantas;
    private javax.swing.JPanel tarjetaTurno;
    // End of variables declaration//GEN-END:variables
}
