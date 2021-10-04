/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.entidades;






/**
 *
 * @author ccont
 */
public class Maincrah {
    public static void main(String[] args) {
        Listado listEventos = new Listado();

        
        //INSERTE MENU XD
        
        Eventos eve1 = new Eventos("2020-05-07", 1830, 2030, "ubicacionEvento", 100, 20,  "Cena");
        Eventos eve2 = new Eventos("2021-03-07",  1830, 2030, "ubicacionEvento", 100, 20,  "Cumpleanio");
        Eventos eve3 = new Eventos("2026-05-07",  1830, 2030, "ubicacionEvento", 100, 20,  "Matrimonio");
        Eventos eve4 = new Eventos("2020-08-28", 1830, 2030, "abicacionEvento", 100, 20,  "Cena");
        Eventos eve5 = new Eventos("2020-01-31", 1830, 2030, "ubicacionEvento", 100, 20,  "Cena");
        Eventos eve6 = new Eventos("2021-12-10", 1830, 2030, "ubicacionEvento", 100, 20,  "Matrimonio");
        Eventos eve7 = new Eventos("2021-11-10", 1830, 2030, "ubicacionEvento", 100, 20,  "Cena");
        Eventos eve8 = new Eventos("2022-12-13", 1830, 2030, "ubicacionEvento", 100, 20,  "Cena");
        Eventos eve9 = new Eventos("2023-09-29", 1830, 2030, "ubicacionEvento", 100, 20,  "Fiesta");
 
        listEventos.agregarLista(eve1);
        listEventos.agregarLista(eve2);
        listEventos.agregarLista(eve3);
        listEventos.agregarLista(eve4);
        listEventos.agregarLista(eve5);
        listEventos.agregarLista(eve6);
        listEventos.agregarLista(eve7);
        listEventos.agregarLista(eve8);
        listEventos.agregarLista(eve9);
        
        
        listEventos.orderBy();
        listEventos.listarEventos();
        listEventos.totalVentas();
        System.out.println(listEventos.mayorVenta());
    }
}
