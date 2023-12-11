package com.kodnest.strings;

public class Stringrever4 {

	public static void main(String[] args) {
		String s1="pratheek", nstr=" ";
		char ch;
		System.out.println("original word:");
		System.out.println("pratheek");
		for(int i=0; i<s1.length(); i++)
		{
			ch=s1.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("reversed word:"+ nstr);
		}
	}


