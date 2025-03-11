package com.kata.quix;


public class QuixBean {


	public static String transformerNumber(int number) {
        StringBuilder result = new StringBuilder();
       
    // divisible par  
        if (number % 3 == 0)
            result.append("FOO");
        if (number % 5 == 0) 
        	result.append("BAR");

    //Contient
        
        String numberStr = String.valueOf(number);
        for (char c : numberStr.toCharArray()) {
            if (c == '3') {
                result.append("FOO");
            }
            if (c == '5' ) {
                result.append("BAR");
            }
            if (c == '7') {
                result.append("QUIX");	
            }
        }
       
        return result.length() > 0 ? result.toString()  : numberStr;
    }

}