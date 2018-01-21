package com.jdlx.blogs.base;

import java.sql.ResultSet;

/**
 * 
 * @Title: IBaseDao
 * @Description: 通用Dao接口
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午5:35:33
 */
public interface IBaseDao {
	/**
	 * 添加(插入)
	 */
	public boolean insert(String sql);

	/**
	 * 删除
	 */
	public boolean delete(String sql);

	/**
	 * 修改
	 */
	public boolean update(String sql);

	/**
	 * 查询
	 */
	public ResultSet select(String sql);

}
