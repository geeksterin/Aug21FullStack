package com.geekster.sept21;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int[] revArr = new int[arr.length];

		int x = 0;
		
		for(int i= arr.length-1; i>=0; i--) {

			revArr[x] = arr[i];			
			x++;
		}
		for(int i=0; i<revArr.length; i++) {
			System.out.print(revArr[i]);
		}
		
	}
}
