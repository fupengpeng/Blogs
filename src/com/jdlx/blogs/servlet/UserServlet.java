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
 * @Description: �û�ģ��
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����3:26:01
 */
public class UserServlet extends BaseServlet {

	/**
	 * 
	 * @Description: ��¼
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
		// 1.��ȡ���ͻ��˴��ݹ������û��˺ź�����
		String loginID = request.getParameter("account");
		String loginPassword = request.getParameter("password");
		// 2.�ж��û��Ƿ��¼�ɹ�
		
		LoginResponse loginResponse = userService.login(loginID,loginPassword);
		
		
//		Session session = null;
//		Transaction tx = null;
//		try {
//		    session = HibernateUtil.getSessionObject();
//		    tx = session.beginTransaction();
//			
//			
//			//1 ����query����
//			Query query = session.createQuery("select count(*) from Customer");
//			
//			//2 ���÷����õ����
//			//query���������з�����ֱ�ӷ��ض�����ʽ
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
			System.out.println("��¼�ɹ�");
			return "denglu chenggong";
		} else {
			System.out.println("��¼ʧ��");
			return "denglu shibai";
		}

	}

	/**
	 * 
	 * @Description: ע��
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
		// 1.��ȡ�����ݹ���������
		String name = request.getParameter("account");
		String phonenumber = request.getParameter("phonenumber");
		// 2.���������ݣ�����ע��ɹ�
		return "zhuce chenggong";
	}

}
