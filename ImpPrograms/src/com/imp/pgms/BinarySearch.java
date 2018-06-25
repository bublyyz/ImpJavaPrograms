package com.imp.pgms;

public class BinarySearch {
	
	public static void main(String[] args){
		
		int arr[]={2,4,5,8,10,12,15};
		int l=arr.length;
		System.out.println(l);
		int m=l/2;
		int n=5;
		int low=0,high=l-1;		
		
		while(low<=high){
			if(n==arr[m]){
				System.out.println("Number "+ n +" found at " +(m+1)+ " position");
				break;
			}
			else if (n>arr[m]){
				low=m+1;	
			}
			else{				
				high=m-1;					 			
			}
			m=(low+high)/2;
		}		
	}	
}


