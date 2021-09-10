package ru.netology;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<String> dicty(String str) {

        final String[] words = str.split(" ");
        final List<String> wordList = Arrays.asList(words);

        List<String> dict = wordList.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        return dict;
    }

    public static void main(String[] args) {

        final String testStr = "rewt fdjt abyrr ihgfdy odaeqwrk wep abyrr mewfhre ksdeewq abyrr hsdfl gfdsgq rewt";

        List<String> test = dicty(testStr);
        test.forEach(System.out::println);


    }
}
