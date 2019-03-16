package tests;

import enumerados.Tipo;

public class TestEnumTipos {
    public static void main(String[] args) {

        for(Tipo myTipo: Tipo.values()){
            System.out.println(myTipo);
            System.out.println(myTipo +" at index "+ myTipo.ordinal());
        }



        /*
        System.out.println(Tipo.NULL);
        System.out.println(Tipo.BUG);
        System.out.println(Tipo.DARK);
        System.out.println(Tipo.DRAGON);
        System.out.println(Tipo.ELECTRIC);
        System.out.println(Tipo.FAIRY);
        System.out.println(Tipo.FIGHTING);
        System.out.println(Tipo.FIRE);
        System.out.println(Tipo.FLYING);
        System.out.println(Tipo.GHOST);
        System.out.println(Tipo.GRASS);
        System.out.println(Tipo.GROUND);
        System.out.println(Tipo.ICE);
        System.out.println(Tipo.NORMAL);
        System.out.println(Tipo.POISON);
        System.out.println(Tipo.PSYCHIC);
        System.out.println(Tipo.ROCK);
        System.out.println(Tipo.STEEL);
        System.out.println(Tipo.WATER);
        */



    }
}
