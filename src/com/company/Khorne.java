package com.company;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Khorne {

    private static Khorne instance_KH = null;

    Khorne() {
    }

    ;

    public static Khorne getInstance() {
        if (instance_KH == null)
            instance_KH = new Khorne();

        return instance_KH;
    }

    public Warp getWarp() {
        return Warp.getInstance();
    }

    public Service getConseilKH() {
        return ((ConseilKH) Warp.getInstance().tabServiceKH[0]);
    }

    public Service getEcouteKH() {
        return ((EcouteKH) Warp.getInstance().tabServiceKH[1]);
    }

    public Service getMiracleKH() {
        return ((MiracleKH) Warp.getInstance().tabServiceKH[2]);
    }

    public Service getCataclysmeKH() {
        return ((CataclysmeKH) Warp.getInstance().tabServiceKH[3]);
    }

    public void runKH() {

        Chaos chaos = new Chaos();
        Random random = new Random();
        int random_service = random.nextInt(4) + 1;
        int random_tache;
        switch (random_service) {
            case 1: //CONSEIL
                System.out.println("CONSEIL : ");
                random_tache = random.nextInt(2) + 1;
                switch (random_tache) {
                    case 1:
                        ((ConseilKH) chaos.communiquerKH().getConseilKH()).conseilSansRaison();
                        break;
                    case 2:
                        ((ConseilKH) chaos.communiquerKH().getConseilKH()).conseilFonctionDemande();
                        break;
                    default:
                        break;
                }
                break;
            case 2: //ECOUTE
                System.out.println("ECOUTE : ");
                random_tache = random.nextInt(3) + 1;
                switch (random_tache) {
                    case 1:
                        ((EcouteKH) chaos.communiquerKH().getEcouteKH()).ecouterSansReponse();
                        break;
                    case 2:
                        ((EcouteKH) chaos.communiquerKH().getEcouteKH()).ecouterRepondreConseil();
                        break;
                    case 3:
                        ((EcouteKH) chaos.communiquerKH().getEcouteKH()).ecouterRealiserMiracle();
                        break;
                    default:
                        break;
                }
                break;
            case 3: //MIRACLE
                System.out.println("MIRACLE : ");
                ((MiracleKH) chaos.communiquerKH().getMiracleKH()).RealiserMiracle();
                break;
            case 4: //CATACLYSME
                System.out.println("CATACLYSME : ");
                random_tache = random.nextInt(3) + 1;
                switch (random_tache) {
                    case 1:
                        ((CataclysmeKH) chaos.communiquerKH().getCataclysmeKH()).RealiserCataclysmeSansRaison();
                        break;
                    case 2:
                        ((CataclysmeKH) chaos.communiquerKH().getCataclysmeKH()).RealiserCataclysmeFonctionDemande();
                        break;
                    case 3:
                        ((CataclysmeKH) chaos.communiquerKH().getCataclysmeKH()).RealiserCataclysmeEtMiracle();
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        System.out.println();
    }
}
