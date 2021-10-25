package com.company;

import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class EmpereurDieu {

    private static EmpereurDieu instance_ED = null;
    static int tour = 0;

    EmpereurDieu() {
    }

    ;

    public static EmpereurDieu getInstance() {
        if (instance_ED == null)
            instance_ED = new EmpereurDieu();

        return instance_ED;
    }

    public Warp getWarp() {
        return Warp.getInstance();
    }

    public Service getConseilED() {
        return ((ConseilED) Warp.getInstance().tabServiceED[0]);
    }

    public Service getEcouteED() {
        return ((EcouteED) Warp.getInstance().tabServiceED[1]);
    }

    public Service getMiracleED() {
        return ((MiracleED) Warp.getInstance().tabServiceED[2]);
    }

    public Service getCataclysmeED() {
        return ((CataclysmeED) Warp.getInstance().tabServiceED[3]);
    }

    public void runED() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Psykers pysker = new Psykers();
                System.out.print("tour : " + tour + " ");
                Random random = new Random();
                int random_service = random.nextInt(4) + 1;
                int random_tache;
                switch (random_service) {
                    case 1: //CONSEIL
                        System.out.println("CONSEIL : ");
                        random_tache = random.nextInt(2) + 1;
                        switch (random_tache) {
                            case 1:
                                ((ConseilED) pysker.communiquerED().getConseilED()).conseilSansRaison();
                                break;
                            case 2:
                                ((ConseilED) pysker.communiquerED().getConseilED()).conseilFonctionDemande();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2: //ECOUTE
                        System.out.println("- ECOUTE : ");
                        random_tache = random.nextInt(3) + 1;
                        switch (random_tache) {
                            case 1:
                                ((EcouteED) pysker.communiquerED().getEcouteED()).ecouterSansReponse();
                                break;
                            case 2:
                                ((EcouteED) pysker.communiquerED().getEcouteED()).ecouterRepondreConseil();
                                break;
                            case 3:
                                ((EcouteED) pysker.communiquerED().getEcouteED()).ecouterRealiserMiracle();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3: //MIRACLE
                        System.out.println("- MIRACLE : ");
                        ((MiracleED) pysker.communiquerED().getMiracleED()).RealiserMiracle();
                        break;
                    case 4: //CATACLYSME
                        System.out.println("- CATACLYSME : ");
                        random_tache = random.nextInt(3) + 1;
                        switch (random_tache) {
                            case 1:
                                ((CataclysmeED) pysker.communiquerED().getCataclysmeED()).RealiserCataclysmeSansRaison();
                                break;
                            case 2:
                                ((CataclysmeED) pysker.communiquerED().getCataclysmeED()).RealiserCataclysmeFonctionDemande();
                                break;
                            case 3:
                                ((CataclysmeED) pysker.communiquerED().getCataclysmeED()).RealiserCataclysmeEtMiracle();
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                tour++;
                System.out.println();
            }


        };
        timer.scheduleAtFixedRate(task, 0, 750);//wait 0 ms before doing the action and do it every 1000ms (1second)
    }
}
