package com.gqt.corejava.staticsegment;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int count=1;
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=n;j++) {
				System.out.print(count+" ");
				count=count+1;
			}
			System.out.println();
		}
		// TODO Auto-generated met

	}

}
