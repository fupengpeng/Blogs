package com.jdlx.blogs.base;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdlx.blogs.service.IUserService;

/**
 * 
 * @Title: BaseServlet
 * @Description: ͨ�ø���BaseServlet
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����3:22:43
 */
public class BaseServlet extends HttpServlet {
	
	@Resource
	protected IUserService userService;
	

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		// 1�����ִ�еķ�����
		String methodName = request.getParameter("method");
		// Ĭ�Ϸ���
		if (methodName == null) {
			methodName = "execute";
		}

		System.out.println("BaseServlet : ������ִ�з��� :  " + methodName);

		try {
			// 2��ͨ�������õ�ǰ��������ָ������,��ʽ����
			Method executeMethod = this.getClass().getMethod(methodName,
					HttpServletRequest.class, HttpServletResponse.class);
			// 3������ִ�з���
			String result = (String) executeMethod.invoke(this, request,
					response);
			// 4����json���ݷ���
			response.getWriter().write(result);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException("δ֪����  : " + methodName);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("�������쳣", e);
		}
	}

	/**
	 * Ĭ��ִ�з���
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
