package com.santi.wildsurgeroll;

import android.content.res.Resources;
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
    public static int getEffect(int roll){
        switch (roll){
            case 1:case 2:
                return R.string.r01_02;
            case 3:case 4:
                return R.string.r03_04;
            case 5:case 6:
                return R.string.r05_06;
            case 7:case 8:
                return R.string.r07_08;
            case 9:case 10:
                return R.string.r09_10;
            case 11:case 12:
                return R.string.r11_12;
            case 13:case 14:
                return R.string.r13_14;
            case 15:case 16:
                return R.string.r15_16;
            case 17:case 18:
                return R.string.r17_18;
            case 19:case 20:
                return R.string.r19_20;
            case 21:case 22:
                return R.string.r21_22;
            case 23:case 24:
                return R.string.r23_24;
            case 25:case 26:
                return R.string.r25_26;
            case 27:case 28:
                return R.string.r27_28;
            case 29:case 30:
                return R.string.r29_30;
            case 31:case 32:
                return R.string.r31_32;
            case 33:case 34:
                return R.string.r33_34;
            case 35:case 36:
                return R.string.r35_36;
            case 37:case 38:
                return R.string.r37_38;
            case 39:case 40:
                return R.string.r39_40;
            case 41:case 42:
                return R.string.r41_42;
            case 43:case 44:
                return R.string.r43_44;
            case 45:case 46:
                return R.string.r45_46;
            case 47:case 48:
                return R.string.r47_48;
            case 49:case 50:
                return R.string.r49_50;
            case 51:case 52:
                return R.string.r51_52;
            case 53:case 54:
                return R.string.r53_54;
            case 55:case 56:
                return R.string.r55_56;
            case 57:case 58:
                return R.string.r57_58;
            case 59:case 60:
                return R.string.r59_60;
            case 61:case 62:
                return R.string.r61_62;
            case 63:case 64:
                return R.string.r63_64;
            case 65:case 66:
                return R.string.r65_66;
            case 67:case 68:
                return R.string.r67_68;
            case 69:case 70:
                return R.string.r69_70;
            case 71:case 72:
                return R.string.r71_72;
            case 73:case 74:
                return R.string.r73_74;
            case 75:case 76:
                return R.string.r75_76;
            case 77:case 78:
                return R.string.r77_78;
            case 79:case 80:
                return R.string.r79_80;
            case 81:case 82:
                return R.string.r81_82;
            case 83:case 84:
                return R.string.r83_84;
            case 85:case 86:
                return R.string.r85_86;
            case 87:case 88:
                return R.string.r87_88;
            case 89:case 90:
                return R.string.r89_90;
            case 91:case 92:
                return R.string.r91_92;
            case 93:case 94:
                return R.string.r93_94;
            case 95:case 96:
                return R.string.r95_96;
            case 97:case 98:
                return R.string.r97_98;
            case 99:case 100:
                return R.string.r99_100;
            default:
                return R.string.wrong_roll;
        }
    }
}
