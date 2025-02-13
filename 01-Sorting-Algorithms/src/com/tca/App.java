package com.tca;

import java.util.Arrays;
import com.tca.sorts.MySort;

public class App {

	public static void main(String[] args) 
	{
		//int a[] =  {94,125,6,39,10};
		// int a[] = { 55,44,33,22,11};
		int a[] = 	{11,33,22,44,55};
				

		System.out.println("Before Sort : " +  Arrays.toString(a));
		
		//MySort.bubbleSort(a);
		//MySort.imporvedBubbleSort(a);
		//MySort.insertionSort(a);	
		
		MySort.selectionSort(a);	

		System.out.println("After Sort  : " +  Arrays.toString(a));

		
		String data[] = {"PUNE","MUMBAI","DELHI","BANGLORE"};
		System.out.println("Before Sort : " +  Arrays.toString(data));
		
		MySort.bubbleSort(data);
		//MySort.insertionSort(data);
		//MySort.selectionSort(data);
		
		System.out.println("After Sort  : " +  Arrays.toString(data));
	}

}
