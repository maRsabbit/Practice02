package com.java.practice02;

public class Problem05 {
	public static void main(String[] args) {
		int[] lotto_num = new int[6];
		for(int i=0; i<lotto_num.length; i++) {
			lotto_num[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j<i; j++) {
				if(lotto_num[i] == lotto_num[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto_num[i]+"\t");
		}
	}
}
