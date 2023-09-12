
package com.mycompany.proyectoliga.model;

/**
 *
 * @author Enciso Suarez
 */
public class Estadistica {
    
    //Crear variables
    private int posicion, partidosJugados, partidosGanados, partidosEmpatados, 
                patidosPerdidos, golesAFavor, golesEnContra, diferenciaDeGoles, puntos;
    private String equipo;
    
    // crear Getter y Setter
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPatidosPerdidos() {
        return patidosPerdidos;
    }

    public void setPatidosPerdidos(int patidosPerdidos) {
        this.patidosPerdidos = patidosPerdidos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getDiferenciaDeGoles() {
        return diferenciaDeGoles;
    }

    public void setDiferenciaDeGoles(int diferenciaDeGoles) {
        this.diferenciaDeGoles = diferenciaDeGoles;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Estadistica(int posicion, String equipo, int partidosJugados, int partidosGanados, int partidosEmpatados, int patidosPerdidos, int golesAFavor, int golesEnContra, int diferenciaDeGoles, int puntos) {
        this.posicion = posicion;
        this.equipo = equipo;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.patidosPerdidos = patidosPerdidos;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
        this.diferenciaDeGoles = diferenciaDeGoles;
        this.puntos = puntos;
    }
}
