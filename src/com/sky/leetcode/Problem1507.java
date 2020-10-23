package com.sky.leetcode;

public class Problem1507 {
    public String reformatDate(String date) {
    	String[] splitDate = date.split(" ");
    	String year = splitDate[2];
    	String[] months = 
    			{"Jan", "Feb", "Mar", "Apr", 
    			"May", "Jun", "Jul", "Aug", 
    			"Sep", "Oct", "Nov", "Dec"};
    	String month = "";
    	for (int i = 0; i < 12; ++i) {
    		if (months[i].equals(splitDate[1]))
    			month = i + 1 < 10 ? "0" + (i + 1) : "" + (i + 1);
    	}
    	String day = (splitDate[0].length() == 3 ? "0" : "") 
    			+ splitDate[0].substring(0, splitDate[0].length() - 2);
    	return year + "-" + month + "-" + day;
    }
}
