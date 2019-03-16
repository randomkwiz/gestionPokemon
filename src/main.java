/*
* Comentario: Programa que pide uno o dos tipos Pokemon y devuelve los tipos contra los cuales este pokemon sería débil o fuerte.
* Entradas: uno o dos tipos pokemon
* Salidas: mensajes de ayuda al usuario, tipos pokemon contra los que seria fuerte y debil
* */
/*PSEUDOCODIGO
* inicio
*   repetir
*       pedirValidarDeseaEjecutar
*       si (respuesta es si)
*          pedirValidarTipoPrimario
*          pedirValidarTipoSecundario
*          mostrarDebilidades
*          mostrarFortalezas
*       finSi
*   mientras(usuario desee ejecutar)
* fin
*
* */

import enumerados.Tipo;
import gestion.GestionPokemon;
import validacion.Validar;
import utilidad.UtilidadPokemon;

public class main {
    public static void main(String[] args) {
        GestionPokemon gestion = new GestionPokemon();
        UtilidadPokemon utilidad = new UtilidadPokemon();
        Validar validar = new Validar();
        double[][] tablaPokemon = new double[19][19];
        utilidad.cargarTablaTipos(tablaPokemon);
        String ejecutar;
        Tipo tipoPrimario= Tipo.NULL;
        Tipo tipoSecundario= Tipo.NULL;


        //pedirValidarDeseaEjecutar
        ejecutar = validar.ejecutar();
        if ( ejecutar.equals("SI")){

            //pedirValidarTipoPrimario
            do {
                System.out.println("El tipo primario no puede estar vacío.");
                tipoPrimario = validar.tipo();
            }while(tipoPrimario == Tipo.NULL);
            //pedirValidarTipoSecundario
            System.out.println("Selecciona 0 si no tiene tipo secundario.");
            tipoSecundario = validar.tipo();

            //mostrarDebilidades

            //mostrarFortalezas

        }










    }
}
