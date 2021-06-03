package com.zvv;

import com.ibm.icu.text.Transliterator;

import java.util.Enumeration;

public class Translit {

    public static void main(String[] args) {
        String input_ru = "Привет Мир";

        String input_en = "Hello world";

        //var CYRILLIC_TO_LATIN = "Latin-Russian/BGN";
        //var CYRILLIC_TO_LATIN = "Russian-Latin/BGN";

        Enumeration<String> availableIDs = Transliterator.getAvailableIDs();
        availableIDs.asIterator().forEachRemaining(id -> {
            Transliterator toLatinTrans = Transliterator.getInstance(id);
            String result_ru = toLatinTrans.transliterate(input_ru);
            String result_en = toLatinTrans.transliterate(input_en);
            System.out.println(id + " : " +input_ru + " -> " + result_ru);
            System.out.println(id + " : " +input_en + " -> " + result_en);
            System.out.println();
        });
    }

    private void printTransliteratorIds(){
        Enumeration<String> availableIDs = Transliterator.getAvailableIDs();
        availableIDs.asIterator().forEachRemaining(System.out::println);
    }
}
