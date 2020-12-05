package com.example.mipt_pd5;

public class Constants {
    private Constants() { }
    public static final String STAT_DATA_URL = "https://osp.stat.gov.lt/praejusios-paros-covid-19-statistika";
    public static final String REGEX_SYNTAX = "Per praėjusią parą patvirtintų naujų atvejų konkretiems žmonėms skaičius: (?<CovidCount>.+\\d)<\\/span>";
    public static final String INFO_FORMATTED = "{INFO}: ";
    public static final String ANNOUNCE_LT = "Per praėjusią parą naujai patvirtinti Covid-19 atvejai: ";
}
