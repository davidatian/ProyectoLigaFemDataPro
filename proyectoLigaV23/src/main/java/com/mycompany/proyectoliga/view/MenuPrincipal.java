package com.mycompany.proyectoliga.view;

import com.mycompany.proyectoliga.controller.AdministradorDeDatos;
import com.mycompany.proyectoliga.controller.AdministradorCampeones;
import com.mycompany.proyectoliga.controller.AdministradorJugadoras;
import com.mycompany.proyectoliga.model.Estadistica;
import com.mycompany.proyectoliga.model.Jugadora;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.util.List;
import java.util.Stack;

/**
 * @author Enciso Suarez
 */
public class MenuPrincipal {

    private JFrame framePrincipal;

    public MenuPrincipal() {
        framePrincipal = new JFrame("Proyecto Liga Betplay Femenina 2023");
        framePrincipal.setSize(700, 650);
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.getContentPane().setBackground(new Color(100, 150, 80));
        framePrincipal.setLayout(new FlowLayout());
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mostrarMenuPrincipal() {

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(50, 50, 50, 50));
        panel.setLayout(new GridLayout(7, 1, 10, 10)); // 3 filas, 1 columna, espacio horizontal y vertical
        // Crear etiqueta
        JLabel etiquetaTitulo = new JLabel("*** Menú principal ***");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiquetaTitulo);
        // Agrega etiqueta vacía para crear espacio entre el titulo y los botones
        panel.add(new JLabel(""));

        //Crear Botones en el menu principal
        JButton botonOpcion1 = new JButton("1. Mostrar equipos campeones");
        JButton botonOpcion2 = new JButton("2. Mostrar jugadoras por equipo");
        JButton botonOpcion3 = new JButton("3. Mostrar estadisticas del torneo actual");
        JButton botonOpcion4 = new JButton("Salir");

        //crear acción del boton para mostrar equipos campeones
        botonOpcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarEquiposCampeones();
            }
        });
        //crear acción del boton para mostrar jugadoras por equipo
        botonOpcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarOpcionesJugadorasPorEquipo();
            }
        });
        //crear acción del boton para mostrar estadisticas y tabla
        botonOpcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarEstadisticasLiga();
            }
        });
        //Crear boton para salir de la aplicación
        botonOpcion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Agregar botones al panel
        panel.add(botonOpcion1);
        panel.add(botonOpcion2);
        panel.add(botonOpcion3);
        panel.add(botonOpcion4);

        // Agregar el panel al JFrame
        framePrincipal.getContentPane().removeAll();
        framePrincipal.add(panel);
        framePrincipal.setVisible(true);
    }

    private void mostrarOpcionesJugadorasPorEquipo() {

        //Crear panel de mostrar equipos
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(7, 1, 10, 10));
        JLabel etiquetaTitulo = new JLabel("¿Que equipo deseas consultar?");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiquetaTitulo);
        
        //Crear botones para mostrar opciones disponibles
        JButton botonOpcion1 = new JButton("1. Nacional");
        JButton botonOpcion2 = new JButton("2. America");
        JButton botonOpcion3 = new JButton("3. SantaFe");
        JButton botonOpcion4 = new JButton("4. Pereira");
        JButton botonOpcion5 = new JButton("5. Cali");
        JButton botonOpcion6 = new JButton("6. Volver");
        
         //crear acción del boton
        botonOpcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarJugadorasPorEquipo(1);
            }
        });

        //crear acción del boton
        botonOpcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarJugadorasPorEquipo(2);
            }
        });
         
        //crear acción del boton
        botonOpcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarJugadorasPorEquipo(3);
            }
        });

        //crear acción del boton
        botonOpcion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarJugadorasPorEquipo(4);
            }
        });

          //crear acción del boton
        botonOpcion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarJugadorasPorEquipo(5);
            }
        });
        
         //crear acción del boton
        botonOpcion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarJFrame();
                mostrarMenuPrincipal();
            }
        });

        // Agregar el botón al panel
        panel.add(botonOpcion1);
        panel.add(botonOpcion2);
        panel.add(botonOpcion3);
        panel.add(botonOpcion4);
        panel.add(botonOpcion5);
        panel.add(botonOpcion6);

        // Agregar el panel al JFrame
        framePrincipal.getContentPane().removeAll();
        framePrincipal.add(panel);
        framePrincipal.revalidate();
        framePrincipal.repaint();
        framePrincipal.setVisible(true);
    }

    private void mostrarEstadisticasLiga() {

        // se crea el titulo de la pestaña
        JLabel titulo = new JLabel("¿Que equipo deseas consultar?");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        String[] options = {"America de Cali", "SantaFe", "Nacional", "Pereira", 
                            "Deportivo Cali", "Tabla de Posiciones"};

        // Crear una instancia de JComboBox y pasar el arreglo de opciones
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Crear un botón para obtener la selección
        JButton obtenerSeleccion = new JButton("Selecciona");

        // Crear Boton para regresar al menu principal
        JButton botonRegresarMenu = new JButton("Volver");
        botonRegresarMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarJFrame();
                mostrarMenuPrincipal();
            }
        });

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(5, 1, 10, 10));
        panel.add(titulo);
        panel.add(comboBox);
        panel.add(obtenerSeleccion);
        panel.add(botonRegresarMenu);

        obtenerSeleccion.addActionListener(e -> {
            int idEquipoSeleccionado = comboBox.getSelectedIndex();
            mostrarEstadisticasPorEquipoSeleccionado(idEquipoSeleccionado);
        });

        // Agregar el panel al JFrame
        framePrincipal.getContentPane().removeAll();
        framePrincipal.add(panel);
        framePrincipal.revalidate();
        framePrincipal.repaint();
        framePrincipal.setVisible(true);
    }

    private void mostrarEstadisticasPorEquipoSeleccionado(int idEquipoSeleccionado) {
        AdministradorDeDatos obtenerEstadisticasDelTorneo = new AdministradorDeDatos();

        // Stack: LIFO
        Stack<Estadistica> listaDeEstadisticas =
                obtenerEstadisticasDelTorneo.obtenerEstadisticasDelTorneo(idEquipoSeleccionado);

        // Crear un modelo de datos de tabla
        DefaultTableModel tableModel = new DefaultTableModel();

        // Crear una instancia de JTable con el modelo de datos
        JTable table = new JTable(tableModel);

        // Agregar la tabla a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        JButton botonVolver = new JButton("Volver");
        botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarJFrame();
                mostrarEstadisticasLiga();
            }
        });

        // Agregar columnas al modelo de datos
        tableModel.addColumn("POS.");
        tableModel.addColumn("EQUIPO");
        tableModel.addColumn("PJ");
        tableModel.addColumn("PG");
        tableModel.addColumn("PE");
        tableModel.addColumn("PP");
        tableModel.addColumn("GF");
        tableModel.addColumn("GC");
        tableModel.addColumn("GD");
        tableModel.addColumn("PTOS");

        int totalEquipos = listaDeEstadisticas.size();

        for (int i = 0; i < totalEquipos; i++) {
            Estadistica estadisticasEquipo = listaDeEstadisticas.pop();

            tableModel.addRow(new Object[]{
                    estadisticasEquipo.getPosicion(),
                    estadisticasEquipo.getEquipo(),
                    estadisticasEquipo.getPartidosJugados(),
                    estadisticasEquipo.getPartidosGanados(),
                    estadisticasEquipo.getPartidosEmpatados(),
                    estadisticasEquipo.getPatidosPerdidos(),
                    estadisticasEquipo.getGolesAFavor(),
                    estadisticasEquipo.getGolesEnContra(),
                    estadisticasEquipo.getDiferenciaDeGoles(),
                    estadisticasEquipo.getPuntos()
            });
        }

        // Cambiar el tamaño de la primer columna(Posición)
        TableColumn columnPosicion = table.getColumnModel().getColumn(0);
        columnPosicion.setPreferredWidth(75); // Establecer el ancho deseado

        // Cambiar el tamaño de la segunda columna (Equipo)
        TableColumn columnEquipo = table.getColumnModel().getColumn(1);
        columnEquipo.setPreferredWidth(200); // Establecer el ancho deseado

        JLabel etiquetaTabla = new JLabel ("Tabla de Posiciones");

        JPanel container = new JPanel();
        container.setBorder(new EmptyBorder(20, 100, 20, 100));
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        
        container.add(etiquetaTabla);
        //Agrega espacios en blanco entre el titulo y la tabla
        container.add(new JLabel(" "));
        container.add(new JLabel(" "));
        container.add(scrollPane);
        container.add(botonVolver);
        
        // Agregar el panel al JFrame
        framePrincipal.getContentPane().removeAll(); 
        framePrincipal.add(container);
        framePrincipal.revalidate();
        framePrincipal.repaint();
        framePrincipal.setVisible(true);
    }

    private void mostrarEquiposCampeones() {

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(100, 100, 100, 100));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel etiquetaTitulo = new JLabel("*** Equipos Campeones***");
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiquetaTitulo);
        // Agrega etiqueta vacía para crear espacio entre el titulo y los botones
        panel.add(new JLabel(" "));
        panel.add(new JLabel(" "));

        AdministradorCampeones campeon = new AdministradorCampeones();
        String equiposCampeones = campeon.obtenerEquiposCampeones();

        JLabel etiqueta1 = new JLabel(equiposCampeones);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta1);

        //Crear boton para regresar al menu principal
        JButton botonSalir = new JButton("Volver");
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarJFrame();
                mostrarMenuPrincipal();
            }
        });
        panel.add(new JLabel(" "));
        panel.add(new JLabel(" "));
        panel.add(botonSalir);

        framePrincipal.getContentPane().removeAll();
        framePrincipal.add(panel);
        framePrincipal.revalidate();
        framePrincipal.repaint();
        framePrincipal.setVisible(true);
    }

    private void mostrarJugadorasPorEquipo(int identificadorEquipo) {

        AdministradorJugadoras administradorJugadoras = new AdministradorJugadoras();

        // Lista generica: permite almacenar objetos de tipo Jugadora
        List<Jugadora> jugadoras = new ArrayList<>();

        if (identificadorEquipo == 1) {
            jugadoras = administradorJugadoras.obtenerJugadorasNacional();
        } else if (identificadorEquipo == 2) {
            jugadoras = administradorJugadoras.obtenerJugadorasAmerica();
        } else if (identificadorEquipo == 3) {
            jugadoras = administradorJugadoras.obtenerJugadorasSantafe();
        } else if (identificadorEquipo == 4) {
            jugadoras = administradorJugadoras.obtenerJugadorasPereira();
        } else if (identificadorEquipo == 5) {
            jugadoras = administradorJugadoras.obtenerJugadorasCali();
        }

        JPanel panel = new JPanel();

        // Crear un modelo de datos de tabla
        DefaultTableModel tableModel = new DefaultTableModel();

        // Crear una instancia de JTable con el modelo de datos
        JTable table = new JTable(tableModel);

        // Agregar la tabla a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Agregar columnas al modelo de datos
        tableModel.addColumn("NOMBRE");
        tableModel.addColumn("APELLIDO");
        tableModel.addColumn("EDAD");
        tableModel.addColumn("DORSAL");
        tableModel.addColumn("POSICIÓN");
        tableModel.addColumn("NACIONALIDAD");
        
        // Pintar las filas con los datos en la tabla
        for (Jugadora jugadora : jugadoras) {
            tableModel.addRow(new Object[]{
                jugadora.getNombre(),
                jugadora.getApellido(),
                jugadora.getEdad(),
                jugadora.getDorsal(),
                jugadora.getPosicion(),
                jugadora.getNacionalidad()
            });
        }
        
        // Cambiar el tamaño de la primera columna (Nombre)
        TableColumn columnNombre = table.getColumnModel().getColumn(0);
        columnNombre.setPreferredWidth(100); // Establecer el ancho deseado

        // Cambiar el tamaño de la quinta columna (Apellido)
        TableColumn columnApellido = table.getColumnModel().getColumn(1);
        columnApellido.setPreferredWidth(90); // Establecer el ancho deseado
        
        // Cambiar el tamaño de la quinta columna (Posición)
        TableColumn columnPosicion = table.getColumnModel().getColumn(4);
        columnPosicion.setPreferredWidth(90); // Establecer el ancho deseado

        // Cambiar el tamaño de la sexta columna (Nacionalidad)        
        TableColumn columnNacionalidad = table.getColumnModel().getColumn(5);
        columnNacionalidad.setPreferredWidth(120); // Establecer el ancho deseado

        JButton botonSalir = new JButton("Volver");
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarJFrame();
                mostrarOpcionesJugadorasPorEquipo();
            }
        });
        panel.add(botonSalir);

        framePrincipal.getContentPane().removeAll();
        framePrincipal.add(scrollPane);
        framePrincipal.add(panel);
        framePrincipal.revalidate();
        framePrincipal.repaint();
        framePrincipal.setVisible(true);
    }

    private void limpiarJFrame(){
        framePrincipal.getContentPane().removeAll();
        framePrincipal.revalidate();
        framePrincipal.repaint();
    }
}