package com.zvv.examples;

import com.ibm.icu.text.Transliterator;

import java.util.Enumeration;

public class AvailableIdsExample {

    public static void main(String[] args) {
        String input_ru = "Юлия";

        String input_en = "Hello world";

        Enumeration<String> availableIDs = Transliterator.getAvailableIDs();
        availableIDs.asIterator().forEachRemaining(id -> {
            Transliterator toLatinTrans = Transliterator.getInstance(id);
            String result_ru = toLatinTrans.transliterate(input_ru);
            String result_en = toLatinTrans.transliterate(input_en);
            if(!result_ru.contains("Û") && !result_ru.contains("Ю") && !result_ru.contains("л") && !result_ru.contains("и") && !result_ru.contains("ᾶ")) {
                System.out.println(id.toUpperCase().replace("-","_").replace("/","_")+"(\""+ id + "\"), -> " + result_ru);
            }
        });
    }
}
