package com.santi.wildsurgeroll;

import android.util.Log;

/**
 * Created by Santi on 24/3/2018.
 */

public final class Roll {

    private final String LOG_TAG = Roll.class.getName();

    //Return a random number between 1 and 100.
    public static int rollDice(){
        return (int) (Math.random()*100)+1;
    }

    //Return the corresponding effect depending on the number rolled.
    public static String getEffect(int roll){
        switch (roll){
            case 1:case 2:case 3:
                return "You win";
            case 4:case 5: case 6:
                return "You lose";
            default:
                return "I dunno try gettin' a low one";
        }
    }

}
