package com.company;

import java.util.Random;

public class CataclysmeED extends Service implements  CataclysmeInterface{

    @Override
    public void RealiserCataclysmeSansRaison() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.print("Empereur-Dieu : ");
                System.out.println(Constantes.CATACLYSMEED1);
                break;
            case 2:
                System.out.print("Empereur-Dieu : ");
                System.out.println(Constantes.CATACLYSMEED2);
                break;
            case 3:
                System.out.print("Empereur-Dieu : ");
                System.out.println(Constantes.CATACLYSMEED3);
                break;
            default:
                break;
        }
    }

    @Override
    public void RealiserCataclysmeFonctionDemande() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.println(Constantes.DEMANDEED4);
                System.out.print("-Empereur-Dieu : ");
                System.out.println(Constantes.CATACLYSMEED1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEED5);
                System.out.print("-Empereur-Dieu : ");
                System.out.println(Constantes.CATACLYSMEED2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEED6);
                System.out.print("-Empereur-Dieu : ");
                System.out.println(Constantes.CATACLYSMEED3);
                break;
            default:
                break;
        }
    }

    @Override
    public void RealiserCataclysmeEtMiracle() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.println(Constantes.CATACLYSMEED1);
                System.out.print("-Empereur-Dieu : ");
                System.out.println(Constantes.MIRACLEED1);
                break;
            case 2:
                System.out.println(Constantes.CATACLYSMEED2);
                System.out.print("-Empereur-Dieu : ");
                System.out.println(Constantes.MIRACLEED2);
                break;
            case 3:
                System.out.println(Constantes.CATACLYSMEED3);
                System.out.print("-Empereur-Dieu : ");
                System.out.println(Constantes.MIRACLEED3);
                break;
            default:
                break;
        }
    }
}
