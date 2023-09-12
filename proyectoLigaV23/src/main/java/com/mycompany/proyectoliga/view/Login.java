
package com.mycompany.proyectoliga.view;

import com.mycompany.proyectoliga.controller.AdministradorOpciones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Enciso Suarez
 */
public class Login {

    private final static String USERNAME = "David";
    private final static String PASSWORD = "Clave123";

    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Proyecto Liga Betplay Femenina 2023");
        // Establecer el tamaño del JFrame
        frame.setSize(700, 650);
        // Establecer el color de fondo del JFrame (fucsia )
        frame.getContentPane().setBackground(new Color(253, 121, 255));
        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();

        // Establecer el diseño del panel como GridLayout
        panel.setBorder(new EmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(12, 1, 10, 10)); // 10 filas, 1 columna, espacio horizontal y vertical

        // Crear etiquetas
        JLabel etiquetaTitulo = new JLabel("**** Bienvenido a FemData Pro ****");
        JLabel etiquetaInstrucciones = new JLabel("Para iniciar ingresa tu nombre de usuario y contraseña");
        JLabel etiquetaLoginIncorrecto = new JLabel("Datos incorrectos");
        JLabel etiquetaVacia = new JLabel("-------------------------------------");
        JLabel etiquetaVacia2 = new JLabel("----------------------------");
        JLabel etiquetaVacia3 = new JLabel("----------------------");
        JLabel etiquetaCreadoPor = new JLabel("Creado por:");
        JLabel etiquetaAutor = new JLabel("David Sebastián Enciso Lopez");
        JLabel etiquetaCorreo = new JLabel("david.enciso@pi.edu.co");
        JTextField textFieldNombre = new JTextField();
        JPasswordField textFieldPassword = new JPasswordField();
        
        //dar estilo a las etiquetas
        etiquetaTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        etiquetaInstrucciones.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        etiquetaLoginIncorrecto.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        etiquetaCreadoPor.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        etiquetaAutor.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        etiquetaCorreo.setFont(new Font("Comic Sans MS", Font.BOLD, 14));


        // Establecer alineación de las etiquetas al centro
        etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaInstrucciones.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaLoginIncorrecto.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaVacia.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaVacia2.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaVacia3.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaCreadoPor.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaAutor.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaCorreo.setHorizontalAlignment(SwingConstants.CENTER);

        // Agregar las etiquetas al panel
        panel.add(etiquetaTitulo);
        panel.add(etiquetaInstrucciones);
        panel.add(textFieldNombre);
        panel.add(textFieldPassword);

        // Crear un botón
        JButton boton = new JButton("Iniciar sesión");
        boton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        // Agregar acción al botón para validar usuario y contraseña
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldNombre.getText();
                String contrasena = textFieldPassword.getText();

                AdministradorOpciones model = new AdministradorOpciones();
                boolean esLoginCorrecto = model.validarDatosUsuario(usuario, contrasena, USERNAME, PASSWORD);
                if (esLoginCorrecto) {
                        frame.setVisible(false);
                        menuPrincipal.mostrarMenuPrincipal();
                    } else {
                        panel.add(etiquetaLoginIncorrecto);
                        panel.revalidate();
                        panel.repaint();
                    }
            }
        });

        // Agregar el botón y etiquetas al panel
        panel.add(boton);
        panel.add(etiquetaVacia);
        panel.add(etiquetaVacia2);
        panel.add(etiquetaVacia3);
        panel.add(etiquetaCreadoPor);
        panel.add(etiquetaAutor);
        panel.add(etiquetaCorreo);

        // Agregar el panel al JFrame
        frame.add(panel);

        // Establecer el JFrame como visible
        frame.setVisible(true);
    }
}
