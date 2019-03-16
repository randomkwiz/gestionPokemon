package resguardo;
import enumerados.Tipo;
public class Resguardo {

    /*Resguardos de utilidad*/

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
        System.out.println("En resguardo cargar tabla tipos");
    }

    /*Resguardos de gestion*/

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
        System.out.println("En resguardo obtener posicion de tipo");
        return 0;
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
        System.out.println("En resguardo obtener tipo de posicion");
        return Tipo.NULL;
    }

    /*INTERFAZ
     * Signatura: public Tipo[] obtenerDebilidades (Tipo tipo, double[][]tablaPokemon)
     * Comentario: genera un array con los tipos frente a los cuales el tipo introducido es débil
     * Precondiciones: por referencia se pasa Tipo y array bidimensional de reales
     * Entradas: Tipo tipo y double[][] tablaPokemon
     * Salidas: Tipo[]
     * Entradas/Salidas:
     * Postcondiciones: se devuelve asociado al nombre un array de Tipos
     * */
    public Tipo[] obtenerDebilidades(Tipo tipo, double[][]tablaPokemon){
        System.out.println("En resguardo obtener debilidades");
        return null;
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

        return 0;
    }
}
