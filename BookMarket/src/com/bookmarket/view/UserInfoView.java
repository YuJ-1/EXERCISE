package com.bookmarket.view;

import java.util.Map;

import com.bookmarket.dto.User;
import com.bookmarket.session.ApplicationSession;

public class UserInfoView extends View{

	@Override
	public Map<String, Object> excute(Map<String, Object> params) {
		User loginUser 
			= (User)ApplicationSession.getSession().getAttribute("loginUser");
		
		System.out.println("���̵� : "+loginUser.getId());
		System.out.println("�̸��� : "+loginUser.getEmail());
		System.out.println("��ȭ��ȣ : "+loginUser.getPhone());
		System.out.println("��  �� : "+loginUser.getAddress());
		System.out.println("��  �� : "+loginUser.getAuthority());
		
		return null;
	}

}
