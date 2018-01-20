package com.jdlx.blogs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jdlx.blogs.base.BaseServlet;
import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;
import com.jdlx.blogs.utils.HibernateUtil;

/**
 * 
 * @Title: UserServlet
 * @Description: 用户模块
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午3:26:01
 */
public class UserServlet extends BaseServlet {

	/**
	 * 
	 * @Description: 登录
	 *               http://localhost:8080/Blogs/UserServlet?method=login&account
	 *               =zhangsan&password=123456
	 * @Title: login
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 *             String
	 */
	public String login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.获取到客户端传递过来的用户账号和密码
		String loginID = request.getParameter("account");
		String loginPassword = request.getParameter("password");
		// 2.判断用户是否登录成功
		
		LoginResponse loginResponse = userService.login(loginID,loginPassword);
		
		
//		Session session = null;
//		Transaction tx = null;
//		try {
//		    session = HibernateUtil.getSessionObject();
//		    tx = session.beginTransaction();
//			
//			
//			//1 创建query对象
//			Query query = session.createQuery("select count(*) from Customer");
//			
//			//2 调用方法得到结果
//			//query对象里面有方法，直接返回对象形式
//			Object obj = query.uniqueResult();
//			
//			System.out.println(((Long) obj).intValue());
//			
//			tx.commit();
//		}catch(Exception e) {
//			e.printStackTrace();
//			tx.rollback();
//		}finally {
//			session.close();
//		}
		
		if ("zhangsan".equals(loginID) && "123456".equals(loginPassword)) {
			System.out.println("登录成功");
			return "denglu chenggong";
		} else {
			System.out.println("登录失败");
			return "denglu shibai";
		}

	}

	/**
	 * 
	 * @Description: 注册
	 *               http://localhost:8080/Blogs/UserServlet?method=register&account
	 *               =zhangsan&phonenumber=17712345678
	 * @Title: register
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 *             String
	 */
	public String register(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 1.获取到传递过来的数据
		String name = request.getParameter("account");
		String phonenumber = request.getParameter("phonenumber");
		// 2.保存至数据，返回注册成功
		return "zhuce chenggong";
	}

}
