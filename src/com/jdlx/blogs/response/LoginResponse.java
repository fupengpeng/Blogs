package com.jdlx.blogs.response;

import com.jdlx.blogs.base.BaseResponse;
import com.jdlx.blogs.domain.User;


/**
 * 
 * @Title: LoginResponse
 * @Description: ��¼��Ӧ
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����6:32:17
 */
public class LoginResponse extends BaseResponse {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
