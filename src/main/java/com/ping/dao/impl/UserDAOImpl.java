package com.ping.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.ping.dao.UserDAO;
import com.ping.formBean.RegisterLoginFormBean;
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private DriverManagerDataSource dataSource;
	@Override
	public boolean select(RegisterLoginFormBean formBean) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			Locale.setDefault(Locale.TAIWAN);
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement("select * from users where ACCOUNT = ? And PASSWORD = ?");
			stmt.setString(1, formBean.getAccount());
			stmt.setString(2, formBean.getPassword());
			rset = stmt.executeQuery();
			if (rset.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	}
}
