package com.pj.character;

import java.util.Arrays;

public class CharacterManipulations {

	public static void main(String[] args) {
		System.out.println(findLength("Parjanya"));
		System.out.println(indexOf('y', "Parjanya"));
		System.out.println(reverse("Parjanya"));

	}
	
	static int findLength(String text)
	{
		char[] arr = text.toCharArray();
		return arr.length;
	}
	
	static int indexOf(char c,String text)
	{
		int index=-1;
		int ctr=1;
		for(char x : text.toCharArray())
		{
			if(x==c)
				{
				index=ctr;
				return index;
				}
					
			ctr++;
		}
		return index;
	}

	static String reverse(String text)
	{
		char arr[]= text.toCharArray();
		int i=0;int j=arr.length-1;
		while(i<j)
		{
			char temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		String s= Arrays.toString(arr);
		s=s.substring(1, s.length()-1);
		s=s.replace(',', '\0');
		return s;
	}
}
