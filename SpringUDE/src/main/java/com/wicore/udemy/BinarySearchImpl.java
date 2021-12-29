package com.wicore.udemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortalg;
	public void setSortalg(SortAlgorithm sortalg) {
		this.sortalg = sortalg;
	}
	
	/*public BinarySearchImpl(SortAlgorithm sortalg) {
		super();
		this.sortalg = sortalg;
	}*/
	public int binarySearch(int[] num, int NumToSearchFor) {
		//BubbleSort bs = new BubbleSort();
		//QuickSort qs = new QuickSort();
	
		int[] sortednumbers = sortalg.sort(num);
		//System.out.println(bs);
		//System.out.println(qs);
		System.out.println("Sort Algorithm--------->" +sortalg);
		System.out.println("Sorted Numbers--------->" +sortednumbers);
		return NumToSearchFor;
		
	}

}
