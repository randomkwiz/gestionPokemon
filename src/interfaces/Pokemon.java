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
package interfaces;
import enumerados.Tipo;
public interface Pokemon {
    public Tipo getTipoPrimario();
    public Tipo getTipoSecundario();
}
