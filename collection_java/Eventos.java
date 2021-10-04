/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.entidades;

import java.time.LocalDate;



/**
 *
 * @author ccont
 */
public class Eventos implements Comparable<Eventos>{

    private int idEvento;
    private String fechaEvento;
    private int horaInicio;
    private int horaTermino;
    private String ubicacionEvento;
    private int precioEvento;
    private int cantidadInvitados;
    private String tipoEvento;
    private static int contadorId;

    public Eventos() {
        this.idEvento = ++contadorId;

    }

    public Eventos(String fechaEvento, int horaInicio, int horaTermino, String ubicacionEvento, int precioEvento, int cantidadInvitados, String tipoEvento) {
         this.idEvento = ++contadorId;
        this.fechaEvento = fechaEvento;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.ubicacionEvento = ubicacionEvento;
        this.precioEvento = precioEvento;
        this.cantidadInvitados = cantidadInvitados;
        this.tipoEvento = tipoEvento;
    }


    
    
    
    public int getIdEvento() {
        return idEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    
    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(int horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getUbicacionEvento() {
        return ubicacionEvento;
    }

    public void setUbicacionEvento(String ubicacionEvento) {
        this.ubicacionEvento = ubicacionEvento;
    }

    public int getPrecioEvento() {
        return precioEvento;
    }

    public void setPrecioEvento(int precioEvento) {
        this.precioEvento = precioEvento;
    }

    public int getCantidadInvitados() {
        return cantidadInvitados;
    }

    public void setCantidadInvitados(int cantidadInvitados) {
        this.cantidadInvitados = cantidadInvitados;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    
    // era pa validar el tipo de evento en el menu
    public String tipoDelEvento(int tipoEvento) {
        switch (tipoEvento) {
            case 1:
                return "Cumpleanio";
               
            case 2:
                return "Matrimonio";
                
            case 3:
                return "Cena";
            case 4:
                return "Fiesta";
            default:
                return "";

        }
    }
    // metodo pa la fecha
    
    public String fechaOrden(String anio,String mes,String dia){
        return anio+"-"+mes+"-"+dia;
    }


    
    @Override
    public String toString() {
        return "Eventos{" + "idEvento= " + idEvento + ", "
                + "Fecha Evento= " + fechaEvento + ","
                + "horaInicio= " + horaInicio + ",horaTermino= " + horaTermino + ",ubicacionEvento= " + ubicacionEvento + ", "
                + "precioEvento=" + precioEvento + ", cantidadInvitados=" + cantidadInvitados + ", tipoEvento=" + tipoEvento +'}';
 
    }

    @Override
    public int compareTo(Eventos t) {
        return fechaEvento.compareTo(t.getFechaEvento()) ;

    

}
}
