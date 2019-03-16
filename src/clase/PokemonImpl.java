/*
 * Nombre: Pokemon
 * Comentario: Una clase Pokémon debería tener muchos más atributos pero ahora mismo sólo necesito los tipos.
 * Propiedades:
 *   -Básicas:
 *       Tipo tipoPrimario   consultable y no modificable
 *       Tipo tipoSecundario consultable y no modificable
 *   -Derivadas:
 *   -Compartidas:
 * Metodos interface:
 *   public Tipo getTipoPrimario();
 *   public Tipo getTipoSecundario();
 * Metodos añadidos:
 * Metodos object:
 * */

package clase;
import interfaces.Pokemon;
import enumerados.Tipo;
public class PokemonImpl implements Pokemon {
    private Tipo tipoPrimario;
    private Tipo tipoSecundario;

    //Constructor


    public PokemonImpl(Tipo tipoPrimario) {
        this.tipoPrimario = tipoPrimario;
        this.tipoSecundario = Tipo.NULL;
    }

    public PokemonImpl(Tipo tipoPrimario, Tipo tipoSecundario) {
        this.tipoPrimario = tipoPrimario;
        this.tipoSecundario = tipoSecundario;
    }

    //Metodos interface
    public Tipo getTipoPrimario(){return this.tipoPrimario;}
    public Tipo getTipoSecundario(){return this.tipoSecundario;}

}
