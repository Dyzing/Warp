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
            case 2:
                System.out.println(Constantes.CONSEILED1);
            case 3:
                System.out.println(Constantes.CONSEILED1);


        }
    }
}
