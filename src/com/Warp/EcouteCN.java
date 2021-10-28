package com.Warp;

import com.Constantes.Constantes;

import java.util.Random;

public class EcouteCN extends Service implements EcouteInterface{
    @Override
    public void ecouterRealiserMiracle() {

        Random random = new Random();
        int random_value = random.nextInt(3) + 1;
        switch (random_value) {
            case 1:
                System.out.println(Constantes.DEMANDECN7);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.MIRACLECN1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDECN8);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.MIRACLECN2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDECN9);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.MIRACLECN3);
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
                System.out.println(Constantes.DEMANDECN1);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.ECOUTECN);
                break;
            case 2:
                System.out.println(Constantes.DEMANDECN5);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.ECOUTECN);
                break;
            case 3:
                System.out.println(Constantes.DEMANDECN9);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.ECOUTECN);
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
                System.out.println(Constantes.DEMANDECN1);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.CONSEILCN1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDECN2);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.CONSEILCN2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDECN3);
                System.out.print("-Coloknee : ");
                System.out.println(Constantes.CONSEILCN3);
                break;
            default:
                break;
        }
    }
}
