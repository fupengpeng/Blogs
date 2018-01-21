package com.jdlx.blogs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.jdlx.blogs.base.BaseServlet;
import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;
import com.jdlx.blogs.response.ReturnStringResponse;

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
	 */
	private static final long serialVersionUID = 1L;

	private static final int REQUEST_SUCCESS = 0;
	private static final int REQUEST_FAILURE = 1;

	private String responseString = null;

	ReturnStringResponse returnStringResponse = new ReturnStringResponse();

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
		String phoneNumber = request.getParameter("phoneNumber");
		String loginPassword = request.getParameter("loginPassword");
		System.out.println("接收数据  phoneNumber = " + phoneNumber
				+ "    loginPassword = " + loginPassword);

		LoginResponse loginResponse = userService.login(phoneNumber,
				loginPassword);

		System.out.println("loginResponse = " + loginResponse.toString());

		if (phoneNumber != null && loginPassword != null) {
			if (loginResponse.getData() != null) {
				loginResponse.setCode(REQUEST_SUCCESS);
				loginResponse.setInfo("登录成功！");
				responseString = JSON.toJSONString(loginResponse);
				System.out.println("loginResponse = " + responseString);

				return responseString;
			} else {
				loginResponse.setCode(REQUEST_FAILURE);
				loginResponse.setInfo("登录失败！");
				responseString = JSON.toJSONString(loginResponse);
				System.out.println("loginResponse = " + responseString);
				return responseString;
			}
		}else {
			loginResponse.setCode(REQUEST_SUCCESS);
			loginResponse.setInfo("请输入账号密码进行登录！");
			responseString = JSON.toJSONString(loginResponse);
			System.out.println("loginResponse = " + responseString);
			return responseString;
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
		String phoneNumber = request.getParameter("phoneNumber");
		String verificationCode = request.getParameter("verificationCode");
		String loginPassword = request.getParameter("loginPassword");
	

		if (phoneNumber != null && verificationCode != null && loginPassword != null) {
			if ("1234".equals(verificationCode)) {
				User user = new User();
				user.setPhoneNumber(phoneNumber);
				user.setLoginPassword(loginPassword);
				if (userService.register(user)) {
					returnStringResponse.setCode(REQUEST_SUCCESS);
					returnStringResponse.setInfo("注册成功！");
					responseString = JSON.toJSONString(returnStringResponse);
					return responseString;
				} else {
					returnStringResponse.setCode(REQUEST_FAILURE);
					returnStringResponse.setInfo("注册失败！");
					responseString = JSON.toJSONString(returnStringResponse);
					return responseString;
				}
			} else {
				returnStringResponse.setCode(REQUEST_SUCCESS);
				returnStringResponse.setInfo("验证码错误！");
				responseString = JSON.toJSONString(returnStringResponse);
				return responseString;
			}
		}else {
			returnStringResponse.setCode(REQUEST_SUCCESS);
			returnStringResponse.setInfo("请输入手机号、正确的验证码、密码进行注册！");
			responseString = JSON.toJSONString(returnStringResponse);
			return responseString;
		}
		

	}

}
