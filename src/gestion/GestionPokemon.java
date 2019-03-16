package gestion;

import enumerados.Tipo;

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

}
