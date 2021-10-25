package com.company;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Cegorach {

    private static Cegorach instance_CG = null;


    Cegorach() {
    }

    ;

    public static Cegorach getInstance() {
        if (instance_CG == null)
            instance_CG = new Cegorach();

        return instance_CG;
    }

    public Warp getWarp() {
        return Warp.getInstance();
    }

    public Service getConseilCG() {
        return ((ConseilCG) Warp.getInstance().tabServiceCG[0]);
    }

    public Service getEcouteCG() {
        return ((EcouteCG) Warp.getInstance().tabServiceCG[1]);
    }

    public Service getMiracleCG() {
        return ((MiracleCG) Warp.getInstance().tabServiceCG[2]);
    }

    public Service getCataclysmeCG() {
        return ((CataclysmeCG) Warp.getInstance().tabServiceCG[3]);
    }

    public void runCG() {

        Harlequins harlequins = new Harlequins();
        Random random = new Random();
        int random_service = random.nextInt(4) + 1;
        int random_tache;
        switch (random_service) {
            case 1: //CONSEIL
                System.out.println("CONSEIL : ");
                random_tache = random.nextInt(2) + 1;
                switch (random_tache) {
                    case 1:
                        ((ConseilCG) harlequins.communiquerCG().getConseilCG()).conseilSansRaison();
                        break;
                    case 2:
                        ((ConseilCG) harlequins.communiquerCG().getConseilCG()).conseilFonctionDemande();
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
                        ((EcouteCG) harlequins.communiquerCG().getEcouteCG()).ecouterSansReponse();
                        break;
                    case 2:
                        ((EcouteCG) harlequins.communiquerCG().getEcouteCG()).ecouterRepondreConseil();
                        break;
                    case 3:
                        ((EcouteCG) harlequins.communiquerCG().getEcouteCG()).ecouterRealiserMiracle();
                        break;
                    default:
                        break;
                }
                break;
            case 3: //MIRACLE
                System.out.println("- MIRACLE : ");
                ((MiracleCG) harlequins.communiquerCG().getMiracleCG()).RealiserMiracle();
                break;
            case 4: //CATACLYSME
                System.out.println("- CATACLYSME : ");
                random_tache = random.nextInt(3) + 1;
                switch (random_tache) {
                    case 1:
                        ((CataclysmeCG) harlequins.communiquerCG().getCataclysmeCG()).RealiserCataclysmeSansRaison();
                        break;
                    case 2:
                        ((CataclysmeCG) harlequins.communiquerCG().getCataclysmeCG()).RealiserCataclysmeFonctionDemande();
                        break;
                    case 3:
                        ((CataclysmeCG) harlequins.communiquerCG().getCataclysmeCG()).RealiserCataclysmeEtMiracle();
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
