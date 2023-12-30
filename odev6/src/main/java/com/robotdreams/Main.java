package com.robotdreams;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        String text = "Yildiz Tek Üniversitesi"; // Yildiz and Üniversitesi includes dublicate chars
      //  String text = "Pat Tek Küt";    // no dublicate char word
        List<String> words = SplitWords(text);
        System.out.println("Metindeki kelimeler: " + words);
        String newWord = getUniqueWordFromChars(words);
        System.out.println("yenimetin: " + newWord);

    }

    public static List<String> SplitWords(String text) {
        List<String> words = new ArrayList<>();

        // Split the text into words
        String[] wordArray = text.split(" ");  // split word by comma

        // Add the words to the list
        Collections.addAll(words, wordArray);
        return words;
    }

    public static String getUniqueWordFromChars(List<String> stringList){
        List<Set<Character>> setList = new ArrayList<>();
        List<Character> flatSetList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String text : stringList)
        {
            Set<Character> uniqueCharacters = new HashSet<>();
            for (char c : text.toCharArray())
                uniqueCharacters.add(c);
            if(text.length() > uniqueCharacters.size())  // check word includes duplicate chars
            {
                setList.add(uniqueCharacters);
                System.out.println("Duplicate char included word: " + text);
            }
            if(setList.size() == 2) // 2 text found duplicate chars included
                break;
        }

        setList.forEach(flatSetList::addAll);  // merge char nested list to single char list
        for(char c : flatSetList)
            sb.append(c);  // convert string new word

        return sb.toString();
    }
}