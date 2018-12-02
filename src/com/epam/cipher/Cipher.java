package com.epam.cipher;

import java.lang.reflect.Array;

public class Cipher {
    private String Encode(String input, String keyword) {
        char[] characters = new char[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И',
                'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С',
                'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ',
                'Э', 'Ю', 'Я', ' ', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', '0'};
        int N = characters.length;
        input = input.toUpperCase();
        keyword = keyword.toUpperCase();
        String result = "";
        int keyword_index = 0;
        for (char symbol : input.toCharArray()) {
            int c = (Array.getInt(characters, symbol) + Array.getInt(characters, keyword.indexOf(keyword_index))) % N;
            result += characters[c];
            keyword_index++;
            if ((keyword_index + 1) == keyword.length())
                keyword_index = 0;
        }
        return result;
    }
}
