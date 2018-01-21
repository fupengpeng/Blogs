package com.jdlx.blogs.response;

import com.jdlx.blogs.base.BaseResponse;
import com.jdlx.blogs.domain.User;

/**
 * 
 * @Title: LoginResponse
 * @Description: 登录响应
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午6:32:17
 */
public class LoginResponse extends BaseResponse {
	private User data;

	public User getData() {
		return data;
	}

	public void setData(User data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "LoginResponse [data=" + data + "]";
	}

}