package com.company;

import java.util.Random;

public class ConseilCG extends Service implements ConseilInterface {

    @Override
    public void conseilSansRaison() {

        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.print("-Cegorach : ");
                System.out.println(Constantes.CONSEILCG1);
                break;
            case 2:
                System.out.print("-Cegorach : ");
                System.out.println(Constantes.CONSEILCG2);
                break;
            case 3:
                System.out.print("-Cegorach : ");
                System.out.println(Constantes.CONSEILCG3);
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
                System.out.println(Constantes.DEMANDECG1);
                System.out.print("-Cegorach : ");
                System.out.println(Constantes.CONSEILCG1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDECG2);
                System.out.print("-Cegorach : ");
                System.out.println(Constantes.CONSEILCG2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDECG3);
                System.out.print("-Cegorach : ");
                System.out.println(Constantes.CONSEILCG3);
                break;
            default:
                break;
        }
    }
}
