package com.company;


import java.util.Random;

public abstract class EcouteED extends Service implements EcouteInterface {

    @Override
    public void ecouterRealiserMiracle() {

        Random random = new Random();
        int random_value = random.nextInt(3) + 1;
        switch (random_value) {
            case 1:
                System.out.println(Constantes.DEMANDEED7);
                System.out.println(Constantes.MIRACLEED1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEED8);
                System.out.println(Constantes.MIRACLEED2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEED9);
                System.out.println(Constantes.MIRACLEED3);
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
                System.out.println(Constantes.DEMANDEED1);
                System.out.println(Constantes.ECOUTEED);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEED5);
                System.out.println(Constantes.ECOUTEED);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEED9);
                System.out.println(Constantes.ECOUTEED);
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
                System.out.println(Constantes.DEMANDEED1);
                System.out.println(Constantes.CONSEILED1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEED2);
                System.out.println(Constantes.CONSEILED2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEED3);
                System.out.println(Constantes.CONSEILED3);
                break;
            default:
                break;
        }
    }
}
