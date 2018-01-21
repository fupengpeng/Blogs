package com.jdlx.blogs.dao;

import com.jdlx.blogs.base.IBaseDao;
import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;

/**
 * 
 * @Title: IUserDao
 * @Description: 用户 Dao接口
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午5:41:53
 */
public interface IUserDao extends IBaseDao {

	public LoginResponse login(String phoneNumber, String loginPassword);

	public boolean register(User user);

}
