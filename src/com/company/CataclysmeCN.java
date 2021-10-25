package com.company;

import java.util.Random;

public class CataclysmeCN extends Service implements CataclysmeInterface {

    @Override
    public void RealiserCataclysmeSansRaison() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.CATACLYSMECN1);
                break;
            case 2:
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.CATACLYSMECN2);
                break;
            case 3:
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.CATACLYSMECN3);
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
                System.out.println(Constantes.DEMANDECN4);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.CATACLYSMECN1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDECN5);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.CATACLYSMECN2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDECN6);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.CATACLYSMECN3);
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
                System.out.println(Constantes.CATACLYSMECN1);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.MIRACLECN1);
                break;
            case 2:
                System.out.println(Constantes.CATACLYSMECN2);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.MIRACLECN2);
                break;
            case 3:
                System.out.println(Constantes.CATACLYSMECN3);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.MIRACLECN3);
                break;
            default:
                break;
        }
    }
}
