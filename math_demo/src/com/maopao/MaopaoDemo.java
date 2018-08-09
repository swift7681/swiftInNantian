package com.maopao;

public class MaopaoDemo {

	public static void main(String[] args) {

		int[] arr=new int[]{3,9,21,2,8,6};
		for(int i=arr.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
