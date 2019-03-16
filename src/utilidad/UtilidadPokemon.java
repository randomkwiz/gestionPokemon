package utilidad;

import enumerados.Tipo;
import gestion.GestionPokemon;

public class UtilidadPokemon {

    /*INTERFAZ
     * Signatura: public void cargarTablaTipos(double[][] tablaFortalezas)
     * Comentario: este método carga automáticamente la tabla de tipos indicando las fortalezas y debilidades de cada uno
     *             Sigue el orden establecido por el enum de Tipos.
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
                    break;
                case ELECTRIC:
                    break;
                case GHOST:
                    break;
                case FIRE:
                    break;
                case FAIRY:
                    break;
                case ICE:
                    break;
                case FIGHTING:
                    break;
                case NORMAL:
                    break;
                case GRASS:
                    break;
                case PSYCHIC:
                    break;
                case ROCK:
                    break;
                case DARK:
                    break;
                case GROUND:
                    break;
                case POISON:
                    break;
                case FLYING:
                    break;
                    }
            }



        }



    }

