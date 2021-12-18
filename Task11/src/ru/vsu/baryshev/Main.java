package ru.vsu.baryshev;

import java.util.HashMap;

public class Main {
    public static String logic(HashMap<String, String> map, String text) {
        String answer = new String();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String str = "" + ch;

            if (!Character.isAlphabetic(ch)) {
                answer = answer + ch;

            } else
                answer = answer + map.get(str);
        }
        return answer;

    }
//    A a B b V v G g D d E e E e
//    ZH zh Z z I i I i K k L l M m
//    N n O o P p R r S s T t U u
//    F f KH kh TS ts CH ch SH sh SHCH shch IE ie
//    Y y E e IU iu IA ia

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(" ", " ");
        map.put("а", "a");
        map.put("А", "A");
        map.put("б", "b");
        map.put("Б", "B");
        map.put("в", "v");
        map.put("В", "V");
        map.put("г", "g");
        map.put("Г", "G");
        map.put("д", "d");
        map.put("Д", "D");
        map.put("е", "e");
        map.put("Е", "E");
        map.put("ё", "e");
        map.put("Ё", "E");
        map.put("ж", "zh");
        map.put("Ж", "ZH");
        map.put("з", "z");
        map.put("З", "Z");
        map.put("и", "i");
        map.put("И", "I");
        map.put("й", "i");
        map.put("Й", "I");
        map.put("к", "k");
        map.put("К", "K");
        map.put("л", "l");
        map.put("Л", "L");
        map.put("м", "m");
        map.put("М", "M");
        map.put("н", "n");
        map.put("Н", "N");
        map.put("о", "o");
        map.put("О", "O");
        map.put("п", "p");
        map.put("П", "P");
        map.put("р", "r");
        map.put("Р", "R");
        map.put("с", "s");
        map.put("С", "S");
        map.put("т", "t");
        map.put("Т", "T");
        map.put("у", "u");
        map.put("У", "U");
        map.put("ф", "f");
        map.put("Ф", "F");
        map.put("х", "kh");
        map.put("Х", "KH");
        map.put("ц", "ts");
        map.put("Ц", "TS");
        map.put("ч", "ch");
        map.put("Ч", "CH");
        map.put("ш", "sh");
        map.put("Ш", "SH");
        map.put("щ", "shch");
        map.put("Щ", "SHCH");
        map.put("ъ", "ie");
        map.put("Ъ", "IE");
        map.put("ы", "y");
        map.put("Ы", "Y");
        map.put("ь", "e");
        map.put("Ь", "E");
        map.put("э", "e");
        map.put("Э", "E");
        map.put("ю", "iu");
        map.put("Ю", "IU");
        map.put("я", "ia");
        map.put("Я", "IA");


        System.out.println(logic(map, "Онлайн сервис транслитерации имени и фамилии для загранпаспорта заменяет буквы русского алфавита буквами латинского алфавита по правилам, установленным приказом МВД России от 27 ноября 2017"));
    }
}
