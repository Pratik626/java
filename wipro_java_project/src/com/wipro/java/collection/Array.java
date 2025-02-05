package com.wipro.java.collection;



class Array {
	public static void main(String[] args) {
		// declare an Array of integer.
		int[] arr;
		
		
		arr= new int[7];// 0,1,2,...6;: 0 index format/
		//1 index format:occasional:informed
		
		//initialize the first element of an array
		arr[0]= 100;
		
		
		//initialize the second element of the array
		arr[1] = 200;
		
		//and so on...
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		arr[5] = 600;
		arr[6] = 700;
		
		
		//accessing the element of the specified array 
		//0 to n-1th index, n=size of the array
		for( int i=0; i< arr.length; i++) {
			System.out.println("Element at index " +i+ " : " +arr[i] );
		}
	}
}
