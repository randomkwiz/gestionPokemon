package tests;

import clase.PokemonImpl;
import enumerados.Tipo;
import interfaces.Pokemon;

public class TestPokemon {
    public static void main(String[] args) {
        PokemonImpl myPokemon = new PokemonImpl(Tipo.BUG);
        PokemonImpl myPokemon2 = new PokemonImpl(Tipo.DRAGON, Tipo.ELECTRIC);



        System.out.println(myPokemon.getTipoPrimario());
        System.out.println(myPokemon2.getTipoPrimario());
        System.out.println(myPokemon2.getTipoSecundario());
        System.out.println(myPokemon.getTipoSecundario());
    }
}
