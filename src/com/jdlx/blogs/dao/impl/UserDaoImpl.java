package com.jdlx.blogs.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.jdlx.blogs.base.BaseDaoImpl;
import com.jdlx.blogs.dao.IUserDao;
import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;


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
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{

	@Override
	public LoginResponse login(String loginID, String loginPassword) {
		// TODO 根据传入的用户登录账号和密码查询数据库，是否有数据，有添加到响应对象中，无则不进行添加，直接返回响应对象。
		LoginResponse loginResponse = new LoginResponse();
		
		//3.写具体的crud操作
        //3-1.条件查询
		String hql = "from User where loginID=? and loginPassword=?";
        Query query = this.getSession().createQuery(hql);
        //3-2.设置条件
        //参数1：? 的位置，从 0 开始    参数2：? 的值
        query.setParameter(0, loginID);
        query.setParameter(1, loginPassword);
        //3-3.调用方法得到结果
        List<User> list = query.list();
        for (User user : list) {
        	loginResponse.setUser(user);
            System.out.println(user.toString());
        }
		
		return loginResponse;
	}



}
