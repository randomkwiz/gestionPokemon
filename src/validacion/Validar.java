package validacion;
import enumerados.Tipo;
import gestion.GestionPokemon;

import java.util.Scanner;
public class Validar {
    /*
    * INTERFAZ
    * Signatura: public String ejecutar()
    * Comentario: pide y valida si desea ejecutar el programa
    * Precondiciones:
    * Entradas:
    * Salidas: String que es "si" si quiere ejecutar y "no" si no quiere
    * Postcondiciones: se devolvera asociado al nombre si desea ejecutar o no
    * */
    public String ejecutar(){
        Scanner sc = new Scanner(System.in);
        String entrada;
        do{
            System.out.println("¿Desea ejecutar el programa de Tipos Pokemon? Escribe 'Si' o 'No': ");
            entrada = sc.next();
        }while( (!entrada.toUpperCase().equals("SI") && !entrada.toUpperCase().equals("NO")) );
        return entrada.toUpperCase();
    }

    /*
     * INTERFAZ
     * Signatura: public Tipo tipo()
     * Comentario: pide y valida un tipo pokemon
     * Precondiciones:
     * Entradas:
     * Salidas: Tipo pokemon
     * Postcondiciones: se devolvera asociado al nombre un Tipo
     * */
    public Tipo tipo(){
        Scanner sc = new Scanner(System.in);
        GestionPokemon gestion = new GestionPokemon();
        int tipo=0;
        do{
            System.out.println("Selecciona un tipo pokemon: ");
            gestion.imprimirTipos();
            tipo = sc.nextInt();
        }while(tipo < 0 || tipo > 18);
    return gestion.obtenerTipodePosicion(tipo);
    }



}
