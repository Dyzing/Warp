package com.Divinite;

import com.Warp.*;

import java.util.Random;

public class Coloknee {

    private static Coloknee instance_CN = null;

    Coloknee() {
    };

    public static Coloknee getInstance() {
        if (instance_CN == null)
            instance_CN = new Coloknee();

        return instance_CN;
    }

    public Warp getWarp() {
        return Warp.getInstance();
    }

    public Service getConseilCN() {
        return ((ConseilCN) Warp.getInstance().getTabServiceCN()[0]);
    }

    public Service getEcouteCN() {
        return ((EcouteCN) Warp.getInstance().getTabServiceCN()[1]);
    }

    public Service getMiracleCN() {
        return ((MiracleCN) Warp.getInstance().getTabServiceCN()[2]);
    }

    public Service getCataclysmeCN() {
        return ((CataclysmeCN) Warp.getInstance().getTabServiceCN()[3]);
    }

    public void runCN() {

        Farfadets farfadet = new Farfadets();
        Random random = new Random();
        int random_service = random.nextInt(4) + 1;
        int random_tache;
        switch (random_service) {
            case 1: //CONSEIL
                System.out.println("CONSEIL : ");
                random_tache = random.nextInt(2) + 1;
                switch (random_tache) {
                    case 1:
                        ((ConseilCN) farfadet.communiquerCN().getConseilCN()).conseilSansRaison();
                        break;
                    case 2:
                        ((ConseilCN) farfadet.communiquerCN().getConseilCN()).conseilFonctionDemande();
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
                        ((EcouteCN) farfadet.communiquerCN().getEcouteCN()).ecouterSansReponse();
                        break;
                    case 2:
                        ((EcouteCN) farfadet.communiquerCN().getEcouteCN()).ecouterRepondreConseil();
                        break;
                    case 3:
                        ((EcouteCN) farfadet.communiquerCN().getEcouteCN()).ecouterRealiserMiracle();
                        break;
                    default:
                        break;
                }
                break;
            case 3: //MIRACLE
                System.out.println("MIRACLE : ");
                ((MiracleCN) farfadet.communiquerCN().getMiracleCN()).RealiserMiracle();
                break;
            case 4: //CATACLYSME
                System.out.println("CATACLYSME : ");
                random_tache = random.nextInt(3) + 1;
                switch (random_tache) {
                    case 1:
                        ((CataclysmeCN) farfadet.communiquerCN().getCataclysmeCN()).RealiserCataclysmeSansRaison();
                        break;
                    case 2:
                        ((CataclysmeCN) farfadet.communiquerCN().getCataclysmeCN()).RealiserCataclysmeFonctionDemande();
                        break;
                    case 3:
                        ((CataclysmeCN) farfadet.communiquerCN().getCataclysmeCN()).RealiserCataclysmeEtMiracle();
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
