
import javax.swing.*;
import java.awt.event.KeyEvent;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class PantallaPrincipal extends JFrame {

        // Se crean instancias de las ventanas
        private GuiClinica uiClinica = new GuiClinica();
        private GuiEmpleados uiEmpleados = new GuiEmpleados();

        private JMenuItem acercaDeMenuItem;
        private JMenu btnAcercaDe;
        private JMenu btnClientes;
        private JMenu btnClinica;
        private JMenu btnEmpleado;
        private JMenu btnMascotas;
        private JMenu btnProductos;
        private JMenu btnServicio;
        private JMenu btnSesion;
        private JMenuItem cntItem1;
        private JMenuItem srvItem1;
        private JMenuItem mctItem1;
        private JMenuItem copyMenuItem;
        private JMenuItem cutMenuItem;
        private JMenuItem deleteMenuItem;
        private JMenuItem cncItem1;
        private JMenuItem acdItem1;
        private JMenuItem pdtItem1;
        private JMenuItem itemInicio;
        private JMenuItem itemSalir;
        private JMenuBar menuBar;
        private JDesktopPane panelEscritorio;
        private JMenuItem empItem1;


        public PantallaPrincipal(){
            this.inicializarComponentes();
        }

        private void inicializarComponentes(){
            this.panelEscritorio = new JDesktopPane();
            this.menuBar = new JMenuBar();
            this.btnClinica = new JMenu();
            this.cncItem1 = new JMenuItem();
            this.btnEmpleado = new JMenu();
            this.cutMenuItem = new JMenuItem();
            this.copyMenuItem = new JMenuItem();
            this.empItem1 = new JMenuItem();
            this.deleteMenuItem = new JMenuItem();
            this.btnClientes = new JMenu();
            this.cntItem1 = new JMenuItem();
            this.acercaDeMenuItem = new JMenuItem();
            this.btnMascotas = new JMenu();
            this.mctItem1 = new JMenuItem();
            this.srvItem1 = new JMenuItem();
            this.acdItem1 = new JMenuItem();
            this.pdtItem1 = new JMenuItem();
            this.itemInicio = new JMenuItem();
            this.itemSalir = new JMenuItem();
            this.btnServicio = new JMenu();
            this.btnProductos = new JMenu();
            this.btnAcercaDe = new JMenu();
            this.btnSesion = new JMenu();

           

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            GroupLayout panelEscritorioLayout = new GroupLayout(panelEscritorio);
            panelEscritorio.setLayout(panelEscritorioLayout);
            panelEscritorioLayout.setHorizontalGroup(
                panelEscritorioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 815, Short.MAX_VALUE)
            );
            panelEscritorioLayout.setVerticalGroup(
                panelEscritorioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 360, Short.MAX_VALUE)
            );
    
            btnClinica.setIcon(new ImageIcon(getClass().getResource("src/images/veterinario.png"))); // NOI18N
            btnClinica.setMnemonic('f');
            btnClinica.setText("Clinica");
            
            btnClinica.addMenuListener(new MenuListener() {
                public void menuCanceled( MenuEvent evt) {
                }
                public void menuDeselected(MenuEvent evt) {
                }
                public void menuSelected( MenuEvent evt) {
                    btnClinicaMenuSelected(evt);
                }
            });
            btnClinica.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnClinicaActionPerformed(evt);
                }
            });
            btnClinica.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    btnClinicaKeyPressed(evt);
                }
            });
    
            cncItem1.setText("Ver clinica");
            cncItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cncItem1ActionPerformed(evt);
                }
            });
  
            btnClinica.add(cncItem1);
    
            menuBar.add(btnClinica);
    
            btnEmpleado.setIcon(new ImageIcon(getClass().getResource("src/images/empleado.png"))); // NOI18N
            btnEmpleado.setMnemonic('e');
            btnEmpleado.setText("Empleados");
    
    
            empItem1.setMnemonic('p');
            empItem1.setText("Ver empleados");
            btnEmpleado.add(empItem1);

            empItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    empItem1ActionPerformed(evt);
                }
            });

           
    
    
            menuBar.add(btnEmpleado);
    
            btnClientes.setIcon(new ImageIcon(getClass().getResource("src/images/clientes.png"))); // NOI18N
            btnClientes.setMnemonic('h');
            btnClientes.setText("Clientes");
    
            cntItem1.setMnemonic('c');
            cntItem1.setText("Ver clientes");
            btnClientes.add(cntItem1);
     
            menuBar.add(btnClientes);

            cntItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cntItem1ActionPerformed(evt);
                }
            });            
            
            btnMascotas.setIcon(new ImageIcon(getClass().getResource("src/images/mascota.png"))); // NOI18N
            btnMascotas.setText("Mascotas");
            
            mctItem1.setMnemonic('m');
            mctItem1.setText("Ver mascotas");
            
            menuBar.add(btnMascotas);
            mctItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    mctItem1ActionPerformed(evt);
                }
            });            
            
            btnMascotas.add(mctItem1);
            
            
            btnServicio.setIcon(new ImageIcon(getClass().getResource("src/images/servicios.png"))); // NOI18N
            btnServicio.setText("Servicio");
            
            srvItem1.setMnemonic('s');
            srvItem1.setText("Ver servicios");

            srvItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    srvItem1ActionPerformed(evt);
                }
            }); 
            btnServicio.add(srvItem1);
            
            menuBar.add(btnServicio);
            
            btnProductos.setIcon(new ImageIcon(getClass().getResource("src/images/inventario.png"))); // NOI18N
            btnProductos.setText("Productos");

            pdtItem1.setMnemonic('p');
            pdtItem1.setText("Ver productos");
            pdtItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pdtItem1ActionPerformed(evt);
                }
            }); 
            btnProductos.add(pdtItem1);
            
            menuBar.add(btnProductos);
            
            btnAcercaDe.setIcon(new ImageIcon(getClass().getResource("src/images/acerca-de.png"))); // NOI18N
            btnAcercaDe.setText("Acerca de");
            
            acdItem1.setMnemonic('a');
            acdItem1.setText("Ver acerca de");
            acdItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    acdItem1ActionPerformed(evt);
                }
            }); 
            
            btnAcercaDe.add(acdItem1);

            menuBar.add(btnAcercaDe);
    
            btnSesion.setIcon(new ImageIcon(getClass().getResource("src/images/Usuario.png"))); // NOI18N
            btnSesion.setText("Sesion");

            itemInicio.setMnemonic('z');
            itemInicio.setText("Inicio de sesión");
            itemInicio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    iniciarItem1ActionPerformed(evt);
                }
            }); 

            itemSalir.setMnemonic('z');
            itemSalir.setText("Cerrar sesión");
            itemSalir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cerrarItem1ActionPerformed(evt);
                }
            }); 
            btnSesion.add(itemInicio);
            btnSesion.add(itemSalir);

            menuBar.add(btnSesion);
    
            setJMenuBar(menuBar);
    
            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(panelEscritorio)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(panelEscritorio)
            );
    
            pack();            
        }
    

        // Funciones para los eventos

        private void btnClinicaMenuSelected(javax.swing.event.MenuEvent evt) {                                        
            System.out.println("Reacciona al evento");
        }                 
        private void btnClinicaKeyPressed(java.awt.event.KeyEvent evt) {                                      
            System.out.println("Reacciona al evento");
       
        }                                     
    
        private void btnClinicaActionPerformed(java.awt.event.ActionEvent evt) {                                           
            System.out.println("Reacciona al evento");


            
            
        }  
        
        private void cntItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

            GuiClientes uiClientes = new GuiClientes();
            uiClientes.setSize(950, 548);
            this.panelEscritorio.add(uiClientes);
            uiClientes.setVisible(true);
            
    
        } 
        private void mctItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

            GuiMascotas uiMascotas = new GuiMascotas();
            uiMascotas.setSize(950, 548);
            this.panelEscritorio.add(uiMascotas);
            uiMascotas.setVisible(true);
            
    
        } 
        private void cncItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            System.out.println("Reacciona al evento desde clinica");
            
            this.uiClinica.setSize(950, 548);
            this.panelEscritorio.add(uiClinica);

            this.uiClinica.setVisible(true);
            
    
        } 
        
        private void desactivarVentanas(){
            this.uiClinica.setVisible(false);
            this.uiEmpleados.setVisible(false);

        }
        private void empItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

            desactivarVentanas();
            

            this.uiEmpleados.setSize(950, 548);

            this.panelEscritorio.add(uiEmpleados);

            this.uiEmpleados.setVisible(true);
            this.uiEmpleados.setEnabled(true);
        
    
        }  
        private void srvItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

         
            GuiServicios uiServicios = new GuiServicios();
            uiServicios.setSize(950, 548);
            this.panelEscritorio.add(uiServicios);
            uiServicios.setVisible(true);
            uiServicios.setEnabled(true);
        }  

        private void acdItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

         
            GuiAcercaDe uiAcercaDe = new GuiAcercaDe();
            uiAcercaDe.setSize(940, 788);
            this.panelEscritorio.add(uiAcercaDe);
            uiAcercaDe.setVisible(true);
            uiAcercaDe.setEnabled(true);
        }  

        private void pdtItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

         
            GuiProductos uiProductos = new GuiProductos();
            uiProductos.setSize(950, 548);
            this.panelEscritorio.add(uiProductos);
            uiProductos.setVisible(true);
            uiProductos.setEnabled(true);
        }  
        private void iniciarItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

         
            GuiInicioSesion uiInicioSesion = new GuiInicioSesion();
            uiInicioSesion.setSize(950, 548);
            this.panelEscritorio.add(uiInicioSesion);
            uiInicioSesion.setVisible(true);
            uiInicioSesion.setEnabled(true);
        }  
        private void cerrarItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

         
            GuiCerrarSesion uiCerrarSesion = new GuiCerrarSesion();
            uiCerrarSesion.setSize(940, 788);
            this.panelEscritorio.add(uiCerrarSesion);
            uiCerrarSesion.setVisible(true);
            uiCerrarSesion.setEnabled(true);
        }  
                 

        public static void main(String[] args) {

            new PantallaPrincipal().setVisible(true);

        
          }        
      


}
