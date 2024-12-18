package Homework06;
import java.util.*;
public class AcendingOrderArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 5 elements");
	
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
	}
	for(int i=0;i<arr.length;i++) {
	Arrays.sort(arr);
	System.out.println(arr[i]);
	}
}
}
