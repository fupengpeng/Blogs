package com.jdlx.blogs.base;

import java.sql.ResultSet;

import com.jdlx.blogs.utils.JDBCUtil;

/**
 * 
 * @Title: BaseDaoImpl
 * @Description: 通用Dao接口实现类
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午5:36:36
 */
public class BaseDaoImpl implements IBaseDao {

	boolean isSuccess = false;

	public boolean insert(String sql) {
		try {
			JDBCUtil.executeUpdate(sql);
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public boolean delete(String sql) {
		try {
			JDBCUtil.executeUpdate(sql);
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public boolean update(String sql) {
		try {
			JDBCUtil.executeUpdate(sql);
			isSuccess = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public ResultSet select(String sql) {
		return JDBCUtil.executeQuery(sql);
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}
