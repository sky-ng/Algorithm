package com.sky.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem966 {
	
	private Set<String> word_perfect;
	private Map<String, String> word_lowerCase;
	private Map<String, String> word_vowel;
	
    public String[] spellchecker(String[] wordlist, String[] queries) {
    	word_perfect = new HashSet<>();
    	word_lowerCase = new HashMap<>();
    	word_vowel = new HashMap<>();
    	for (String word : wordlist) {
    		word_perfect.add(word);
    		word_lowerCase.putIfAbsent(word.toLowerCase(), word);
    		word_vowel.putIfAbsent(delVowel(word.toLowerCase()), word);
    	}
    	String[] ans = new String[queries.length];
    	int idx = 0;
    	for (String word : queries) {
    		ans[idx++] = solve(word);
    	}
    	return ans;
    }
    
    private String solve(String word) {
    	String lowerCase = word.toLowerCase();
    	if (word_perfect.contains(word)) return word;
    	else if (word_lowerCase.get(lowerCase) != null) 
    		return word_lowerCase.get(lowerCase);
    	else if (word_vowel.get(delVowel(lowerCase)) != null)
    		return word_vowel.get(delVowel(lowerCase));
    	else return "";
	}

	private boolean isVowel(char c) {
    	return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    private String delVowel(String word) {
    	StringBuilder sb = new StringBuilder();
    	for (char c : word.toCharArray()) {
    		if (isVowel(c)) {
    			sb.append("*");
    		} else {
    			sb.append(c);
    		}
    	}
    	return sb.toString();
    }
}
