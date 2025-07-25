package com.gqt.corejava.staticsegment;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int count=1;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
