package com.polytechnique.stringManip;

import android.util.Log;

public class StringManip {
    public static String getHash(String string) {
        return String.valueOf(string.hashCode());
    }

    public static String getReverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
