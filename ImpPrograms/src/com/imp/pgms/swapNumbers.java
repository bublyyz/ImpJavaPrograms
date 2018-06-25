package com.imp.pgms;

public class swapNumbers {
	
	public static void main(String[] args){
		
		int arr[]={1,1,2,1,2,0,2,0,1,0,2,0};
		int l=arr.length;
		int i,j,temp;
		
		for(i=0;i<l;i++){
			System.out.print(arr[i]+",");
		}
		
		for(i=0;i<=l;i++){
			for(j=i+1;j<l;j++){
				if(arr[i]>=arr[j]){					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}
			}		
		}		
		
		System.out.println();
		for(i=0;i<l;i++){
			System.out.print(arr[i]+",");
		}
	}

}
