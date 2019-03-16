package utilidad;

import enumerados.Tipo;
import gestion.GestionPokemon;

public class UtilidadPokemon {

    /*INTERFAZ
     * Signatura: public void cargarTablaTipos(double[][] tablaFortalezas)
     * Comentario: este método carga automáticamente la tabla de tipos indicando las fortalezas y debilidades de cada uno
     *             Sigue el orden establecido por el enum de Tipos. La i es el tipo del pokemon, y la j el tipo del ataque que recibe.
     * Precondiciones: el enum de tipos no debe cambiar su orden. Por referencia se pasa un array bidimensional de reales
     * Entradas:
     * Salidas:
     * Entradas/Salidas: double[][] tablaFortalezas
     * Postcondiciones: se devuelve por referencia el array bidimensional cargado con los datos.
     * */
    public void cargarTablaTipos(double[][] tablaFortalezas){
        GestionPokemon gestion = new GestionPokemon();
        final double MUY_EFICAZ = 2;
        final double POCO_EFICAZ = 0.5;
        final double NEUTRAL = 1;
        final double INMUNE = 0;
        for(Tipo myTipo: Tipo.values()){
            switch (myTipo){
                case STEEL:

                        for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                            switch (gestion.obtenerTipodePosicion(i)){
                                case STEEL:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                                case WATER:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL ;
                                    break;
                                case BUG:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                                case DRAGON:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                                case ELECTRIC:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL ;
                                    break;
                                case GHOST:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL ;
                                    break;
                                case FIRE:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ ;
                                    break;
                                case FAIRY:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                                case ICE:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                                case FIGHTING:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ ;
                                    break;
                                case NORMAL:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                                case GRASS:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                                case PSYCHIC:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                                case ROCK:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                                case DARK:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL ;
                                    break;
                                case GROUND:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ ;
                                    break;
                                case POISON:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = INMUNE ;
                                    break;
                                case FLYING:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ ;
                                    break;
                            }
                        }

                    break;
                case WATER:
                        for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                            switch (gestion.obtenerTipodePosicion(i)) {
                                case STEEL:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                    break;
                                case WATER:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                    break;
                                case BUG:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case DRAGON:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case ELECTRIC:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                    break;
                                case GHOST:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case FIRE:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                    break;
                                case FAIRY:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case ICE:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                    break;
                                case FIGHTING:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case NORMAL:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case GRASS:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                    break;
                                case PSYCHIC:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case ROCK:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case DARK:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case GROUND:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case POISON:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                case FLYING:
                                    tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                    break;
                                }
                            }
                    break;

                case BUG:
                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                        }
                    }
                    break;
                case DRAGON:
                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }


                    break;
                case ELECTRIC:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }


                    break;
                case GHOST:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = INMUNE;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = INMUNE;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }


                    break;
                case FIRE:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }


                    break;
                case FAIRY:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = INMUNE;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }

                    break;
                case ICE:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }

                    break;
                case FIGHTING:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                        }
                    }

                    break;
                case NORMAL:
                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = INMUNE;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }

                    break;
                case GRASS:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                        }
                    }

                    break;
                case PSYCHIC:
                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }


                    break;
                case ROCK:
                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                        }
                    }

                    break;
                case DARK:
                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = INMUNE;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }

                    break;
                case GROUND:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = INMUNE;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }

                    break;
                case POISON:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }

                    break;
                case FLYING:

                    for(int i = 0; i < tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)].length; i++ ){

                        switch (gestion.obtenerTipodePosicion(i)) {
                            case STEEL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case WATER:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case BUG:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case DRAGON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ELECTRIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case GHOST:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FIRE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FAIRY:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ICE:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case FIGHTING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case NORMAL:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GRASS:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = POCO_EFICAZ;
                                break;
                            case PSYCHIC:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case ROCK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = MUY_EFICAZ;
                                break;
                            case DARK:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case GROUND:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = INMUNE;
                                break;
                            case POISON:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                            case FLYING:
                                tablaFortalezas[gestion.obtenerPosicionDeTipo(myTipo)][i] = NEUTRAL;
                                break;
                        }
                    }

                    break;
                    }
            }



        }



    }

