package com.bookmarket.main;

import java.util.Scanner;

public class Welcome {

	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;

	public static void main(String[] args) {
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

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

	public static void menuGuestInfo(String name, String mobile) {
		System.out.println("���� �� ���� : ");
		System.out.println("�̸� " + name + "   ����ó " + mobile);
	}

	public static void menuCartItemList() {
		System.out.println("2. ��ٱ��� ��ǰ ��� ���� :");
	}

	public static void menuCartClear() {
		System.out.println("3. ��ٱ��� ����");
	}

	public static void menuCartAddItem(String[][] book) {
		// System.out.println("4. ��ٱ��Ͽ� �׸� �߰��ϱ� : ");

		bookList(book);

		for (int i = 0; i < NUM_BOOK; i++) {
			for (int j = 0; j < NUM_ITEM; j++)
				System.out.print(book[i][j] + " | ");
			System.out.println("");
		}

		boolean quit = false;

		while (!quit) {
			System.out.print("��ٱ��Ͽ� �߰��� ������ ID�� �Է��ϼ��� :");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();

			boolean flag = false;
			int numId = -1;

			for (int i = 0; i < NUM_BOOK; i++) {
				if (str.equals(book[i][0])) {
					numId = i;
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("�ٽ� �Է��� �ּ���");
				continue;
			}
			
			System.out.println("��ٱ��Ͽ� �߰��ϰڽ��ϱ�? Y | N ");
			str = input.nextLine();
			if (str.toUpperCase().equals("Y")) {
				System.out.println(book[numId][0] + " ������ ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
			}
			quit = true;

		}
	}

	public static void menuCartRemoveItemCount() {
		System.out.println("5. ��ٱ����� �׸� ���� ���̱�");
	}

	public static void menuCartRemoveItem() {
		System.out.println("6. ��ٱ����� �׸� �����ϱ�");

	}

	public static void menuCartBill() {
		System.out.println("7. ������ ǥ���ϱ�");
	}

	public static void menuExit() {
		System.out.println("���α׷��� �����մϴ�.");
	}

	public static void bookList(String[][] book) {
		book[0][0] = "ISBN1234";
		book[0][1] = "���� ���� JSP �� ���α׷���";
		book[0][2] = "27000";
		book[0][3] = "�۹̿�";
		book[0][4] = "�ܰ躰�� ���θ��� �����ϸ� ���� JSP �� ���α׷��� ";
		book[0][5] = "IT������";
		book[0][6] = "2018/10/08";

		book[1][0] = "ISBN1235";
		book[1][1] = "�ȵ���̵� ���α׷���";
		book[1][2] = "33000";
		book[1][3] = "���糲";
		book[1][4] = "�ǽ� �ܰ躰 ������ ���丵!";
		book[1][5] = "IT������";
		book[1][6] = "2022/01/22";

		book[2][0] = "ISBN1236";
		book[2][1] = "��ũ��ġ";
		book[2][2] = "22000";
		book[2][3] = "����";
		book[2][4] = "��ǻ�� ������ Ű��� ��� �ڵ�";
		book[2][5] = "��ǻ���Թ�";
		book[2][6] = "2019/06/10";
	}
}
