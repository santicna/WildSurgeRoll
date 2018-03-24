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

    public static String getEffect(int roll){
        switch (roll){
            case 0:case 1:case 2:
                return "You win";
            case 3:case 4: case 5:
                return "You lose";
            default:
                return "I dunno try gettin' a low one";
        }
    }

}
