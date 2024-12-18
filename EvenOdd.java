package Homework06;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the array ");
	int arr[]=new int[6];
	
	
	for(int i=0;i<arr.length;i++) {
		
		
		arr[i]=sc.nextInt();
		if(arr[i]%2==0)	{
		int even[]=arr;
		System.out.println("even number is ="+even[i]);
			
		}
		else {
			int odd1[]=arr;
			System.out.println("odd  number is ="+odd1[i]);
		}
		}
}
}
