package com.jdlx.blogs.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;

import com.jdlx.blogs.base.BaseDaoImpl;
import com.jdlx.blogs.dao.IUserDao;
import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;
import com.jdlx.blogs.response.ReturnStringResponse;
import com.jdlx.blogs.utils.JDBCUtil;

/**
 * 
 * @Title: UserDaoImpl
 * @Description: 用户 Dao实现
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午5:56:25
 */
@SuppressWarnings("unchecked")
public class UserDaoImpl extends BaseDaoImpl implements IUserDao {
	String sql = null;
	ResultSet rs = null;

	@Override
	public LoginResponse login(String phoneNumber, String loginPassword) {
		// TODO 根据传入的用户登录账号和密码查询数据库，是否有数据，有添加到响应对象中，无则不进行添加，直接返回响应对象。
		LoginResponse loginResponse = new LoginResponse();
		User user = new User();
		System.out.println("数据库操作，查询用户。获取到的数据 phoneNumber = " + phoneNumber
				+ "    loginPassword = " + loginPassword);
		
		sql = "select * from blogs_user where phoneNumber='" + phoneNumber
				+ "' and loginPassword='" + loginPassword + "'";
		rs = JDBCUtil.executeQuery(sql);
		try {
			while (rs.next()) {
				user.setId(rs.getLong(1));
				user.setNickName(rs.getString(2));
				user.setName(rs.getString(3));
				user.setBirthday(rs.getDate(4));
				user.setGender(rs.getString(5));
				user.setProvince(rs.getString(6));
				user.setCity(rs.getString(7));
				user.setCounty(rs.getString(8));
				user.setAddress(rs.getString(9));
				user.setPhoneNumber(rs.getString(10));
				user.setEmailAddress(rs.getString(11));
				user.setLoginID(rs.getString(12));
				user.setLoginPassword(rs.getString(13));
				user.setIDCardNumber(rs.getString(14));
				user.setWeChatAccount(rs.getString(15));
				user.setQQAccount(rs.getString(16));
				user.setImageUrl(rs.getString(17));
				user.setRegisterTime(rs.getDate(18));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, JDBCUtil.getPs(), JDBCUtil.getConnection());
		}
		loginResponse.setData(user);
		return loginResponse;
	}

	@Override
	public boolean register(User user) {
		sql = "insert into blogs_user (phoneNumber,loginPassword) VALUES ('"
				+ user.getPhoneNumber()
				+ "','" + user.getLoginPassword() + "')";
		return this.insert(sql);
	}

}
