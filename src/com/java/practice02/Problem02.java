package com.java.practice02;

import java.util.*;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		float average;
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		average = sum / num.length;
		System.out.println(average);
		sc.close();
	}
}
