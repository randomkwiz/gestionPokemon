package gestion;

import enumerados.Tipo;
import utilidad.UtilidadPokemon;

public class GestionPokemon {
    /*INTERFAZ
     * Signatura: public int obtenerPosicionDeTipo(Tipo tipo)
     * Comentario: dado un tipo pokemon te devuelve su posicion en el enum
     * Precondiciones: se pasa un enum
     * Entradas: enum
     * Salidas: entero que es la posicion
     * Entradas/Salidas:
     * Postcondiciones: se devuelve asociado al nombre un entero
     * */
    public int obtenerPosicionDeTipo(Tipo tipo){
        int posicion = 0;
        for(Tipo myTipo: Tipo.values()){
            if (myTipo == tipo)
            posicion = myTipo.ordinal();
        }

        return posicion;
    }

    /*INTERFAZ
     * Signatura: public Tipo obtenerTipodePosicion(int posicion)
     * Comentario: dado una posicion del enum te devuelve el tipo al que hace referencia
     * Precondiciones: se pasa un entero
     * Entradas: por valor entero posicion
     * Salidas: enum Tipo
     * Entradas/Salidas:
     * Postcondiciones: se devuelve asociado al nombre el Tipo
     * */
    public Tipo obtenerTipodePosicion(int posicion){
        Tipo tipo = Tipo.NULL;
        for(Tipo myTipo: Tipo.values()){
            if (myTipo.ordinal() == posicion)
                tipo = myTipo;
        }
        return tipo;
    }
    /*INTERFAZ
     * Signatura: public void imprimirTipos ()
     * Comentario: imprime los tipos pokemon
     * Precondiciones:
     * Entradas:
     * Salidas:
     * Entradas/Salidas:
     * Postcondiciones: imprime en pantalla los tipos pokemon
     * */
    public void imprimirTipos(){
        for(Tipo myTipo: Tipo.values()){
            if(myTipo.ordinal() > 0) {
                System.out.println(myTipo.ordinal() + " - " + myTipo);
            }
        }
    }

    /*INTERFAZ
     * Signatura: public Tipo[] obtenerDebilidades (Tipo tipo)
     * Comentario: genera un array con los tipos frente a los cuales el tipo introducido es débil
     * Precondiciones: por referencia se pasa Tipo
     * Entradas: Tipo tipo
     * Salidas: Tipo[]
     * Entradas/Salidas:
     * Postcondiciones: se devuelve asociado al nombre un array de Tipos
     * */
    public Tipo[] obtenerDebilidades(Tipo tipo){
        UtilidadPokemon utilidad = new UtilidadPokemon();
        double[][]tablaPokemon = new double[19][19];
        utilidad.cargarTablaTipos(tablaPokemon);
        Tipo[] debilidades = new Tipo[contarDebilidades(tipo, tablaPokemon)];

        final double MUY_EFICAZ = 2;
        for(int j = 0, i = 0; j < tablaPokemon.length; j ++) {
            if (tablaPokemon[obtenerPosicionDeTipo(tipo)][j]  == MUY_EFICAZ){   //funciona, no tocar
                debilidades[i] = obtenerTipodePosicion(j);
                i++;
            }
        }
        return debilidades;
    }

    /*INTERFAZ
     * Signatura: public int contarDebilidades (Tipo tipo, double[][]tablaPokemon)
     * Comentario: dado un tipo y una tabla de fortalezas devuelve frente a cuantos tipos es debil
     * Precondiciones: por referencia se pasa Tipo y array bidimensional de reales
     * Entradas: Tipo tipo y double[][] tablaPokemon
     * Salidas: entero
     * Entradas/Salidas:
     * Postcondiciones: se devuelve asociado al nombre un entero
     * */
    public int contarDebilidades (Tipo tipo, double[][]tablaPokemon){
        int contador=0;
        final double MUY_EFICAZ = 2;
        for(int j = 0; j < tablaPokemon.length; j ++) {
            if (tablaPokemon[obtenerPosicionDeTipo(tipo)][j]  == MUY_EFICAZ){   //funciona, no tocar
                contador++;
            }
        }
        return contador;
    }

    /*INTERFAZ
     * Signatura: public int contarFortalezas (Tipo tipo, double[][]tablaPokemon)
     * Comentario: dado un tipo y una tabla de fortalezas devuelve frente a cuantos tipos es fuerte
     * Precondiciones: por referencia se pasa Tipo y array bidimensional de reales
     * Entradas: Tipo tipo y double[][] tablaPokemon
     * Salidas: entero
     * Entradas/Salidas:
     * Postcondiciones: se devuelve asociado al nombre un entero
     * */
    public int contarFortalezas (Tipo tipo, double[][]tablaPokemon){
        int contador=0;
        final double MUY_EFICAZ = 2;
        for(int j = 0; j < tablaPokemon.length; j ++) {
            if (tablaPokemon[j][obtenerPosicionDeTipo(tipo)]  == MUY_EFICAZ){   //funciona, no tocar. Para las fortalezas se cambia lo que se mira. Antes mirabamos por columnas ahora por filas
                contador++;
            }
        }
        return contador;
    }

    /*INTERFAZ
     * Signatura: public Tipo[] obtenerFortalezas (Tipo tipo)
     * Comentario: genera un array con los tipos frente a los cuales el tipo introducido es fuerte
     * Precondiciones: por referencia se pasa Tipo
     * Entradas: Tipo tipo
     * Salidas: Tipo[]
     * Entradas/Salidas:
     * Postcondiciones: se devuelve asociado al nombre un array de Tipos
     * */
    public Tipo[] obtenerFortalezas(Tipo tipo){
        UtilidadPokemon utilidad = new UtilidadPokemon();
        double[][]tablaPokemon = new double[19][19];
        utilidad.cargarTablaTipos(tablaPokemon);
        Tipo[] fortalezas = new Tipo[contarFortalezas(tipo, tablaPokemon)];

        final double MUY_EFICAZ = 2;
        for(int j = 0, i = 0; j < tablaPokemon.length; j ++) {
            if (tablaPokemon[j][obtenerPosicionDeTipo(tipo)]  == MUY_EFICAZ){   //funciona, no tocar
                fortalezas[i] = obtenerTipodePosicion(j);
                i++;
            }
        }
        return fortalezas;
    }

}
