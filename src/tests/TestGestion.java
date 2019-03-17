package tests;

import enumerados.Tipo;
import gestion.GestionPokemon;
import utilidad.UtilidadPokemon;

import java.util.Arrays;

public class TestGestion {
    public static void main(String[] args) {
        GestionPokemon gestion = new GestionPokemon();
        UtilidadPokemon utilidad = new UtilidadPokemon();
        double [][] tablaTipos = new double[19][19];

        utilidad.cargarTablaTipos(tablaTipos);

/*
        System.out.println(gestion.obtenerTipodePosicion(5));
        System.out.println(gestion.obtenerPosicionDeTipo(Tipo.BUG));
  */
        //gestion.imprimirTipos();
/*
        System.out.println(gestion.contarDebilidades(Tipo.ELECTRIC, tablaTipos));
        System.out.println(gestion.contarDebilidades(Tipo.GROUND, tablaTipos));
        System.out.println(Arrays.toString(gestion.obtenerDebilidades(Tipo.ELECTRIC)));
        System.out.println(Arrays.toString(gestion.obtenerDebilidades(Tipo.FAIRY)));
        System.out.println(Arrays.toString(gestion.obtenerDebilidades(Tipo.GHOST)));
        System.out.println(Arrays.toString(gestion.obtenerDebilidades(Tipo.FIGHTING)));
        System.out.println(Arrays.toString(gestion.obtenerDebilidades(Tipo.FIRE)));
*/
/*
        System.out.println(Arrays.toString(gestion.obtenerFortalezas(Tipo.FIRE)));
        System.out.println(Arrays.toString(gestion.obtenerFortalezas(Tipo.FAIRY)));
        System.out.println(Arrays.toString(gestion.obtenerFortalezas(Tipo.STEEL)));
        System.out.println(Arrays.toString(gestion.obtenerFortalezas(Tipo.WATER)));
*/

        System.out.println(Arrays.toString(gestion.esInmuneFrenteA(Tipo.GROUND)));
        System.out.println(Arrays.toString(gestion.esInmuneFrenteA(Tipo.FAIRY)));
        System.out.println(Arrays.toString(gestion.esInmuneFrenteA(Tipo.FLYING)));
        System.out.println(Arrays.toString(gestion.esInmuneFrenteA(Tipo.PSYCHIC)));
        System.out.println(Arrays.toString(gestion.esInmuneFrenteA(Tipo.DARK)));
        System.out.println(Arrays.toString(gestion.esInmuneFrenteA(Tipo.GHOST)));

/*
        System.out.println(Arrays.toString(gestion.esIneficazContra(Tipo.GHOST)));
        System.out.println(Arrays.toString(gestion.esIneficazContra(Tipo.ELECTRIC)));
        System.out.println(Arrays.toString(gestion.esIneficazContra(Tipo.GROUND)));
        System.out.println(Arrays.toString(gestion.esIneficazContra(Tipo.NORMAL)));
*/
    }
}
