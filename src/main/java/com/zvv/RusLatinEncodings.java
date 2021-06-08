package com.zvv;

import java.util.stream.Stream;

public enum RusLatinEncodings {
    //Optimal, does not support "Ё"
    RUSSIAN_LATIN_BGN("Russian-Latin/BGN"),
    AZERBAIJANI_LATIN_BGN("Azerbaijani-Latin/BGN"),
    BULGARIAN_LATIN_BGN("Bulgarian-Latin/BGN"),
    CYRILLIC_LATIN("Cyrillic-Latin"),
    CYRL_LATN("Cyrl-Latn"),
    KIRGHIZ_LATIN_BGN("Kirghiz-Latin/BGN"),
    MACEDONIAN_LATIN_BGN("Macedonian-Latin/BGN"),
    MONGOLIAN_LATIN_BGN("Mongolian-Latin/BGN"),
    SERBIAN_LATIN_BGN("Serbian-Latin/BGN"),
    UKRAINIAN_LATIN_BGN("Ukrainian-Latin/BGN"),
    UZBEK_LATIN_BGN("Uzbek-Latin/BGN"),
    AZ_CYRL_AZ_BGN("az_Cyrl-az/BGN"),
    BE_BE_LATN_BGN("be-be_Latn/BGN"),
    BG_BG_LATN_BGN("bg-bg_Latn/BGN"),
    KY_KY_LATN_BGN("ky-ky_Latn/BGN"),
    MK_MK_LATN_BGN("mk-mk_Latn/BGN"),
    MN_MN_LATN_BGN("mn-mn_Latn/BGN"),
    MN_MN_LATN_MNS("mn-mn_Latn/MNS"),
    RU_RU_LATN_BGN("ru-ru_Latn/BGN"),
    SR_SR_LATN_BGN("sr-sr_Latn/BGN"),
    UK_UK_LATN_BGN("uk-uk_Latn/BGN"),
    UZ_CYRL_UZ_BGN("uz_Cyrl-uz/BGN"),
    UZ_CYRL_UZ_LATN("uz_Cyrl-uz_Latn");


    private String name;

    RusLatinEncodings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Stream<RusLatinEncodings> stream() {
        return Stream.of(RusLatinEncodings.values());
    }
}
