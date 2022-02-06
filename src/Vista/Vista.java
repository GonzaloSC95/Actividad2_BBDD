package Vista;

import Controlador.Controlador;
import Modelo.Entidad.Coche;
import Modelo.Entidad.Pasajero;
import Modelo.Persistencia.DaoCocheMYSQL;
import Modelo.Persistencia.DaoPasajeroMYSQL;
import java.awt.Toolkit;
import java.util.List;

/**
 *
 * @author Gonzalo
 */
public class Vista extends javax.swing.JFrame {

    ///////////////////////////////////////
    private DaoCocheMYSQL daoCocheMYSQL;
    private DaoPasajeroMYSQL daoPasajeroMYSQL;
    /////////////////////////////////////////
    private Controlador controlador;

    /**
     *
     */
    public Vista() {
        daoCocheMYSQL = new DaoCocheMYSQL();
        daoPasajeroMYSQL = new DaoPasajeroMYSQL();
        ///////////////////////////////////////////
        controlador = new Controlador();
        //////////////////////////////////////////
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/cocheLogoRojo.png")));
        //////////////////////////////////
        esconderMenuPasajero();
        esconderDatosCoche();
        esconderDatosPasajero();
        ///////////////////////////////
        setVisible(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelMenuCoche = new javax.swing.JPanel();
        addCoche = new javax.swing.JButton();
        deleteCoche = new javax.swing.JButton();
        getCoche = new javax.swing.JButton();
        modificarCoche = new javax.swing.JButton();
        listarCoches = new javax.swing.JButton();
        gestionarPasajeros = new javax.swing.JButton();
        panelMenuPasajeros = new javax.swing.JPanel();
        createPasajero = new javax.swing.JButton();
        deletePasajero = new javax.swing.JButton();
        getPasajero = new javax.swing.JButton();
        listarPasajeros = new javax.swing.JButton();
        addPasajeroA_Coche = new javax.swing.JButton();
        sacarPasajeroDe_Coche = new javax.swing.JButton();
        listarPasajerosDe_Coche = new javax.swing.JButton();
        panelDatosCoche = new javax.swing.JPanel();
        IDCocheLabel = new javax.swing.JLabel();
        IdCocheTexto = new javax.swing.JTextField();
        matriculaCocheLabel = new javax.swing.JLabel();
        matriculaCocheTexto = new javax.swing.JTextField();
        marcaCocheLabel = new javax.swing.JLabel();
        marcaCocheTexto = new javax.swing.JTextField();
        modeloCocheLabel = new javax.swing.JLabel();
        modeloCocheTexto = new javax.swing.JTextField();
        colorCocheLabel = new javax.swing.JLabel();
        colorCocheTexto = new javax.swing.JTextField();
        panelDatosPasajero = new javax.swing.JPanel();
        iD_PasajeroLabel = new javax.swing.JLabel();
        iD_PasajeroTexto = new javax.swing.JTextField();
        iD_CocheLabel = new javax.swing.JLabel();
        iD_CocheTexto = new javax.swing.JTextField();
        nombrePasajeroLabel = new javax.swing.JLabel();
        nombrePasajeroTexto = new javax.swing.JTextField();
        edadPasajeroLabel = new javax.swing.JLabel();
        edadPasajeroTexto = new javax.swing.JTextField();
        pesoPasajeroLabel = new javax.swing.JLabel();
        pesoPasajeroTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaMostradorBBDD = new javax.swing.JTextArea();
        salir = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1382, 776));
        setMinimumSize(new java.awt.Dimension(1382, 776));
        setResizable(false);
        setSize(new java.awt.Dimension(1382, 776));

        panel.setMaximumSize(new java.awt.Dimension(1382, 776));
        panel.setMinimumSize(new java.awt.Dimension(1382, 776));
        panel.setPreferredSize(new java.awt.Dimension(1382, 776));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuCoche.setBackground(new java.awt.Color(23, 13, 36));

        addCoche.setBackground(new java.awt.Color(43, 11, 35));
        addCoche.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        addCoche.setForeground(new java.awt.Color(244, 67, 54));
        addCoche.setText("AÑADIR COCHE");
        addCoche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        addCoche.setContentAreaFilled(false);
        addCoche.setFocusPainted(false);
        addCoche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addCoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCocheMouseEntered(evt);
            }
        });
        addCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCocheActionPerformed(evt);
            }
        });

        deleteCoche.setBackground(new java.awt.Color(43, 11, 35));
        deleteCoche.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        deleteCoche.setForeground(new java.awt.Color(244, 67, 54));
        deleteCoche.setText("BORRAR COCHE");
        deleteCoche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        deleteCoche.setContentAreaFilled(false);
        deleteCoche.setFocusPainted(false);
        deleteCoche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteCoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteCocheMouseEntered(evt);
            }
        });
        deleteCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCocheActionPerformed(evt);
            }
        });

        getCoche.setBackground(new java.awt.Color(43, 11, 35));
        getCoche.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getCoche.setForeground(new java.awt.Color(244, 67, 54));
        getCoche.setText("BUSCAR COCHE");
        getCoche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        getCoche.setContentAreaFilled(false);
        getCoche.setFocusPainted(false);
        getCoche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getCoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                getCocheMouseEntered(evt);
            }
        });
        getCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCocheActionPerformed(evt);
            }
        });

        modificarCoche.setBackground(new java.awt.Color(43, 11, 35));
        modificarCoche.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        modificarCoche.setForeground(new java.awt.Color(244, 67, 54));
        modificarCoche.setText("MODIFICAR COCHE");
        modificarCoche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        modificarCoche.setContentAreaFilled(false);
        modificarCoche.setFocusPainted(false);
        modificarCoche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modificarCoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarCocheMouseEntered(evt);
            }
        });
        modificarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCocheActionPerformed(evt);
            }
        });

        listarCoches.setBackground(new java.awt.Color(43, 11, 35));
        listarCoches.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        listarCoches.setForeground(new java.awt.Color(244, 67, 54));
        listarCoches.setText("LISTAR COCHES");
        listarCoches.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        listarCoches.setContentAreaFilled(false);
        listarCoches.setFocusPainted(false);
        listarCoches.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        listarCoches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listarCochesMouseEntered(evt);
            }
        });
        listarCoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCochesActionPerformed(evt);
            }
        });

        gestionarPasajeros.setBackground(new java.awt.Color(43, 11, 35));
        gestionarPasajeros.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        gestionarPasajeros.setForeground(new java.awt.Color(244, 67, 54));
        gestionarPasajeros.setText("GESTIONAR PASAJEROS");
        gestionarPasajeros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        gestionarPasajeros.setContentAreaFilled(false);
        gestionarPasajeros.setFocusPainted(false);
        gestionarPasajeros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gestionarPasajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionarPasajerosMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelMenuCocheLayout = new javax.swing.GroupLayout(panelMenuCoche);
        panelMenuCoche.setLayout(panelMenuCocheLayout);
        panelMenuCocheLayout.setHorizontalGroup(
            panelMenuCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuCocheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(deleteCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(getCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(modificarCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(listarCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(gestionarPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        panelMenuCocheLayout.setVerticalGroup(
            panelMenuCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuCocheLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelMenuCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarCoche, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listarCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestionarPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        panel.add(panelMenuCoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1330, 40));

        panelMenuPasajeros.setBackground(new java.awt.Color(23, 13, 36));
        panelMenuPasajeros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 13, 36), 4, true));

        createPasajero.setBackground(new java.awt.Color(43, 11, 35));
        createPasajero.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        createPasajero.setForeground(new java.awt.Color(244, 67, 54));
        createPasajero.setText("CREAR PASAJERO");
        createPasajero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        createPasajero.setContentAreaFilled(false);
        createPasajero.setFocusPainted(false);
        createPasajero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createPasajeroMouseEntered(evt);
            }
        });
        createPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPasajeroActionPerformed(evt);
            }
        });

        deletePasajero.setBackground(new java.awt.Color(43, 11, 35));
        deletePasajero.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        deletePasajero.setForeground(new java.awt.Color(244, 67, 54));
        deletePasajero.setText("BORRAR PASAJERO");
        deletePasajero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        deletePasajero.setContentAreaFilled(false);
        deletePasajero.setFocusPainted(false);
        deletePasajero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deletePasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletePasajeroMouseEntered(evt);
            }
        });
        deletePasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePasajeroActionPerformed(evt);
            }
        });

        getPasajero.setBackground(new java.awt.Color(43, 11, 35));
        getPasajero.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getPasajero.setForeground(new java.awt.Color(244, 67, 54));
        getPasajero.setText("BUSCAR PASAJERO");
        getPasajero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        getPasajero.setContentAreaFilled(false);
        getPasajero.setFocusPainted(false);
        getPasajero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                getPasajeroMouseEntered(evt);
            }
        });
        getPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPasajeroActionPerformed(evt);
            }
        });

        listarPasajeros.setBackground(new java.awt.Color(43, 11, 35));
        listarPasajeros.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        listarPasajeros.setForeground(new java.awt.Color(244, 67, 54));
        listarPasajeros.setText("LISTAR PASAJEROS");
        listarPasajeros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        listarPasajeros.setContentAreaFilled(false);
        listarPasajeros.setFocusPainted(false);
        listarPasajeros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        listarPasajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listarPasajerosMouseEntered(evt);
            }
        });
        listarPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPasajerosActionPerformed(evt);
            }
        });

        addPasajeroA_Coche.setBackground(new java.awt.Color(43, 11, 35));
        addPasajeroA_Coche.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        addPasajeroA_Coche.setForeground(new java.awt.Color(244, 67, 54));
        addPasajeroA_Coche.setText("AÑADIR PASAJERO A UN COCHE");
        addPasajeroA_Coche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        addPasajeroA_Coche.setContentAreaFilled(false);
        addPasajeroA_Coche.setFocusPainted(false);
        addPasajeroA_Coche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addPasajeroA_Coche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPasajeroA_CocheMouseEntered(evt);
            }
        });
        addPasajeroA_Coche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPasajeroA_CocheActionPerformed(evt);
            }
        });

        sacarPasajeroDe_Coche.setBackground(new java.awt.Color(43, 11, 35));
        sacarPasajeroDe_Coche.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        sacarPasajeroDe_Coche.setForeground(new java.awt.Color(244, 67, 54));
        sacarPasajeroDe_Coche.setText("SACAR PASAJERO DE UN COCHE");
        sacarPasajeroDe_Coche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        sacarPasajeroDe_Coche.setContentAreaFilled(false);
        sacarPasajeroDe_Coche.setFocusPainted(false);
        sacarPasajeroDe_Coche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sacarPasajeroDe_Coche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sacarPasajeroDe_CocheMouseEntered(evt);
            }
        });
        sacarPasajeroDe_Coche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarPasajeroDe_CocheActionPerformed(evt);
            }
        });

        listarPasajerosDe_Coche.setBackground(new java.awt.Color(43, 11, 35));
        listarPasajerosDe_Coche.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        listarPasajerosDe_Coche.setForeground(new java.awt.Color(244, 67, 54));
        listarPasajerosDe_Coche.setText("LISTAR PASAJEROS DE UN COCHE");
        listarPasajerosDe_Coche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        listarPasajerosDe_Coche.setContentAreaFilled(false);
        listarPasajerosDe_Coche.setFocusPainted(false);
        listarPasajerosDe_Coche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        listarPasajerosDe_Coche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listarPasajerosDe_CocheMouseEntered(evt);
            }
        });
        listarPasajerosDe_Coche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPasajerosDe_CocheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPasajerosLayout = new javax.swing.GroupLayout(panelMenuPasajeros);
        panelMenuPasajeros.setLayout(panelMenuPasajerosLayout);
        panelMenuPasajerosLayout.setHorizontalGroup(
            panelMenuPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPasajerosLayout.createSequentialGroup()
                .addGroup(panelMenuPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMenuPasajerosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deletePasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(getPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuPasajerosLayout.createSequentialGroup()
                        .addComponent(createPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listarPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelMenuPasajerosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelMenuPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sacarPasajeroDe_Coche, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listarPasajerosDe_Coche, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPasajeroA_Coche, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuPasajerosLayout.setVerticalGroup(
            panelMenuPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPasajerosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelMenuPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listarPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenuPasajerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addPasajeroA_Coche, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sacarPasajeroDe_Coche, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listarPasajerosDe_Coche, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.add(panelMenuPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, 320, 290));

        panelDatosCoche.setOpaque(false);

        IDCocheLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        IDCocheLabel.setForeground(new java.awt.Color(244, 67, 54));
        IDCocheLabel.setText("ID");

        IdCocheTexto.setBackground(addCoche.getBackground());
        IdCocheTexto.setFont(addCoche.getFont());
        IdCocheTexto.setForeground(new java.awt.Color(244, 67, 54));
        IdCocheTexto.setBorder(addCoche.getBorder());

        matriculaCocheLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        matriculaCocheLabel.setForeground(new java.awt.Color(244, 67, 54));
        matriculaCocheLabel.setText("MATRICULA");

        matriculaCocheTexto.setBackground(addCoche.getBackground());
        matriculaCocheTexto.setFont(addCoche.getFont());
        matriculaCocheTexto.setForeground(new java.awt.Color(244, 67, 54));
        matriculaCocheTexto.setBorder(addCoche.getBorder());

        marcaCocheLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        marcaCocheLabel.setForeground(new java.awt.Color(244, 67, 54));
        marcaCocheLabel.setText("MARCA");

        marcaCocheTexto.setBackground(addCoche.getBackground());
        marcaCocheTexto.setFont(addCoche.getFont());
        marcaCocheTexto.setForeground(new java.awt.Color(244, 67, 54));
        marcaCocheTexto.setBorder(addCoche.getBorder());

        modeloCocheLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        modeloCocheLabel.setForeground(new java.awt.Color(244, 67, 54));
        modeloCocheLabel.setText("MODELO");

        modeloCocheTexto.setBackground(addCoche.getBackground());
        modeloCocheTexto.setFont(addCoche.getFont());
        modeloCocheTexto.setForeground(new java.awt.Color(244, 67, 54));
        modeloCocheTexto.setBorder(addCoche.getBorder());

        colorCocheLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        colorCocheLabel.setForeground(new java.awt.Color(244, 67, 54));
        colorCocheLabel.setText("COLOR");

        colorCocheTexto.setBackground(addCoche.getBackground());
        colorCocheTexto.setFont(addCoche.getFont());
        colorCocheTexto.setForeground(new java.awt.Color(244, 67, 54));
        colorCocheTexto.setBorder(addCoche.getBorder());

        javax.swing.GroupLayout panelDatosCocheLayout = new javax.swing.GroupLayout(panelDatosCoche);
        panelDatosCoche.setLayout(panelDatosCocheLayout);
        panelDatosCocheLayout.setHorizontalGroup(
            panelDatosCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCocheLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelDatosCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDCocheLabel)
                    .addComponent(matriculaCocheLabel)
                    .addComponent(marcaCocheLabel)
                    .addComponent(modeloCocheLabel)
                    .addComponent(colorCocheLabel))
                .addGap(40, 40, 40)
                .addGroup(panelDatosCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorCocheTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(IdCocheTexto)
                    .addComponent(matriculaCocheTexto)
                    .addComponent(marcaCocheTexto)
                    .addComponent(modeloCocheTexto))
                .addContainerGap())
        );
        panelDatosCocheLayout.setVerticalGroup(
            panelDatosCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCocheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDCocheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdCocheTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaCocheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriculaCocheTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaCocheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaCocheTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloCocheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloCocheTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosCocheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorCocheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorCocheTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        panel.add(panelDatosCoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, 170));

        panelDatosPasajero.setOpaque(false);

        iD_PasajeroLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        iD_PasajeroLabel.setForeground(new java.awt.Color(244, 67, 54));
        iD_PasajeroLabel.setText("ID");

        iD_PasajeroTexto.setBackground(addCoche.getBackground());
        iD_PasajeroTexto.setFont(addCoche.getFont());
        iD_PasajeroTexto.setForeground(new java.awt.Color(244, 67, 54));
        iD_PasajeroTexto.setBorder(addCoche.getBorder());

        iD_CocheLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        iD_CocheLabel.setForeground(new java.awt.Color(244, 67, 54));
        iD_CocheLabel.setText("ID COCHE");

        iD_CocheTexto.setBackground(addCoche.getBackground());
        iD_CocheTexto.setFont(addCoche.getFont());
        iD_CocheTexto.setForeground(new java.awt.Color(244, 67, 54));
        iD_CocheTexto.setBorder(addCoche.getBorder());

        nombrePasajeroLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nombrePasajeroLabel.setForeground(new java.awt.Color(244, 67, 54));
        nombrePasajeroLabel.setText("NOMBRE");

        nombrePasajeroTexto.setBackground(addCoche.getBackground());
        nombrePasajeroTexto.setFont(addCoche.getFont());
        nombrePasajeroTexto.setForeground(new java.awt.Color(244, 67, 54));
        nombrePasajeroTexto.setBorder(addCoche.getBorder());

        edadPasajeroLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        edadPasajeroLabel.setForeground(new java.awt.Color(244, 67, 54));
        edadPasajeroLabel.setText("EDAD");

        edadPasajeroTexto.setBackground(addCoche.getBackground());
        edadPasajeroTexto.setFont(addCoche.getFont());
        edadPasajeroTexto.setForeground(new java.awt.Color(244, 67, 54));
        edadPasajeroTexto.setBorder(addCoche.getBorder());

        pesoPasajeroLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pesoPasajeroLabel.setForeground(new java.awt.Color(244, 67, 54));
        pesoPasajeroLabel.setText("PESO");

        pesoPasajeroTexto.setBackground(addCoche.getBackground());
        pesoPasajeroTexto.setFont(addCoche.getFont());
        pesoPasajeroTexto.setForeground(new java.awt.Color(244, 67, 54));
        pesoPasajeroTexto.setBorder(addCoche.getBorder());

        javax.swing.GroupLayout panelDatosPasajeroLayout = new javax.swing.GroupLayout(panelDatosPasajero);
        panelDatosPasajero.setLayout(panelDatosPasajeroLayout);
        panelDatosPasajeroLayout.setHorizontalGroup(
            panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPasajeroLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iD_PasajeroLabel)
                    .addComponent(iD_CocheLabel)
                    .addComponent(nombrePasajeroLabel)
                    .addGroup(panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pesoPasajeroLabel)
                        .addComponent(edadPasajeroLabel)))
                .addGap(40, 40, 40)
                .addGroup(panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edadPasajeroTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(iD_PasajeroTexto)
                    .addComponent(iD_CocheTexto)
                    .addComponent(pesoPasajeroTexto)
                    .addComponent(nombrePasajeroTexto))
                .addContainerGap())
        );
        panelDatosPasajeroLayout.setVerticalGroup(
            panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPasajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iD_PasajeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iD_PasajeroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iD_CocheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iD_CocheTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePasajeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrePasajeroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadPasajeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edadPasajeroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoPasajeroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoPasajeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panel.add(panelDatosPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 290, 200));

        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setRequestFocusEnabled(false);
        jScrollPane1.setVerifyInputWhenFocusTarget(false);

        cajaMostradorBBDD.setEditable(false);
        cajaMostradorBBDD.setBackground(addCoche.getBackground());
        cajaMostradorBBDD.setColumns(1);
        cajaMostradorBBDD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cajaMostradorBBDD.setForeground(new java.awt.Color(255, 255, 255));
        cajaMostradorBBDD.setLineWrap(true);
        cajaMostradorBBDD.setRows(5);
        cajaMostradorBBDD.setText(" Welcome to carLooker 2.0\n");
        cajaMostradorBBDD.setBorder(addCoche.getBorder());
        cajaMostradorBBDD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cajaMostradorBBDD.setHighlighter(null);
        jScrollPane1.setViewportView(cajaMostradorBBDD);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 960, 410));

        salir.setBackground(new java.awt.Color(43, 11, 35));
        salir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(244, 67, 54));
        salir.setText("EXIT");
        salir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 13, 38), 2, true));
        salir.setContentAreaFilled(false);
        salir.setFocusPainted(false);
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        panel.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 670, 150, 50));

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        panel.add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //DESPLEGAR MENU PASAJEROS
    private void gestionarPasajerosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarPasajerosMouseEntered
        desplegarMenuPasajero();
        esconderDatosCoche();
    }//GEN-LAST:event_gestionarPasajerosMouseEntered

    private void addCocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCocheMouseEntered
        esconderMenuPasajero();
        desplegarDatosCoche();
        esconderIDCoche();
    }//GEN-LAST:event_addCocheMouseEntered

    private void deleteCocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCocheMouseEntered
        esconderMenuPasajero();
        desplegarDatosCoche();
        desplegarIDCoche();
    }//GEN-LAST:event_deleteCocheMouseEntered

    private void getCocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getCocheMouseEntered
        esconderMenuPasajero();
        desplegarDatosCoche();
        desplegarIDCoche();
    }//GEN-LAST:event_getCocheMouseEntered

    private void modificarCocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarCocheMouseEntered
        esconderMenuPasajero();
        desplegarDatosCoche();
    }//GEN-LAST:event_modificarCocheMouseEntered

    private void listarCochesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarCochesMouseEntered
        esconderMenuPasajero();
        esconderDatosCoche();
    }//GEN-LAST:event_listarCochesMouseEntered
    //SALIR DE LA APP
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        esconderMenuPasajero();
        esconderDatosPasajero();
        esconderDatosCoche();
    }//GEN-LAST:event_salirMouseEntered
    //DESPLEGAR OPCIONES PARA CREAR PASAJERO
    private void createPasajeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createPasajeroMouseEntered
        esconderDatosCoche();
        esconderIDPasajero();
        iD_CocheLabel.setVisible(false);
        iD_CocheTexto.setVisible(false);
    }//GEN-LAST:event_createPasajeroMouseEntered
    //ESCONDER DATOS PASAJEROS AL LISTAR PASAJEROS
    private void listarPasajerosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarPasajerosMouseEntered
        esconderDatosPasajero();
    }//GEN-LAST:event_listarPasajerosMouseEntered
    //MOSTRAR ID PASAJERO Y ESCONDER EL RESTO DE CAMPOS
    private void deletePasajeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePasajeroMouseEntered
        desplegarIDPasajero();
    }//GEN-LAST:event_deletePasajeroMouseEntered
    //MOSTRAR ID PASAJERO Y ESCONDER EL RESTO DE CAMPOS
    private void getPasajeroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getPasajeroMouseEntered
        desplegarIDPasajero();
    }//GEN-LAST:event_getPasajeroMouseEntered

    private void addPasajeroA_CocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPasajeroA_CocheMouseEntered
        desplegarIDPasajero();
        iD_CocheLabel.setVisible(true);
        iD_CocheTexto.setVisible(true);
        mostrarPasajerosYCoches();
    }//GEN-LAST:event_addPasajeroA_CocheMouseEntered

    private void sacarPasajeroDe_CocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sacarPasajeroDe_CocheMouseEntered
        desplegarIDPasajero();
        iD_CocheLabel.setVisible(true);
        iD_CocheTexto.setVisible(true);
        mostrarPasajerosYCoches();
    }//GEN-LAST:event_sacarPasajeroDe_CocheMouseEntered

    private void listarPasajerosDe_CocheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarPasajerosDe_CocheMouseEntered
        esconderDatosPasajero();
        iD_CocheLabel.setVisible(true);
        iD_CocheTexto.setVisible(true);
    }//GEN-LAST:event_listarPasajerosDe_CocheMouseEntered

    private void listarCochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCochesActionPerformed
        try {
            limpiarCajasTexto();
            System.out.println("Conexion abierta " + daoCocheMYSQL.abrirConexion());
            List listaDeCoches = daoCocheMYSQL.listarCoches();
            if (listaDeCoches.isEmpty()) {
                cajaMostradorBBDD.setText("No hay coches en la bbdd.\n\n");
            } else {
                cajaMostradorBBDD.setText("///////////////// LISTA DE COCHES //////////////////////////\n\n");
                for (Object coche : listaDeCoches) {
                    cajaMostradorBBDD.append(coche.toString());
                    cajaMostradorBBDD.append("\n\n");
                }
            }
            System.out.println("Conexion cerrada " + daoCocheMYSQL.cerrarConexion());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Error de conexion con la bbdd");
        }
    }//GEN-LAST:event_listarCochesActionPerformed

    private void listarPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPasajerosActionPerformed
        try {
            limpiarCajasTexto();
            System.out.println("Conexion abierta " + daoPasajeroMYSQL.abrirConexion());
            List listaDePasajeros = daoPasajeroMYSQL.listarPasajeros();
            if (listaDePasajeros.isEmpty()) {
                cajaMostradorBBDD.setText("No hay pasajeros en la bbdd.\n\n");
            } else {
                cajaMostradorBBDD.setText("///////////////// LISTA DE PASAJEROS //////////////////////////\n\n");
                for (Object pasajero : listaDePasajeros) {
                    cajaMostradorBBDD.append(pasajero.toString());
                    cajaMostradorBBDD.append("\n\n");
                }
            }
            System.out.println("Conexion cerrada " + daoPasajeroMYSQL.cerrarConexion());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Error de conexion con la bbdd");
        }

    }//GEN-LAST:event_listarPasajerosActionPerformed

    private void getCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCocheActionPerformed
        try {
            int idCoche = Integer.parseInt(IdCocheTexto.getText());
            System.out.println("Conexion abierta " + daoCocheMYSQL.abrirConexion());
            //////////////////////////////////
            Coche cObtenido = daoCocheMYSQL
                    .obtenerCoche(idCoche);
            if (cObtenido.getId() == 0) {
                cajaMostradorBBDD.setText("El coche con id " + cObtenido
                        + " no esta registrado en la bbdd.");
            } else {
                cajaMostradorBBDD.setText("Coche encontrado:\n\n");
                cajaMostradorBBDD.append(cObtenido.toString());
            }
            ////////////////////////////////////
            System.out.println("Conexion cerrada " + daoCocheMYSQL.cerrarConexion());
            limpiarCajasDatos();
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Debes introducir un id en formato numero entero ---> Ej id 1.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_getCocheActionPerformed

    private void getPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPasajeroActionPerformed
        try {
            int idPasajero = Integer.parseInt(iD_PasajeroTexto.getText());
            System.out.println("Conexion abierta " + daoPasajeroMYSQL.abrirConexion());
            //////////////////////////////////
            Pasajero pObtenido = daoPasajeroMYSQL
                    .obtenerPasajero(idPasajero);
            if (pObtenido.getId() == 0) {
                cajaMostradorBBDD.setText("El pasajero con id " + idPasajero
                        + " no esta registrado en la bbdd.");
            } else {
                cajaMostradorBBDD.setText("Pasajero encontrado:\n\n");
                cajaMostradorBBDD.append(pObtenido.toString());
            }
            ////////////////////////////////////
            System.out.println("Conexion cerrada " + daoPasajeroMYSQL.cerrarConexion());
            limpiarCajasDatos();
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Debes introducir un id en formato numero entero ---> Ej id 1.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_getPasajeroActionPerformed

    private void deleteCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCocheActionPerformed
        try {
            int idCoche = Integer.parseInt(IdCocheTexto.getText());
            System.out.println("Conexion abierta " + daoCocheMYSQL.abrirConexion());
            Coche cocheBorrado = daoCocheMYSQL.obtenerCoche(idCoche);
            //////////////////////////////////
            if (daoCocheMYSQL.borrarCoche(idCoche, daoPasajeroMYSQL) == true) {
                cajaMostradorBBDD.setText("Coche borrado satisfactoriamente:\n\n");
                cajaMostradorBBDD.append(cocheBorrado.toString());
            } else {
                cajaMostradorBBDD.setText("El coche con id " + idCoche
                        + " no esta registrado en la bbdd.");
            }
            ////////////////////////////////////
            System.out.println("Conexion cerrada " + daoCocheMYSQL.cerrarConexion());
            limpiarCajasDatos();
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Debes introducir un id en formato numero entero ---> Ej id 1.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_deleteCocheActionPerformed

    private void deletePasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePasajeroActionPerformed
        try {
            int idPasajero = Integer.parseInt(iD_PasajeroTexto.getText());
            System.out.println("Conexion abierta " + daoPasajeroMYSQL.abrirConexion());
            Pasajero pasajeroBorrado = daoPasajeroMYSQL.obtenerPasajero(idPasajero);
            //////////////////////////////////
            if (daoPasajeroMYSQL.borrarPasajero(idPasajero, daoCocheMYSQL) == true) {
                cajaMostradorBBDD.setText("Pasajero borrado satisfactoriamente:\n\n");
                cajaMostradorBBDD.append(pasajeroBorrado.toString());
            } else {
                cajaMostradorBBDD.setText("El pasajero con id " + idPasajero
                        + " no esta registrado en la bbdd.");
            }
            ////////////////////////////////////
            System.out.println("Conexion cerrada " + daoPasajeroMYSQL.cerrarConexion());
            limpiarCajasDatos();
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Debes introducir un id en formato numero entero ---> Ej id 1.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_deletePasajeroActionPerformed

    private void addCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCocheActionPerformed
        try {
            ////////////////////////////////////////////////////////
            String matricula = matriculaCocheTexto.getText();
            String marca = marcaCocheTexto.getText();
            String modelo = modeloCocheTexto.getText();
            String color = colorCocheTexto.getText();
            ///////////////////////////////////////////////////////
            if (controlador.camposVaciosCoche(matricula, marca, modelo, color) == true) {
                cajaMostradorBBDD.setText("Debes rellenar todos los atributos del coche "
                        + "para poder añadirlo a la bbdd.");
            } else {
                Coche coche = new Coche(matricula, marca, modelo, color, 0);
                System.out.println("Conexion abierta " + daoCocheMYSQL.abrirConexion());
                //////////////////////////////////
                if (daoCocheMYSQL.addCoche(coche) == true) {
                    cajaMostradorBBDD.setText("Coche añadido satisfactoriamente:\n\n");
                    cajaMostradorBBDD.append(coche.toString2());
                } else {
                    cajaMostradorBBDD.setText("Ocurrió un error al intentar añadir el nuevo coche.");
                }
                ////////////////////////////////////
                System.out.println("Conexion cerrada " + daoCocheMYSQL.cerrarConexion());
                limpiarCajasDatos();
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }//GEN-LAST:event_addCocheActionPerformed

    private void createPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPasajeroActionPerformed
        try {
            String nomb = nombrePasajeroTexto.getText();
            String ed = edadPasajeroTexto.getText();
            String pes = controlador.numeroDecimalSinComas(pesoPasajeroTexto.getText());
            
            if (controlador.camposVaciosPasajero(nomb, ed,
                    pes) == true) {
                cajaMostradorBBDD.setText("Debes rellenar todos los atributos del pasajero "
                        + "para poder añadirlo a la bbdd.");
            } else {
                String nombre = nomb;
                int edad = Integer.parseInt(ed);
                double peso = Double.parseDouble(pes);
                /////////////////////////////////////////////////
                Pasajero pasajero = new Pasajero(nombre, edad, peso);
                System.out.println("Conexion abierta " + daoPasajeroMYSQL.abrirConexion());
                //////////////////////////////////
                if (daoPasajeroMYSQL.addPasajero(pasajero) == true) {
                    cajaMostradorBBDD.setText("Pasajero creado satisfactoriamente:\n\n");
                    cajaMostradorBBDD.append(pasajero.toString2());
                } else {
                    cajaMostradorBBDD.setText("Ocurrió un error al intentar crear el nuevo pasajero.");
                }
                ////////////////////////////////////
                System.out.println("Conexion cerrada " + daoPasajeroMYSQL.cerrarConexion());
                limpiarCajasDatos();
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Debes introducir el peso "
                    + "y la edad, en formato numero ---> Ej "
                    + "peso 45.55, edad 40.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_createPasajeroActionPerformed

    private void modificarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCocheActionPerformed
        try {
            ////////////////////////////////////////////////////////
            String ids = IdCocheTexto.getText();
            String matricula = matriculaCocheTexto.getText();
            String marca = marcaCocheTexto.getText();
            String modelo = modeloCocheTexto.getText();
            String color = colorCocheTexto.getText();
            ///////////////////////////////////////////////////////
            if (controlador.camposVaciosCoche2(ids, matricula, marca,
                    modelo, color) == true) {
                cajaMostradorBBDD.setText("Debes rellenar todos los atributos del coche "
                        + "para poder modificarlo.");
            } else {
                int id = Integer.parseInt(ids);
                System.out.println("Conexion abierta " + daoCocheMYSQL.abrirConexion());
                //////////////////////////////////////
                if (daoCocheMYSQL.modificarCoche(id, matricula, marca, modelo, color)) {
                    cajaMostradorBBDD.setText("Coche modificado satisfactoriamente:\n\n");
                    cajaMostradorBBDD.append(daoCocheMYSQL.obtenerCoche(id).toString());
                } else {
                    cajaMostradorBBDD.setText("Ocurrió un error al intentar modificar el coche "
                            + "o tal vez ese coche ya no exista.");
                }
                ////////////////////////////////////
                System.out.println("Conexion cerrada " + daoPasajeroMYSQL.cerrarConexion());
                limpiarCajasDatos();
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Debes introducir un id en formato numero entero ---> Ej id 1.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_modificarCocheActionPerformed
    /////////AÑADIR UN PASAJERO A UN COCHE////////////////////////////
    private void addPasajeroA_CocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPasajeroA_CocheActionPerformed
        try {
            int idPasajero = Integer.parseInt(iD_PasajeroTexto.getText());
            int idCoche = Integer.parseInt(iD_CocheTexto.getText());
            System.out.println("Conexion abierta " + daoPasajeroMYSQL.abrirConexion());
            ///////////////////////////////////////////
            if (daoPasajeroMYSQL.addPasajeroA_Coche(idPasajero, idCoche) == true) {
                Pasajero pActualizado = daoPasajeroMYSQL.obtenerPasajero(idPasajero);
                if (pActualizado.getId() == 0) {
                    cajaMostradorBBDD.setText("Ocurrio un error al consultar la bbdd,"
                            + " tal vez ese coche o ese pasajero no existan.");
                } else {
                    cajaMostradorBBDD.setText("Pasajero actualizado correctamente:\n\n");
                    cajaMostradorBBDD.append(pActualizado.toString());
                }
            } else {
                cajaMostradorBBDD.setText("Ocurrio un error al intentar actualizar la bbdd "
                        + "o tal vez ese pasajero ya no exista.");
            }
            //////////////////////////////////////////
            System.out.println("Conexion cerrada " + daoPasajeroMYSQL.cerrarConexion());
            limpiarCajasDatos();
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Debes introducir un id en formato numero entero ---> Ej id 1.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_addPasajeroA_CocheActionPerformed
    /////////SACAR A UN PASAJERO DE UN COCHE////////////////////////////
    private void sacarPasajeroDe_CocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarPasajeroDe_CocheActionPerformed
        try {
            int idPasajero = Integer.parseInt(iD_PasajeroTexto.getText());
            int idCoche = Integer.parseInt(iD_CocheTexto.getText());
            System.out.println("Conexion abierta " + daoPasajeroMYSQL.abrirConexion());
            ///////////////////////////////////////////
            if (daoPasajeroMYSQL.sacarPasajeroDeunCoche(idPasajero, idCoche) == true) {
                Pasajero pActualizado = daoPasajeroMYSQL.obtenerPasajero(idPasajero);
                if (pActualizado.getId() == 0) {
                    cajaMostradorBBDD.setText("Ocurrio un error al consultar la bbdd,"
                            + " tal vez ese coche o ese pasajero no existan.");
                } else {
                    cajaMostradorBBDD.setText("Pasajero actualizado correctamente:\n\n");
                    cajaMostradorBBDD.append(pActualizado.toString());
                }
            } else {
                cajaMostradorBBDD.setText("Ocurrio un error al intentar actualizar la bbdd "
                        + "o tal vez ese pasajero ya no exista.");
            }
            //////////////////////////////////////////
            System.out.println("Conexion cerrada " + daoPasajeroMYSQL.cerrarConexion());
            limpiarCajasDatos();
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Debes introducir un id en formato numero entero ---> Ej id 1.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_sacarPasajeroDe_CocheActionPerformed
    /////LISTAR A TODOS LOS PASAJEROS DE UN COCHE///////////////////////////////////////////
    private void listarPasajerosDe_CocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPasajerosDe_CocheActionPerformed
        try {
            int idCoche = Integer.parseInt(iD_CocheTexto.getText());
            System.out.println("Conexion abierta " + daoPasajeroMYSQL.abrirConexion());
            List listaDePasajeros = daoPasajeroMYSQL.listaDePasajerosQueHayEnUnCoche(idCoche);
            ////////////////////////////////////////
            if (listaDePasajeros.isEmpty() == true) {
                cajaMostradorBBDD.setText("///////////////// No hay pasajeros en la bbbd.");
            } else {
                cajaMostradorBBDD.setText("///////////////// PASAJEROS DEL COCHE CON ID " + idCoche + " //////////////////////////\n\n");
                for (Object pasajero : listaDePasajeros) {
                    cajaMostradorBBDD.append(pasajero.toString() + "\n\n");
                }
            }
            ///////////////////////////////////////
            System.out.println("Conexion cerrada " + daoPasajeroMYSQL.cerrarConexion());
            limpiarCajasDatos();
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("Debes introducir un id en formato numero entero ---> Ej id 1.");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            cajaMostradorBBDD.setText("No hay ningún pasajero en ese coche.");
        }
    }//GEN-LAST:event_listarPasajerosDe_CocheActionPerformed
    ////////////////MIS METODOS/////////////////////////////
    //QUITAMOS TODOS LO CAMPOS DEL COCHE//////////////////////
    private void esconderDatosCoche() {
        IdCocheTexto.setVisible(false);
        IDCocheLabel.setVisible(false);
        ////////////////////////////////
        matriculaCocheLabel.setVisible(false);
        matriculaCocheTexto.setVisible(false);
        marcaCocheLabel.setVisible(false);
        marcaCocheTexto.setVisible(false);
        modeloCocheLabel.setVisible(false);
        modeloCocheTexto.setVisible(false);
        colorCocheLabel.setVisible(false);
        colorCocheTexto.setVisible(false);
    }

    //QUITAMOS TODOS LO CAMPOS DEL COCHE//////////////////////
    private void desplegarDatosCoche() {
        IdCocheTexto.setVisible(true);
        IDCocheLabel.setVisible(true);
        ////////////////////////////////
        matriculaCocheLabel.setVisible(true);
        matriculaCocheTexto.setVisible(true);
        marcaCocheLabel.setVisible(true);
        marcaCocheTexto.setVisible(true);
        modeloCocheLabel.setVisible(true);
        modeloCocheTexto.setVisible(true);
        colorCocheLabel.setVisible(true);
        colorCocheTexto.setVisible(true);
    }

    //QUITAMOS EL ID DEL COCHE//////////////////////
    private void esconderIDCoche() {
        IdCocheTexto.setVisible(false);
        IDCocheLabel.setVisible(false);
        ////////////////////////////////
        matriculaCocheLabel.setVisible(true);
        matriculaCocheTexto.setVisible(true);
        marcaCocheLabel.setVisible(true);
        marcaCocheTexto.setVisible(true);
        modeloCocheLabel.setVisible(true);
        modeloCocheTexto.setVisible(true);
        colorCocheLabel.setVisible(true);
        colorCocheTexto.setVisible(true);
    }

    //DEJAMOS EL ID DEL COCHE//////////////////////
    private void desplegarIDCoche() {
        IdCocheTexto.setVisible(true);
        IDCocheLabel.setVisible(true);
        ////////////////////////////////
        matriculaCocheLabel.setVisible(false);
        matriculaCocheTexto.setVisible(false);
        marcaCocheLabel.setVisible(false);
        marcaCocheTexto.setVisible(false);
        modeloCocheLabel.setVisible(false);
        modeloCocheTexto.setVisible(false);
        colorCocheLabel.setVisible(false);
        colorCocheTexto.setVisible(false);
    }

    //DESPLEGAMOS EL MENU DE PASAJEROS//////////////////////
    private void desplegarMenuPasajero() {
        panelMenuPasajeros.setVisible(true);
        desplegarDatosPasajeros();
    }

    //ESCONDER EL MENU DE PASAJEROS//////////////////////
    private void esconderMenuPasajero() {
        panelMenuPasajeros.setVisible(false);
        esconderDatosPasajero();
    }

    //MOSTRAR DATOS DE PASAJEROS//////////////////////
    private void desplegarDatosPasajeros() {
        iD_PasajeroLabel.setVisible(true);
        iD_PasajeroTexto.setVisible(true);
        //////////////////////////////////
        iD_CocheLabel.setVisible(true);
        iD_CocheTexto.setVisible(true);
        nombrePasajeroLabel.setVisible(true);
        nombrePasajeroTexto.setVisible(true);
        edadPasajeroLabel.setVisible(true);
        edadPasajeroTexto.setVisible(true);
        pesoPasajeroLabel.setVisible(true);
        pesoPasajeroTexto.setVisible(true);
        
    }

    //QUITAMOS TODOS LO CAMPOS DEL PASAJERO//////////////////////
    private void esconderDatosPasajero() {
        iD_PasajeroLabel.setVisible(false);
        iD_PasajeroTexto.setVisible(false);
        //////////////////////////////////
        iD_CocheLabel.setVisible(false);
        iD_CocheTexto.setVisible(false);
        nombrePasajeroLabel.setVisible(false);
        nombrePasajeroTexto.setVisible(false);
        edadPasajeroLabel.setVisible(false);
        edadPasajeroTexto.setVisible(false);
        pesoPasajeroLabel.setVisible(false);
        pesoPasajeroTexto.setVisible(false);
    }

    //MOSTRAMOS EL ID DEL PASAJERO
    private void desplegarIDPasajero() {
        iD_PasajeroLabel.setVisible(true);
        iD_PasajeroTexto.setVisible(true);
        desplegarDatosPasajeros();
        //////////////////////////////////
        iD_CocheLabel.setVisible(false);
        iD_CocheTexto.setVisible(false);
        nombrePasajeroLabel.setVisible(false);
        nombrePasajeroTexto.setVisible(false);
        edadPasajeroLabel.setVisible(false);
        edadPasajeroTexto.setVisible(false);
        pesoPasajeroLabel.setVisible(false);
        pesoPasajeroTexto.setVisible(false);
    }

    //ESCONDEMOS EL ID DEL PASAJERO
    private void esconderIDPasajero() {
        iD_PasajeroLabel.setVisible(false);
        iD_PasajeroTexto.setVisible(false);
        //////////////////////////////////
        iD_CocheLabel.setVisible(true);
        iD_CocheTexto.setVisible(true);
        nombrePasajeroLabel.setVisible(true);
        nombrePasajeroTexto.setVisible(true);
        edadPasajeroLabel.setVisible(true);
        edadPasajeroTexto.setVisible(true);
        pesoPasajeroLabel.setVisible(true);
        pesoPasajeroTexto.setVisible(true);
    }

    //////////////////////////////////////////////////
    private void limpiarCajasTexto() {
        cajaMostradorBBDD.setText("");
        /////DATOS COCHE////////
        IdCocheTexto.setText("");
        matriculaCocheTexto.setText("");
        marcaCocheTexto.setText("");
        modeloCocheTexto.setText("");
        colorCocheTexto.setText("");
        ///DATOS PASAJERO//////////
        iD_PasajeroTexto.setText("");
        iD_CocheTexto.setText("");
        nombrePasajeroTexto.setText("");
        edadPasajeroTexto.setText("");
        pesoPasajeroTexto.setText("");
        
    }
    
    private void limpiarCajasDatos() {
        /////DATOS COCHE////////
        IdCocheTexto.setText("");
        matriculaCocheTexto.setText("");
        marcaCocheTexto.setText("");
        modeloCocheTexto.setText("");
        colorCocheTexto.setText("");
        ///DATOS PASAJERO//////////
        iD_PasajeroTexto.setText("");
        iD_CocheTexto.setText("");
        nombrePasajeroTexto.setText("");
        edadPasajeroTexto.setText("");
        pesoPasajeroTexto.setText("");
    }

    ///////////////////////////////////////////
    private void mostrarPasajerosYCoches() {
        try {
            System.out.println("Conexion abierta " + daoPasajeroMYSQL.abrirConexion());
            ////////////////////////////////
            List listaPasajeros = daoPasajeroMYSQL.listarPasajeros();
            ////////////////////////////////////////////////////////////////
            if (listaPasajeros.isEmpty() == true) {
                cajaMostradorBBDD.setText("No hay pasajeros en la bbdd.\n\n");
            } else {
                cajaMostradorBBDD.setText("///////////////// LISTA DE PASAJEROS ////////////////////\n\n");
                for (Object pasajero : listaPasajeros) {
                    cajaMostradorBBDD.append(pasajero.toString() + "\n\n");
                }
            }
            System.out.println("Conexion cerrada " + daoPasajeroMYSQL.cerrarConexion());
            /////////////////////////////////////////////
            System.out.println("Conexion abierta " + daoCocheMYSQL.abrirConexion());
            ////////////////////////////////////////////////
            List listaDeCoches = daoCocheMYSQL.listarCoches();
            ////////////////////////////////
            if (listaDeCoches.isEmpty() == true) {
                cajaMostradorBBDD.append("No hay coches en la bbdd.\n\n");
            } else {
                cajaMostradorBBDD.append("///////////////// LISTA DE COCHES ////////////////////\n\n");
                for (Coche coche : daoCocheMYSQL.listarCoches()) {
                    cajaMostradorBBDD.append(coche.toString() + "\n\n");
                }
            }
            System.out.println("Conexion cerrada " + daoCocheMYSQL.cerrarConexion());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    //////////MAIN//////////////////////////////////
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        new Vista();
        /////////////////////////

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDCocheLabel;
    private javax.swing.JTextField IdCocheTexto;
    private javax.swing.JButton addCoche;
    private javax.swing.JButton addPasajeroA_Coche;
    private javax.swing.JTextArea cajaMostradorBBDD;
    private javax.swing.JLabel colorCocheLabel;
    private javax.swing.JTextField colorCocheTexto;
    private javax.swing.JButton createPasajero;
    private javax.swing.JButton deleteCoche;
    private javax.swing.JButton deletePasajero;
    private javax.swing.JLabel edadPasajeroLabel;
    private javax.swing.JTextField edadPasajeroTexto;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JButton gestionarPasajeros;
    private javax.swing.JButton getCoche;
    private javax.swing.JButton getPasajero;
    private javax.swing.JLabel iD_CocheLabel;
    private javax.swing.JTextField iD_CocheTexto;
    private javax.swing.JLabel iD_PasajeroLabel;
    private javax.swing.JTextField iD_PasajeroTexto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarCoches;
    private javax.swing.JButton listarPasajeros;
    private javax.swing.JButton listarPasajerosDe_Coche;
    private javax.swing.JLabel marcaCocheLabel;
    private javax.swing.JTextField marcaCocheTexto;
    private javax.swing.JLabel matriculaCocheLabel;
    private javax.swing.JTextField matriculaCocheTexto;
    private javax.swing.JLabel modeloCocheLabel;
    private javax.swing.JTextField modeloCocheTexto;
    private javax.swing.JButton modificarCoche;
    private javax.swing.JLabel nombrePasajeroLabel;
    private javax.swing.JTextField nombrePasajeroTexto;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelDatosCoche;
    private javax.swing.JPanel panelDatosPasajero;
    private javax.swing.JPanel panelMenuCoche;
    private javax.swing.JPanel panelMenuPasajeros;
    private javax.swing.JLabel pesoPasajeroLabel;
    private javax.swing.JTextField pesoPasajeroTexto;
    private javax.swing.JButton sacarPasajeroDe_Coche;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

}
