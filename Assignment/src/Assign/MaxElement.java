//program to find max element from array
package Assign;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[] num= new int[] {14,25,56,48,94,1000,22,345};
        int max=num[0];
        System.out.println("Array elements:");
        for(int i=0; i<num.length; i++)
        {
        	System.out.println(+num[i] +",");
        }
        System.out.println();
        for(int i=1; i<num.length; i++)
        {
        	if(num[i]>max)
        	{
        		max=num[i];
        	}
        }
        System.out.println("max element in the array:" +max);
	}

}
