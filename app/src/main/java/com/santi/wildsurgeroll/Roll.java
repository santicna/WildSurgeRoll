package com.santi.wildsurgeroll;

import android.util.Log;

/**
 * Created by Santi on 24/3/2018.
 */

public final class Roll {

    private final String LOG_TAG = Roll.class.getName();

    public static int rollDice(){
        return (int) (Math.random()*101);
    }

}
