package com.company;

import java.util.Random;

public class CataclysmeCG extends Service implements CataclysmeInterface{
    @Override
    public void RealiserCataclysmeSansRaison() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.print("Cegorach : ");
                System.out.println(Constantes.CATACLYSMECG1);
                break;
            case 2:
                System.out.print("Cegorach : ");
                System.out.println(Constantes.CATACLYSMECG2);
                break;
            case 3:
                System.out.print("Cegorach : ");
                System.out.println(Constantes.CATACLYSMECG3);
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
                System.out.println(Constantes.DEMANDECG4);
                System.out.print("Cegorach : ");
                System.out.println(Constantes.CATACLYSMECG1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDECG5);
                System.out.print("Cegorach : ");
                System.out.println(Constantes.CATACLYSMECG2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDECG6);
                System.out.print("Cegorach : ");
                System.out.println(Constantes.CATACLYSMECG3);
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
                System.out.println(Constantes.CATACLYSMECG1);
                System.out.print("Cegorach : ");
                System.out.println(Constantes.MIRACLECG1);
                break;
            case 2:
                System.out.println(Constantes.CATACLYSMECG2);
                System.out.print("Cegorach : ");
                System.out.println(Constantes.MIRACLECG2);
                break;
            case 3:
                System.out.println(Constantes.CATACLYSMECG3);
                System.out.print("Cegorach : ");
                System.out.println(Constantes.MIRACLECG3);
                break;
            default:
                break;
        }
    }
}
