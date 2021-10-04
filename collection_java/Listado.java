/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.entidades;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

/**
 *
 * @author ccont
 */
public class Listado {

    private List<Eventos> listaEventos;

    public Listado() {
        listaEventos = new ArrayList<Eventos>();
    }

    public void agregarLista(Eventos eve) {
        listaEventos.add(eve);
    }

    public void totalVentas() {
        int totalCumple = 0, totalMatri = 0, totalCena = 0, totalParty = 0;
        for (Eventos eve : listaEventos) {
            String tipo = eve.getTipoEvento();
            switch (tipo) {
                case "Cumpleanio":
                    totalCumple++;
                    break;
                case "Matrimonio":
                    totalMatri++;
                    break;
                case "Cena":
                    totalCena++;
                    break;
                case "Fiesta":
                    totalParty++;
                    break;
            }

        }
        System.out.println("Total Cumpleaños = " + totalCumple);
        System.out.println("Total Matrimonio = " + totalMatri);
        System.out.println("Total Cena = " + totalCena);
        System.out.println("Total Fiesta = " + totalParty);
    }

    public void listarEventos() {
        for (Eventos eve : listaEventos) {
            System.out.println(eve.toString());
        }
    }

    public String mayorVenta() {
        int totalCumple = 0, totalMatri = 0, totalCena = 0, totalParty = 0;
        for (Eventos eve : listaEventos) {
            String tipo = eve.getTipoEvento();
            switch (tipo) {
                case "Cumpleanio":
                    totalCumple++;
                    break;
                case "Matrimonio":
                    totalMatri++;
                    break;
                case "Cena":
                    totalCena++;
                    break;
                case "Fiesta":
                    totalParty++;
                    break;
            }
        }

        if (totalCumple > totalCena || totalCumple > totalMatri || totalCumple > totalParty) {
            return ("El evento mas perron es el Cumpleaños con " + totalCumple + " eventos");
        } else if (totalCena > totalMatri || totalCena > totalParty) {
            return ("El evento mas perron es la cena con " + totalCena + " eventos");
        } else if (totalMatri > totalParty) {
            return ("El evento mas perron es el matricidio con " + totalMatri + " eventos");
        } else {
            return ("El evento mas perron es la fiestoca con " + totalParty + " eventos");
        }

    }
    
    public void orderBy(){
        Collections.sort(listaEventos);

    }
}
