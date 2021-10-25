package com.company;

import java.util.Random;

public class MiracleCN extends Service implements  MiracleInterface{
    @Override
    public void RealiserMiracle() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.println(Constantes.MIRACLECN1);
                break;
            case 2:
                System.out.println(Constantes.MIRACLECN2);
                break;
            case 3:
                System.out.println(Constantes.MIRACLECN3);
                break;
            default:
                break;
        }
    }
}
