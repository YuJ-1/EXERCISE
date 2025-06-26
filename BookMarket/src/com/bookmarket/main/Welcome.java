package com.bookmarket.main;

import com.bookmarket.controller.Controller;
import com.bookmarket.controller.LoginController;
import com.bookmarket.controller.MainController;

public class Welcome {
	
	public static void main(String[] args) {
		Controller login = new LoginController();		
		Controller main = new MainController();
		
		try {
			login.execute(null);
			
			while(true) main.execute(null);
			
		} catch (Exception e) {
			System.out.println("���α׷��� ������ �� �����ϴ�.");
		}
	}
	

	
}
