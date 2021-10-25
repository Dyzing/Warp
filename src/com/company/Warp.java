package com.company;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Warp {

    private static Warp instance_warp = null;

    Service [] tabServiceED; // 0 : Conseil | 1 : Ecoute | 2 : Miracle | 3 : Cataclysme
    EmpereurDieu ed;

    Service [] tabServiceCN; // 0 : Conseil | 1 : Ecoute | 2 : Miracle | 3 : Cataclysme
    Coloknee cn;

    public Warp()
    {
        tabServiceED = new Service [4];
        tabServiceED[0] = new ConseilED();
        tabServiceED[1] = new EcouteED();
        tabServiceED[2] = new MiracleED();
        tabServiceED[3] = new CataclysmeED();

        ed = EmpereurDieu.getInstance();
    }


    public static Warp getInstance()
    {
        if(instance_warp == null)
            instance_warp = new Warp();

        return instance_warp;
    }

    public void run()
    {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                EmpereurDieu ed = EmpereurDieu.getInstance();
                ed.runED();
            }
        };
        timer.scheduleAtFixedRate(task, 0,2000);//wait 0 ms before doing the action and do it every 1000ms (1second)
    }

}
