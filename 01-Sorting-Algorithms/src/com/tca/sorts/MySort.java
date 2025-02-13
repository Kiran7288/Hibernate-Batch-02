package com.tca.sorts;

/**
 * A utility class that provides various sorting algorithms.
 */
public class MySort 
{
	
	 /**
     * Sorts the given array using the Bubble Sort algorithm.
     *
     * @param a the array to be sorted
     */
	public static void bubbleSort(int a[])
	{
		int  n  = a.length;
		int i;

		for(i=n-1; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				//System.out.println("WELCOME TO TCA");  // 
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]     = a[j+1];
					a[j+1]   =  temp;
				}
			}
		}//for-i
		//System.out.println("Value of i : " + i);
	}
	

	public static void imporvedBubbleSort(int a[])
	{
		int  n  = a.length;
		int i;

		for(i=n-1; i>0; i--)
		{
			boolean flag=true; // Asssuming Array is sorted

			for(int j=0; j<i; j++)
			{
				//System.out.println("WELCOME TO TCA");  // 
				if(a[j]>a[j+1])
				{
					flag = false; // data found  unsorted so contracticting assumption 
					int temp = a[j];
					a[j]     = a[j+1];
					a[j+1]   =  temp;
				}

			}
			if(flag==true)
			{
				break;
			}

		}//for-i

		//System.out.println("Value of i : " + i);
	}
	
	public static void insertionSort(int a[])
    {
    	int n = a.length;
    	int j;

    	for(int i=1; i<n; i++)
    	{
    		int t = a[i];
           
    		for(j=i-1; j>=0; j--)
    		{
    			if(a[j] > t )
    			{
    				a[j+1] =  a[j];   // shift operation
    			}
    			else 
    			{
    				break;
    			}
    		}

    		a[j+1] = t;
    	}

    }
	
	public static void selectionSort(int a[])
	{
		int n =  a.length;

		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]>a[j])
				{
					int t = a[i];
					a[i]  = a[j];
					a[j]  =  t;
				}
			}
		}
	}
	
	public static void selectionSort(String a[])
	{
		//complete this code
		int n =  a.length;

		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				// Swap if elements are out of order based on unicode of characters comparison
				if(a[i].compareTo(a[j])>0)
				{
					String t = a[i];
					a[i]  = a[j];
					a[j]  =  t;
				}
			}
		}
	}

	public static void insertionSort(String a[])
	{
		int n = a.length;
    	int j;

    	for(int i=1; i<n; i++)
    	{
    		String t = a[i];
           
    		for(j=i-1; j>=0; j--)
    		{
    			if(a[j].compareTo(t) > 0 )
    			{
    				a[j+1] =  a[j];   // Shift elements to create the correct position for insertion
    			}
    			else 
    			{
    				break;
    			}
    		}

    		a[j+1] = t;
    	}
	}

	public static void bubbleSort(String a[])
	{
		//complete this code
		
		int  n  = a.length;
		

		for(int i=n-1; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				 // Swap if elements are out of order based on unicode of characters comparison
				if(a[j].compareTo(a[j+1]) > 0 )
				{
					String temp = a[j];
					a[j]     = a[j+1];
					a[j+1]   =  temp;
				}
			}
		}//for-i
		
	}

}
