package com.demo;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ram","Pooja","Shivam","Omkar");
		for(String s:list) {
			System.out.println(list);
		}
	}

}
