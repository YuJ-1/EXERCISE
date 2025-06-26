package com.bookmarket.controller;

import java.util.Map;
import java.util.Scanner;

import com.bookmarket.view.MainView;
import com.bookmarket.view.View;

public class MainController extends Controller {
	private View view = new MainView();

	@Override
	public void execute(Map<String, Object> request) throws Exception {
		
		Map<String, Object> dataMap = view.excute(null);

		String menu = (String) dataMap.get("menu");
		
		Controller cont = HandlerMapper.getInstance().getController(menu);
		
		if(cont==null) {
			System.out.println("�޴������� �߸��Ǿ����ϴ�.");
		}else {
			cont.execute(null);
		}
		System.out.println("\n���͸� ��������.");
		new Scanner(System.in).nextLine();
	}

}
