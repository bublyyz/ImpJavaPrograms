package com.imp.pgms;

public class Max_Two_Numbers {

	public static void main(String[] args) {
		int[] arr={-2,-5,-3,-17,-8,-9};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}				
			}
		}
		//Print the array in Descending order
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}

		//Products of Two max numbers
		System.out.println(arr[0]*arr[1]);

	}

}
