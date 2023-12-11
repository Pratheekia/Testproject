package com.kodnest.strings;

public class Stringrevalsubstring11 {

	public static  String stringReverse (String str) {
	char [] arr=str.toCharArray();
	char [] arr1=new char[arr.length];
	int j=arr.length-1;
	for(int i=0;i<=arr.length-1;i++)
	{
		arr1[i]=arr[j];
		j--;
	}
	String newstr=new String(arr1);
	return newstr;
	}
		public static void displaySubstring(String newstr)
		{
			char [] arr=newstr.toCharArray();
			for(int i=0;i<=arr.length-1;i++)
			{
				String temp="";
				for(int j=i;j<=arr.length-1;j++)
				{
					temp=temp+arr[j];
					System.out.println(temp);
				}
			}
		}
	}

	
