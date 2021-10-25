package com.company;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Warp {

    private static Warp instance_warp = null;

    Service [] tabServiceED; // 0 : Conseil | 1 : Ecoute | 2 : Miracle | 3 : Cataclysme
    EmpereurDieu ed;

    Service [] tabServiceCG; // 0 : Conseil | 1 : Ecoute | 2 : Miracle | 3 : Cataclysme
    Cegorach cg;

    Service [] tabServiceCN; // 0 : Conseil | 1 : Ecoute | 2 : Miracle | 3 : Cataclysme
    Coloknee cn;

    Service [] tabServiceKH; // 0 : Conseil | 1 : Ecoute | 2 : Miracle | 3 : Cataclysme
    Khorne kh;

    public Warp()
    {
        tabServiceED = new Service [4];
        tabServiceED[0] = new ConseilED();
        tabServiceED[1] = new EcouteED();
        tabServiceED[2] = new MiracleED();
        tabServiceED[3] = new CataclysmeED();

        ed = EmpereurDieu.getInstance();

        tabServiceCG = new Service [4];
        tabServiceCG[0] = new ConseilCG();
        tabServiceCG[1] = new EcouteCG();
        tabServiceCG[2] = new MiracleCG();
        tabServiceCG[3] = new CataclysmeCG();
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
                cg.runCG();
            }
        };
        timer.scheduleAtFixedRate(task, 0,2000);//wait 0 ms before doing the action and do it every 1000ms (1second)
    }

}
