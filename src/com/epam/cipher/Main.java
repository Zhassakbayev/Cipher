package com.epam.cipher;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String key = "ру";
        final Vigenener v = new Vigenener(1072, 33);
        String enc = v.encrypt("русский", key);
        System.out.println(enc); // ѐеагъыщ
        String dec = v.decrypt(enc, key);
        System.out.println(dec); // русский
    }

}
