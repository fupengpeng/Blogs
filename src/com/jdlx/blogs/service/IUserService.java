package com.jdlx.blogs.service;

import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;
import com.jdlx.blogs.response.ReturnStringResponse;

/**
 * 
 * @Title: IUserService
 * @Description: 用户Service接口
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午5:51:39
 */
public interface IUserService {

	public LoginResponse login(String phoneNumber, String loginPassword);

	public boolean register(User user);

}