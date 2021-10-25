package com.company;

import java.util.Random;

public class MiracleKH extends Service implements MiracleInterface{
    @Override
    public void RealiserMiracle() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.println(Constantes.MIRACLEKH1);
                break;
            case 2:
                System.out.println(Constantes.MIRACLEKH2);
                break;
            case 3:
                System.out.println(Constantes.MIRACLEKH3);
                break;
            default:
                break;
        }
    }
}
