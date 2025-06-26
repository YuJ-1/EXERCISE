package com.bookmarket.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bookmarket.dto.User;
import com.bookmarket.session.ApplicationSession;

public class MainView extends View {

	@Override
	public Map<String, Object> excute(Map<String, Object> params) {
		String menu = null;
		Scanner input = new Scanner(System.in);
		
		User loginUser 
		= (User)ApplicationSession.getSession().getAttribute("loginUser");
		
		System.out.println(loginUser.getId()+"�� �ȳ��ϼ���.");
		System.out.println("��ȭ��ȣ : "+loginUser.getPhone());
		System.out.println("��� : "+loginUser.getAuthority());
		
		
		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";
		System.out.println("***********************************************");
		System.out.println("\t" + greeting);
		System.out.println("\t" + tagline);
		System.out.println("***********************************************");
		System.out.println(" 1. �� ���� Ȯ���ϱ� \t\t4. �ٱ��Ͽ� �׸� �߰��ϱ�");
		System.out.println(" 2. ��ٱ��� ��ǰ ��� ���� \t5. ��ٱ����� �׸� ���� ���̱�");
		System.out.println(" 3. ��ٱ��� ���� \t\t6. ��ٱ����� �׸� �����ϱ�");
		System.out.println(" 7. ������ ǥ���ϱ� \t\t8. ����");
		System.out.println("***********************************************");
		
		
		System.out.print("�޴� ��ȣ : ");
		menu = input.nextLine();
		System.out.println(menu + "���� �����߽��ϴ�");
		
		Map<String,Object> dataMap = new HashMap<String,Object>();
		
		dataMap.put("menu",menu);
		return dataMap;
	}

}
