
package com.mycompany.proyectoliga.controller;

/**
 *
 * @author Enciso Suarez
 */

//
public class AdministradorCampeones {
    private static final String EQUIPOS_CAMPEONES = "<html>     " +
            "     2023 Independiente SantaFe<br/>" +
            "     2022 America de Cali<br/>" +
            "     2021 Deportivo Cali<br/>" +
            "     2020 Independiente SantaFe<br/>" +
            "     2019 America de Cali<br/>" +
            "     2018 Atletico Huila<br/>" +
            "     2017 Independiente SantaFe</html>";

    public String obtenerEquiposCampeones(){
        return EQUIPOS_CAMPEONES;
    }
}

