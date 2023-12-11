package com.kodnest.strings;

public class Stringfindsamealpha11 {
	public static void replace(String name1, String name2) {

String newstr1=" ";
String newstr2=" ";
for(int i=0;i<=name1.length()-1;i++)
{
	if(newstr1.contains(name1.charAt(i)+" "))
	{
		newstr1=newstr2+name1.charAt(i);
		
				char []arr1=newstr1.toCharArray();
				char []arr2=newstr2.toCharArray();
			for(int i=0;i<=arr1.length-1;i++)
				{
					for(int j=0;j<=arr2.length-1;j++)
					{
						if(arr1[i]==arr2[j])
						{
							System.out.println(arr2[i]);
						}
					}
				}}

	 
