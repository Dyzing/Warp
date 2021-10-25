package com.company;

public class Chaos {
    public static int id_Chaos;

    public void Chaos()
    {
        ++id_Chaos;
    }


    Khorne communiquerKH()
    {
        return Khorne.getInstance();
    }
}
