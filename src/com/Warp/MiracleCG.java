package com.Warp;

import com.Constantes.Constantes;

import java.util.Random;

public class MiracleCG extends Service implements MiracleInterface{
    @Override
    public void RealiserMiracle() {
        Random random = new Random();
        int random_value = random.nextInt(3) + 1;

        switch (random_value) {
            case 1:
                System.out.print("-Cegorach : ");
                System.out.println(Constantes.MIRACLECG1);
                break;
            case 2:
                System.out.print("-Cegorach : ");
                System.out.println(Constantes.MIRACLECG2);
                break;
            case 3:
                System.out.print("-Cegorach : ");
                System.out.println(Constantes.MIRACLECG3);
                break;
            default:
                break;
        }
    }
}