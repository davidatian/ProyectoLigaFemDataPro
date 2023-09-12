package com.mycompany.proyectoliga.controller;

import com.mycompany.proyectoliga.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enciso Suarez
 */
//Se crea clase donde se van a ingresar las jugadoras de los equipos
public class AdministradorJugadoras {

    //se crea metodo que va a imprimir las jugadoras de Santafe
    public List<Jugadora> obtenerJugadorasSantafe() {

        Arquera jugadora = new Arquera("Yessica", "Velásquez", 33, 12,  "Venezuela");
        Defensa jugadoraDos = new Defensa("Kelly", "Ibarguen", 20, 21,  "Colombia");
        Defensa jugadoraTres = new Defensa("Wendy", "Cardenas", 28, 15,  "Colombia");
        Defensa jugadoraCuatro = new Defensa("Sofia", "Garcia", 22, 16, "Colombia");
        Defensa jugadoraCinco = new Defensa("Viviana", "Acosta", 24, 6,  "Colombia");
        Volante jugadoraSeis = new Volante("Liana", "Salazar", 30, 11,  "Colombia");
        Volante jugadoraSiete = new Volante("Gabriela", "Huertas", 32, 19, "Colombia");
        Volante jugadoraOcho = new Volante("Camila", "Reyes", 21, 7,  "Colombia");
        Volante jugadoraNueve = new Volante("Heidy", "Mosquera", 27, 12,  "Colombia");
        Delantera jugadoraDiez = new Delantera("Karla", "Viancha", 17, 20,  "Colombia");
        Delantera jugadoraOnce = new Delantera("Enyerliannys", "Higuera", 22, 9,  "Venezuela");
        DirectorTecnico directorTecnico = new DirectorTecnico("Omar", "Ramirez", 31, 0,"Colombia");

        // Lista tipada: permite almacenar objetos solo de tipo Jugadora
        List<Jugadora> jugadorasSantafeList = new ArrayList<>();

        jugadorasSantafeList.add(jugadora);
        jugadorasSantafeList.add(jugadoraDos);
        jugadorasSantafeList.add(jugadoraTres);
        jugadorasSantafeList.add(jugadoraCuatro);
        jugadorasSantafeList.add(jugadoraCinco);
        jugadorasSantafeList.add(jugadoraSeis);
        jugadorasSantafeList.add(jugadoraSiete);
        jugadorasSantafeList.add(jugadoraOcho);
        jugadorasSantafeList.add(jugadoraNueve);
        jugadorasSantafeList.add(jugadoraDiez);
        jugadorasSantafeList.add(jugadoraOnce);
        jugadorasSantafeList.add(directorTecnico);

        return jugadorasSantafeList;
    }

    //se crea metodo que va a imprimir las jugadoras de Nacional
    public List<Jugadora> obtenerJugadorasNacional() {
        Arquera jugadora = new Arquera("Vanessa", "Cordoba", 28, 1,  "Colombia");
        Defensa jugadoraDos = new Defensa("Angela", "Barón", 19, 14,  "Colombia");
        Defensa jugadoraTres = new Defensa("Yeirdan", "Padilla", 19, 15, "Colombia");
        Defensa jugadoraCuatro = new Defensa("Mary ", "Alvarez", 18, 2,  "Colombia");
        Defensa jugadoraCinco = new Defensa("Nairelis", "Gutierrez", 28, 18,  "Venezuela");
        Volante jugadoraSeis = new Volante("Daniela", "Montoya", 32, 6,  "Colombia");
        Volante jugadoraSiete = new Volante("Joselyn", "Espinales", 24, 7,  "Ecuador");
        Volante jugadoraOcho = new Volante("Geraldine", "Cardona", 29, 8,  "Colombia");
        Volante jugadoraNueve = new Volante("Katerine", "Osorio", 18, 14, "Colombia");
        Delantera jugadoraDiez = new Delantera("Yirleidis", "Quejada", 20, 19, "Colombia");
        Delantera jugadoraOnce = new Delantera("Yesica", "Muñoz", 18, 10,  "Colombia");
        DirectorTecnico directorTecnico = new DirectorTecnico("Jorge", "Barreneche", 47, 0, "Colombia");

        // Lista tipada: permite almacenar objetos solo de tipo Jugadora
        List<Jugadora> jugadorasNacionalList = new ArrayList<>();

        jugadorasNacionalList.add(jugadora);
        jugadorasNacionalList.add(jugadoraDos);
        jugadorasNacionalList.add(jugadoraTres);
        jugadorasNacionalList.add(jugadoraCuatro);
        jugadorasNacionalList.add(jugadoraCinco);
        jugadorasNacionalList.add(jugadoraSeis);
        jugadorasNacionalList.add(jugadoraSiete);
        jugadorasNacionalList.add(jugadoraOcho);
        jugadorasNacionalList.add(jugadoraNueve);
        jugadorasNacionalList.add(jugadoraDiez);
        jugadorasNacionalList.add(jugadoraOnce);
        jugadorasNacionalList.add(directorTecnico);
        return jugadorasNacionalList;
    }
    //se crea metodo que va a imprimir las jugadoras de America

    public List<Jugadora> obtenerJugadorasAmerica() {
        Arquera jugadora = new Arquera("Natalia", "Giraldo", 20, 1, "Colombia");
        Defensa jugadoraDos = new Defensa("Daniela", "Arias", 29, 2,  "Colombia");
        Defensa jugadoraTres = new Defensa("Tatiana", "Castañeda", 32, 17,  "Colombia");
        Defensa jugadoraCuatro = new Defensa("Leury", "Basanta", 30, 16,  "Venezuela");
        Defensa jugadoraCinco = new Defensa("Diana", "Ospina", 34, 4,  "Colombia");
        Volante jugadoraSeis = new Volante("Carolina", "Pineda", 33, 8,  "Colombia");
        Volante jugadoraSiete = new Volante("Sara", "Martinez", 22, 15,  "Colombia");
        Volante jugadoraOcho = new Volante("Ingrid", "Vidal", 32, 21,  "Colombia");
        Volante jugadoraNueve = new Volante("Mariana", "Muñoz", 20, 6,  "Colombia");
        Delantera jugadoraDiez = new Delantera("Catalina", "Usme", 33, 10, "Colombia");
        Delantera jugadoraOnce = new Delantera("Gabriela", "Rodriguez", 18, 9,  "Colombia");
        DirectorTecnico directorTecnico = new DirectorTecnico("Carlos", "Hernandez", 57, 0, "Colombia");

        // Lista tipada: permite almacenar objetos solo de tipo Jugadora
        List<Jugadora> jugadorasAmericaList = new ArrayList<>();

        jugadorasAmericaList.add(jugadora);
        jugadorasAmericaList.add(jugadoraDos);
        jugadorasAmericaList.add(jugadoraTres);
        jugadorasAmericaList.add(jugadoraCuatro);
        jugadorasAmericaList.add(jugadoraCinco);
        jugadorasAmericaList.add(jugadoraSeis);
        jugadorasAmericaList.add(jugadoraSiete);
        jugadorasAmericaList.add(jugadoraOcho);
        jugadorasAmericaList.add(jugadoraNueve);
        jugadorasAmericaList.add(jugadoraDiez);
        jugadorasAmericaList.add(jugadoraOnce);
        jugadorasAmericaList.add(directorTecnico);
        return jugadorasAmericaList;
    }

    public List<Jugadora> obtenerJugadorasPereira() {
        Arquera jugadora = new Arquera("Sofia", "Buitrago", 19, 12,  "Colombia");
        Defensa jugadoraDos = new Defensa("Alejandra", "Villegas", 26, 15,  "Colombia");
        Defensa jugadoraTres = new Defensa("Ana Maria", "Guzman", 18, 7,  "Colombia");
        Defensa jugadoraCuatro = new Defensa("Laura", "Orozco", 22, 3,  "Colombia");
        Defensa jugadoraCinco = new Defensa("Angelica", "Ordoñez", 23, 5,  "Colombia");
        Volante jugadoraSeis = new Volante("Luisa", "Valbuena", 20, 4,  "Colombia");
        Volante jugadoraSiete = new Volante("Erika", "Largo", 29, 8, "Colombia");
        Volante jugadoraOcho = new Volante("Vanessa", "Franco", 25, 11,  "Colombia");
        Volante jugadoraNueve = new Volante("Ana Mile", "Gonzalez", 18, 10,  "Colombia");
        Delantera jugadoraDiez = new Delantera("Greicy", "Landazury", 19, 9,  "Colombia");
        Delantera jugadoraOnce = new Delantera("Vanessa", "Castillo", 19, 19,  "Colombia");
        DirectorTecnico directorTecnico = new DirectorTecnico("Carlos", "Osorio", 46, 0,  "Colombia");

        // Lista tipada: permite almacenar objetos solo de tipo Jugadora
        List<Jugadora> jugadorasPereiraList = new ArrayList<>();

        jugadorasPereiraList.add(jugadora);
        jugadorasPereiraList.add(jugadoraDos);
        jugadorasPereiraList.add(jugadoraTres);
        jugadorasPereiraList.add(jugadoraCuatro);
        jugadorasPereiraList.add(jugadoraCinco);
        jugadorasPereiraList.add(jugadoraSeis);
        jugadorasPereiraList.add(jugadoraSiete);
        jugadorasPereiraList.add(jugadoraOcho);
        jugadorasPereiraList.add(jugadoraNueve);
        jugadorasPereiraList.add(jugadoraDiez);
        jugadorasPereiraList.add(jugadoraOnce);
        jugadorasPereiraList.add(directorTecnico);
        return jugadorasPereiraList;
    }

    public List<Jugadora> obtenerJugadorasCali() {
        Arquera jugadora = new Arquera("Stefany", "Castaño", 29, 1, "Colombia");
        Defensa jugadoraDos = new Defensa("Jessica", "Romero", 23, 2,  "Colombia");
        Defensa jugadoraTres = new Defensa("Stefania", "Perlaza", 17, 4,  "Colombia");
        Defensa jugadoraCuatro = new Defensa("Angie", "Salazar", 23, 3, "Colombia");
        Defensa jugadoraCinco = new Defensa("Maria", "Morales", 27, 13, "Colombia");
        Volante jugadoraSeis = new Volante("Paula", "Medina", 23, 6, "Colombia");
        Volante jugadoraSiete = new Volante("Gisela", "Pino", 31, 5, "Chile");
        Volante jugadoraOcho = new Volante("Natalia", "Hernandez", 18, 10, "Colombia");
        Volante jugadoraNueve = new Volante("Valerin", "Loboa", 16, 23, "Colombia");
        Delantera jugadoraDiez = new Delantera("Diana", "Celis", 29, 7, "Colombia");
        Delantera jugadoraOnce = new Delantera("Paula", "Quintero", 28, 15, "Colombia");
        DirectorTecnico directorTecnico = new DirectorTecnico("Sergio", "Angulo", 62, 0, "Colombia");

        // Lista tipada: permite almacenar objetos solo de tipo Jugadora
        List<Jugadora> jugadorasCaliList = new ArrayList<>();

        jugadorasCaliList.add(jugadora);
        jugadorasCaliList.add(jugadoraDos);
        jugadorasCaliList.add(jugadoraTres);
        jugadorasCaliList.add(jugadoraCuatro);
        jugadorasCaliList.add(jugadoraCinco);
        jugadorasCaliList.add(jugadoraSeis);
        jugadorasCaliList.add(jugadoraSiete);
        jugadorasCaliList.add(jugadoraOcho);
        jugadorasCaliList.add(jugadoraNueve);
        jugadorasCaliList.add(jugadoraDiez);
        jugadorasCaliList.add(jugadoraOnce);
        jugadorasCaliList.add(directorTecnico);

        return jugadorasCaliList;
    }
}
