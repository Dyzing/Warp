package com.company;

import java.util.Random;

public class ConseilCN extends Service implements ConseilInterface{

    @Override
    public void conseilSansRaison() {

        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.println(Constantes.CONSEILCN1);
                break;
            case 2:
                System.out.println(Constantes.CONSEILCN2);
                break;
            case 3:
                System.out.println(Constantes.CONSEILCN3);
                break;
            default:
                break;
        }
    }

    @Override
    public void conseilFonctionDemande() {


        Random random = new Random();
        int random_value = random.nextInt(3) + 1;
        switch (random_value) {
            case 1:
                System.out.println(Constantes.DEMANDECN1);
                System.out.println(Constantes.CONSEILCN1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDECN2);
                System.out.println(Constantes.CONSEILCN2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEED3);
                System.out.println(Constantes.CONSEILCN3);
                break;
            default:
                break;
        }
    }
}
