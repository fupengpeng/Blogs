package com.jdlx.blogs.service.impl;

import javax.annotation.Resource;

import com.jdlx.blogs.dao.IUserDao;
import com.jdlx.blogs.dao.impl.UserDaoImpl;
import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;
import com.jdlx.blogs.response.ReturnStringResponse;
import com.jdlx.blogs.service.IUserService;

/**
 * 
 * @Title: UserServiceImpl
 * @Description: 用户Service实现
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午5:53:19
 */
public class UserServiceImpl implements IUserService {

	private IUserDao userDao = new UserDaoImpl();

	@Override
	public LoginResponse login(String phoneNumber, String loginPassword) {
		return userDao.login(phoneNumber, loginPassword);
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return userDao.register(user);
	}

}
