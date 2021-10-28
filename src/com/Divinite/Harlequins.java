package com.Divinite;

public class Harlequins {

    public static int id_Harlequins;

    public void Harlequins()
    {
        ++id_Harlequins;
    }


    Cegorach communiquerCG()
    {
        return Cegorach.getInstance();
    }
}
