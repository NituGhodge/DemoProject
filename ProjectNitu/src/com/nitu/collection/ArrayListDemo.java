package com.nitu.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("radha","jay","aryan","rina");
		for(String str:list) {
			System.out.println(str);
		}
			
	}

}
