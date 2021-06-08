package com.zvv.examples;

import com.zvv.TranslitUtil;

import java.util.ArrayList;
import java.util.List;

public class UtilsExample {
    private static final List<String> RUSSIAN_HARD_TRANSLIT_PHRASES;
    static{
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("Юлия, съешь ещё этих мягких французских булок из Йошкар-Олы, да выпей алтайского чаю");
        tmp.add("Зато наши космические корабли бороздили просторы вселенной");
        tmp.add("Хабр, ну что ты делаешь? Прекрати");
        tmp.add("Россия, город Йошкар-Ола, улица Яна Крастыня");
        RUSSIAN_HARD_TRANSLIT_PHRASES = tmp;
    }

    public static void main(String[] args) {
        RUSSIAN_HARD_TRANSLIT_PHRASES.forEach(TranslitUtil::printInAllEncodings);
    }
}
