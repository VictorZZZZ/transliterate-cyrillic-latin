package com.zvv;

import com.ibm.icu.text.Transliterator;

public class TranslitUtil {

    private static final Transliterator TRANSLITERATOR = Transliterator.getInstance(RusLatinEncodings.RUSSIAN_LATIN_BGN.getName());

    public static String transliterate(String inputRu){
        return TRANSLITERATOR.transliterate(inputRu);
    }

    public static String transliterate(String input, RusLatinEncodings id){
        return Transliterator.getInstance(id.getName()).transliterate(input);
    }

    public static void printInAllEncodings(String input){
        RusLatinEncodings.stream().forEach(encoding -> {
            System.out.printf("%s - ", encoding);
            System.out.println(transliterate(input, encoding));
        });
    }
}
