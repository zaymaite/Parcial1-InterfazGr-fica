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

        panelSuperior = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        panelTitulos = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        panelEstadoClima = new javax.swing.JPanel();
        lblEstadoSimulacion = new javax.swing.JLabel();
        lblClima = new javax.swing.JLabel();
        panelContadores = new javax.swing.JPanel();
        tarjetaTurno = new javax.swing.JPanel();
        lblTurno = new javax.swing.JLabel();
        lblTotalTurnos = new javax.swing.JLabel();
        lblTituloTurno = new javax.swing.JLabel();
        tarjetaPlantas = new javax.swing.JPanel();
        lblPlantas = new javax.swing.JLabel();
        lblDescPlantas = new javax.swing.JLabel();
        lblTituloPlantas = new javax.swing.JLabel();
        tarjetaConejos = new javax.swing.JPanel();
        lblConejos = new javax.swing.JLabel();
        lblDescConejos = new javax.swing.JLabel();
        lblTituloConejos = new javax.swing.JLabel();
        tarjetaLobos = new javax.swing.JPanel();
        lblLobos = new javax.swing.JLabel();
        lblDescLobos = new javax.swing.JLabel();
        lblTituloLobos = new javax.swing.JLabel();
        panelEntidades = new javax.swing.JPanel();
        pnlTituloTabla = new javax.swing.JPanel();
        lblTituloTabla = new javax.swing.JLabel();
        lblCantidadEntidades = new javax.swing.JLabel();
        jScrollTabla = new javax.swing.JScrollPane();
        tablaEntidades = new javax.swing.JTable();
        lblPieTabla = new javax.swing.JLabel();
        panelEventos = new javax.swing.JPanel();
        lblTituloEventos = new javax.swing.JLabel();
        jScrollEventos = new javax.swing.JScrollPane();
        listaEventos = new javax.swing.JList<>();
        lblPieEventos = new javax.swing.JLabel();
        panelIntervencion = new javax.swing.JPanel();
        panelTextoIntervencion = new javax.swing.JPanel();
        lblTituloIntervencion = new javax.swing.JLabel();
        lblDisponibilidad = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnCambiarClima = new javax.swing.JButton();
        btnAgregarEntidad = new javax.swing.JButton();
        btnAvanzarTurno = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 250, 252));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 24, 16, 24));
        setLayout(new java.awt.BorderLayout(16, 16));

        panelSuperior.setOpaque(false);
        panelSuperior.setLayout(new java.awt.BorderLayout(0, 16));

        panelEncabezado.setOpaque(false);
        panelEncabezado.setLayout(new java.awt.BorderLayout());

        panelTitulos.setOpaque(false);
        panelTitulos.setLayout(new java.awt.GridLayout(2, 1));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setText("Dashboard de Simulación");
        panelTitulos.add(lblTitulo);

        lblSubtitulo.setForeground(new java.awt.Color(100, 116, 139));
        lblSubtitulo.setText("Sin simulación en curso");
        panelTitulos.add(lblSubtitulo);

        panelEncabezado.add(panelTitulos, java.awt.BorderLayout.WEST);

        panelEstadoClima.setOpaque(false);

        lblEstadoSimulacion.setForeground(new java.awt.Color(21, 128, 61));
        lblEstadoSimulacion.setText("En curso");
        panelEstadoClima.add(lblEstadoSimulacion);

        lblClima.setText("Clima: ");
        panelEstadoClima.add(lblClima);

        panelEncabezado.add(panelEstadoClima, java.awt.BorderLayout.EAST);

        panelSuperior.add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelContadores.setOpaque(false);
        panelContadores.setLayout(new java.awt.GridLayout(1, 4, 12, 0));

        tarjetaTurno.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaTurno.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        tarjetaTurno.setLayout(new java.awt.BorderLayout());

        lblTurno.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(21, 128, 61));
        lblTurno.setText("0");
        tarjetaTurno.add(lblTurno, java.awt.BorderLayout.CENTER);

        lblTotalTurnos.setForeground(new java.awt.Color(100, 116, 139));
        lblTotalTurnos.setText("de 0 turnos");
        tarjetaTurno.add(lblTotalTurnos, java.awt.BorderLayout.SOUTH);

        lblTituloTurno.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloTurno.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloTurno.setText("Turno actual");
        tarjetaTurno.add(lblTituloTurno, java.awt.BorderLayout.NORTH);

        panelContadores.add(tarjetaTurno);

        tarjetaPlantas.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaPlantas.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        tarjetaPlantas.setLayout(new java.awt.BorderLayout());

        lblPlantas.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblPlantas.setForeground(new java.awt.Color(22, 163, 74));
        lblPlantas.setText("0");
        tarjetaPlantas.add(lblPlantas, java.awt.BorderLayout.CENTER);

        lblDescPlantas.setForeground(new java.awt.Color(100, 116, 139));
        lblDescPlantas.setText("Población actual");
        tarjetaPlantas.add(lblDescPlantas, java.awt.BorderLayout.SOUTH);

        lblTituloPlantas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloPlantas.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/planta24.png"))); // NOI18N
        lblTituloPlantas.setText("Plantas");
        tarjetaPlantas.add(lblTituloPlantas, java.awt.BorderLayout.NORTH);

        panelContadores.add(tarjetaPlantas);

        tarjetaConejos.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaConejos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        tarjetaConejos.setLayout(new java.awt.BorderLayout());

        lblConejos.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblConejos.setForeground(new java.awt.Color(14, 165, 233));
        lblConejos.setText("0");
        tarjetaConejos.add(lblConejos, java.awt.BorderLayout.CENTER);

        lblDescConejos.setForeground(new java.awt.Color(100, 116, 139));
        lblDescConejos.setText("Población actual");
        tarjetaConejos.add(lblDescConejos, java.awt.BorderLayout.SOUTH);

        lblTituloConejos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloConejos.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloConejos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/conejo24.png"))); // NOI18N
        lblTituloConejos.setText("Conejos");
        tarjetaConejos.add(lblTituloConejos, java.awt.BorderLayout.NORTH);

        panelContadores.add(tarjetaConejos);

        tarjetaLobos.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaLobos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        tarjetaLobos.setLayout(new java.awt.BorderLayout());

        lblLobos.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblLobos.setForeground(new java.awt.Color(234, 88, 12));
        lblLobos.setText("0");
        tarjetaLobos.add(lblLobos, java.awt.BorderLayout.CENTER);

        lblDescLobos.setForeground(new java.awt.Color(100, 116, 139));
        lblDescLobos.setText("Población actual");
        tarjetaLobos.add(lblDescLobos, java.awt.BorderLayout.SOUTH);

        lblTituloLobos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTituloLobos.setForeground(new java.awt.Color(100, 116, 139));
        lblTituloLobos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/lobo24.png"))); // NOI18N
        lblTituloLobos.setText("Lobos");
        tarjetaLobos.add(lblTituloLobos, java.awt.BorderLayout.NORTH);

        panelContadores.add(tarjetaLobos);

        panelSuperior.add(panelContadores, java.awt.BorderLayout.CENTER);

        add(panelSuperior, java.awt.BorderLayout.NORTH);

        panelEntidades.setBackground(new java.awt.Color(255, 255, 255));
        panelEntidades.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        panelEntidades.setLayout(new java.awt.BorderLayout());

        pnlTituloTabla.setOpaque(false);
        pnlTituloTabla.setLayout(new java.awt.BorderLayout());

        lblTituloTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloTabla.setText("Entidades del ecosistema");
        pnlTituloTabla.add(lblTituloTabla, java.awt.BorderLayout.WEST);

        lblCantidadEntidades.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblCantidadEntidades.setForeground(new java.awt.Color(100, 116, 139));
        lblCantidadEntidades.setText("0 Entidades");
        pnlTituloTabla.add(lblCantidadEntidades, java.awt.BorderLayout.EAST);

        panelEntidades.add(pnlTituloTabla, java.awt.BorderLayout.NORTH);

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
        tablaEntidades.setRowHeight(28);
        jScrollTabla.setViewportView(tablaEntidades);

        panelEntidades.add(jScrollTabla, java.awt.BorderLayout.CENTER);

        lblPieTabla.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPieTabla.setForeground(new java.awt.Color(147, 51, 234));
        lblPieTabla.setText("Sin entidades");
        panelEntidades.add(lblPieTabla, java.awt.BorderLayout.SOUTH);

        add(panelEntidades, java.awt.BorderLayout.CENTER);

        panelEventos.setBackground(new java.awt.Color(255, 255, 255));
        panelEventos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 232, 240)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        panelEventos.setPreferredSize(new java.awt.Dimension(300, 0));
        panelEventos.setLayout(new java.awt.BorderLayout(0, 8));

        lblTituloEventos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloEventos.setText("Log de Eventos");
        panelEventos.add(lblTituloEventos, java.awt.BorderLayout.NORTH);

        jScrollEventos.setViewportView(listaEventos);

        panelEventos.add(jScrollEventos, java.awt.BorderLayout.CENTER);

        lblPieEventos.setForeground(new java.awt.Color(100, 116, 139));
        lblPieEventos.setText("Evento más reciente primero");
        panelEventos.add(lblPieEventos, java.awt.BorderLayout.SOUTH);

        add(panelEventos, java.awt.BorderLayout.EAST);

        panelIntervencion.setBackground(new java.awt.Color(240, 253, 244));
        panelIntervencion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 239, 172)), javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12)));
        panelIntervencion.setToolTipText("");
        panelIntervencion.setLayout(new java.awt.BorderLayout(16, 0));

        panelTextoIntervencion.setOpaque(false);
        panelTextoIntervencion.setLayout(new java.awt.GridLayout(2, 1));

        lblTituloIntervencion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloIntervencion.setForeground(new java.awt.Color(21, 128, 61));
        lblTituloIntervencion.setText("Panel de intervención");
        panelTextoIntervencion.add(lblTituloIntervencion);

        lblDisponibilidad.setForeground(new java.awt.Color(100, 116, 139));
        lblDisponibilidad.setText("Sin simulación en curso");
        panelTextoIntervencion.add(lblDisponibilidad);

        panelIntervencion.add(panelTextoIntervencion, java.awt.BorderLayout.WEST);

        panelBotones.setOpaque(false);

        btnCambiarClima.setText("Cambiar Clima");
        btnCambiarClima.setPreferredSize(new java.awt.Dimension(109, 30));
        btnCambiarClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarClimaActionPerformed(evt);
            }
        });
        panelBotones.add(btnCambiarClima);

        btnAgregarEntidad.setText("Agregar Entidad");
        btnAgregarEntidad.setPreferredSize(new java.awt.Dimension(115, 30));
        btnAgregarEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEntidadActionPerformed(evt);
            }
        });
        panelBotones.add(btnAgregarEntidad);

        btnAvanzarTurno.setBackground(new java.awt.Color(21, 128, 61));
        btnAvanzarTurno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAvanzarTurno.setForeground(new java.awt.Color(255, 255, 255));
        btnAvanzarTurno.setText("Avanzar Turno");
        btnAvanzarTurno.setPreferredSize(new java.awt.Dimension(111, 30));
        btnAvanzarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarTurnoActionPerformed(evt);
            }
        });
        panelBotones.add(btnAvanzarTurno);

        panelIntervencion.add(panelBotones, java.awt.BorderLayout.EAST);

        add(panelIntervencion, java.awt.BorderLayout.SOUTH);
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
        actualizarEstado(0, 0, "-", 0, 0, 0);
        cargarTabla(new java.util.ArrayList<>());
        listaEventos.setListData(new String[]{"Todavía no hay eventos"});
        habilitarIntervencion(false, "Sin simulación en curso");
        btnAvanzarTurno.setEnabled(false);
        lblEstadoSimulacion.setText("Sin simulación");
        lblSubtitulo.setText("Configurá una simulación en la pestaña Configuración");
    }

    public void mostrarEnCurso(String subtitulo) {
        btnAvanzarTurno.setEnabled(true);
        lblEstadoSimulacion.setText("En curso");
        lblSubtitulo.setText(subtitulo);
    }
    
    
    
    private controlador.ControladorPrincipal controlador;

    public void setControlador(controlador.ControladorPrincipal controlador) {
        this.controlador = controlador;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEntidad;
    private javax.swing.JButton btnAvanzarTurno;
    private javax.swing.JButton btnCambiarClima;
    private javax.swing.JScrollPane jScrollEventos;
    private javax.swing.JScrollPane jScrollTabla;
    private javax.swing.JLabel lblCantidadEntidades;
    private javax.swing.JLabel lblClima;
    private javax.swing.JLabel lblConejos;
    private javax.swing.JLabel lblDescConejos;
    private javax.swing.JLabel lblDescLobos;
    private javax.swing.JLabel lblDescPlantas;
    private javax.swing.JLabel lblDisponibilidad;
    private javax.swing.JLabel lblEstadoSimulacion;
    private javax.swing.JLabel lblLobos;
    private javax.swing.JLabel lblPieEventos;
    private javax.swing.JLabel lblPieTabla;
    private javax.swing.JLabel lblPlantas;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloConejos;
    private javax.swing.JLabel lblTituloEventos;
    private javax.swing.JLabel lblTituloIntervencion;
    private javax.swing.JLabel lblTituloLobos;
    private javax.swing.JLabel lblTituloPlantas;
    private javax.swing.JLabel lblTituloTabla;
    private javax.swing.JLabel lblTituloTurno;
    private javax.swing.JLabel lblTotalTurnos;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JList<String> listaEventos;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelContadores;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelEntidades;
    private javax.swing.JPanel panelEstadoClima;
    private javax.swing.JPanel panelEventos;
    private javax.swing.JPanel panelIntervencion;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelTextoIntervencion;
    private javax.swing.JPanel panelTitulos;
    private javax.swing.JPanel pnlTituloTabla;
    private javax.swing.JTable tablaEntidades;
    private javax.swing.JPanel tarjetaConejos;
    private javax.swing.JPanel tarjetaLobos;
    private javax.swing.JPanel tarjetaPlantas;
    private javax.swing.JPanel tarjetaTurno;
    // End of variables declaration//GEN-END:variables
}
