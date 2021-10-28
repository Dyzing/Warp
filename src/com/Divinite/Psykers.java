package com.Divinite;

public class Psykers {

    public static int id_Psykers;

    public void Psykers()
    {
        ++id_Psykers;
    }


    EmpereurDieu communiquerED()
    {
        return EmpereurDieu.getInstance();
    }

}
