package test;

import java.util.Scanner;

public class ScannerEX {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int inputNum = 0;
		
		try {
			System.out.println("������ �Է��ϼ���.");
			inputNum = Integer.parseInt(scann.nextLine());
			
		}catch(Exception e) {
			System.out.println("���ڰ� �ƴմϴ�.");
			return;
		}
		System.out.println(inputNum);

	}

}
