package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if(sentence.isEmpty()){
            return map;
        }
        String[] words =sentence.toLowerCase().split("\\s+");

        for(String word:words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        return map;
    }

}
