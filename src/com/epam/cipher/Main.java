package com.epam.cipher;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String key = "ру";
        final Vigenener v = new Vigenener(1072, 33);
        String enc = v.encrypt("трали вали ", key);
        System.out.println(enc);
        String dec = v.decrypt(enc, key);
        System.out.println(dec);
    }

}
