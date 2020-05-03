package com.example.spring.basics.springbasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SelectionSort implements SortingAlgorithem {

	@Override
	public void sort(Integer[] inputArray) {
		// Not Concentrating on the logic.
	}
}
