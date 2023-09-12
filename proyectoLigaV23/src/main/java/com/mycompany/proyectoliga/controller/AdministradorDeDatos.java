package com.mycompany.proyectoliga.controller;

import com.mycompany.proyectoliga.model.Estadistica;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Enciso Suarez
 */
public class AdministradorDeDatos {

    // muestra al usuario opciones de equipos que desea consultar y/o tabla de posciones
    public Stack<Estadistica> obtenerEstadisticasDelTorneo(int idEquipo) {

        //Stack: LIFO
        Stack<Estadistica> listaDeEstadisticas = new Stack<>();

        Estadistica estadisticasAmerica = new Estadistica( 1, "America", 16, 13, 1, 2, 43, 8, 35, 40);
        Estadistica estadisticasSantafe = new Estadistica( 2, "SantaFe", 16, 10, 5, 1, 33, 12,21, 35);      
        Estadistica estadisticasNacional = new Estadistica( 3, "Nacional", 16, 8, 6, 2, 28, 9, 19, 30);      
        Estadistica estadisticasPereira = new Estadistica( 4, "Pereira", 16, 8, 5, 3, 28, 20, 8, 29);      
        Estadistica estadisticasCali = new Estadistica( 5, "Cali", 16, 7, 6, 3, 24, 18, 6, 27);      
        Estadistica estadisticasMedellin = new Estadistica( 6, "Medellin", 16, 8, 3, 5, 25, 20, 5, 27);      
        Estadistica estadisticasCortulua = new Estadistica( 7, "Cortulua", 16, 7, 4, 5, 20, 13, 7, 25);      
        Estadistica estadisticasLaEquidad = new Estadistica( 8, "La Equidad", 16, 7, 2, 7, 28, 20, 8, 23);      
        Estadistica estadisticasMillonarios = new Estadistica( 9, "Millonarios", 16, 6, 4, 6, 23, 21, 2, 22);      
        Estadistica estadisticasLlaneros = new Estadistica( 10, "Llaneros", 16, 7, 1, 8, 21, 23, -2, 22);      
        Estadistica estadisticasJunior = new Estadistica( 11, "Junior", 16, 5, 6, 5, 17, 12, 5, 21);      
        Estadistica estadisticasBoyacaChico = new Estadistica( 12, "Boyaca Chico", 16, 4, 8, 4, 13, 15, -2, 20);      
        Estadistica estadisticasHuila = new Estadistica( 13, "Huila", 16, 5, 5, 6, 15, 21, -6, 20);      
        Estadistica estadisticasRealSantander = new Estadistica( 14, "Real Santander", 16, 3, 4, 9, 13, 29, -16, 13);      
        Estadistica estadisticasPasto = new Estadistica( 15, "Pasto", 16, 3, 3, 10, 11, 34, -23, 12);      
        Estadistica estadisticasBucaramanga = new Estadistica( 16, "Bucaramanga", 16, 1, 3, 12, 9, 41, -32, 6);
        Estadistica estadisticasTolima = new Estadistica( 17, "Tolima", 16, 0, 2, 14, 1, 46, -35, 2);

        switch (idEquipo) {
                case 0:
                    listaDeEstadisticas.add(estadisticasAmerica);
                    break;

                case 1:
                    listaDeEstadisticas.add(estadisticasSantafe);
                    break;

                case 2:
                    listaDeEstadisticas.add(estadisticasNacional);
                    break;

                case 3:
                    listaDeEstadisticas.add(estadisticasPereira);
                    break;

                case 4:
                    listaDeEstadisticas.add(estadisticasCali);
                    break;

                case 5:
                    listaDeEstadisticas.add(estadisticasTolima);
                    listaDeEstadisticas.add(estadisticasBucaramanga);
                    listaDeEstadisticas.add(estadisticasPasto);
                    listaDeEstadisticas.add(estadisticasRealSantander);
                    listaDeEstadisticas.add(estadisticasHuila);
                    listaDeEstadisticas.add(estadisticasBoyacaChico);
                    listaDeEstadisticas.add(estadisticasJunior);
                    listaDeEstadisticas.add(estadisticasLlaneros);
                    listaDeEstadisticas.add(estadisticasMillonarios);
                    listaDeEstadisticas.add(estadisticasLaEquidad);
                    listaDeEstadisticas.add(estadisticasCortulua);
                    listaDeEstadisticas.add(estadisticasMedellin);
                    listaDeEstadisticas.add(estadisticasCali);
                    listaDeEstadisticas.add(estadisticasPereira);
                    listaDeEstadisticas.add(estadisticasNacional);
                    listaDeEstadisticas.add(estadisticasSantafe);
                    listaDeEstadisticas.add(estadisticasAmerica);

                    break;
            }
            
            return listaDeEstadisticas;
    }
}
