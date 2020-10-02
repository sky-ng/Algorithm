package com.sky.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem929 {
	
	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(new Problem929().numUniqueEmails(emails));
	}
	
    public int numUniqueEmails(String[] emails) {
    	Set<String> emailSet = new HashSet<>();
        for (String email:emails) {
        	emailSet.add(email.split("@")[0].replace(".", "").split("\\+")[0]+"@"+email.split("@")[1]);
        }
    	return emailSet.size();
    }
}
