package com.bookmarket.controller;

import java.util.Map;

import com.bookmarket.session.ApplicationSession;

public class ExitController extends Controller{

	@Override
	public void execute(Map<String, Object> request) throws Exception {
		System.out.println("���α׷��� �����մϴ�.");
		ApplicationSession.getSession().removeAttribute("loginUser");
		System.exit(0);
	}

}
