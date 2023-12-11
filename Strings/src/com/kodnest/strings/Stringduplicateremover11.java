package com.kodnest.strings;

public class Stringduplicateremover11 {

	    public String removeDuplicates(String str) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            if (result.indexOf(String.valueOf(currentChar)) == -1) {
	                result.append(currentChar);
	            }
	        }
	        return result.toString();
	    }

	}


