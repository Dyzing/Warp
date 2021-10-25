package com.company;

import java.util.Random;

public abstract class ConseilED extends Service implements ConseilInterface {


    @Override
    public void conseilSansRaison() {

        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.println(Constantes.CONSEILED1);
                break;
            case 2:
                System.out.println(Constantes.CONSEILED2);
                break;
            case 3:
                System.out.println(Constantes.CONSEILED3);
                break;
            default:
                break;
        }
    }

    @Override
    public void conseilFonctionDemande() {


        Random random = new Random();
        int random_value = random.nextInt(3) + 1; switch (random_value) {
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
