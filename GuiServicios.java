import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.FlowLayout;

public class GuiServicios extends JInternalFrame {




    private JButton btnBuscar;
    private JButton btnCancelar;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnGuardar;
    private JButton btnNuevo1;
    private JLabel lblBtnCancelar;
    private JLabel lblBtnNuevo;
    private JLabel lblBtnGuardar;
    private JLabel lblBtnEditar;
    private JLabel lblBtnEliminar;
    private JScrollPane jScrollPane1;
    private JLabel lblBuscar;
    private JLabel lblID;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JTable tbl;
    private JTextField txtBuscar;
    private JTextField txtId;
    
    private JTextField txtIdMascota;
    private JTextField txtFechaServicio;
    private JTextField txtNombreServicio;
    private JTextField txtDescripcionServicio;
    private JTextField txtPrecioServicio;
    private JTextArea txtObservacion;
    
    private JLabel lblIdMascota;
    private JLabel lblFechaServicio;
    private JLabel lblNombreServicio;
    private JLabel lblDescripcionServicio;
    private JLabel lblPrecioServicio;
    private JLabel lblObservacion;
    

    

    public GuiServicios(){
        inicializarComponentes();
        getContentPane().setLayout(null);
 

    }
    
    private void inicializarComponentes(){

        leftPanel = new JPanel();
        lblID = new JLabel();
        txtId = new JTextField();
        btnCancelar = new JButton();
        btnNuevo1 = new JButton();
        btnGuardar = new JButton();
        btnEditar = new JButton();
        btnEliminar = new JButton();
        lblBtnCancelar = new JLabel();
        lblBtnNuevo = new JLabel();
        lblBtnGuardar = new JLabel();
        lblBtnEditar = new JLabel();
        lblBtnEliminar = new JLabel();
        rightPanel = new JPanel();
        jScrollPane1 = new JScrollPane();
        tbl = new JTable();
        txtBuscar = new JTextField(10);
        btnBuscar = new JButton();
        lblBuscar = new JLabel();

        txtIdMascota = new JTextField();
        txtFechaServicio = new JTextField();
        txtNombreServicio = new JTextField();
        txtDescripcionServicio = new JTextField();
        txtPrecioServicio = new JTextField();
        txtObservacion = new JTextArea();
        
        lblIdMascota = new JLabel();
        lblFechaServicio = new JLabel();
        lblNombreServicio = new JLabel();
        lblDescripcionServicio = new JLabel();
        lblPrecioServicio = new JLabel();
        lblObservacion = new JLabel();
        

        setClosable(true);
        diseñoPanelIzquierdo();
        diseñoPanelDerecho();

        pack();

         
    }

    private void diseñoPanelDerecho(){
        // Posicionae panel derecho
        getContentPane().add(rightPanel);
        rightPanel.setBounds(490,0, 450, 517);

        // Personalizar panel
        rightPanel.setBackground(new java.awt.Color(0,0,102));

        // Agregar componentes al panel derecho
        rightPanel.add(jScrollPane1);
        rightPanel.add(tbl);
        rightPanel.add(txtBuscar);
        rightPanel.add(btnBuscar);
        rightPanel.add(lblBuscar);
        

        // Posicionae componentes en el panel

        rightPanel.setLayout(null);

        // Textbox
        txtBuscar.setBounds(90, 100, 220, 30);
        lblBuscar.setBounds(90, 10, 120, 130);
        btnBuscar.setBounds(330, 90, 70, 50);





    
        
        lblBuscar.setBackground(new java.awt.Color(255, 255, 255));
        lblBuscar.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 18)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(0, 204, 204));
        lblBuscar.setText("Buscar por id");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/btnBuscar1.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);        
        
        // Tabla

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo 1", "Titulo 2", "Titulo 3", "Titulo 4"
            }
        ));

        jScrollPane1.setBounds(0, 320, 450, 200);
        jScrollPane1.setViewportView(tbl);
       
    
    }

    private void diseñoPanelIzquierdo(){

        // Posicionar los paneles
        getContentPane().add(leftPanel);
        leftPanel.setBounds(0,0, 488, 517);
        
        
        
        // Personalizar panel izquierdo
        leftPanel.setBackground(new java.awt.Color(0, 0, 51));
        lblID.setBackground(new java.awt.Color(255, 255, 255));
        lblID.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 204, 204));
        lblID.setText("ID");


        // Agregar componentes al panel izquierdo
        leftPanel.add(lblID);
        leftPanel.add(txtId);
        leftPanel.add(btnCancelar);
        leftPanel.add(btnNuevo1);
        leftPanel.add(btnGuardar);
        leftPanel.add(btnEditar);
        leftPanel.add(btnEliminar);
        leftPanel.add(btnCancelar);
        leftPanel.add(lblBtnCancelar);
        leftPanel.add(lblBtnNuevo);
        leftPanel.add(lblBtnGuardar);
        leftPanel.add(lblBtnEditar);
        leftPanel.add(lblBtnEliminar);

        leftPanel.add(txtIdMascota);
        leftPanel.add(txtFechaServicio);
        leftPanel.add(txtNombreServicio);
        leftPanel.add(txtDescripcionServicio);
        leftPanel.add(txtPrecioServicio);
        leftPanel.add(txtObservacion);
        
        leftPanel.add(lblIdMascota);
        leftPanel.add(lblFechaServicio);
        leftPanel.add(lblNombreServicio);
        leftPanel.add(lblDescripcionServicio);
        leftPanel.add(lblPrecioServicio);
        leftPanel.add(lblObservacion);
        


        // Posicionar componentes en el panel izquierdo

        leftPanel.setLayout(null);
        // Textbox

        txtId.setBounds(320,20,30,15);
        txtIdMascota.setBounds(70,60, 220, 30);
        txtFechaServicio.setBounds(70,120,220,30);
        txtNombreServicio.setBounds(70,180,220,30);
        txtDescripcionServicio.setBounds(70,240,220,30);
        txtObservacion.setBounds(70,300,220,30);


        // Labels y personalización
        lblID.setBounds(280, 10, 20, 30);

        lblIdMascota.setBounds(60, 30, 140, 30);
        lblFechaServicio.setBounds(60, 90, 190, 30);
        lblNombreServicio.setBounds(60,150,190,30);
        lblDescripcionServicio.setBounds(60, 210, 190, 30);
        lblObservacion.setBounds(60, 270, 190, 30);
        

        lblIdMascota.setBackground(new java.awt.Color(255, 255, 255));
        lblIdMascota.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 18)); // NOI18N
        lblIdMascota.setForeground(new java.awt.Color(0, 204, 204));
        lblIdMascota.setText("Id mascota");

        lblFechaServicio.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaServicio.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 18)); // NOI18N
        lblFechaServicio.setForeground(new java.awt.Color(0, 204, 204));
        lblFechaServicio.setText("Fecha Servicio");

        lblNombreServicio.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreServicio.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 18)); // NOI18N
        lblNombreServicio.setForeground(new java.awt.Color(0, 204, 204));
        lblNombreServicio.setText("Nombre Servicio");

        lblDescripcionServicio.setBackground(new java.awt.Color(255, 255, 255));
        lblDescripcionServicio.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 18)); // NOI18N
        lblDescripcionServicio.setForeground(new java.awt.Color(0, 204, 204));
        lblDescripcionServicio.setText("Descripción");

        lblObservacion.setBackground(new java.awt.Color(255, 255, 255));
        lblObservacion.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 18)); // NOI18N
        lblObservacion.setForeground(new java.awt.Color(0, 204, 204));
        lblObservacion.setText("Observaciones");

        
        // Botones

        btnNuevo1.setBounds(30, 430, 70, 40);
        btnGuardar.setBounds(100, 430, 70, 40);
        btnEditar.setBounds(180, 430, 70, 40);
        btnEliminar.setBounds(260, 430, 70, 40);
        btnCancelar.setBounds(340, 430, 70, 40);

        // Personalizar botones

        btnNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/btnNuevo1.png"))); // NOI18N
        btnNuevo1.setBorderPainted(false);
        btnNuevo1.setContentAreaFilled(false);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/btnGuardar2.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/btnEditar1.png"))); // NOI18N
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/btnEliminar3.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/btnCancelar1.png"))); // NOI18N
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);

        // Labels para los botones
        
        lblBtnNuevo.setBounds(40, 470, 570, 20);
        lblBtnNuevo.setFont(new java.awt.Font("Dialog", 1, 11));
        lblBtnNuevo.setText("Nuevo");   
        lblBtnNuevo.setForeground(new java.awt.Color(255, 255, 255));     
        
        lblBtnGuardar.setBounds(110, 470, 60, 20);
        lblBtnGuardar.setFont(new java.awt.Font("Dialog", 1, 11));
        lblBtnGuardar.setText("Guardar");        
        lblBtnGuardar.setForeground(new java.awt.Color(255, 255, 255));     
        
        lblBtnEditar.setBounds(190, 470, 60, 20);
        lblBtnEditar.setFont(new java.awt.Font("Dialog", 1, 11));
        lblBtnEditar.setText("Editar");        
        lblBtnEditar.setForeground(new java.awt.Color(255, 255, 255));     
        
        lblBtnEliminar.setBounds(270, 470, 60, 20);
        lblBtnEliminar.setFont(new java.awt.Font("Dialog", 1, 11));
        lblBtnEliminar.setText("Eliminar");        
        lblBtnEliminar.setForeground(new java.awt.Color(255, 255, 255));     
        
        lblBtnCancelar.setBounds(350, 470, 60, 20);
        lblBtnCancelar.setFont(new java.awt.Font("Dialog", 1, 11));
        lblBtnCancelar.setText("Cancelar");        
        lblBtnCancelar.setForeground(new java.awt.Color(255, 255, 255));     

    }
}
