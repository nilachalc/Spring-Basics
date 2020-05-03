package com.example.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	private SortingAlgorithem sortingAlgorithem;
	
	public Integer binarySearch(Integer[] inputArray, Integer item) {
		sortingAlgorithem.sort(inputArray);
		System.out.println(sortingAlgorithem);
		// Not Concentrating on the logic.
		return 10;
	}
}
