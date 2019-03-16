package tests;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import enumerados.Tipo;
import gestion.GestionPokemon;
import utilidad.*;
public class TestUtilidad {
    public static void main(String[] args) {
        UtilidadPokemon utilidad = new UtilidadPokemon();
        GestionPokemon gestion = new GestionPokemon();
        double [][] tablaTipos = new double[19][19];

        utilidad.cargarTablaTipos(tablaTipos);

        for(int i = 0; i < tablaTipos.length; i ++){    //empiezo en 1 porque el 0 es el tipo NULL
            if(i > 0) {
                System.out.print(gestion.obtenerTipodePosicion(i) + " ");
            }else{
                System.out.println("   ");
            }
            if (i == 0) {
                for (Tipo myTipo : Tipo.values()) {

                        System.out.print("  "+myTipo + " ");

                }
                System.out.println();
            }
            for(int j = 0; j < tablaTipos[i].length; j++){
                if(j >0 ) {
                    if(i > 0){
                        System.out.print("[ " + tablaTipos[i][j] + " ]");
                    }

                }

            }
            System.out.println("\n");
        }

    }
}
