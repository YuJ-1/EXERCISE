package com.bookmarket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookmarket.datasource.OracleDataSource;
import com.bookmarket.dto.User;

public class OracleUserDAOImpl implements OracleUserDAO {

	private OracleDataSource dataSource = OracleDataSource.getInstance();

	@Override
	public List<User> selectUserList() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();

			List<User> userList = new ArrayList<User>();

			stmt = conn.createStatement();
			String sql = "select * from member";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				User user = new User();
				user.setAddress(rs.getString("address"));
				user.setAuthority(rs.getString("authority"));
				user.setEmail(rs.getString("email"));
				user.setId(rs.getString("id"));
				user.setPhone(rs.getString("phone"));
				user.setPwd(rs.getString("pwd"));

				userList.add(user);
			}

			return userList;
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}

	@Override
	public User selectUserByID(String id) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = dataSource.getConnection();
			User user = null;

			stmt = conn.createStatement();
			String sql = "select * from member where id = '" + id + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				user = new User();
				user.setAddress(rs.getString("address"));
				user.setAuthority(rs.getString("authority"));
				user.setEmail(rs.getString("email"));
				user.setId(rs.getString("id"));
				user.setPhone(rs.getString("phone"));
				user.setPwd(rs.getString("pwd"));
			}

			return user;
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}

	@Override
	public void insertUser(User user) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();

			String sql = "insert into member(id,pwd,phone,email,authority,address)" + " values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPwd());
			pstmt.setString(3, user.getPhone());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getAuthority());
			pstmt.setString(6, user.getAddress());

			pstmt.executeUpdate();

		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

	@Override
	public void updateUser(User user) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection();

			String sql = "update " + " member" + " set" + " pwd=?, address=?, authority=?, phone=?, email=? "
					+ " where id=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getPwd());
			pstmt.setString(2, user.getAddress());
			pstmt.setString(3, user.getAuthority());
			pstmt.setString(4, user.getPhone());
			pstmt.setString(5, user.getEmail());
			pstmt.setString(6, user.getId());

			pstmt.executeUpdate();

		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

	@Override
	public void deleteUser(String id) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = dataSource.getConnection();

			stmt = conn.createStatement();
			String sql = "delete" + " from member" + " where id='" + id + "'";

			stmt.executeUpdate(sql);

		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}

	}

}
