package com.company;

import java.util.Random;

public abstract class CataclysmeED implements  CataclysmeInterface{

    @Override
    public void RealiserCataclysmeSansRaison() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.println(Constantes.MIRACLEED1);
            case 2:
                System.out.println(Constantes.MIRACLEED2);
            case 3:
                System.out.println(Constantes.MIRACLEED3);
        }
    }

    @Override
    public void RealiserCataclysmeFonctionDemande() {

    }

    @Override
    public void RealiserCataclysmeEtMiracle() {

    }
}
