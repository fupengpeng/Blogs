package com.jdlx.blogs.service;

import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;


/**
 * 
 * @Title: IUserService
 * @Description: �û�Service�ӿ�
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����5:51:39
 */
public interface IUserService {
	

	public LoginResponse login(String loginID, String loginPassword);

}
