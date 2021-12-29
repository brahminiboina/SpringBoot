package com.wicore.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringUdeApplication {

	public static void main(String[] args) {
		//BinarySearchImpl b = new BinarySearchImpl(new BubbleSort());
		//BinarySearchImpl b1 = new BinarySearchImpl(new QuickSort());
		//int result = b.binarySearch(new int[] {1,2,5},3);
		//int result1 = b1.binarySearch(new int[] {1,2,5},3);
		//System.out.println("Result--------->"+result);
		ConfigurableApplicationContext appc=  SpringApplication.run(SpringUdeApplication.class, args);
		BinarySearchImpl bsearch = appc.getBean(BinarySearchImpl.class);
		int result = bsearch.binarySearch(new int[] {1,2,5},3);
		System.out.println("Result--------->"+result);
	}
}
