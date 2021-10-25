package com.company;

import java.util.Random;

public class EcouteKH extends Service implements EcouteInterface{
    @Override
    public void ecouterRealiserMiracle() {

        Random random = new Random();
        int random_value = random.nextInt(3) + 1;
        switch (random_value) {
            case 1:
                System.out.println(Constantes.DEMANDEKH7);
                System.out.print("-Khorne : ");
                System.out.println(Constantes.MIRACLEKH1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEKH8);
                System.out.print("-Khorne : ");
                System.out.println(Constantes.MIRACLEKH2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEKH9);
                System.out.print("-Khorne : ");
                System.out.println(Constantes.MIRACLEKH3);
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
                System.out.println(Constantes.DEMANDEKH1);
                System.out.print("-Khorne : ");
                System.out.println(Constantes.ECOUTEKH);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEKH5);
                System.out.print("-Khorne : ");
                System.out.println(Constantes.ECOUTEKH);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEKH9);
                System.out.print("-Khorne : ");
                System.out.println(Constantes.ECOUTEKH);
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
                System.out.println(Constantes.DEMANDEKH1);
                System.out.print("-Khorne : ");
                System.out.println(Constantes.CONSEILKH1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEKH2);
                System.out.print("-Khorne : ");
                System.out.println(Constantes.CONSEILKH2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEKH3);
                System.out.print("-Khorne : ");
                System.out.println(Constantes.CONSEILKH3);
                break;
            default:
                break;
        }
    }
}
