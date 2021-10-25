package com.company;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class EmpereurDieu {

    private static EmpereurDieu instance_ED = null;

    EmpereurDieu()
    {};

    public static EmpereurDieu getInstance()
    {
        if(instance_ED == null)
            instance_ED = new EmpereurDieu();

        return instance_ED;
    }

    public Warp getWarp()
    {
        return Warp.getInstance();
    }

    public Service getConseilED()
    {
        return ((ConseilED) Warp.getInstance().tabServiceED[0]);
    }

    public Service getEcouteED()
    {
        return ((EcouteED) Warp.getInstance().tabServiceED[1]);
    }

    public Service getMiracleED()
    {
        return ((MiracleED) Warp.getInstance().tabServiceED[2]);
    }

    public Service getCataclysmeED()
    {
        return ((CataclysmeED) Warp.getInstance().tabServiceED[3]);
    }

    public void runED()
    {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Psykers pysker = new Psykers();
                ((ConseilED) pysker.communiquerED().getConseilED()).conseilSansRaison();
            }
        };
        timer.scheduleAtFixedRate(task, 0,2000);//wait 0 ms before doing the action and do it every 1000ms (1second)
    }
}
