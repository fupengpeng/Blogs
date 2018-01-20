package com.jdlx.blogs.service.impl;

import javax.annotation.Resource;

import com.jdlx.blogs.dao.IUserDao;
import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;
import com.jdlx.blogs.service.IUserService;


/**
 * 
 * @Title: UserServiceImpl
 * @Description: �û�Serviceʵ��
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����5:53:19
 */
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public LoginResponse login(String loginID, String loginPassword) {
		// TODO Auto-generated method stub
		return userDao.login(loginID,loginPassword);
	}

}
