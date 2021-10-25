package com.company;

import java.util.Random;

public class EcouteCG extends Service implements EcouteInterface{

    @Override
    public void ecouterRealiserMiracle() {

        Random random = new Random();
        int random_value = random.nextInt(3) + 1;
        switch (random_value) {
            case 1:
                System.out.println(Constantes.DEMANDECG7);
                System.out.println(Constantes.MIRACLECG1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDECG8);
                System.out.println(Constantes.MIRACLECG2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDECG9);
                System.out.println(Constantes.MIRACLECG3);
                break;
            default:
                break;
        }
    }

    @Override
    public void ecouterSansReponse() {

        Random random = new Random();
        int random_value = random.nextInt(3) + 1;
        switch (random_value) {
            case 1:
                System.out.println(Constantes.DEMANDECG1);
                System.out.println(Constantes.ECOUTECG);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEED5);
                System.out.println(Constantes.ECOUTECG);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEED9);
                System.out.println(Constantes.ECOUTECG);
                break;
            default:
                break;
        }
    }

    @Override
    public void ecouterRepondreConseil() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;
        switch (random_value) {
            case 1:
                System.out.println(Constantes.DEMANDECG1);
                System.out.println(Constantes.CONSEILCG1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDECG2);
                System.out.println(Constantes.CONSEILCG2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDECG3);
                System.out.println(Constantes.CONSEILCG3);
                break;
            default:
                break;
        }
    }
}
