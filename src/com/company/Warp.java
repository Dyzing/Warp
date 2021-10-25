package com.company;

import java.util.ArrayList;

public class Warp {

    EmpereurDieu [] tabServiceED; // 0 : Conseil | 1 : Ecoute | 2 : Miracle | 3 : Cataclysme

    public Warp()
    {
        tabServiceED = new EmpereurDieu [4];
    }

    public EmpereurDieu getConseilED()
    {
        return tabServiceED[0];
    }

    public EmpereurDieu getEcouteED()
    {
        return tabServiceED[1];
    }

    public EmpereurDieu getMiracleED()
    {
        return tabServiceED[2];
    }

    public EmpereurDieu getCataclysmeED()
    {
        return tabServiceED[3];
    }

}
