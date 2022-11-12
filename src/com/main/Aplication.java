package com.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Aplication {

	public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,1,2,2,4,4,5,5,5));
	int altDiziUzunlugu=0;
		for (int i = 0; i < a.size(); i++) {
			int counter=0;
			for (int j = i; j < a.size(); j++) {
				if(a.get(i)==a.get(j) || (a.get(i)+1)==a.get(j)) counter++;				
			}
			if(counter>altDiziUzunlugu) altDiziUzunlugu=counter;		
		}
	System.out.println(altDiziUzunlugu);
	}

}
