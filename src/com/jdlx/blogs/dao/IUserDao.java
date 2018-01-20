package com.jdlx.blogs.dao;

import com.jdlx.blogs.base.IBaseDao;
import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;


/**
 * 
 * @Title: IUserDao
 * @Description: �û� Dao�ӿ�
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����5:41:53
 */
public interface IUserDao extends IBaseDao<User>{
	
	public LoginResponse login(String loginID,String loginPassword);

}
