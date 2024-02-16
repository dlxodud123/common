package common;

import java.util.Scanner;

import TV_.Tv;

public class major_project {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("====전자 제품 선택====\n1. 에어컨\n2. 티비\n3. 안마기\n>>> ");
		int func = sc.nextInt();
		
		switch (func) {
		case 1:
			break;
		case 2:
			Tv t = new Tv();
			t.powerOn();
			t.Sound();
			t.channel();
			break;
		case 3:
			break;
		default:
			break;
		}
	}
}
