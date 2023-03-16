//program to reverse a string
package Assign;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str1="";
        System.out.println("enter a string:");
        String str=sc.nextLine();
     for(int i=0; i<str.length(); i++)
     {
    	 str1=str.charAt(i)+str1;
     }
     System.out.println("Reversed string: "+str1);
     sc.close();
	}

}
