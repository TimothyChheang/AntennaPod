package com.polytechnique.stringManip;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class StringManipUnitTests {
    @Test
    public void reverse_isCorrect() {
        String palindrome = "are we not pure no sir panamas moody noriega brags it is garbage irony dooms a man a prisoner up to new era".replaceAll(" ", "");
        assertEquals(StringManip.getReverse(palindrome), palindrome);
    }

    @Test
    public void hash_isCorrect() {
        String string = "123456789";
        String hash = String.valueOf(string.hashCode());
        assertEquals(StringManip.getHash(string), hash);
    }
}
