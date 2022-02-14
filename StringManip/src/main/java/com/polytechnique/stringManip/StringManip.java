package com.polytechnique.stringManip;

import android.util.Log;

public class StringManip {
    public static String getHash(String string) {
        Log.e("IMPORTANT STRINGMANIP", "Called !");
        return String.valueOf(string.hashCode());
    }

    public static String getReverse(String string) {
        Log.e("IMPORTANT STRINGMANIP", "Also Called !");
        return new StringBuilder(string).reverse().toString();
    }
}
