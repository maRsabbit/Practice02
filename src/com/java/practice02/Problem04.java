package com.java.practice02;

import java.util.*;

public class Problem04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] coin = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] coin_count = new int[10];
		System.out.print("금액:");int money = sc.nextInt();
		
		for(int i=0; i<coin.length; i++) {
			coin_count[i] = money / coin[i];
			money = money % coin[i];
			System.out.println(coin[i]+"원 : "+coin_count[i]+"개");
		}
		sc.close();
	}
}
