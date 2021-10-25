package com.company;

import java.util.Random;

public class CataclysmeKH extends Service implements CataclysmeInterface{

    @Override
    public void RealiserCataclysmeSansRaison() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.println(Constantes.CATACLYSMEKH1);
                break;
            case 2:
                System.out.println(Constantes.CATACLYSMEKH2);
                break;
            case 3:
                System.out.println(Constantes.CATACLYSMEKH3);
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
                System.out.println(Constantes.DEMANDEKH4);
                System.out.println(Constantes.CATACLYSMEKH1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEKH5);
                System.out.println(Constantes.CATACLYSMEKH2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEKH6);
                System.out.println(Constantes.CATACLYSMEKH3);
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
                System.out.println(Constantes.CATACLYSMEKH1);
                System.out.println(Constantes.MIRACLEKH1);
                break;
            case 2:
                System.out.println(Constantes.CATACLYSMEKH2);
                System.out.println(Constantes.MIRACLEKH2);
                break;
            case 3:
                System.out.println(Constantes.CATACLYSMEKH3);
                System.out.println(Constantes.MIRACLEKH3);
                break;
            default:
                break;
        }
    }
}
