package com.nitu.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> evenNoSet=new LinkedHashSet<Integer>();
		evenNoSet.add(2);
		evenNoSet.add(4);
		evenNoSet.add(6);
		evenNoSet.add(8);
		
		Iterator<Integer> itr=evenNoSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
