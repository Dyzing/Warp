package com.company;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Warp {

    private static Warp instance_warp = null;

    Service [] tabServiceED; // 0 : Conseil | 1 : Ecoute | 2 : Miracle | 3 : Cataclysme
    EmpereurDieu ed;

    Service [] tabServiceCG;
    Cegorach cg;

    Service [] tabServiceKH;
    Khorne kh;

    Service [] tabServiceCN;
    Coloknee cn;


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

        cg = Cegorach.getInstance();


        tabServiceKH = new Service [4];
        tabServiceKH[0] = new ConseilKH();
        tabServiceKH[1] = new EcouteKH();
        tabServiceKH[2] = new MiracleKH();
        tabServiceKH[3] = new CataclysmeKH();

        kh = Khorne.getInstance();

        tabServiceCN = new Service [4];
        tabServiceCN[0] = new ConseilCN();
        tabServiceCN[1] = new EcouteCN();
        tabServiceCN[2] = new MiracleCN();
        tabServiceCN[3] = new CataclysmeCN();

        cn = Coloknee.getInstance();

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
                System.out.print("Psykers : ");
                ed.runED();
                System.out.print("Harlequins : ");
                cg.runCG();
                System.out.print("Chaos : ");
                kh.runKH();
                System.out.print("Farfadets : ");
                cn.runCN();
                System.out.println("");
            }
        };
        timer.scheduleAtFixedRate(task, 0,2000);//wait 0 ms before doing the action and do it every 1000ms (1second)
    }

}
