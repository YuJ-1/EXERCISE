package com.bookmarket.datasource;

import com.bookmarket.dto.Book;
import com.bookmarket.dto.User;

public class DataSource {
	
	private static DataSource instance = new DataSource();
	private DataSource() {
		bookList();
		
	}
	public static DataSource getInstance() {
		return instance;
	}
	
	static final int NUM_BOOK = 3;
	
	private Book[] book = new Book[NUM_BOOK];
	public Book[] getBook() {
		return book;
	}

	private void bookList() {
		book[0] =new Book("ISBN1234",
							 "���� ���� JSP �� ���α׷���",
							 27000,
							 "�۹̿�",
							 "�ܰ躰�� ���θ��� �����ϸ� ���� JSP �� ���α׷��� ",
							 "IT������",
							 "2018/10/08");

		book[1] =new Book("ISBN1235",
					      "�ȵ���̵� ���α׷���",
					      33000,
					      "���糲",
					      "�ǽ� �ܰ躰 ������ ���丵!",
					      "IT������",
					      "2022/01/22");

		book[2] =new Book("ISBN1236",
				          "��ũ��ġ",
				          22000,
				          "����",
				          "��ǻ�� ������ Ű��� ��� �ڵ�",
				          "��ǻ���Թ�",
				          "2019/06/10");
		
		User user1 = new User("mimi","mimi","ROLE_ADMIN");
		User user2 = new User("mama","mama","ROLE_USER");
		User user3 = new User("mumu","mumu","ROLE_USER");
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
	}
	
	private User[] users = new User[50];
	
	public User[] getUsers() {
		return users;
	}
	public void setUsers(User[] users) {
		this.users = users;
	}
	
	
}








