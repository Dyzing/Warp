package com.company;

import java.util.Random;

public class ConseilKH extends Service implements ConseilInterface{

    @Override
    public void conseilSansRaison() {

        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.println(Constantes.CONSEILKH1);
                break;
            case 2:
                System.out.println(Constantes.CONSEILKH2);
                break;
            case 3:
                System.out.println(Constantes.CONSEILKH3);
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
                System.out.println(Constantes.DEMANDEKH1);
                System.out.println(Constantes.CONSEILKH1);
                break;
            case 2:
                System.out.println(Constantes.DEMANDEKH2);
                System.out.println(Constantes.CONSEILKH2);
                break;
            case 3:
                System.out.println(Constantes.DEMANDEKH3);
                System.out.println(Constantes.CONSEILKH3);
                break;
            default:
                break;
        }
    }
}
