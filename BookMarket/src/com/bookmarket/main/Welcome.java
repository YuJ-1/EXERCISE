package com.bookmarket.main;

import java.util.Scanner;

import com.bookmarket.controller.UserController;

public class Welcome {

	UserController ucont = new UserController();
	
	public static void main(String[] args) {
		Welcome w = new Welcome();
		w.ucont.login();
	}
	
	public void start() {

		Scanner input = new Scanner(System.in);
		String userName = null;
		String userMobile = null;
		String menu = null;

		System.out.print("�̸� : ");
		userName = input.nextLine();

		System.out.print("����ó : ");
		userMobile = input.nextLine();

		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";

		do {
			System.out.println("***********************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			menuIntroduction();

			System.out.print("�޴� ��ȣ : ");
			menu = input.nextLine();
			System.out.println(menu + "���� �����߽��ϴ�");

			switch (menu) {
			case "1":
				menuGuestInfo(userName, userMobile);
				break;
			case "2":
				menuCartItemList();
				break;
			case "3":
				menuCartClear();
				break;
			case "4":
				menuCartAddItem(mBook);
				break;
			case "5":
				menuCartRemoveItemCount();
				break;
			case "6":
				menuCartRemoveItem();
				break;
			case "7":
				menuCartBill();
				break;
			case "8":
				menuExit();
				break;
			default:
				System.out.println("�޴� ������ �ùٸ��� �ʽ��ϴ�.");
			}
		} while (!menu.equals("8"));
	}

	public static void menuIntroduction() {
		System.out.println("***********************************************");
		System.out.println(" 1. �� ���� Ȯ���ϱ� \t\t4. �ٱ��Ͽ� �׸� �߰��ϱ�");
		System.out.println(" 2. ��ٱ��� ��ǰ ��� ���� \t5. ��ٱ����� �׸� ���� ���̱�");
		System.out.println(" 3. ��ٱ��� ���� \t\t6. ��ٱ����� �׸� �����ϱ�");
		System.out.println(" 7. ������ ǥ���ϱ� \t\t8. ����");
		System.out.println("***********************************************");
	}


	

	public static void menuExit() {
		System.out.println("���α׷��� �����մϴ�.");
	}

	
}
