package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Psykers {

    public static AtomicInteger genId = new AtomicInteger();
    private int id;

    public Psykers(int id) {
        this.id = genId.getAndIncrement();
    }

}
