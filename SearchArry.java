package Homework06;
import java.util.*;
public class SearchArry {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter array element");
	
	int arr[]=new int[4];
	System.out.println("Enter ele to search");
	int n=sc.nextInt();
	int pos=-1;
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		if(arr[i]==n)
		{
			pos=arr[i];
			System.out.println("the search ele is ="+ pos);
			
		}
	}
	
	
	}
		
	
}
