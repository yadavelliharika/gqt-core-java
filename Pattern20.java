package com.gqt.corejava.staticsegment;
import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=n*n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(count+" ");
				count++;
			}System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
